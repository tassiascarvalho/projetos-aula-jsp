package br.com.exemplosservlets.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
@WebServlet(urlPatterns = {"/CalcularValores"})
public class CalcularValores extends HttpServlet {

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
        
        Double numero1, numero2, resultado;
        String tipocalculo;
        
        //Receber Valores
        numero1= Double.parseDouble(request.getParameter("n1"));
        numero2= Double.parseDouble(request.getParameter("n2"));
        tipocalculo= request.getParameter("tipoc");
        
        //Processamento
        if(tipocalculo.equals("s")){
            resultado = numero1+numero2;
        }else if(tipocalculo.equals("i")){
            resultado = numero1-numero2;
        }else{
            resultado = numero1/numero2;
        }
        
        
        
        Double salarioatual=0.0, reajuste=0.0;
        
        
        
        if(salarioatual >= 1500 && salarioatual <1750){
            reajuste= salarioatual *(salarioatual * 0.12);
        }else if(salarioatual >= 1750 && salarioatual <2000){
            reajuste= salarioatual *(salarioatual * 0.10);        
        }else{
            
        }   
        
        
        
        //Enviar resposta
        request.setAttribute("resultado", resultado);
   
        request.getRequestDispatcher("exemplocalculo.jsp").forward(request, response);
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
