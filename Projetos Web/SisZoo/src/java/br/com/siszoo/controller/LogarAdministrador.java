/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siszoo.controller;

import br.com.siszoo.dao.AdministradorDAOImpl;
import br.com.siszoo.dao.GenericDAO;
import br.com.siszoo.model.Administrador;
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
@WebServlet(name = "LogarAdministrador", urlPatterns = {"/LogarAdministrador"})
public class LogarAdministrador extends HttpServlet {

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

        String mensagem = null;
        
        //Verifica se a inteção é Logar
        if (request.getParameter("acao").equals("logar")) {
            //recupera o login e a senha
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            
            //Verifica se nem o login ou a senha estão vázios
            if (!login.equals("") && !senha.equals("")) {
                try {
                    AdministradorDAOImpl dao = new AdministradorDAOImpl();
                    Administrador administrador = dao.logarAdministrador(login, senha);
                    if (administrador != null) {
                        //Instancia a Sessão e a torna verdadeira
                        HttpSession session = request.getSession(true);
                        //Atribui o objeto admin a Sessão, que passa a ser reconhecido em qualquer parte do seu sistema
                        session.setAttribute("admin", administrador);
                        mensagem = "Seja bem-vindo(a) " + administrador.getNomeAdministrador() + "!";
                        session.setAttribute("saudacao", mensagem);
                        request.getRequestDispatcher("Administrador/index.jsp").forward(request, response);
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
            //Executa caso o usuário não tenham informa a senha ou o login
            } else {
                mensagem = "Login ou Senha inválidos!";
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        //Executa caso seja para sair do Sistema com Logout    
        } else if (request.getParameter("acao").equals("logout")) {
            //Recupera a sessão e instancia
            HttpSession session = request.getSession(true);
            //mas a torna invalida limpe a memória no logout
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
