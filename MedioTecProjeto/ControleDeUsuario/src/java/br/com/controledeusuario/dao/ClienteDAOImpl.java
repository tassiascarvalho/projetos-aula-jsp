/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controledeusuario.dao;

import br.com.controledeusuario.model.Cidade;
import br.com.controledeusuario.model.Cliente;
import br.com.controledeusuario.util.ConnectionFactory;
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
public class ClienteDAOImpl implements GenericDAO {

    Connection conn;

    //construtor com a conexão
    public ClienteDAOImpl() throws Exception {
        try {
            conn = ConnectionFactory.conectar();
            System.out.println("Conectado com Sucesso");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        PreparedStatement stmt = null;
        Cliente oCliente = (Cliente) object;

        String sql = "INSERT INTO cliente "
                + "(observacao, situacao, "
                + "permitelogin, idpessoa) "
                + "VALUES (?,?,?,?)";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oCliente.getObservacao());
            stmt.setString(2, oCliente.getSituacao());
            stmt.setString(3, oCliente.getPermiteLogin());
            try {
                //Cadastra a pessoa e retorna o id para a filha
                stmt.setInt(4, new PessoaDAOImpl().cadastrar(oCliente));
            } catch (Exception ex) {
                System.out.println("Erro ao cadastrar Pessoa (cliente)");
            }
            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao salvar Cliente(Pessoa) Erro: "
                    + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexao Erro: "
                        + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT p.*, c.*, cd.* "
                + "FROM pessoa p, cliente c, cidade cd "
                + "WHERE p.idpessoa = c.idpessoa "
                + "and p.idcidade = cd.idcidade "
                + "ORDER BY p.nome;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente oCliente = new Cliente();
                //Atributos Pessoa - Classe Pai
                oCliente.setIdPessoa(rs.getInt("idpessoa"));
                oCliente.setNome(rs.getString("nome"));
                oCliente.setCpf(rs.getString("cpf"));
                oCliente.setDatanascimento(rs.getDate("datanascimento"));
                oCliente.setLogin(rs.getString("login"));
                oCliente.setSenha(rs.getString("senha"));
                oCliente.setCidade(new Cidade(rs.getString("nomecidade")));
                //Atributos Cliente
                oCliente.setIdCliente(rs.getInt("idcliente"));
                oCliente.setObservacao(rs.getString("observacao"));
                oCliente.setSituacao(rs.getString("situacao"));
                oCliente.setPermiteLogin(rs.getString("permitelogin"));
                resultado.add(oCliente);
                
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar Cliente \n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexao \n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return resultado;
    }

    @Override
    public void excluir(int idObject) {
        PreparedStatement stmt = null;
        
        String sql="DELETE FROM cliente WHERE idpessoa = ?;"
                + "COMMIT;"                
                + "DELETE FROM pessoa WHERE idpessoa = ?;";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.setInt(2, idObject);
            stmt.executeUpdate();
        }catch (Exception ex) {
            System.out.println("Erro ao Excluir Cliente \n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexao \n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Object carregar(int idObject) {
        Cliente oCliente = new Cliente();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT p.*, c.*, cd.* FROM pessoa p, cliente c, cidade cd "
                + "WHERE p.idpessoa = c.idpessoa and p.idcidade = cd.idcidade "
                + "and c.idpessoa = ? ORDER BY p.nome;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();

            if (rs.next()) {
                //Atributos Pessoa - Classe Pai
                oCliente.setIdPessoa(rs.getInt("idpessoa"));
                oCliente.setNome(rs.getString("nome"));
                oCliente.setCpf(rs.getString("cpf"));
                oCliente.setDatanascimento(rs.getDate("datanascimento"));
                oCliente.setLogin(rs.getString("login"));
                oCliente.setSenha(rs.getString("senha"));
                //Criar um construtor na Classe Cidade(Selecionar somente idcidade, nomecidade)
                oCliente.setCidade(new Cidade(rs.getInt("idcidade"), rs.getString("nomecidade")));
                //Atributos Cliente
                oCliente.setIdCliente(rs.getInt("idcliente"));
                oCliente.setObservacao(rs.getString("observacao"));
                oCliente.setSituacao(rs.getString("situacao"));
                oCliente.setPermiteLogin(rs.getString("permitelogin"));                
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar Cliente \n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexao \n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return oCliente;
    }

    @Override
    public Boolean alterar(Object object) {
        PreparedStatement stmt = null;
        Cliente oCliente = (Cliente) object;        
         String sql = "UPDATE cliente SET "                                
                + "observacao = ?, "
                 + "situacao = ?, "
                + "permitelogin = ? "
                + "WHERE idpessoa = ?;";     

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oCliente.getObservacao());
            stmt.setString(2, oCliente.getSituacao());
            stmt.setString(3, oCliente.getPermiteLogin());
            stmt.setInt(4, oCliente.getIdPessoa());
                      
            try {
                if(new PessoaDAOImpl().alterar(oCliente)){
                    stmt.executeUpdate();
                    return true;
                }else{
                    return false;
                }                
            } catch (Exception ex) {
                System.out.println("Erro ao alterar Pessoa \n Erro: " + ex.getMessage());
                ex.printStackTrace();
                return false;
            }                
        } catch (Exception ex) {
            System.out.println("Erro ao salvar Cliente(Pessoa) Erro: "
                    + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexao Erro: "
                        + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

}
