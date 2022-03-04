package br.com.hamp.controller;

import br.com.hamp.DAO.AdmDAOImpl;
import br.com.hamp.DAO.PessoaFDAOImpl;
import br.com.hamp.DAO.PessoaJDAOImp;
import br.com.hamp.model.Administrador;
import br.com.hamp.model.PessoaFisica;
import br.com.hamp.model.PessoaJuridica;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Douglas Costa
 */
@WebServlet(name = "LogarUsuario", urlPatterns = {"/LogarUsuario"})
public class LogarUsuario extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String mensagem = null;
        //Verifica se ação de sessão é logar
        if (request.getParameter("acao").equals("logar")) {
            String login = request.getParameter("email");
            String senha = request.getParameter("senha");
            //Verifica se a senha e o email não está vazio;
            if (!login.equals("") && !senha.equals("")) {
                //---------------------------------------------------------------------------//
                //Verifica se o usuário é ADMINISTRADOR
                if (request.getParameter("usuario").equals("a")) {
                    try {
                        AdmDAOImpl dao = new AdmDAOImpl();
                        Administrador adm = dao.logarAdministrador(login, senha);
                        if (adm != null) {
                            HttpSession session = request.getSession(true);
                            session.setAttribute("admin", adm);
                            mensagem = "Bem-vindo, " + adm.getNomeAdm() + "!";
                            session.setAttribute("saudacao", mensagem);
                            request.getRequestDispatcher("administrador/index.jsp").forward(request, response);
                        } else {
                            mensagem = "Login ou Senha inválidos!";
                            request.setAttribute("mensagem", mensagem);
                            request.getRequestDispatcher("index.jsp").forward(request, response);
                        }
                    } catch (Exception ex) {
                        System.out.println("Problemas ao logar Administrador!"
                                + "\n Erro: " + ex.getMessage());
                        ex.printStackTrace();
                    }
                //---------------------------------------------------------------------------//
                //VErifica se o usuário é EMPRESA    
                }else if (request.getParameter("usuario").equals("e")){
                    try {
                       PessoaJDAOImp dao = new PessoaJDAOImp();
                        PessoaJuridica pessoaj = dao.logarPessoaJ(login, senha);
                        if (pessoaj!= null) {
                            HttpSession session = request.getSession(true);
                            session.setAttribute("pessoaj", pessoaj);
                            mensagem = "Bem-vindo, " + pessoaj.getNomePessoa()+ "!";
                            session.setAttribute("saudacao", mensagem);
                            request.getRequestDispatcher("pessoaJuridica/index.jsp").forward(request, response);
                        } else {
                            mensagem = "Login ou Senha inválidos!";
                            request.setAttribute("mensagem", mensagem);
                            request.getRequestDispatcher("index.jsp").forward(request, response);
                        }
                    } catch (Exception ex) {
                        System.out.println("Problemas ao logar Empresa!"
                                + "\n Erro: " + ex.getMessage());
                        ex.printStackTrace();
                    }
                //---------------------------------------------------------------------------//
                //VErifica se o usuário é CLIENTE       
                }else if(request.getParameter("usuario").equals("c")){
                    try {
                        PessoaFDAOImpl dao = new PessoaFDAOImpl();
                        PessoaFisica pessoaf = dao.logarPessoaF(login, senha);
                        if(pessoaf!=null){
                             HttpSession session =request.getSession(true);
                             session.setAttribute("pessoaf", pessoaf);
                             mensagem = "Bem-vindo, "+pessoaf.getNomePessoa() + "!";
                             session.setAttribute("saudacao", mensagem);
                             request.getRequestDispatcher("hamp/index.jsp").forward(request, response);
                        }else{
                            mensagem = "Login ou senha inválido!";
                            request.setAttribute("mensagem", mensagem);
                            request.getRequestDispatcher("index.jsp").forward(request, response);
                        }
                    } catch (Exception ex) {
                        System.out.println("Problemas ao logar Cliente!"
                                + "\n Erro: " + ex.getMessage());
                        ex.printStackTrace();
                    }               
                }
            } else {
                mensagem = "Login ou Senha inválidos!";
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } else if (request.getParameter("acao").equals("logout")) {
            HttpSession session = request.getSession(true);
            session.invalidate();
            response.sendRedirect("index.jsp");
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
