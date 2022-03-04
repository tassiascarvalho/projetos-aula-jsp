/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qa.controller;

import br.com.qa.dao.CategoriaDAOImpl;
import br.com.qa.dao.GenericDAO;
import br.com.qa.model.Categoria;
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
@WebServlet(name = "SalvarCategoria", urlPatterns = {"/SalvarCategoria"})
public class SalvarCategoria extends HttpServlet {

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
        
        Categoria categoria = new Categoria();
        
        categoria.setDescricaoCategoria(request.getParameter("descricaocategoria"));
        

        //cria a váriavel responsável pelo retorno
        String mensagem = "";
        try {
            //Instância a Classe, que já possui a conexão com o BD
            GenericDAO dao = new CategoriaDAOImpl();
            //Verifica se é um cadastro ou uma alteração.
            if (request.getParameter("idcategoria").equals("")) {
                  //Cadastrar
                if (dao.cadastrar(categoria)) {
                    mensagem = "Categoria cadastrado com sucesso!";
                } else {
                    mensagem = "Problemas ao cadastrar Categoria!";
                }
            } else if (!request.getParameter("idcategoria").equals("")) {
                //Alterar
                categoria.setIdCategoria(Integer.parseInt
                             (request.getParameter("idcategoria")));
                if (dao.alterar(categoria)) {
                    mensagem = "Categoria alterado com sucesso!";
                } else {
                    mensagem = "Problemas ao alterar Categoria!";
                }
            }
            //request - a requesição da página ao servidor, sendo dinamica a um response
            //setAttribute() atribuir objetos, respostas a requisição, e tambem têm o getAttribute()
            //sendo possível recuperar esses valores na JSP.
            request.setAttribute("mensagem", mensagem);
            //O "forward" serve para transferir o controle para outro componente web (servlet/JSP). 
            //Você deve lembrar como ele funciona: redireciona seus objetos request e reponse 
            //para o recurso que você aponta no getRequestDispatcher.
            request.getRequestDispatcher("ListarCategoria").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas ao salvar Categoria!"
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
