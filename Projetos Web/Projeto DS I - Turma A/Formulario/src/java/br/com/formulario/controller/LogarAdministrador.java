/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.formulario.controller;

import br.com.formulario.dao.AdministradorDAOImpl;
import br.com.formulario.model.Administrador;
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
 * @author Tassia
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
        response.setContentType("text/html;charset=UTF-8");
        String mensagem = "";

        //Identificar a ação que irá ocorrer: Login ou Logout
        String acao = request.getParameter("acao");

        if ("logar".equals(acao)) {
            String usuario = request.getParameter("usuarioadministrador");
            String senha = request.getParameter("senhaadministrador");

            try {
                AdministradorDAOImpl dao = new AdministradorDAOImpl();
                Administrador oAdministrador = dao.logarAdm(usuario, senha);

                if (oAdministrador != null) {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("administrador", oAdministrador);
                    request.getRequestDispatcher("menulogado.jsp").forward(request, response);
                } else {
                    mensagem = "Usuario e senha incorretos";
                    request.setAttribute("mensagem", mensagem);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
            } catch (Exception ex) {
                System.out.println("Erro ao realizar login Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }else if("logout".equals(acao)){
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
