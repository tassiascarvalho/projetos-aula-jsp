package br.com.hamp.DAO;

import br.com.hamp.model.Pessoa;
import br.com.hamp.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Douglas Costa
 */
public class PessoaDAOImpl {

    private Connection conn;

    public PessoaDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    public Integer cadastrar(Pessoa pessoa) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer idPessoa = null;
        String sql = "INSERT INTO pessoa(senha_pessoa,telefone_pessoa, nome_pessoa,email_pessoa, nome_usuario) values (?,?,?,?,?) RETURNING (id_pessoa);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getSenhaPessoa());
            stmt.setString(2, pessoa.getTelefonePessoa());
            stmt.setString(3, pessoa.getNomePessoa());
            stmt.setString(4, pessoa.getEmailPessoa());
            stmt.setString(5, pessoa.getNomeUsuario());

            rs = stmt.executeQuery();

            if (rs.next()) {
                idPessoa = rs.getInt("id_pessoa");
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Pessoa! Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return idPessoa;
    }

    public Boolean alterar(Pessoa pessoa) {

        PreparedStatement stmt = null;
        String sql = "update pessoa set nome_pessoa=?, email_pessoa=?, "
                + " senha_pessoa=?, telefone_pessoa=? where id_pessoa=?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNomePessoa());
            stmt.setString(2, pessoa.getEmailPessoa());
            stmt.setString(3, pessoa.getSenhaPessoa());
            stmt.setString(4, pessoa.getTelefonePessoa());
            stmt.setInt(5, pessoa.getIdPessoa());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao alterar Pessoa! Erro: " + ex.getMessage());
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
}
