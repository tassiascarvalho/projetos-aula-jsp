/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hamp.DAO;

import br.com.hamp.model.Administrador;
import br.com.hamp.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.apache.commons.fileupload.FileItem;

/**
 *
 * @author Douglas
 */
public class AdmDAOImpl implements GenericDAO{

    private Connection conn;

    public AdmDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
 
    
    @Override
    public Boolean cadastrar(Object object) {
        Administrador adm= (Administrador) object;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO administrador (nome_adm, login_adm, senha_adm) values (?,?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, adm.getNomeAdm());
            stmt.setString(2, adm.getLoginAdm());
            stmt.setString(3, adm.getSenhaAdm());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
           System.err.println("Problemas ao cadastrar Administrador!Erro:" + ex.getMessage());
            ex.printStackTrace();
            return false; 
        }finally{
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.err.println("Problemas ao fechar conexão!Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
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
    public Administrador logarAdministrador(String login, String senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Administrador administrador = null;
        String sql = "SELECT a.*"
                + " FROM administrador a"
                + " WHERE a.login_adm = ?"
                + " AND a.senha_adm = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                administrador = new Administrador();     
                administrador.setNomeAdm(rs.getString("nome_adm"));
                administrador.setLoginAdm(rs.getString("login_adm"));
                administrador.setSenhaAdm(rs.getString("senha_adm"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao logar Administrador!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return administrador;
    }

    
    
}
