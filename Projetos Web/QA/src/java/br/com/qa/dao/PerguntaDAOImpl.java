/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qa.dao;

import br.com.qa.model.Categoria;
import br.com.qa.model.Genero;
import br.com.qa.model.Pergunta;
import br.com.qa.util.ConnectionFactory;
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
public class PerguntaDAOImpl implements GenericDAO {

    private Connection conn;

    public PerguntaDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.conectar();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Pergunta oPergunta = (Pergunta) object;
        PreparedStatement stmt = null;

        String sql = "Insert into Pergunta (descricaopergunta, idcategoria)"
                + " values(?,?); ";

        try {
            stmt = conn.prepareCall(sql);
            stmt.setString(1, oPergunta.getDescricaoPergunta());
            //na passagem dos parametros recupera do objeto de depencia
            stmt.setInt(2, oPergunta.getCategoria().getIdCategoria());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Pergunta! Erro: " + ex.getMessage());
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
        String sql = "select idpergunta, descricaopergunta,"
                + " pergunta.idcategoria, descricaocategoria"
                + " from pergunta, categoria"
                + " where pergunta.idcategoria = categoria.idcategoria";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Pergunta oPergunta = new Pergunta();
                oPergunta.setIdPergunta(rs.getInt("idpergunta"));
                oPergunta.setDescricaoPergunta(rs.getString("descricaopergunta"));
                //O formato de recuperar a informação.
                oPergunta.setCategoria(new Categoria(rs.getInt("idcategoria"), rs.getString("descricaocategoria")));
                
                resultado.add(oPergunta);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Pergunta! Erro: " + ex.getMessage());
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
