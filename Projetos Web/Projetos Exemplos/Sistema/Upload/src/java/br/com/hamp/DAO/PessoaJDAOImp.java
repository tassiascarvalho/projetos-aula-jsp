/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hamp.DAO;


import br.com.hamp.model.PessoaJuridica;
import br.com.hamp.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Douglas Costa
 */
public class PessoaJDAOImp implements GenericDAO {

    private Connection conn;

    public PessoaJDAOImp() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        PessoaJuridica pessoaj = (PessoaJuridica) object;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "INSERT INTO pessoa_juridica (razao_social_pessoa_juridica, cpnj_pessoa_juridica, imagem_pessoa_j ,id_pessoa)"
                + "values (?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, pessoaj.getRazaoSocialPessoaJuridica());
            stmt.setString(2, pessoaj.getCpnjPessoaJuridica());
            stmt.setString(3, pessoaj.getImagemPessoaJ());
            try {
                //PessoaDAOImpl pessoadao = new PessoaDAOImpl();
                //stmt.setInt(4, pessoadao.cadastrar(cliente));
                stmt.setInt(4, new PessoaDAOImpl().cadastrar(pessoaj));
            } catch (Exception ex) {
                System.out.println("Erro ao cadastrar Pessoa!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Pessoa Jurídica! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problema ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT p.*, pj.* FROM pessoa p, pessoa_juridica pj WHERE p.id_pessoa = pj.id_pessoa";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                PessoaJuridica pessoaj = new PessoaJuridica();
                pessoaj.setImagemPessoaJ(rs.getString("imagem_pessoa_j"));
                pessoaj.setNomePessoa(rs.getString("nome_pessoa"));
                pessoaj.setEmailPessoa(rs.getString("email_pessoa"));
                pessoaj.setTelefonePessoa(rs.getString("telefone_pessoa"));
                pessoaj.setSenhaPessoa(rs.getString("senha_pessoa"));
                pessoaj.setCpnjPessoaJuridica(rs.getString("cpnj_pessoa_juridica"));
                pessoaj.setRazaoSocialPessoaJuridica(rs.getString("razao_social_pessoa_juridica"));
                pessoaj.setAvaliacaoPessoaJuridica(rs.getDouble("avaliacao_pessoa_juridica"));
                pessoaj.setIdPessoaJuridica(rs.getInt("id_pessoa_juridica"));
                pessoaj.setIdPessoa(rs.getInt("id_pessoa"));
                resultado.add(pessoaj);
            }

        } catch (Exception ex) {
            System.out.println("Problemas ao listar Pessoa Juridica.!Erro:" + ex.getMessage());
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

    @Override
    public void excluir(Integer idObject) {
        PreparedStatement stmt = null;
        String sql = "Delete from pessoa_juridica where id_pessoa = ?; commit; Delete from pessoa where id_pessoa = ?; ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.setInt(2, idObject);
            stmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Problemas ao excluir Empresa! Erro: " + ex.getMessage());
            ex.printStackTrace();
        }
        try {
            ConnectionFactory.closeConnection(conn, stmt);
        } catch (Exception ex) {
            System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PessoaJuridica pessoaj = null;
        String sql = "select p.*,pj.* from pessoa p, pessoa_juridica pj where p.id_pessoa = pj.id_pessoa and p.id_pessoa =?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                pessoaj = new PessoaJuridica();
                pessoaj.setNomePessoa(rs.getString("nome_pessoa"));
                pessoaj.setTelefonePessoa(rs.getString("telefone_pessoa"));
                pessoaj.setEmailPessoa(rs.getString("email_pessoa"));
                pessoaj.setSenhaPessoa(rs.getString("senha_pessoa"));
                pessoaj.setCpnjPessoaJuridica(rs.getString("cpnj_pessoa_juridica"));
                pessoaj.setRazaoSocialPessoaJuridica(rs.getString("razao_social_pessoa_juridica"));
                pessoaj.setIdPessoaJuridica(rs.getInt("id_pessoa_juridica"));
                pessoaj.setImagemPessoaJ(rs.getString("imagem_pessoa_j"));
                pessoaj.setIdPessoa(rs.getInt("id_pessoa"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar Empresa! Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return pessoaj;
    }

    @Override
    public Boolean alterar(Object object) {
        PessoaJuridica pessoaj = (PessoaJuridica) object;
        PreparedStatement stmt = null;
        String sql = "update pessoa_juridica set cpnj_pessoa_juridica=?,razao_social_pessoa_juridica=?, imagem_pessoa_j=? where id_pessoa=?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoaj.getCpnjPessoaJuridica());
            stmt.setString(2, pessoaj.getRazaoSocialPessoaJuridica());
            stmt.setString(3, pessoaj.getImagemPessoaJ());
            stmt.setInt(4, pessoaj.getIdPessoa());
            if (new PessoaDAOImpl().alterar(pessoaj)) {
                stmt.executeUpdate();
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Problemas ao alterar Empresa! Erro: " + ex.getMessage()); //identifica erro
            ex.printStackTrace(); //mostra as linhas onde deram o erro
            return false;
        } finally { //o finally sempre será executado (fecha conexão com o banco)
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problema ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    public PessoaJuridica logarPessoaJ(String login, String senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PessoaJuridica pessoaj = null;
        String sql = "SELECT p.*, pj.* "
                + "FROM pessoa p, pessoa_juridica pj "
                + "WHERE p.email_pessoa=? and p.senha_pessoa =?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {
                pessoaj = new PessoaJuridica();
                pessoaj.setNomePessoa(rs.getString("nome_pessoa"));
                pessoaj.setEmailPessoa(rs.getString("email_pessoa"));
                pessoaj.setSenhaPessoa(rs.getString("senha_pessoa"));
                pessoaj.setTelefonePessoa(rs.getString("telefone_pessoa"));
                pessoaj.setRazaoSocialPessoaJuridica(rs.getString("razao_social_pessoa_juridica"));
                pessoaj.setCpnjPessoaJuridica(rs.getString("cpnj_pessoa_juridica"));
                pessoaj.setIdPessoa(rs.getInt("id_pessoa"));
                pessoaj.setImagemPessoaJ(rs.getString("imagem_pessoa_j"));
                pessoaj.setIdPessoaJuridica(rs.getInt("id_pessoa_juridica"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao logar Empresa!"
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
        return pessoaj;
    }

    public PessoaJuridica listarIndividualPessoaJ(int idpessoaj) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PessoaJuridica pessoaj = null;
        String sql = "select p.*,pj.* from pessoa p, pessoa_juridica pj where p.id_pessoa = pj.id_pessoa and p.id_pessoa =?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idpessoaj);
            rs = stmt.executeQuery();

            if (rs.next()) {
                pessoaj = new PessoaJuridica();
                pessoaj.setNomePessoa(rs.getString("nome_pessoa"));
                pessoaj.setEmailPessoa(rs.getString("email_pessoa"));
                pessoaj.setSenhaPessoa(rs.getString("senha_pessoa"));
                pessoaj.setTelefonePessoa(rs.getString("telefone_pessoa"));
                pessoaj.setRazaoSocialPessoaJuridica(rs.getString("razao_social_pessoa_juridica"));
                pessoaj.setCpnjPessoaJuridica(rs.getString("cpnj_pessoa_juridica"));
                pessoaj.setIdPessoa(rs.getInt("id_pessoa"));
                pessoaj.setImagemPessoaJ(rs.getString("imagem_pessoa_j"));
                pessoaj.setIdPessoaJuridica(rs.getInt("id_pessoa_juridica"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Empresa!"
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
        return pessoaj;
    }
}
