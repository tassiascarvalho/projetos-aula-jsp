/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.formulario.dao;

import br.com.formulario.model.Genero;
import br.com.formulario.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tassia
 */
public class GeneroDAOImpl implements GenericDAO {

    private Connection conn;

    public GeneroDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.abrirconexao();
            System.out.println("Conectado com Sucesso");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Genero oGenero = (Genero) object;

        PreparedStatement stmt = null;

        String sql = "INSERT INTO GENERO"
                + " (NOME_GENERO,"
                + "  DESCRICAO_GENERO)"
                + " VALUES (?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oGenero.getNomeGenero());
            stmt.setString(2, oGenero.getDescricaoGenero());

            stmt.execute();

            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao cadastrar Genero \n" + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão \n " + ex.getMessage());;
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> listar() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Object> resultado = new ArrayList<>();

        String sql = "SELECT * FROM GENERO";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Genero oGenero = new Genero();
                oGenero.setIdGenero(rs.getInt("id_genero"));
                oGenero.setNomeGenero(rs.getString("nome_genero"));
                oGenero.setDescricaoGenero(rs.getString("descricao_genero"));

                resultado.add(oGenero); //Jamais esquecer essa linha;           
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Genero! \n Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão \n Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return resultado;
    }

    @Override
    public void excluir(int idObject) {
        PreparedStatement stmt = null;

        String sql = "DELETE FROM GENERO WHERE ID_GENERO = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Erro ao Excluir Genero \n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexao \n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Object carregar(int idObject) {
        Genero oGenero = null; //Instanciando um novo objeto como nulo
        PreparedStatement stmt = null; //manipular o sql
        ResultSet rs = null; //retorno do banco de dados
        String sql = "select * from genero where id_genero = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                oGenero = new Genero();
                oGenero.setIdGenero(rs.getInt("id_genero"));
                oGenero.setNomeGenero(rs.getString("nome_genero"));
                oGenero.setDescricaoGenero(rs.getString("descricao_genero"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao Carregar do Genero Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return oGenero;
    }

    @Override
    public Boolean alterar(Object object) {
        Genero oGenero = (Genero) object; //Instancia um novo objeto com os dados
        PreparedStatement stmt = null; //Manipula sql.
        String sql = "Update genero set nome_genero = ?, descricao_genero = ? where id_genero = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oGenero.getNomeGenero());
            stmt.setString(2, oGenero.getDescricaoGenero());
            stmt.setInt(3, oGenero.getIdGenero());
            stmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao alterar genero Erro:" + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexao Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

}
