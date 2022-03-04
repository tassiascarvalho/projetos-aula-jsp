package br.com.exemplosservlets.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.exemplosservlets.dao.DisciplinaDAOImpl;
import br.com.exemplosservlets.dao.GenericDAO;
import br.com.exemplosservlets.model.Disciplina;
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
@WebServlet(urlPatterns = {"/CadastrarDisciplina"})
public class CadastrarDisciplina extends HttpServlet {

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
        
        //Instanciar o Objeto
        Disciplina oDisciplina = new Disciplina();
        
        oDisciplina.setnomeDisciplina(request.getParameter("nomeDisciplina"));
        oDisciplina.setdescricaoDisciplina(request.getParameter("descricaoDisciplina"));
        oDisciplina.setementaDisciplina(request.getParameter("ementaDisciplina"));
        
        //Processamento
        String mensagem= "";
        
        //Armazenamento
        //Conexão com BD
        try{
            GenericDAO dao = new DisciplinaDAOImpl();
            if(dao.cadastrar(oDisciplina)){
                mensagem= "Disciplina "+ oDisciplina.getnomeDisciplina() +" Cadastrada com Sucesso";
            }else{
                mensagem= "Disciplina "+ oDisciplina.getnomeDisciplina() +" Erro ao cadastrar";
            }
        }catch(Exception ex){
            System.out.println("Erro ao Cadastrar Disciplina - Servlet \n Erro:" + ex.getMessage());
            ex.printStackTrace();
        }
        
        //Retorno
        request.setAttribute("mensagem", mensagem);
        
        request.getRequestDispatcher("ListarDisciplina").forward(request, response);
        
                
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
