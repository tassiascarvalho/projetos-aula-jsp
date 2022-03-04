/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.inbooking.controller;

import br.com.inbooking.DAO.PessoaDAOImpl;
import br.com.inbooking.model.Pessoa;
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
 * @author Aluno
 */
@WebServlet(name = "LogarPessoa", urlPatterns = {"/LogarPessoa"})
public class LogarPessoa extends HttpServlet {

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
//Verifica qual a ação - se for logar pega o usuário e a senha 
        if (request.getParameter("acao").equals("logar")) {
            String emailpessoa = request.getParameter("emailpessoa");
            String senhapessoa = request.getParameter("senhapessoa");
//Verifica se os dados estão preenchidos
            if (!emailpessoa.equals("") && !senhapessoa.equals("")) {
                try {
                    PessoaDAOImpl dao = new PessoaDAOImpl();
//Chama o método de logar passando os dados
                    Pessoa pessoa = dao.logarPessoa(emailpessoa, senhapessoa);
                    if (pessoa != null) {
//Se os dados estiverem certo abre a sessão, e atribuiu a classe pessoa.
                        HttpSession session = request.getSession(true);
                        session.setAttribute("pessoa", pessoa);
                        mensagem = "Seja bem-vindo(a) " + pessoa.getNomePessoa() + "!";
                        session.setAttribute("saudacao", mensagem);
                        request.getRequestDispatcher("pessoa/menu.jsp").forward(request, response);
                    } else {
                        mensagem = "Login ou Senha inválidos!";
                        request.setAttribute("mensagem", mensagem);
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    }
                } catch (Exception ex) {
                    System.out.println("Problemas ao logar Pessoa!"
                            + "\n Erro: " + ex.getMessage());
                    ex.printStackTrace();
                }
            } else {
                mensagem = "Login ou senha inválidos!";
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } else if (request.getParameter("acao").equals("logout")) {
            //Instância a sessão vazia
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
