/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hamp.controller;

import br.com.hamp.DAO.GenericDAO;
import br.com.hamp.DAO.PedidoDAOImpl;
import br.com.hamp.DAO.PessoaFDAOImpl;
import br.com.hamp.DAO.PessoaJDAOImp;
import br.com.hamp.DAO.ProdutoDAOImpl;
import br.com.hamp.model.Pedido;
import br.com.hamp.model.PessoaFisica;
import br.com.hamp.model.Produto;
import br.com.hamp.util.Conversoes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "SalvarPedido", urlPatterns = {"/SalvarPedido"})
public class SalvarPedido extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");

        int idpessoaf = Integer.parseInt(request.getParameter("idpessoaf"));
        int idpessoaj = Integer.parseInt(request.getParameter("idpessoaj"));
        int idproduto = Integer.parseInt(request.getParameter("idproduto"));
        //Pedido
        String totalDias = request.getParameter("totalDias");
        String totalLocacao = request.getParameter("total");
        Date dataInicio = Conversoes.converterData(request.getParameter("dataInicio"));
        Date dataLimite = Conversoes.converterData(request.getParameter("dataLimite"));
        //Endereço
        String endereco = request.getParameter("endereco");
        String numero = request.getParameter("numero");
        String bairro = request.getParameter("bairro");
        String estado = request.getParameter("estado");
        String cidade = request.getParameter("cidade");
        String cep = request.getParameter("cep");
        //PesoaFisia
        String nomePessoaFisica = request.getParameter("nome") ;
        String telefonePessoaFisica = request.getParameter("telefone");
        String cpf = request.getParameter("cpf");
        String emailPessoaFisica = request.getParameter("email");
        //PesoaJuridica
        String nomePessoaJuridica = request.getParameter("nomeRespon");
        String razaoSocial = request.getParameter("razaosocial");
        String cnpj = request.getParameter("cnpj");
        String emailPessoaJuridica = request.getParameter("emailEmpresa");
        String telefonePessoaJuridica = request.getParameter("telefoneEmpresa");
        //Produto
        String nomeProduto = request.getParameter("nomeproduto");
        String imagemProduto = request.getParameter("imgproduto");
        String categoriaPoduto = request.getParameter("categoria");
        String tamanhoProduto = request.getParameter("tamanho");
        String pesoProduto = request.getParameter("peso");
        String corPredominante = request.getParameter("cor");
       
        
        Pedido pedido = new Pedido();
        pedido.setIdPessoFisica(idpessoaf);
        pedido.setIdpessoaJuridica(idpessoaj);
        pedido.setProduto(new Produto(idproduto));
        pedido.setTotalDias(totalDias);
        pedido.setValorLocacao(totalLocacao);
        pedido.setDataInicio(dataInicio);
        pedido.setDataLimite(dataLimite);
        pedido.setEnderecoLocal(endereco);
        pedido.setNumeroLocal(numero);
        pedido.setBairroLocal(bairro);
        pedido.setEstadoLocal(estado);
        pedido.setCidadeLocal(cidade);
        pedido.setCepLocal(cep);
        pedido.setCnpj(cnpj);
        pedido.setNomePessoaFisica(nomePessoaFisica);
        pedido.setTelefonePessoaFisica(telefonePessoaFisica);
        pedido.setCpf(cpf);
        pedido.setEmailPessoaFisica(emailPessoaFisica);
        
        pedido.setNomePessoaJuridica(nomePessoaJuridica);
        pedido.setRazaoSocial(razaoSocial);
        pedido.setEmailPessoaJuridica(emailPessoaJuridica);
        pedido.setTelefonePessoaFisica(telefonePessoaJuridica);
        
        pedido.setNomeProduto(nomeProduto);
        pedido.setImagemProduto(imagemProduto);
        pedido.setCategoriaPoduto(categoriaPoduto);
        pedido.setTamanhoProduto(tamanhoProduto);
        pedido.setPesoProduto(pesoProduto);
        pedido.setCorPredominante(corPredominante);
        

        //Cadastra pedido
        try {
            GenericDAO dao = new PedidoDAOImpl();
            if (dao.cadastrar(pedido)) {
                System.out.println("PEDIDO CADASTRADO COM SUCESSO !!!!!!!!!!!");
            } else {
                System.out.println("ERRO AO CADASTRAR PEDIDO !!!!!!!!!!!!!!!!!");
            }
        } catch (Exception ex) {
            System.out.println("Erro ao cadastrar pedido " + ex.getMessage());
            ex.printStackTrace();
        }
        //Lista cliente
        try {
            PessoaFDAOImpl dao = new PessoaFDAOImpl();
            request.setAttribute("pessoaf", dao.listarIndividualPessoaF(idpessoaf));
        } catch (Exception ex) {
            System.out.println("Erro ao listar Cliente " + ex.getMessage());
            ex.printStackTrace();
        }
        //Lista a empresa
        try {
            PessoaJDAOImp dao = new PessoaJDAOImp();
            request.setAttribute("pessoaj", dao.listarIndividualPessoaJ(idpessoaj));
        } catch (Exception ex) {
            System.out.println("Erro ao listar Empresa " + ex.getMessage());
            ex.printStackTrace();
        }
        //Lista o produto
        try {
            ProdutoDAOImpl dao = new ProdutoDAOImpl();
            request.setAttribute("produto", dao.listarIndividual(idproduto));
        } catch (Exception ex) {
            System.err.println("Erro ao listar Produtos. Erro: " + ex.getMessage());
            ex.printStackTrace();
        }

        request.setAttribute("pedido", pedido);
        request.setAttribute("totalDias", totalDias);
        request.setAttribute("totalLocacao", totalLocacao);
        request.setAttribute("endereco", endereco);
        request.setAttribute("numero", numero);
        request.setAttribute("bairro", bairro);
        request.setAttribute("estado", estado);
        request.setAttribute("cidade", cidade);
        request.getRequestDispatcher("hamp/contrato.jsp").forward(request, response);
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
