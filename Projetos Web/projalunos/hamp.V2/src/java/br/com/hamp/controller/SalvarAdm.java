/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hamp.controller;

import br.com.hamp.DAO.AdmDAOImpl;
import br.com.hamp.DAO.GenericDAO;
import br.com.hamp.model.Administrador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ludi
 */
@WebServlet(name = "SalvarAdm", urlPatterns = {"/SalvarAdm"})
public class SalvarAdm extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String mensagem = null;
        
        String nomeAdm = request.getParameter("nomeadm");
        String loginAdm = request.getParameter("loginadm");
        String senhaAdm = request.getParameter("senhaadm");
        
        Administrador adm = new Administrador();
        adm.setNomeAdm(nomeAdm);
        adm.setLoginAdm(loginAdm);
        adm.setSenhaAdm(senhaAdm);
        
        try {
            GenericDAO dao = new AdmDAOImpl();
            if(dao.cadastrar(adm)){
                mensagem = "Adm cadastrado com sucesso";
            }else{
                mensagem = "Erro ao cadastrara Adm";
            }
        } catch (Exception ex) {
            System.err.println("Problemas ao cadastrar Adm!Erro:" + ex.getMessage());
                ex.printStackTrace();
        }
        request.setAttribute("mensagem",mensagem );
        request.getRequestDispatcher("administrador/salvar.jsp").forward(request, response);
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
