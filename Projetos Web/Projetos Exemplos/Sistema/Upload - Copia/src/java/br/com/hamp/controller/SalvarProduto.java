package br.com.hamp.controller;

import br.com.hamp.DAO.GenericDAO;
import br.com.hamp.DAO.ProdutoDAOImpl;
import br.com.hamp.model.Categoria;
import br.com.hamp.model.Produto;
import br.com.hamp.util.Upload;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Douglas Costa
 */
@WebServlet(name = "SalvarProduto", urlPatterns = {"/SalvarProduto"})
public class SalvarProduto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String mensagem;
        //Criação do atributo para cadastro do produto 

        //Criação de um novo objeto da Classe upload
        Upload up = new Upload();

        ///Descreve qual pasta vai receber a imagem do produto
        up.setFolderUpload("produtos");

        if (up.formProcess(getServletContext(), request)) {
            //Criação de um novo objeto do tipo produto
            Produto produto = new Produto();
            //Imagem do produto
            produto.setImagemProduto(up.getFiles().get(0));
            //Outros campos do form
            produto.setIdPessoaJ(Integer.parseInt(((up.getForm().get("idempresa").toString()))));
            produto.setNomeProduto(up.getForm().get("nome").toString());
            produto.setCategoriaProduto(up.getForm().get("categoria").toString());
            produto.setTamanhoProduto(up.getForm().get("tamanho").toString());
            produto.setPesoProduto(up.getForm().get("peso").toString());
            produto.setValorLocacaoDia(Double.parseDouble(up.getForm().get("preco").toString()));
            produto.setCorProduto(up.getForm().get("cor").toString());
            produto.setDescricaoProduto(up.getForm().get("desc").toString());
            produto.setReferenciaProduto(up.getForm().get("ref").toString());
            produto.setDisponibilidade(up.getForm().get("disp").toString());
            produto.setQuantidadeProduto(Integer.parseInt(up.getForm().get("quant").toString()));

            Integer idProduto = null;
                try {
                    ProdutoDAOImpl dao = new ProdutoDAOImpl();
                    idProduto = dao.cadastrarListar(produto);
                    if (idProduto != null) {
                        mensagem = "Produto públicado com sucesso";
                    } else {
                        mensagem = "Erro ao públicar produto";
                    }
                    request.setAttribute("mensagem", mensagem);
                } catch (Exception ex) {
                    System.err.println("Erro ao cadastrar Produto! Erro:" + ex.getMessage());
                    ex.printStackTrace();
                }
                try {
                    ProdutoDAOImpl dao = new ProdutoDAOImpl();
                    request.setAttribute("produto", dao.carregar(idProduto));
                    request.getRequestDispatcher("produto/salvar.jsp").forward(request, response);
                } catch (Exception ex) {
                    System.out.println("Problemas ao listar Produto! Erro: " + ex.getMessage());
                    ex.printStackTrace();
                }
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
