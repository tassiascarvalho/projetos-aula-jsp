/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siszoo.controller;

import br.com.siszoo.dao.EspecieDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.siszoo.dao.GenericDAO;
import br.com.siszoo.model.Especie;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "SalvarEspecie", urlPatterns = {"/SalvarEspecie"})
public class SalvarEspecie extends HttpServlet {

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

        Especie especie = new Especie();

        especie.setNomeEspecie(request.getParameter("nome"));
        especie.setDescricaoEspecie(request.getParameter("descricao"));

        try {
            GenericDAO dao = new EspecieDAOImpl();
            if (request.getParameter("id").equals("")) {
                //Cadastrar
                if (dao.cadastrar(especie)) {
                    mensagem = "Especie cadastrada com sucesso!";
                } else {
                    mensagem = "Problemas ao cadastrar Especie!";
                }
            } else if (!request.getParameter("id").equals("")) {
                //Alterar
                especie.setIdEspecie(Integer.parseInt(request.getParameter("id")));
                if (dao.alterar(especie)) {
                    mensagem = "Especie alterada com sucesso!";
                } else {
                    mensagem = "Problemas ao alterar Especie!";
                }
            }
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("Especie/salvar.jsp").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas ao salvar Especie!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    /*if (request.getParameter("id").equals("")) {
     //Cadastrar
     try {
     GenericDAO dao = new EspecieDAOImpl();
     if (dao.cadastrar(especie)) {
     mensagem = "Especie cadastrada com sucesso!";
     } else {
     mensagem = "Problemas ao cadastrar Especie!";
     }
     request.setAttribute("mensagem", mensagem);
     request.getRequestDispatcher("Especie/salvar.jsp").forward(request, response);
     } catch (Exception ex) {
     System.out.println("Problemas ao cadastrar Especie!"
     + "\n Erro: " + ex.getMessage());
     ex.printStackTrace();
     }
     } else if (!request.getParameter("id").equals("")) {
     //Alterar
     especie.setIdEspecie(Integer.parseInt(request.getParameter("id")));
     try {
     GenericDAO dao = new EspecieDAOImpl();
     if (dao.alterar(especie)) {
     mensagem = "Especie alterada com sucesso!";
     } else {
     mensagem = "Problemas ao alterar Especie!";
     }
     request.setAttribute("mensagem", mensagem);
     request.getRequestDispatcher("Especie/salvar.jsp").forward(request, response);
     } catch (Exception ex) {
     System.out.println("Problemas ao alterar Especie!"
     + "\n Erro: " + ex.getMessage());
     ex.printStackTrace();
     }
     }*/
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
