/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.inbooking.controller;

import br.com.inbooking.DAO.GenericDAO;
import br.com.inbooking.DAO.PessoaDAOImpl;
import br.com.inbooking.model.Pessoa;
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
@WebServlet(name = "CadastrarPessoaCliente", urlPatterns = {"/CadastrarPessoaCliente"})
public class CadastrarPessoaCliente extends HttpServlet {

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
        
        Pessoa pessoa = new Pessoa();

        pessoa.setNomePessoa(request.getParameter("nomepessoa"));
        pessoa.setResponsavelPessoa(request.getParameter("responsavelpessoa"));
        pessoa.setTelefoneResponsavelPessoa(request.getParameter("telefoneresponsavelpessoa"));
        pessoa.setCepPessoa(request.getParameter("ceppessoa"));
        pessoa.setCpfPessoa(request.getParameter("cpfpessoa"));
        pessoa.setTelefonePessoa(request.getParameter("telefonepessoa"));
        pessoa.setCelularPessoa(request.getParameter("celularpessoa"));
        pessoa.setEnderecoPessoa(request.getParameter("enderecopessoa"));
        pessoa.setBairroPessoa(request.getParameter("bairropessoa"));
        pessoa.setCidadePessoa(request.getParameter("cidadepessoa"));
        pessoa.setEstadoPessoa(request.getParameter("estadopessoa"));
        pessoa.setNumeroEndPessoa(request.getParameter("numeroendpessoa"));
        pessoa.setSexoPessoa(request.getParameter("sexopessoa"));
        pessoa.setEmailPessoa(request.getParameter("emailpessoa"));
        pessoa.setSenhaPessoa(request.getParameter("senhapessoa"));
        pessoa.setPerfilPessoa(request.getParameter("perfilpessoa"));

        //inicia a tentativa nde cadastrar no BD
        try {
            //Instancia a DAOImpl
            GenericDAO dao = new PessoaDAOImpl();
            if (request.getParameter("idpessoa").equals("")) {
                //chama o metodo cadastrar na DAOImpl
                if (dao.cadastrar(pessoa)) {
                    mensagem = "Pessoa cadastrada com sucesso!";
                } else {
                    mensagem = "Problemas ao cadastrar Pessoa!";
                }
            } else if (!request.getParameter("idpessoa").equals("")) {
                //alterar 
                pessoa.setIdPessoa(Integer.parseInt(request.getParameter("idpessoa")));
                if (dao.alterar(pessoa)) {
                    mensagem = "Pessoa alterada com sucesso - Servlet!";
                } else {
                    mensagem = "Problemas ao alterar Pessoa";
                }
            }
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("pessoa/cliente/cadastrarcliente.jsp").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas ao salvar Pessoa!"
                    + "\n Erro:" + ex.getMessage());
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


