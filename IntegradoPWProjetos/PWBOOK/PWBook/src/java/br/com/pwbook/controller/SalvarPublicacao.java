/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pwbook.controller;

import br.com.pwbook.dao.GenericDAO;
import br.com.pwbook.dao.PublicacaoDAOImpl;
import br.com.pwbook.model.Publicacao;
import br.com.pwbook.model.Usuario;
import br.com.pwbook.util.Conversoes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.enterprise.context.Conversation;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tassia
 */
@WebServlet(name = "SalvarPublicacao", urlPatterns = {"/SalvarPublicacao"})
public class SalvarPublicacao extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        //RECUPERAR OS DADOS
        Publicacao oPublicacao = new Publicacao();
        
        oPublicacao.setDataPublicacao(Conversoes.ConverterData(request.getParameter("dataPublicacao")));
        oPublicacao.setTextoPublicacao(request.getParameter("textoPublicacao"));
        oPublicacao.setTipoPublicacao(Integer.parseInt(
                    request.getParameter("tipoPublicacao")));  
        //Classe a qual ela se associa.
        Usuario oUsuario = new Usuario(Integer.parseInt(request.getParameter("idUsuario")));
        oPublicacao.setUsuario(oUsuario);
        String mensagem = null;
        try{
            GenericDAO dao = new PublicacaoDAOImpl();
            if(request.getParameter("idPublicacao").equals("")){
                //Cadastrar
                if(dao.cadastrar(oPublicacao)){
                    mensagem = "Publicação Cadastrada com Sucesso";
                }else{
                    mensagem = "Erro ao Cadastrar Publicação";
                }                    
            }else{
                //alterar - Recuperar o ID para saber qual altera
                oPublicacao.setIdPublicacao(Integer.parseInt(request.getParameter("idPublicacao")));
                if(dao.alterar(oPublicacao)){
                    mensagem = "Publicação Alterada com Sucesso";
                }else{
                    mensagem = "Erro ao Alterar Publicação";
                }                    
            }   
            
            //Adicionar no servlet SalvarPublicacao
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("gerenciar/gerenciarpublicacao.jsp").forward(request, response);
            
        }catch(Exception ex){
            System.out.println("Erro no Servlet SalvarPublicação" + ex.getMessage());
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
