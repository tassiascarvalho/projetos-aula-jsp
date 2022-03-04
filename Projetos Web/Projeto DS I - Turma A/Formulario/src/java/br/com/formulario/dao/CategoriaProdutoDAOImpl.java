/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.formulario.dao;

import br.com.formulario.model.CategoriaProduto;
import br.com.formulario.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Tassia
 */
public class CategoriaProdutoDAOImpl implements GenericDAO{

    
    //Quando a classe DAOImpl é criada, 
    //a  primeira ação que deve ser realizada é a conexão com o BD
    private Connection conn; 
    //Váriavel que armazenará a conexão
    
    
    public CategoriaProdutoDAOImpl() throws Exception  {
         try {
            this.conn = ConnectionFactory.abrirconexao(); //Realiza a Conexão
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }   
    }

    @Override
    public Boolean cadastrar(Object object) {
        //stmt indica que haverá manipulação de dados
        PreparedStatement stmt = null;
        //Instância o objeto com os dados que virão do Servlet.
        CategoriaProduto oCategoria = (CategoriaProduto) object;
       
        String sql="Insert into Categoria_Produto("
                + "nome_categoria_produto,"
                + "descricao_categoria_produto)"
                + "values (?,?)";
        
        try{
            //O stmt utiliza a conexão criada, e prepara o SQL com o stmt
            stmt = conn.prepareStatement(sql);
            //Atribui os valores para os parametros (?)
            stmt.setString(1, oCategoria.getNomeCategoriaProduto());
            stmt.setString(2, oCategoria.getDescricaoCategoriaProduto());
            //Executa o SQL, sem retorno
            stmt.execute();
            //Se tudo der certo, e conectar ocorrer a inserção o método retorna true
            return true;
        }catch (Exception ex) {
            //Caso aconteça erro durante a inserção de dados 
            //executa os comandos do catch
            //que exibirá os erros
            System.out.println("Erro ao cadastrar Categoria! "
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally{
            //independentemente se der certo ou errado é 
            //necessário fechar a conexão com o BD
            try {
                ConnectionFactory.fechar(conn, stmt);
            }catch (Exception ex) {
                System.out.println("Problemas ao fechar os"
                        + " parâmetros da conexão! \n Erro: " 
                        + ex.getMessage());
                ex.printStackTrace();
            } 
        }      
        
    }

    @Override
    public List<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object carregar(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
