/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoupload.controller;


import br.com.projetoupload.DAO.GenericDAO;
import br.com.projetoupload.DAO.PessoaFDAOImpl;
import br.com.projetoupload.model.PessoaFisica;
import br.com.projetoupload.util.Conversoes;
import br.com.projetoupload.util.Upload;
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
@WebServlet(name = "SalvarPessoaF", urlPatterns = {"/SalvarPessoaF"})
public class SalvarPessoaF extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String mensagem = null;

        Upload up = new Upload();
        //Caminho onde a foto ficará.
        up.setFolderUpload("fotos");

        try {
            if (up.formProcess(getServletContext(), request)) {
                
                PessoaFisica pessoaf = new PessoaFisica();
                pessoaf.setImagemPessoaFisica(up.getFiles().get(0));
                pessoaf.setNomePessoa(up.getForm().get("nome").toString());
                pessoaf.setCpfPessoaFisica(up.getForm().get("cpf").toString());
                pessoaf.setEmailPessoa(up.getForm().get("email").toString());
                pessoaf.setSexoPessoaFisica(up.getForm().get("sexo").toString());
                pessoaf.setTelefonePessoa(up.getForm().get("telefone").toString());
                pessoaf.setSenhaPessoa(up.getForm().get("senha").toString());
                Date dataNascimanto = Conversoes.converterData(up.getForm().get("data").toString());
                pessoaf.setDataNascimentoPessoaFisica(dataNascimanto);

                if (up.getForm().get("idpessoa").toString().equals("")) {
                    try {
                        GenericDAO dao = new PessoaFDAOImpl();
                        if (dao.cadastrar(pessoaf)) {
                            mensagem = "Cadastro efetuado com sucesso!";
                        } else {
                            mensagem = "“Usuário já existe” /”CPF incorreto”/”CPNJ incorreto”";
                        }
                        request.setAttribute("mensagem", mensagem);
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    } catch (Exception ex) {
                        System.out.println("Erro ao cadastrar. ERRO: " + ex.getMessage());
                        ex.printStackTrace();
                    }
                } else {
                    pessoaf.setIdPessoa(Integer.parseInt(up.getForm().get("idpessoa").toString()));
                    try {
                        GenericDAO dao = new PessoaFDAOImpl();
                        if (dao.alterar(pessoaf)) {
                            mensagem = "Perfil Alterado com sucesso!";
                        }else{
                            mensagem ="Erro ao alterar perfil! Tente mais novamente";
                        }
                        request.setAttribute("mensagem", mensagem);
                        request.getRequestDispatcher("pessoaFisica/perfil.jsp").forward(request, response);
                    } catch (Exception ex) {
                        System.out.println("Erro ao alterar. Erro: "+ex.getMessage());
                        ex.printStackTrace();
                    }
                }
            } else {
                System.err.println("Errooooooooooooooooooooooooo!");
            }
        } catch (Exception ex) {
            System.out.println("Erro ao processar dados. ERRO: " + ex.getMessage());
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
