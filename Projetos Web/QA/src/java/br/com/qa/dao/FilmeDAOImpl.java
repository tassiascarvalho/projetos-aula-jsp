package br.com.qa.dao;

import br.com.qa.model.Categoria;
import br.com.qa.model.Filme;
import br.com.qa.model.Genero;
import br.com.qa.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAOImpl implements GenericDAO {

    private Connection conn;

    public FilmeDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.conectar();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Filme filme = (Filme) object;
        PreparedStatement stmt = null;
        String sql = "Insert into filme (nomefilme, duracaofilme, sinopsefilme,"
                + "classificacaofilme,idgenero, idcategoria) values (?,?,?,?,?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, filme.getNomeFilme());
            stmt.setInt(2, filme.getDuracaoFilme());
            stmt.setString(3, filme.getSinopseFilme());
            stmt.setString(4, filme.getClassificacaoFilme());
            stmt.setInt(5, filme.getGenero().getIdGenero());
            stmt.setInt(6, filme.getCategoria().getIdCategoria());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Filme! Erro: " + ex.getMessage());
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
        String sql = "select f.*, g.nomegenero, c.descricaocategoria "
                + "from filme f, genero g, categoria c"
                + " where f.idgenero= g.idgenero and f.idcategoria = c.idcategoria;";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Filme filme = new Filme();
                filme.setIdFilme(rs.getInt("idfilme"));
                filme.setNomeFilme(rs.getString("nomefilme"));
                filme.setDuracaoFilme(rs.getInt("duracaofilme"));
                filme.setSinopseFilme(rs.getString("sinopsefilme"));
                filme.setClassificacaoFilme(rs.getString("classificacaofilme"));
                filme.setGenero(new Genero(rs.getInt("idgenero"), rs.getString("nomegenero")));
                filme.setCategoria(new Categoria(rs.getInt("idcategoria"), rs.getString("descricaocategoria")));
                resultado.add(filme);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Filme! Erro: " + ex.getMessage());
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
        PreparedStatement stmt = null;
        String sql = "Delete from filme where idfilme=?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Problemas ao excluir Filme! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Object carregar(int idObject) {
        Filme filme = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select f.* from filme f where f.idfilme=?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                filme = new Filme();
                filme.setIdFilme(rs.getInt("idfilme"));
                filme.setNomeFilme(rs.getString("nomefilme"));
                filme.setDuracaoFilme(rs.getInt("duracaofilme"));
                filme.setSinopseFilme(rs.getString("sinopsefilme"));
                filme.setClassificacaoFilme(rs.getString("classificacaofilme"));
                filme.setGenero(new Genero(rs.getInt("idgenero")));
                filme.setCategoria(new Categoria(rs.getInt("idcategoria")));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar Filme: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return filme;
    }

    @Override
    public Boolean alterar(Object object) {
        Filme filme = (Filme) object;
        PreparedStatement stmt = null;
        String sql = "update filme set nomefilme=?, duracaofilme=?, sinopsefilme=?, classificacaofilme=?,idgenero=?, idcategoria=? where idfilme=? ;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, filme.getNomeFilme());
            stmt.setInt(2, filme.getDuracaoFilme());
            stmt.setString(3, filme.getSinopseFilme());
            stmt.setString(4, filme.getClassificacaoFilme());
            stmt.setInt(5, filme.getGenero().getIdGenero());
            stmt.setInt(6, filme.getCategoria().getIdCategoria());
            stmt.setInt(7, filme.getIdFilme());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao alterar Filme! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
}
