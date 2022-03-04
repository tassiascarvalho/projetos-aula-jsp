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

/**
 *
 * @author Aluno
 */
@WebServlet(name = "SalvarAdministrador", urlPatterns = {"/SalvarAdministrador"})
public class SalvarAdministrador extends HttpServlet {

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
        
        Administrador administrador = new Administrador();
        
        administrador.setNomeAdministrador(request.getParameter("nome"));
        administrador.setCpfAdministrador(request.getParameter("cpf"));
        administrador.setLoginAdministrador(request.getParameter("login"));
        administrador.setSenhaAdministrador(request.getParameter("senha"));
        
        try {
            GenericDAO dao = new AdministradorDAOImpl();
            if (request.getParameter("id").equals("")) {
                //Cadastrar
                if (dao.cadastrar(administrador)) {
                    mensagem = "Administrador cadastrado com sucesso!";
                } else {
                    mensagem = "Problemas ao cadastrar Administrador!";
                }
            } else if (!request.getParameter("id").equals("")) {
                //Alterar
                administrador.setIdAdministrador(Integer.parseInt(request.getParameter("id")));
                if (dao.alterar(administrador)) {
                    mensagem = "Administrador alterado com sucesso!";
                } else {
                    mensagem = "Problemas ao alterar Administrador!";
                }
            }
            
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("Administrador/salvar.jsp").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas ao salvar Administrador!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
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
