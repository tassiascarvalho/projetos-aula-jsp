package br.com.projetoupload.DAO;



import br.com.projetoupload.model.PessoaFisica;
import br.com.projetoupload.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaFDAOImpl implements GenericDAO {

    private Connection conn;

    public PessoaFDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        PessoaFisica pessoaf = (PessoaFisica) object;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "INSERT INTO pesso_fisica (sexo_pessoa_fisica, data_nascimento_pessoa_fisica, cpf_pessoa_fisica, imagem_pessoa_f ,id_pessoa)"
                + "values (?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoaf.getSexoPessoaFisica());
            stmt.setDate(2, new java.sql.Date(pessoaf.getDataNascimentoPessoaFisica().getTime()));
            stmt.setString(3, pessoaf.getCpfPessoaFisica());
            stmt.setString(4, pessoaf.getImagemPessoaFisica());

            try {
                //PessoaDAOImpl pessoadao = new PessoaDAOImpl();
                //stmt.setInt(4, pessoadao.cadastrar(cliente));
                stmt.setInt(5, new PessoaDAOImpl().cadastrar(pessoaf));
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
        String sql = "SELECT p.*, pf.* FROM pessoa p, pesso_fisica pf WHERE p.id_pessoa = pf.id_pessoa";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                PessoaFisica pessoaf = new PessoaFisica();
                pessoaf.setNomePessoa(rs.getString("nome_pessoa"));
                pessoaf.setEmailPessoa(rs.getString("email_pessoa"));
                pessoaf.setTelefonePessoa(rs.getString("telefone_pessoa"));
                pessoaf.setSenhaPessoa(rs.getString("senha_pessoa"));
                pessoaf.setCpfPessoaFisica(rs.getString("cpf_pessoa_fisica"));
                pessoaf.setSexoPessoaFisica(rs.getString("sexo_pessoa_fisica"));
                pessoaf.setDataNascimentoPessoaFisica(rs.getDate("data_nascimento_pessoa_fisica"));
                pessoaf.setIdPessoaFisica(rs.getInt("id_pessoa_fisica"));
                pessoaf.setIdPessoa(rs.getInt("id_pessoa"));
                resultado.add(pessoaf);
            }

        } catch (Exception ex) {
            System.out.println("Problemas ao listar Pessoa Fisica.!Erro:" + ex.getMessage());
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
        String sql = "DELETE FROM pesso_fisica WHERE id_pessoa = ?; commit; DELETE FROM pessoa WHERE id_pessoa = ?; ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.setInt(2, idObject);
            stmt.executeUpdate();
            System.out.println("Cliente excluido com sucesso");
        } catch (Exception ex) {
            System.out.println("Problemas ao excluir Cliente! Erro: " + ex.getMessage());
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
        ResultSet rs = null;
        PreparedStatement stmt = null;
        PessoaFisica pessoaf = null;
        String sql = "SELECT p.*, pf.* FROM pessoa p, pesso_fisica pf WHERE p.id_pessoa = pf.id_pessoa AND p.id_pessoa =?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                pessoaf = new PessoaFisica();
                pessoaf.setImagemPessoaFisica(rs.getString("imagem_pessoa_f"));
                pessoaf.setNomePessoa(rs.getString("nome_pessoa"));
                pessoaf.setTelefonePessoa(rs.getString("telefone_pessoa"));
                pessoaf.setEmailPessoa(rs.getString("email_pessoa"));
                pessoaf.setSenhaPessoa(rs.getString("senha_pessoa"));
                pessoaf.setCpfPessoaFisica(rs.getString("cpf_pessoa_fisica"));
                pessoaf.setDataNascimentoPessoaFisica(rs.getDate("data_nascimento_pessoa_fisica"));
                pessoaf.setSexoPessoaFisica(rs.getString("sexo_pessoa_fisica"));
                pessoaf.setIdPessoaFisica(rs.getInt("id_pessoa_fisica"));
                pessoaf.setIdPessoa(rs.getInt("id_pessoa"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar Cliente! Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return pessoaf;
    }

    @Override
    public Boolean alterar(Object object) {
        PessoaFisica pessoaf = (PessoaFisica) object;
        PreparedStatement stmt = null;
        String sql = "update pesso_fisica set cpf_pessoa_fisica=?, data_nascimento_pessoa_fisica=?, imagem_pessoa_f=? where id_pessoa=?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoaf.getCpfPessoaFisica());
            stmt.setDate(2, new java.sql.Date(pessoaf.getDataNascimentoPessoaFisica().getTime()));
            stmt.setString(3, pessoaf.getImagemPessoaFisica());
            stmt.setInt(4, pessoaf.getIdPessoa());
            if (new PessoaDAOImpl().alterar(pessoaf)) {
                stmt.executeUpdate();
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Problemas ao alterar Cliente! Erro: " + ex.getMessage()); //identifica erro
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

    public PessoaFisica logarPessoaF(String login, String senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PessoaFisica pessoaf = null;
        String sql = "SELECT p.*, pf.* "
                + "FROM pessoa p, pesso_fisica pf "
                + "WHERE p.email_pessoa=? and p.senha_pessoa =?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {
                pessoaf = new PessoaFisica();

                pessoaf.setNomePessoa(rs.getString("nome_pessoa"));
                pessoaf.setEmailPessoa(rs.getString("email_pessoa"));
                pessoaf.setSenhaPessoa(rs.getString("senha_pessoa"));
                pessoaf.setTelefonePessoa(rs.getString("telefone_pessoa"));
                pessoaf.setSexoPessoaFisica(rs.getString("sexo_pessoa_fisica"));
                pessoaf.setCpfPessoaFisica(rs.getString("cpf_pessoa_fisica"));
                pessoaf.setIdPessoa(rs.getInt("id_pessoa"));
                pessoaf.setDataNascimentoPessoaFisica(rs.getDate("data_nascimento_pessoa_fisica"));
                pessoaf.setImagemPessoaFisica(rs.getString("imagem_pessoa_f"));
                pessoaf.setIdPessoaFisica(rs.getInt("id_pessoa_fisica"));

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao logar Cliente!"
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
        return pessoaf;
    }

    public PessoaFisica listarIndividualPessoaF(int idpessoaf) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PessoaFisica pessoaf = null;
        String sql ="SELECT p.*, pf.* FROM pessoa p, pesso_fisica pf WHERE p.id_pessoa = pf.id_pessoa AND p.id_pessoa =?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idpessoaf);
            rs = stmt.executeQuery();

            if (rs.next()) {
                pessoaf = new PessoaFisica();

                pessoaf.setNomePessoa(rs.getString("nome_pessoa"));
                pessoaf.setEmailPessoa(rs.getString("email_pessoa"));
                pessoaf.setSenhaPessoa(rs.getString("senha_pessoa"));
                pessoaf.setTelefonePessoa(rs.getString("telefone_pessoa"));
                pessoaf.setSexoPessoaFisica(rs.getString("sexo_pessoa_fisica"));
                pessoaf.setCpfPessoaFisica(rs.getString("cpf_pessoa_fisica"));
                pessoaf.setIdPessoa(rs.getInt("id_pessoa"));
                pessoaf.setDataNascimentoPessoaFisica(rs.getDate("data_nascimento_pessoa_fisica"));
                pessoaf.setImagemPessoaFisica(rs.getString("imagem_pessoa_f"));
                pessoaf.setIdPessoaFisica(rs.getInt("id_pessoa_fisica"));

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
                ex.printStackTrace();
            }
        }
        return pessoaf;
    }

    

}
