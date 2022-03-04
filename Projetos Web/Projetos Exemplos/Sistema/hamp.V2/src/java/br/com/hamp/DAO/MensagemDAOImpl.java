/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hamp.DAO;

import br.com.hamp.model.Categoria;
import br.com.hamp.model.Mensagem;
import br.com.hamp.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Douglas
 */
public class MensagemDAOImpl implements GenericDAO {

    private Connection conn;

    public MensagemDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Mensagem mensagem = (Mensagem) object;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO mensagem (mensagem, id_emissor, id_receptor) values (?,?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, mensagem.getMensagem());
            stmt.setInt(2, mensagem.getIdEmissor());
            stmt.setInt(3, mensagem.getIdReceptor());           
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println("Problemas ao cadastrar Mensagem!Erro:" + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.err.println("Problemas ao fechar conexão!Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
     public List<Object> listarMensagem(int idEmissor, int idReceptor) {         
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        String sql = "select m.* from mensagem m where (id_emissor=? and id_receptor=?) or (id_emissor=? and id_receptor=?) order by m.id_mensagem;";
        try {
            stmt = conn.prepareStatement(sql);        
            stmt.setInt(1, idEmissor);
            stmt.setInt(2, idReceptor);
            stmt.setInt(3, idReceptor);
            stmt.setInt(4, idEmissor);
            System.out.println(idEmissor);
            System.out.println(idReceptor);
            rs = stmt.executeQuery();
            while(rs.next()){
                Mensagem msg = new Mensagem();
                msg.setIdEmissor(rs.getInt("id_emissor"));
                msg.setIdReceptor(rs.getInt("id_receptor"));
                msg.setMensagem(rs.getString("mensagem"));
                resultado.add(msg);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Mensagem.!Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão!Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return resultado;

    }
    

    @Override
    public List<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Integer idObject) {
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
