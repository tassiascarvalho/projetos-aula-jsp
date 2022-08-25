/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controledeusuario.dao;

import br.com.controledeusuario.model.Fornecedor;
import br.com.controledeusuario.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Ghost
 */
public class FornecedorDAOImpl implements GenericDAO{


    Connection conn;
    //construtor com a conexão
    public FornecedorDAOImpl() throws Exception {
        try{
            conn = ConnectionFactory.conectar();
            System.out.println("Conectado com Sucesso");
        }catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    
    @Override
    public Boolean cadastrar(Object object) {
       PreparedStatement stmt = null;
       Fornecedor oFornecedor = (Fornecedor) object;
       
       String sql = "INSERT INTO FORNECEDOR (url, observacao, situacao, permitelogin, idpessoa)" 
               + "VALUES (?, ?, ?, ?, ?)";
       
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oFornecedor.getUrl());
            stmt.setString(2, oFornecedor.getObservacao());
            stmt.setString(3, oFornecedor.getSituacao());
            stmt.setString(4, oFornecedor.getPermiteLogin());
            try {
                stmt.setInt(5, new PessoaDAOImpl().cadastrar(oFornecedor));
            }catch (Exception ex) {
                System.out.println("Erro ao cadastrar Pessoa (Fornecedor)");
            }
            stmt.execute();
            return true;
        }catch (Exception ex){
            System.out.println("Erro ao salvar Fornecedor (Pessoa) Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        }finally{
            try{
                ConnectionFactory.fechar(conn, stmt, null);                
            }catch (Exception ex) {
                System.out.println("Erro ao fechar conexao Erro: " + ex.getMessage());
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
