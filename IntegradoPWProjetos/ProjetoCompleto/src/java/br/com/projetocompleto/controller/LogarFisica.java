/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.controller;

import br.com.projetocompleto.dao.FisicaDAOImpl;
import br.com.projetocompleto.dao.PessoaDAOImpl;
import br.com.projetocompleto.dao.SaidaDAOImpl;
import br.com.projetocompleto.model.Fisica;
import br.com.projetocompleto.model.Pessoa;
import br.com.projetocompleto.model.Saida;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tassia
 */
@WebServlet(name = "LogarFisica", urlPatterns = {"/LogarFisica"})
public class LogarFisica extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acao = request.getParameter("acao");
        
        //determinar se é login ou logout
        if(acao.equals("login")){
            String email = request.getParameter("emailpessoa");
            String senha = request.getParameter("senhapessoa");

            if(!email.equals("") && !senha.equals("")){
                //Criar Login
                try{
                    PessoaDAOImpl dao = new PessoaDAOImpl();
                    Pessoa oPessoa = dao.logarPessoa(email, senha);

                    if(oPessoa != null){
                        //Login deu certo
                        HttpSession sessao = request.getSession(true);
                        //determinar o tempo que ela fica aberta
                        sessao.setAttribute("pessoalogada", oPessoa);                       
                        //Carregar o carrinho de compras (saída)
                        SaidaDAOImpl daosaida = new SaidaDAOImpl();
                        Saida oSaida = (Saida) daosaida.carregar(oPessoa.getIdPessoa());
                        if(oSaida != null)
                            sessao.setAttribute("carrinho", oSaida);
                        else{
                            //Negocio dificil - Criar a Saída
                            FisicaDAOImpl daofisica = new FisicaDAOImpl();
                            Fisica oFisica = new Fisica();
                            oFisica = (Fisica) daofisica.carregar(oPessoa.getIdPessoa());
                            
                            //Cadastrar a Saida
                            oSaida = new Saida();
                            oSaida.setoFisica(oFisica);
                            daosaida = new SaidaDAOImpl();
                            if(daosaida.cadastrar(oSaida)){       
                                daosaida = new SaidaDAOImpl();
                                oSaida = (Saida) daosaida.carregar(oPessoa.getIdPessoa());
                                sessao.setAttribute("carrinho", oSaida);
                            }else{
                                System.out.println("Erro ao cadastrar carrinho na sessão");
                            }                                
                        }
                        //Se tiver carrega os itens
                        
                        request.setAttribute("mensagem", "Seja bem vindo!" + oPessoa.getNomePessoa());
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    }else{
                        //Login deu errado
                        request.setAttribute("mensagem", "Usuario ou senha inválidos");
                        request.getRequestDispatcher("loginfisica.jsp").forward(request, response);
                    }                
                }catch(Exception ex){
                  System.out.println("Problemas ao logar Usuario! \n Erro:" + ex.getMessage());
                  ex.printStackTrace();  
                }
            }else{
                request.setAttribute("mensagem", "Login ou Senha em branco! Tente novamente");
                request.getRequestDispatcher("loginfisica.jsp").forward(request, response);
            }
            
        }else if(acao.equals("logout")){
            HttpSession session = request.getSession(true);
            session.invalidate();
            response.sendRedirect("loginfisica.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
