/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siszoo.controller;

import br.com.siszoo.dao.AnimalDAOImpl;
import br.com.siszoo.dao.GenericDAO;
import br.com.siszoo.model.Animal;
import br.com.siszoo.model.Especie;
import br.com.siszoo.util.Conversoes;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "SalvarAnimal", urlPatterns = {"/SalvarAnimal"})
public class SalvarAnimal extends HttpServlet {

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
        
        Animal animal = new Animal();
        
        animal.setNomeAnimal(request.getParameter("nome"));
        animal.setDataNascimentoAnimal(Conversoes.converterData(request.getParameter("data_nascimento")));
        animal.setPesoAnimal(Double.parseDouble(request.getParameter("peso")));
        
        Integer idEspecie = Integer.parseInt(request.getParameter("idespecie")); //pega o parâmetro
        Especie especie = new Especie(idEspecie); //tem um contrutor só com o id na classe Especie        
        animal.setEspecie(especie);
        
        
        try {
            GenericDAO dao = new AnimalDAOImpl();
            if (request.getParameter("id").equals("")) {
                //Cadastrar
                if (dao.cadastrar(animal)) {
                    mensagem = "Animal cadastrado com sucesso!";
                } else {
                    mensagem = "Problemas ao cadastrar Animal!";
                }
            } else if (!request.getParameter("id").equals("")) {
                //Alterar
                animal.setIdAnimal(Integer.parseInt(request.getParameter("id")));
                if (dao.alterar(animal)) {
                    mensagem = "Animal alterado com sucesso!";
                } else {
                    mensagem = "Problemas ao alterar Animal!";
                }
            }
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("Animal/salvar.jsp").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas ao salvar Animal!"
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
