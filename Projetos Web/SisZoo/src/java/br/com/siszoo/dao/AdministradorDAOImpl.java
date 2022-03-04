/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siszoo.dao;

import br.com.siszoo.model.Administrador;
import br.com.siszoo.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class AdministradorDAOImpl implements GenericDAO {

    private Connection conn;

    public AdministradorDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Administrador administrador = (Administrador) object;

        PreparedStatement stmt = null;
        String sql = "INSERT INTO administrador (nome_administrador, cpf_administrador, login_administrador, senha_administrador)"
                + " VALUES (?, ?, ?, ?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, administrador.getNomeAdministrador());
            stmt.setString(2, administrador.getCpfAdministrador());
            stmt.setString(3, administrador.getLoginAdministrador());
            stmt.setString(4, administrador.getSenhaAdministrador());
            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao cadastrar Administrador!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros da conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT a.*"
                + " FROM administrador a"
                + " ORDER BY a.nome_administrador;";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Administrador administrador = new Administrador();
                administrador.setIdAdministrador(rs.getInt("id_administrador"));
                administrador.setNomeAdministrador(rs.getString("nome_administrador"));
                administrador.setCpfAdministrador(rs.getString("cpf_administrador"));
                administrador.setLoginAdministrador(rs.getString("login_administrador"));
                administrador.setSenhaAdministrador(rs.getString("senha_administrador"));
                resultado.add(administrador);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Administrador!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão!"
                        + "\n Erro: " + ex.getMessage());
            }
        }
        return resultado;
    }

    @Override
    public void excluir(int idObject) {
        PreparedStatement stmt = null;
        String sql = "DELETE FROM administrador"
                + " WHERE id_administrador = ? ;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Erro ao excluir Administrador!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros da conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Administrador administrador = null;
        String sql = "SELECT a.*"
                + " FROM administrador a"
                + " WHERE a.id_administrador = ? ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                administrador = new Administrador();
                administrador.setIdAdministrador(rs.getInt("id_administrador"));
                administrador.setNomeAdministrador(rs.getString("nome_administrador"));
                administrador.setCpfAdministrador(rs.getString("cpf_administrador"));
                administrador.setLoginAdministrador(rs.getString("login_administrador"));
                administrador.setSenhaAdministrador(rs.getString("senha_administrador"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar Administrador!"
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

    @Override
    public Boolean alterar(Object object) {
        Administrador administrador = (Administrador) object;
        PreparedStatement stmt = null;
        String sql = "UPDATE administrador SET"
                + " nome_administrador = ?,"
                + " cpf_administrador = ?,"
                + " login_administrador = ?,"
                + " senha_administrador = ?"
                + " WHERE id_administrador = ? ; ";
        try {
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, administrador.getNomeAdministrador());
            stmt.setString(2, administrador.getCpfAdministrador());
            stmt.setString(3, administrador.getLoginAdministrador());
            stmt.setString(4, administrador.getSenhaAdministrador());
            stmt.setInt(5, administrador.getIdAdministrador());

            stmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao alterar Administrador!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros da conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    public Administrador logarAdministrador(String login, String senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Administrador administrador = null;
        String sql = "SELECT a.*"
                + " FROM administrador a"
                + " WHERE a.login_administrador = ?"
                + " AND a.senha_administrador = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                administrador = new Administrador();
                administrador.setIdAdministrador(rs.getInt("id_administrador"));
                administrador.setNomeAdministrador(rs.getString("nome_administrador"));
                administrador.setCpfAdministrador(rs.getString("cpf_administrador"));
                administrador.setLoginAdministrador(rs.getString("login_administrador"));
                administrador.setSenhaAdministrador(rs.getString("senha_administrador"));
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
