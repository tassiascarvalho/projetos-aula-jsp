/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qa.controller;

import br.com.qa.dao.ClienteDAOImpl;
import br.com.qa.dao.GenericDAO;
import br.com.qa.model.Cliente;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "SalvarCliente", urlPatterns = {"/SalvarCliente"})
public class SalvarCliente extends HttpServlet {

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
        
        Cliente cliente = new Cliente();
        
        cliente.setNomePessoa(request.getParameter("nome"));
        cliente.setRgCliente(request.getParameter("rg"));
        cliente.setCpfPessoa(request.getParameter("cpf"));
        cliente.setCidadeCliente(request.getParameter("cidade"));
        cliente.setQuantidadeDependentesCliente(Integer.parseInt(request.getParameter("qtddep")));
        cliente.setLoginPessoa(request.getParameter("login"));
        cliente.setSenhaPessoa(request.getParameter("senha"));     
        cliente.setTipoPessoa("C");
        
        try {
            GenericDAO dao = new ClienteDAOImpl();
            if (request.getParameter("id").equals("")) {
                //Cadastrar
                if (dao.cadastrar(cliente)) {
                    mensagem = "Cliente cadastrado com sucesso!";
                } else {
                    mensagem = "Problemas ao cadastrar Cliente!";
                }
            } else if (!request.getParameter("id").equals("")) {
                //Alterar
                cliente.setIdPessoa(Integer.parseInt(request.getParameter("id")));
                if (dao.alterar(cliente)) {
                    mensagem = "Cliente alterado com sucesso!";
                } else {
                    mensagem = "Problemas ao alterar Cliente!";
                }
            }
            
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("ListarCliente").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas ao salvar Cliente!"
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
