/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controledeusuario.dao;

import br.com.controledeusuario.model.Cliente;
import br.com.controledeusuario.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Tassia
 */
public class ClienteDAOImpl implements GenericDAO{
    
    //Conexão com o BD
    private Connection conn;

    public ClienteDAOImpl() throws Exception {
        //Construtor da Classe;
        try {
            this.conn = ConnectionFactory.conectar();
            System.out.println("Conectado com Sucesso");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    
    @Override
    public Boolean cadastrar(Object object) {
        Cliente oCliente = (Cliente) object;
        PreparedStatement stmt = null;

        String sql = "INSERT INTO cliente "
                + "(idpessoa, "
                + "observacao, " //Preciso do atributo da classe pai
                + "situacao, "
                + "permitelogin)"
                + "VALUES(?, ?, ?, ?);";       
        try {
            stmt = conn.prepareStatement(sql);
            try {
                stmt.setInt(1, new PessoaDAOImpl().cadastrar(oCliente));
            } catch (Exception ex) {
                System.out.println("Erro ao cadastrar Pessoa \n Erro: " 
                        + ex.getMessage());
                ex.printStackTrace();
            }
            stmt.setString(2, oCliente.getObservacao());
            stmt.setString(3, oCliente.getSituacao());
            stmt.setString(4, oCliente.getPermiteLogin());
            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao cadastrar ADM \n Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexao \n Erro: " + ex.getMessage());
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
