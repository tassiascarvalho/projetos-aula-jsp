/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hamp.controller;

import br.com.hamp.DAO.PessoaFDAOImpl;
import br.com.hamp.DAO.PessoaJDAOImp;
import br.com.hamp.DAO.ProdutoDAOImpl;
import br.com.hamp.model.Pedido;
import br.com.hamp.util.Conversoes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "DadosPedido", urlPatterns = {"/DadosPedido"})
public class DadosPedido extends HttpServlet {

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
        int idpessoaf = Integer.parseInt(request.getParameter("idpessoaf"));
        int idpessoaj = Integer.parseInt(request.getParameter("idpessoaj"));
        int idproduto = Integer.parseInt(request.getParameter("idproduto"));
        String totalDias = request.getParameter("dias");
        String total = request.getParameter("total");
        Date dataInicio = Conversoes.converterData(request.getParameter("comeco"));
        Date dataLimite = Conversoes.converterData(request.getParameter("fim"));

        //Lista cliente
        try {
            PessoaFDAOImpl dao = new PessoaFDAOImpl();
            request.setAttribute("pessoaf", dao.listarIndividualPessoaF(idpessoaf));
        } catch (Exception ex) {
            System.out.println("Erro ao listar Cliente " + ex.getMessage());
            ex.printStackTrace();
        }
        //Lista a empresa
        try {
            PessoaJDAOImp dao = new PessoaJDAOImp();
            request.setAttribute("pessoaj", dao.listarIndividualPessoaJ(idpessoaj));
        } catch (Exception ex) {
            System.out.println("Erro ao listar Empresa " + ex.getMessage());
            ex.printStackTrace();
        }
        //Lista o produto
        try {
            ProdutoDAOImpl dao = new ProdutoDAOImpl();
            request.setAttribute("produto", dao.listarIndividual(idproduto));
        } catch (Exception ex) {
            System.err.println("Erro ao listar Produtos. Erro: " + ex.getMessage());
            ex.printStackTrace();
        }
        Pedido pedido = new Pedido();
        pedido.setDataInicio(dataInicio);
        pedido.setDataLimite(dataLimite);
        
        request.setAttribute("pedido", pedido);
        request.setAttribute("totalDias", totalDias);
        request.setAttribute("totalLocacao", total);
      
        request.getRequestDispatcher("hamp/confirmarpedido.jsp").forward(request, response);
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
