/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoupa.controller;

import br.com.projetoupa.dao.EspecialidadeDAOImpl;
import br.com.projetoupa.dao.GenericDAO;
import br.com.projetoupa.model.Especialidade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tassia
 */
@WebServlet(name = "SalvarEspecialidade", urlPatterns = {"/SalvarEspecialidade"})
public class SalvarEspecialidade extends HttpServlet {

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
        
        Especialidade oEspecialidade = new Especialidade();
        
        oEspecialidade.setDescricaoEspecialidade(request.getParameter("descricaoespecialidade"));
        
        oEspecialidade.setNomeEspecialidade(request.getParameter("nomeespecialidade"));
        try{
        GenericDAO dao = new EspecialidadeDAOImpl();
        String mensagem ="";
        if(!request.getParameter("idespecialidade").equals("")){
        
           oEspecialidade.setIdEspecialidade(Integer.parseInt(request.getParameter("idespecialidade")));
           if(dao.alterar(oEspecialidade)){
               mensagem="Especialidade alterar com Sucesso";
           }else{
               mensagem="Erro ao alterar Especialidade";
           }
        }else{
           if(dao.cadastrar(oEspecialidade)){
               mensagem="Especialidade cadastrada com Sucesso";
           }else{
               mensagem="Erro ao cadastrar Especialidade";
           }
        }
        
        request.setAttribute("mensagem", mensagem);
        
        request.getRequestDispatcher("ListarEspecialidade").forward(request, response);
        
        }catch(Exception ex) {
            System.out.println("Problemas ao salvar Especialidade!"
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
