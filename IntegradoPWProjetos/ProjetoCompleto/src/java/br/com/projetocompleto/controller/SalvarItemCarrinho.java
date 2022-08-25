/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.controller;

import br.com.projetocompleto.dao.GenericDAO;
import br.com.projetocompleto.dao.ItensSaidaDAOImpl;
import br.com.projetocompleto.model.ItensSaida;
import br.com.projetocompleto.model.Produto;
import br.com.projetocompleto.model.Saida;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tassia
 */
@WebServlet(name = "SalvarItemCarrinho", urlPatterns = {"/SalvarItemCarrinho"})
public class SalvarItemCarrinho extends HttpServlet {

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
        
        //Recuperar os dados
        ItensSaida oItensSaida = new ItensSaida();
        //Criar construtor na classe produto marcando somente o ID
        oItensSaida.setoProduto(new Produto(Integer.parseInt(request.getParameter("idproduto"))));
        oItensSaida.setValorUnItem(Double.parseDouble(request.getParameter("valorunitem")));
        //Recuperar o ID do carrinho da sessão
        HttpSession sessaoAtiva = request.getSession(true);
        Saida oSaida = new Saida();
        oSaida = (Saida) sessaoAtiva.getAttribute("carrinho");
        //Passa a saída que estava na sessão
        oItensSaida.setoSaida(oSaida);
        String mensagem= "";
        try{
            GenericDAO dao = new ItensSaidaDAOImpl();
            if(dao.cadastrar(oItensSaida)){
                mensagem = "Item Adicionado ao Carrinho";
            }else{
                mensagem = "Erro ao Adicionar Item";
            }
        }catch(Exception ex){
            System.out.println("Erro no Servlet SalvarItemCarrinho "+ex.getMessage());
            ex.printStackTrace();
        }
        request.setAttribute("mensagem", mensagem);
        request.getRequestDispatcher("ListarItensSaida").forward(request, response);
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
