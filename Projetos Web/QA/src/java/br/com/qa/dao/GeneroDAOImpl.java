/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qa.dao;

import br.com.qa.model.Genero;
import br.com.qa.util.ConnectionFactory;
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
public class GeneroDAOImpl implements GenericDAO {

    private Connection conn;

    public GeneroDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.conectar();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Genero genero = (Genero) object;
        PreparedStatement stmt = null;
        String sql = "Insert into genero (nomegenero, descricaogenero) values (?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, genero.getNomeGenero());
            stmt.setString(2, genero.getDescricaoGenero());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Gênero! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }

    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select g.* from genero g order by g.nomegenero;";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Genero genero = new Genero();
                genero.setIdGenero(rs.getInt("idgenero"));
                genero.setNomeGenero(rs.getString("nomegenero"));
                genero.setDescricaoGenero(rs.getString("descricaogenero"));
                resultado.add(genero);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Gênero! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return resultado;
    }

    @Override
    public void excluir(int idObject) {
        PreparedStatement stmt=null;
        String sql="Delete from genero where idgenero=?;";
        try{
            stmt=conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
        }catch (SQLException ex){
            System.out.println("Problemas ao excluir Gênero! Erro: "+ex.getMessage());
            ex.printStackTrace();
        }finally {
            try{
                ConnectionFactory.closeConnection(conn,stmt);
            }catch (Exception ex){
                System.out.println("Problemas ao fechar conexão! Erro: "+ex.getMessage());
                ex.printStackTrace();
            }
        } 
    }

    @Override
    public Object carregar(int idObject) {
        Genero genero=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        String sql="select g.* from genero g where g.idgenero=?;";
        try {
            stmt=conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs=stmt.executeQuery();
            if (rs.next()){
                genero=new Genero();
                genero.setIdGenero(rs.getInt("idgenero"));
                genero.setNomeGenero(rs.getString("nomegenero"));
                genero.setDescricaoGenero(rs.getString("descricaogenero"));
            }
        }catch (SQLException ex){
            System.out.println("Problemas ao carregar Gênero: "+ex.getMessage());
            ex.printStackTrace();
        }finally{
            try{
                ConnectionFactory.closeConnection(conn,stmt,rs);
            } catch(Exception ex){
                System.out.println("Problemas ao fechar conexão! Erro: "+ex.getMessage());
                ex.printStackTrace();
            }
        }return genero;
    }

    @Override
    public Boolean alterar(Object object) {
        Genero genero=(Genero) object;
        PreparedStatement stmt=null;
        String sql="update genero set nomegenero=?, descricaogenero=? where idgenero=?;";
        try{
            stmt=conn.prepareStatement(sql);
            stmt.setString(1, genero.getNomeGenero());
            stmt.setString(2, genero.getDescricaoGenero());
            stmt.setInt(3, genero.getIdGenero());
            stmt.executeUpdate();
            return true;
        }catch (SQLException ex){
            System.out.println("Problemas ao alterar Gênero! Erro: "+ex.getMessage());
            ex.printStackTrace();
        return false;
    }finally {
        try{
            ConnectionFactory.closeConnection(conn,stmt);
        }catch (Exception ex){
            System.out.println("Problemas ao fechar conexão! Erro: "+ex.getMessage());
            ex.printStackTrace();
        }
}

}
}
