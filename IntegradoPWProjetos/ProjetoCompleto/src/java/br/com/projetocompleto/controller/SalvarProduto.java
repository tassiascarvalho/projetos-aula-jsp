/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.controller;

import br.com.projetocompleto.dao.ProdutoDAOImpl;
import br.com.projetocompleto.model.Juridica;
import br.com.projetocompleto.model.Produto;
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
@WebServlet(name = "SalvarProduto", urlPatterns = {"/SalvarProduto"})
public class SalvarProduto extends HttpServlet {

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
        //Criar Servlet SalvarProduto
        
        //Entrada
        //recupera os dados
        Produto oProduto = new Produto();
        oProduto.setNomeProduto(request.getParameter("nomeproduto"));
        oProduto.setValorProduto(Double.parseDouble(
                request.getParameter("valorproduto")));
        //Criar o construtor na Classe Juridica marcando somente o ID
        
        oProduto.setJuridica( new Juridica
        (Integer.parseInt(request.getParameter("idjuridica"))));
        String mensagem="";
        try{
            ProdutoDAOImpl dao = new ProdutoDAOImpl();
            if(dao.cadastrar(oProduto)){
                mensagem="Produto cadastrado com Sucesso";
            }else{
                mensagem="Erro ao cadastrar Produto";
            }            
        }catch(Exception ex){
            System.out.println("Erro no Servlet SalvarProduto");
        }
        request.setAttribute("mensagem", 
                mensagem);
        request.getRequestDispatcher("DadosProduto").
                forward(request, response);
       
        
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
