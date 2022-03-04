/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siszoo.dao;

import br.com.siszoo.model.Especie;
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
public class EspecieDAOImpl implements GenericDAO {

    private Connection conn;

    public EspecieDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Especie especie = (Especie) object;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO especie (nome_especie, descricao_especie)"
                + " VALUES (?, ?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, especie.getNomeEspecie());
            stmt.setString(2, especie.getDescricaoEspecie());
            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao cadastrar Especie!"
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
        String sql = "SELECT e.*"
                + " FROM especie e"
                + " ORDER BY e.nome_especie;";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Especie especie = new Especie();
                especie.setIdEspecie(rs.getInt("id_especie"));
                especie.setNomeEspecie(rs.getString("nome_especie"));
                especie.setDescricaoEspecie(rs.getString("descricao_especie"));
                resultado.add(especie);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Especie!"
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
        return resultado;
    }

    @Override
    public void excluir(int idObject) {
        PreparedStatement stmt = null;
        String sql = "DELETE FROM especie"
                + " WHERE id_especie = ? ;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Erro ao excluir Especie!"
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
        Especie especie = null;
        String sql = "SELECT e.* FROM especie e"
                + " WHERE e.id_especie = ? ;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                especie = new Especie();
                especie.setIdEspecie(rs.getInt("id_especie"));
                especie.setNomeEspecie(rs.getString("nome_especie"));
                especie.setDescricaoEspecie(rs.getString("descricao_especie"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar Especie!"
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
        return especie;
    }

    @Override
    public Boolean alterar(Object object) {
        Especie especie = (Especie) object;
        PreparedStatement stmt = null;
        String sql = "UPDATE especie  SET"
                + " nome_especie = ?,"
                + " descricao_especie = ?"
                + " WHERE id_especie = ? ; ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, especie.getNomeEspecie());
            stmt.setString(2, especie.getDescricaoEspecie());
            stmt.setInt(3, especie.getIdEspecie());
            stmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao alterar Especie!"
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
}
