/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qa.controller;

import br.com.qa.dao.FilmeDAOImpl;
import br.com.qa.dao.GenericDAO;
import br.com.qa.dao.PerguntaDAOImpl;
import br.com.qa.model.Categoria;
import br.com.qa.model.Pergunta;
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
@WebServlet(name = "SalvarPergunta", urlPatterns = {"/SalvarPergunta"})
public class SalvarPergunta extends HttpServlet {

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
        String mensagem="";
        Pergunta oPergunta = new Pergunta();
        
        oPergunta.setDescricaoPergunta(request.getParameter("descricaopergunta"));
        //Existe a necessidade de instanciar a Categoria(Classe de depencia)
        oPergunta.setCategoria(new Categoria(Integer.parseInt(request.getParameter("idcategoriapergunta"))));
        
        try {
            GenericDAO dao = new PerguntaDAOImpl();
            if (request.getParameter("idpergunta").equals("")) {
                if (dao.cadastrar(oPergunta)) {
                    mensagem = "Pergunta  cadastrado com sucesso!";
                } else {
                    mensagem = "Problemas ao cadastrar Pergunta!";
                }
            } else {
                oPergunta.setIdPergunta(Integer.parseInt(request.getParameter("idpergunta")));
                if (dao.alterar(oPergunta)) {
                    mensagem = "Pergunta alterado com sucesso!";
                } else {
                    mensagem = "Problemas ao alterar Pergunta!";
                }
            }
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("ListarPergunta").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Pergunta! Erro: " + ex.getMessage());
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
