/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siszoo.dao;

import br.com.siszoo.model.Cliente;
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
public class ClienteDAOImpl implements GenericDAO {

    private Connection conn;

    public ClienteDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {

        Cliente cliente = (Cliente) object;

        PreparedStatement stmt = null;
        String sql = "INSERT INTO cliente (rg_cliente, cidade_cliente, quantidade_dependentes_cliente, id_pessoa)"
                + " VALUES (?, ?, ?, ?);";

        try {
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, cliente.getRgCliente());
            stmt.setString(2, cliente.getCidadeCliente());
            stmt.setInt(3, cliente.getQuantidadeDependentesCliente());

            try {
                //PessoaDAOImpl pessoadao = new PessoaDAOImpl();
                //stmt.setInt(4, pessoadao.cadastrar(cliente));
                stmt.setInt(4, new PessoaDAOImpl().cadastrar(cliente));
            } catch (Exception ex) {
                System.out.println("Erro ao cadastrar Pessoa!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }

            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao cadastrar Cliente!"
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
        String sql = "SELECT p.*, c.*"
                + " FROM pessoa p, cliente c"
                + " WHERE p.id_pessoa = c.id_pessoa"
                + " ORDER BY p.nome_pessoa;";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdPessoa(rs.getInt("id_pessoa"));
                cliente.setNomePessoa(rs.getString("nome_pessoa"));
                cliente.setCpfPessoa(rs.getString("cpf_pessoa"));
                cliente.setLoginPessoa(rs.getString("login_pessoa"));
                cliente.setSenhaPessoa(rs.getString("senha_pessoa"));
                cliente.setTipoPessoa(rs.getString("tipo_pessoa"));
                cliente.setIdCliente(rs.getInt("id_cliente"));
                cliente.setRgCliente(rs.getString("rg_cliente"));
                cliente.setCidadeCliente(rs.getString("cidade_cliente"));
                cliente.setQuantidadeDependentesCliente(rs.getInt("quantidade_dependentes_cliente"));
                resultado.add(cliente);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Cliente!"
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
        String sql = "DELETE FROM cliente"
                + " WHERE id_pessoa = ? ;"
                + " COMMIT;"
                + " DELETE FROM pessoa"
                + " WHERE id_pessoa = ? ;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.setInt(2, idObject);
            stmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Erro ao excluir Cliente!"
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
        Cliente cliente = null;
        String sql = "SELECT c.*, p.*"
                + " FROM cliente c, pessoa p"
                + " WHERE c.id_pessoa = p.id_pessoa"
                + " AND c.id_pessoa = ? ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdPessoa(rs.getInt("id_pessoa"));
                cliente.setNomePessoa(rs.getString("nome_pessoa"));
                cliente.setCpfPessoa(rs.getString("cpf_pessoa"));
                cliente.setLoginPessoa(rs.getString("login_pessoa"));
                cliente.setSenhaPessoa(rs.getString("senha_pessoa"));
                cliente.setTipoPessoa(rs.getString("tipo_pessoa"));
                cliente.setIdCliente(rs.getInt("id_cliente"));
                cliente.setRgCliente(rs.getString("rg_cliente"));
                cliente.setCidadeCliente(rs.getString("cidade_cliente"));
                cliente.setQuantidadeDependentesCliente(rs.getInt("quantidade_dependentes_cliente"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar Cliente!"
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
        return cliente;
    }

    @Override
    public Boolean alterar(Object object) {
        
        Cliente cliente = (Cliente) object;
        PreparedStatement stmt = null;
        String sql = "UPDATE cliente SET"
                + " rg_cliente = ?,"
                + " cidade_cliente = ?,"
                + " quantidade_dependentes_cliente = ?"
                + " WHERE id_pessoa = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            
             stmt.setString(1, cliente.getRgCliente());
             stmt.setString(2, cliente.getCidadeCliente());
             stmt.setInt(3, cliente.getQuantidadeDependentesCliente());
             stmt.setInt(4, cliente.getIdPessoa());

            try {
                if (new PessoaDAOImpl().alterar(cliente)) {
                    stmt.executeUpdate();
                    return true;
                } else {
                    return false;
                }
            } catch (Exception ex) {
                System.out.println("Problemas ao alterar Pessoa!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Erro ao alterar Cliente!"
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
