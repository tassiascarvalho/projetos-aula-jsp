/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pwbook.controller;

import br.com.pwbook.dao.GenericDAO;
import br.com.pwbook.dao.UsuarioDAOImpl;
import br.com.pwbook.model.Usuario;
import br.com.pwbook.util.Conversoes;
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
@WebServlet(name = "SalvarUsuario", urlPatterns = {"/SalvarUsuario"})
public class SalvarUsuario extends HttpServlet {

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
        //Criar uma nova instancia na memoria
        Usuario oUsuario = new Usuario();
        //Recupera os dados direto em um objeto e coloca na memoria;
        //oUsuario.setIdUsuario(Integer.parseInt(request.getParameter("idUsuario")));
        oUsuario.setNomeUsuario(request.getParameter("nomeUsuario")); 
        oUsuario.setDataNascimentoUsuario(Conversoes.ConverterData(request.getParameter("dataNascimentoUsuario")));
        oUsuario.setEmailUsuario(request.getParameter("emailUsuario"));
        oUsuario.setSenhaUsuario(request.getParameter("senhaUsuario"));
        oUsuario.setTelefoneUsuario(request.getParameter("telefoneUsuario"));
        oUsuario.setGeneroUsuario(request.getParameter("generoUsuario"));
        oUsuario.setCaminhofotoUsuario(request.getParameter("caminhofotoUsuario"));
        oUsuario.setSinteseUsuario(request.getParameter("sinteseUsuario"));
        oUsuario.setCaminhocapaUsuario(request.getParameter("caminhocapaUsuario"));
        oUsuario.setTiposeguidorUsuario(request.getParameter("tiposeguidorUsuario"));
        
        String mensagem="";
        //Pegar os dados e levar para BD
        try{
            GenericDAO dao = new UsuarioDAOImpl();
            
            if(request.getParameter("id").equals("")){
                if(dao.cadastrar(oUsuario)){
                       mensagem ="Cadastrado com Sucesso";
                }else{
                       mensagem="Erro ao Cadastrar Usuario";
                }
            }else{
                oUsuario.setIdUsuario(Integer.parseInt(request.getParameter("idUsuario")));
                if(dao.alterar(oUsuario)){
                    mensagem ="Alterado com Sucesso";
                }else{
                    mensagem="Erro ao Alterar Usuario";
                }
            }
        }catch(Exception ex){
            System.out.println("Erro no Servlet SalvarUsuario Erro: " + ex.getMessage());
            ex.printStackTrace();
        }        
        request.setAttribute("mensagem", mensagem);
        request.getRequestDispatcher("ListarUsuario").forward(request, response);        
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
