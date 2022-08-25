/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controledeusuario.controller;

import br.com.controledeusuario.dao.AdministradorDAOImpl;
import br.com.controledeusuario.dao.GenericDAO;
import br.com.controledeusuario.model.Administrador;
import br.com.controledeusuario.model.Cidade;
import br.com.controledeusuario.util.Conversoes;
import br.com.controledeusuario.util.Upload;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tassia
 */
@WebServlet(name = "SalvarAdministrador", urlPatterns = {"/SalvarAdministrador"})
public class SalvarAdministrador extends HttpServlet {

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
        String mensagem = "";
        Upload up = new Upload();
        //Caminho onde a foto ficará.
        up.setFolderUpload("fotos");
        try {
            if (up.formProcess(getServletContext(), request)) {
                Administrador oAdministrador = new Administrador();
                //Recupera os dados do front
                oAdministrador.setCaminhofoto(up.getFiles().get(0));
                oAdministrador.setNome(up.getForm().get("nome").toString());
                oAdministrador.setCpf(up.getForm().get("cpf").toString());
                oAdministrador.setDatanascimento(Conversoes.ConverterData(up.getForm().get("datanascimento").toString()));
                oAdministrador.setLogin(up.getForm().get("login").toString());
                oAdministrador.setSenha(up.getForm().get("senha").toString());
                oAdministrador.setSituacao(up.getForm().get("situacao").toString());
                oAdministrador.setPermiteLogin(up.getForm().get("permitelogin").toString());
                oAdministrador.setCidade(new Cidade(Integer.parseInt(up.getForm().get("idcidade").toString())));
                try {
                    GenericDAO dao = new AdministradorDAOImpl();
                    if (up.getForm().get("idpessoa").toString().equals("")) {
                        if (dao.cadastrar(oAdministrador)) {
                            mensagem = "Adm cadastrado com Sucesso!";
                        } else {
                            mensagem = "Erro ao cadastrar Adm";
                        }
                    } else {
                        oAdministrador.setIdPessoa(Integer.parseInt(up.getForm().get("idpessoa")
                                .toString()));
                        if (dao.alterar(oAdministrador)) {
                            mensagem = "Adm alterado com Sucesso!";
                        } else {
                            mensagem = "Erro ao alterar Adm";
                        }
                    }
                    request.setAttribute("mensagem", mensagem);
                    request.getRequestDispatcher("ListarAdministrador").forward(request, response);
                } catch (Exception ex) {
                    System.out.println("Problemas no Servlet SalvarAdministrador \n Erro: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro de Upload \n Erro: " + ex.getMessage());
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
