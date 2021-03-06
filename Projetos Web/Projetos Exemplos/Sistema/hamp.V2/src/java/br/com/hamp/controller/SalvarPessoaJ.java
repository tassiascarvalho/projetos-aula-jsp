/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hamp.controller;

import br.com.hamp.DAO.PessoaJDAOImp;
import br.com.hamp.DAO.GenericDAO;
import br.com.hamp.DAO.PessoaFDAOImpl;
import br.com.hamp.model.PessoaFisica;
import br.com.hamp.model.PessoaJuridica;
import br.com.hamp.util.Conversoes;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Douglas Costa
 */
@WebServlet(name = "SalvarPessoaJ", urlPatterns = {"/SalvarPessoaJ"})
public class SalvarPessoaJ extends HttpServlet {

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
         String mensagem = null;
        
        //Atributos da classe Pessoa
        String nomePessoa = request.getParameter("nomepessoa");
        String emailPessoa = request.getParameter("emailpessoa");
        String senhaPessoa = request.getParameter("senhapessoa");
        String telefonePessoa = request.getParameter("telefonepessoa");

        //Atributos da subclasse Pessoa Juridica
        String cpnjPessoaJuridica = request.getParameter("cpnj");
        String razaoSocial = request.getParameter("razaosocial");

        //Criação do Objeto Pessoa Juridica
        PessoaJuridica pessoaj = new PessoaJuridica();
        pessoaj.setNomePessoa(nomePessoa);
        pessoaj.setTelefonePessoa(telefonePessoa);
        pessoaj.setSenhaPessoa(senhaPessoa);
        pessoaj.setEmailPessoa(emailPessoa);
        pessoaj.setCpnjPessoaJuridica(cpnjPessoaJuridica);
        pessoaj.setRazaoSocialPessoaJuridica(razaoSocial);
        if (request.getParameter("idpessoa").equals("")) {
            try {
                GenericDAO dao = new PessoaJDAOImp();
                if (dao.cadastrar(pessoaj)) {
                    mensagem = "Pessoa Juridica cadastrada com sucesso";
                } else {
                    mensagem = "Erro ao cadastrar Pessoa Juridicva";
                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("pessoaJuridica/salvar.jsp").forward(request, response);
            } catch (Exception ex) {
                System.err.println("Problemas ao cadastrar Pessoa Juridica! Erro:" + ex.getMessage());
                ex.printStackTrace();

            }
        }else{
           pessoaj.setIdPessoa(Integer.parseInt(request.getParameter("idpessoa")));
            try {
                GenericDAO dao = new PessoaJDAOImp();
                if (dao.alterar(pessoaj)) {
                    mensagem = "Pessoa Juridica alterada com sucesso";
                } else {
                    mensagem = "Erro ao alterar Pessoa Juridicva";
                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("pessoaJuridica/salvar.jsp").forward(request, response);
            } catch (Exception ex) {
                System.err.println("Problemas ao alterar Pessoa Juridica! Erro:" + ex.getMessage());
                ex.printStackTrace();

            }
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
