/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hamp.controller;

import br.com.hamp.DAO.GenericDAO;
import br.com.hamp.DAO.MensagemDAOImpl;
import br.com.hamp.DAO.PedidoDAOImpl;
import br.com.hamp.model.Mensagem;
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
@WebServlet(name = "SalvarMensagem", urlPatterns = {"/SalvarMensagem"})
public class SalvarMensagem extends HttpServlet {

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
        String situ = null;
        String mensagem = request.getParameter("mensagem");
        int idReceptor = Integer.parseInt(request.getParameter("idReceptor"));
        int idEmissor = Integer.parseInt(request.getParameter("idEmissor"));

        Mensagem msg = new Mensagem();
        msg.setIdEmissor(idEmissor);
        msg.setIdReceptor(idReceptor);
        msg.setMensagem(mensagem);

        try {
            GenericDAO dao = new MensagemDAOImpl();
            if (dao.cadastrar(msg)) {
                situ = "Mensagem enviada";
                request.setAttribute("mensagem", situ);
            } else {
                situ = "Erro ao enviar mensagem";
                request.setAttribute("mensagem", situ);
            }
        } catch (Exception ex) {
            System.out.println("Erro ao enviar MENSAGEM " + ex.getMessage());
            ex.printStackTrace();
        }
        try {
            GenericDAO dao = new PedidoDAOImpl();
            request.setAttribute("pedidos", dao.listar());
            System.out.println("Listaddddddddddddddddddoooooooooooooooooo");
            request.getRequestDispatcher("hamp/pedido.jsp").forward(request, response);
        } catch (Exception ex) {
            System.out.println("ERRO SO LISTAR PEDIDO!" + ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println(situ);
        request.getRequestDispatcher("hamp/pedido.jsp").forward(request, response);
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
