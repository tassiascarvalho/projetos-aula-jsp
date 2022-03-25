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
public class ClienteDAOImpl implements GenericDAO {

    Connection conn;

    //construtor com a conexão
    public ClienteDAOImpl() throws Exception {
        try {
            conn = ConnectionFactory.conectar();
            System.out.println("Conectado com Sucesso");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        PreparedStatement stmt = null;
        Cliente oCliente = (Cliente) object;

        String sql = "INSERT INTO cliente "
                + "(observacao, situacao, "
                + "permitelogin, idpessoa) "
                + "VALUES (?,?,?,?)";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oCliente.getObservacao());
            stmt.setString(2, oCliente.getSituacao());
            stmt.setString(3, oCliente.getPermiteLogin());
            try {
                //Cadastra a pessoa e retorna o id para a filha
                stmt.setInt(4, new PessoaDAOImpl().cadastrar(oCliente));
            } catch (Exception ex) {
                System.out.println("Erro ao cadastrar Pessoa (cliente)");
            }
            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao salvar Cliente(Pessoa) Erro: "
                    + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexao Erro: "
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
