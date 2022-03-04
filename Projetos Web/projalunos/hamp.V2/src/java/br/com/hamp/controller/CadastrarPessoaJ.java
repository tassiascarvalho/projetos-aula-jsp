package br.com.hamp.controller;

import br.com.hamp.DAO.GenericDAO;
import br.com.hamp.DAO.PessoaJDAOImp;
import br.com.hamp.model.PessoaJuridica;
import br.com.hamp.util.Upload;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Douglas
 */
@WebServlet(name = "CadastrarPessoaJ", urlPatterns = {"/CadastrarPessoaJ"})
public class CadastrarPessoaJ extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // Mensagem para status de cadastro
        String mensagem = null;

        //Criação de um objeto de formulário
        Upload up = new Upload();

        //Descreve qual será a pasta que receberá os arquivos
        up.setFolderUpload("fotos");
        //Processa o formulário
        if (up.formProcess(getServletContext(), request)) {
            //Criação do obejto PESSOA JURIDICA
            PessoaJuridica pessoaj = new PessoaJuridica();
            //Imagem pessoa juridica
            pessoaj.setImagemPessoaJ(up.getFiles().get(0));
            //Outros campos do form
            pessoaj.setNomePessoa(up.getForm().get("nomepessoa").toString());
            pessoaj.setEmailPessoa(up.getForm().get("emailpessoa").toString());
            pessoaj.setSenhaPessoa(up.getForm().get("senhapessoa").toString());
            pessoaj.setCpnjPessoaJuridica(up.getForm().get("cpnj").toString());
            pessoaj.setRazaoSocialPessoaJuridica(up.getForm().get("razaosocial").toString());
            pessoaj.setTelefonePessoa(up.getForm().get("telefonepessoa").toString());
           

            if ((up.getForm().get("idpessoa").toString()).equals("")) {
                try {
                    GenericDAO dao = new PessoaJDAOImp();
                    if (dao.cadastrar(pessoaj)) {
                        mensagem = "Cadastro efetuado com sucesso";
                    } else {
                        mensagem = "Usuário já existe” /”CPF incorreto”/”CPNJ incorreto";
                    }
                    request.setAttribute("mensagem", mensagem);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                } catch (Exception ex) {
                    System.err.println("Erro ao cadastrar Empresa" + ex.getMessage());
                }
            } else {
                pessoaj.setIdPessoa(Integer.parseInt(up.getForm().get("idpessoa").toString()));
                try {
                    GenericDAO dao = new PessoaJDAOImp();
                    if (dao.alterar(pessoaj)) {
                        mensagem = "Pessoa Juridica alterada com sucesso";
                    } else {
                        mensagem = "Erro ao alterar Pessoa Juridicva";
                    }
                    request.setAttribute("mensagem", mensagem);
                    request.getRequestDispatcher("pessoaJuridica/perfil.jsp").forward(request, response);
                } catch (Exception ex) {
                    System.err.println("Problemas ao alterar Pessoa Juridica! Erro:" + ex.getMessage());
                    ex.printStackTrace();

                }
            }

        } else {
            System.out.println("Erro ao enviar arquivo!");
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
