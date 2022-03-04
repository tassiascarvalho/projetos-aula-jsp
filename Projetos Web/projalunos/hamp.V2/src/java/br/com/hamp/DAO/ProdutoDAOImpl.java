/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hamp.DAO;

import br.com.hamp.model.Produto;
import br.com.hamp.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Douglas
 */
public class ProdutoDAOImpl implements GenericDAO {

    private Connection conn;

    public ProdutoDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Produto produto = (Produto) object;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO produto (id_pessoa_j, nome_produto, categoria_produto, tamanho_produto, peso_produto, valor_locacao_dia, cor_produto "
                + ", descricao_produto, referencia_produto, disponibilidade, imagem_produto, quantidade_produto) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, produto.getIdPessoaJ());
            stmt.setString(2, produto.getNomeProduto());
            stmt.setString(3, produto.getCategoriaProduto());
            stmt.setString(4, produto.getTamanhoProduto());
            stmt.setString(5, produto.getPesoProduto());
            stmt.setDouble(6, produto.getValorLocacaoDia());
            stmt.setString(7, produto.getCorProduto());
            stmt.setString(8, produto.getDescricaoProduto());
            stmt.setString(9, produto.getReferenciaProduto());
            stmt.setString(10, produto.getDisponibilidade());
            stmt.setString(11, produto.getImagemProduto());
            stmt.setInt(12, produto.getQuantidadeProduto());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println("Problemas ao cadastrar produto!Erro:" + ex.getMessage());
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

    public Integer cadastrarListar(Object object) {
        Integer idProduto = null;
        Produto produto = (Produto) object;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "INSERT INTO produto (id_pessoa_j, nome_produto, categoria_produto, tamanho_produto, peso_produto, valor_locacao_dia, cor_produto "
                + ", descricao_produto, referencia_produto, disponibilidade, imagem_produto, quantidade_produto) VALUES (?,?,?,?,?,?,?,?,?,?,?,?) RETURNING (id_produto);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, produto.getIdPessoaJ());
            stmt.setString(2, produto.getNomeProduto());
            stmt.setString(3, produto.getCategoriaProduto());
            stmt.setString(4, produto.getTamanhoProduto());
            stmt.setString(5, produto.getPesoProduto());
            stmt.setDouble(6, produto.getValorLocacaoDia());
            stmt.setString(7, produto.getCorProduto());
            stmt.setString(8, produto.getDescricaoProduto());
            stmt.setString(9, produto.getReferenciaProduto());
            stmt.setString(10, produto.getDisponibilidade());
            stmt.setString(11, produto.getImagemProduto());
            stmt.setInt(12, produto.getQuantidadeProduto());

            rs = stmt.executeQuery();

            if (rs.next()) {
                idProduto = rs.getInt("id_produto");
            }

        } catch (SQLException ex) {
            System.err.println("Problemas ao cadastrar produto!Erro:" + ex.getMessage());
            ex.printStackTrace();

        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.err.println("Problemas ao fechar conexão!Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return idProduto;
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
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Produto produto = null;
        String sql = "SELECT * FROM produto WHERE id_produto=?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                produto = new Produto();
                produto.setIdProduto(rs.getInt("id_produto"));
                produto.setIdPessoaJ(rs.getInt("id_pessoa_j"));
                produto.setImagemProduto(rs.getString("imagem_produto"));
                produto.setNomeProduto(rs.getString("nome_produto"));
                produto.setCategoriaProduto(rs.getString("categoria_produto"));
                produto.setTamanhoProduto(rs.getString("tamanho_produto"));
                produto.setPesoProduto(rs.getString("peso_produto"));
                produto.setValorLocacaoDia(rs.getDouble("valor_locacao_dia"));
                produto.setCorProduto(rs.getString("cor_produto"));
                produto.setDescricaoProduto(rs.getString("descricao_produto"));
                produto.setReferenciaProduto(rs.getString("referencia_produto"));
                produto.setDisponibilidade(rs.getString("disponibilidade"));
                produto.setQuantidadeProduto(rs.getInt("quantidade_produto"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar Categoria! Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return produto;
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Object> listarParaEmpresa(Integer idEmpresa) {
        int Idempresa = idEmpresa;
        List<Object> resultado = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String sql = "SELECT * FROM produto WHERE id_pessoa_j =?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, Idempresa);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setImagemProduto(rs.getString("imagem_produto"));
                produto.setNomeProduto(rs.getString("nome_produto"));
                produto.setCategoriaProduto(rs.getString("categoria_produto"));
                produto.setTamanhoProduto(rs.getString("tamanho_produto"));
                produto.setPesoProduto(rs.getString("peso_produto"));
                produto.setValorLocacaoDia(rs.getDouble("valor_locacao_dia"));
                produto.setCorProduto(rs.getString("cor_produto"));
                produto.setDescricaoProduto(rs.getString("descricao_produto"));
                produto.setReferenciaProduto(rs.getString("referencia_produto"));
                produto.setDisponibilidade(rs.getString("disponibilidade"));
                produto.setQuantidadeProduto(rs.getInt("quantidade_produto"));
                produto.setIdProduto(rs.getInt("id_produto"));
                resultado.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Produto.!Erro:" + ex.getMessage());
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

    public List<Object> ListarPorCategoria(String categoria) {
        String idcategoria = categoria;
        List<Object> resultado = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String sql = "SELECT * FROM produto WHERE categoria_produto =?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, idcategoria);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("id_produto"));
                produto.setImagemProduto(rs.getString("imagem_produto"));
                produto.setNomeProduto(rs.getString("nome_produto"));
                produto.setCategoriaProduto(rs.getString("categoria_produto"));
                produto.setTamanhoProduto(rs.getString("tamanho_produto"));
                produto.setPesoProduto(rs.getString("peso_produto"));
                produto.setValorLocacaoDia(rs.getDouble("valor_locacao_dia"));
                produto.setCorProduto(rs.getString("cor_produto"));
                produto.setDescricaoProduto(rs.getString("descricao_produto"));
                produto.setReferenciaProduto(rs.getString("referencia_produto"));
                produto.setDisponibilidade(rs.getString("disponibilidade"));
                produto.setQuantidadeProduto(rs.getInt("quantidade_produto"));
                resultado.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Produto.!Erro:" + ex.getMessage());
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

    public List<Object> listarIndividual(int idProduto) {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String sql = "SELECT * FROM produto WHERE id_produto=?";
        List<Object> resultado = new ArrayList<>();
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idProduto);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("id_produto"));
                produto.setIdPessoaJ(rs.getInt("id_pessoa_j"));
                produto.setImagemProduto(rs.getString("imagem_produto"));
                produto.setNomeProduto(rs.getString("nome_produto"));
                produto.setCategoriaProduto(rs.getString("categoria_produto"));
                produto.setTamanhoProduto(rs.getString("tamanho_produto"));
                produto.setPesoProduto(rs.getString("peso_produto"));
                produto.setValorLocacaoDia(rs.getDouble("valor_locacao_dia"));
                produto.setCorProduto(rs.getString("cor_produto"));
                produto.setDescricaoProduto(rs.getString("descricao_produto"));
                produto.setReferenciaProduto(rs.getString("referencia_produto"));
                produto.setDisponibilidade(rs.getString("disponibilidade"));
                produto.setQuantidadeProduto(rs.getInt("quantidade_produto"));
                resultado.add(produto);
            }
        } catch (Exception ex) {
            System.out.println("Problemas ao listar Produto.!Erro:" + ex.getMessage());
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
}
