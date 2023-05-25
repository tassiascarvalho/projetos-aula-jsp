package br.com.processorequestresponse.controller;

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
@WebServlet(urlPatterns = {"/Exercicio2IF"})
public class Exercicio2IF extends HttpServlet {

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
        /*2.	Desenvolva um software para calcular o reajuste salarial. 
        Por padrão, o aumento será de 15%. Entretanto, 
        deve ser aplicada uma regra diferente para cada faixa salarial. Regras:
            para 1.500,00 >= salarioAtual < 1.750,00: aumento igual a 12%
            para 1.750,00 >= salarioAtual < 2.000,00: aumento igual a 10%
            para 2.000,00 >= salarioAtual < 3.000,00: aumento igual a 7%
            para acima de 3.000,00: aumento igual a 5%.
        
        Sintaxe:
            if(condição1 && condição2){
                Comandos ser verdadeiras as condições
            }else if(condições){
                Comandos
            }else{
                Comandos
            }    
        */        
        Double salarioatual = Double.parseDouble(request.getParameter("salarioatual"));
        Double reajuste=0.0;
        if(salarioatual>=1500 && salarioatual<1750){
            reajuste = salarioatual * 0.12;            
        }else if(salarioatual>=1750 && salarioatual<2000){
            reajuste = salarioatual * 0.10;
        }else if(salarioatual>=2000 && salarioatual <3000){
            reajuste = salarioatual * 0.07;
        }else if(salarioatual>=3000){
            reajuste = salarioatual * 0.05;            
        }else{
            reajuste = salarioatual * 0.15;
        }
                  
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Exercicio2IF</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Salario " + salarioatual + "</h1>");
            out.println("<h1>Reajuste " + reajuste + "</h1>");
            out.println("<h1>Novo Salario " + (salarioatual+reajuste) + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
