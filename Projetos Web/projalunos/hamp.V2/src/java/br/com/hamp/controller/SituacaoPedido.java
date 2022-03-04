/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hamp.controller;

import br.com.hamp.DAO.PedidoDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Douglas Costa
 */
@WebServlet(name = "SituacaoPedido", urlPatterns = {"/SituacaoPedido"})
public class SituacaoPedido extends HttpServlet {

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
        int idPedido = Integer.parseInt(request.getParameter("idpedido"));
        int idPessoaJ = Integer.parseInt(request.getParameter("idempresa"));
        String situacao = request.getParameter("situacao");
        String mensagem = null;
        //Alterar a situação do pedido
        try {
            PedidoDAOImpl dao = new PedidoDAOImpl();
            if (dao.alterarSituacao(idPedido, situacao)) {
                mensagem = "Situação alterada com sucesso!";
            } else {
                mensagem = "Erro ao altearar situação!";
            }
        } catch (Exception ex) {
            System.out.println("Erro ao alterar situação! " + ex.getMessage());
            ex.printStackTrace();
        }
        //Lista novamente o Pedido
        try {
            PedidoDAOImpl dao = new PedidoDAOImpl();
            request.setAttribute("pedidos", dao.listarPorPessoaJ(idPessoaJ));
            System.out.println("Listaddddddddddddddddddoooooooooooooooooo");

        } catch (Exception ex) {
            System.out.println("ERRO SO LISTAR PEDIDO!" + ex.getMessage());
            ex.printStackTrace();
        }
        request.getRequestDispatcher("pessoaJuridica/pedido.jsp").forward(request, response);
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
