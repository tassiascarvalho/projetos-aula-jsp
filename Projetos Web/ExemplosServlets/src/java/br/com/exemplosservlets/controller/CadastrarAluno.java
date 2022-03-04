package br.com.exemplosservlets.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.exemplosservlets.dao.AlunoDAOImpl;
import br.com.exemplosservlets.dao.GenericDAO;
import br.com.exemplosservlets.model.Aluno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tassia
 */
@WebServlet(urlPatterns = {"/CadastrarAluno"})
public class CadastrarAluno extends HttpServlet {

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
        
        ///Instanciar Objeto de uma classe;        
        Aluno oAluno = new Aluno();
        
        //Recupera os valores que estão vindo do form... através do request
        //nomeObjeto.metododeacesso(request.parametros('nomeparametro'));
        oAluno.setnomeAluno(request.getParameter("nomeAluno"));
        oAluno.setenderecoAluno(request.getParameter("enderecoAluno"));
        oAluno.setnumeroAluno(request.getParameter("numeroAluno"));
        oAluno.setcidadeAluno(request.getParameter("cidadeAluno"));
        oAluno.settelefoneAluno(request.getParameter("telefoneAluno"));
        oAluno.setidadeAluno(Integer.parseInt(request.getParameter("idadeAluno")));
        oAluno.setemailAluno(request.getParameter("emailAluno"));
        oAluno.setsenhaAluno(request.getParameter("senhaAluno"));
        
        //tomada de decisão
        String mensagem="";        
        /* if(oAluno.getIdadeAluno() >= 18){
           mensagem= "é maior.";
        }else{
           mensagem=" é menor";
        } */
        //Manipulação com o BD
        
        try{
            GenericDAO dao= new AlunoDAOImpl();
            if(dao.cadastrar(oAluno)){
                System.out.println("Cadastrado com Sucesso");                
            }            
        }catch(Exception ex){
                System.out.println("Erro ao Cadastrar");
        }
        
        
        //Resposta
        request.setAttribute("mensagem", mensagem);
        
        request.getRequestDispatcher("gerenciaraluno.jsp").forward(request, response);
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
