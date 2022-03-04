package br.com.inbooking.DAO;

import br.com.inbooking.model.Pessoa;
import br.com.inbooking.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAOImpl implements GenericDAO {
//Variável responsavel pela conexão

    private Connection conn;

    public PessoaDAOImpl() throws Exception {
        try {
            //Chama o método getConnection, que faz a conexão com o BD
            this.conn = ConnectionFactory.getconnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        //instancia o objeto pessoa com dados vindos do servlet
        Pessoa pessoa = (Pessoa) object;
        //através do stmt pode modificar o bd;
        PreparedStatement stmt = null;
        //código sql que será executado pelo stmt
        String sql = "INSERT INTO pessoa (nomepessoa, "
                + "responsavelpessoa, "
                + "telefoneresponsavelpessoa,"
                + "ceppessoa,"
                + "cpfpessoa,"
                + "telefonepessoa,"
                + "celularpessoa,"
                + "enderecopessoa,"
                + "bairropessoa,"
                + "cidadepessoa,"
                + "estadopessoa,"
                + "numeroendpessoa,"
                + "sexopessoa,"
                + "emailpessoa,"
                + "senhapessoa,"
                + "datanascimentopessoa,"                            
                + "perfilpessoa"
                + ")VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        //Tentativa de cadastrar os dados do banco

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setDate(1, new java.sql.Date(pessoa.getDataNascimentoPessoa().getTime()));
            stmt.setString(2, pessoa.getNomePessoa());
            stmt.setString(3, pessoa.getResponsavelPessoa());
            stmt.setString(4, pessoa.getTelefoneResponsavelPessoa());
            stmt.setString(5, pessoa.getCepPessoa());
            stmt.setString(6, pessoa.getCpfPessoa());
            stmt.setString(7, pessoa.getTelefonePessoa());
            stmt.setString(8, pessoa.getCelularPessoa());
            stmt.setString(9, pessoa.getEnderecoPessoa());
            stmt.setString(10, pessoa.getBairroPessoa());
            stmt.setString(11, pessoa.getCidadePessoa());
            stmt.setString(12, pessoa.getEstadoPessoa());
            stmt.setString(13, pessoa.getNumeroEndPessoa());
            stmt.setString(14, pessoa.getSexoPessoa());
            stmt.setString(15, pessoa.getEmailPessoa());
            stmt.setString(16, pessoa.getSenhaPessoa());
            stmt.setString(17, pessoa.getPerfilPessoa());

            //executa o sql com os parâmetros
            stmt.execute();
            //retorna verdadeiro se der certo o cadastro
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao cadastrar Pessoa!"
                    + "\n Erro:" + ex.getMessage());
            ex.printStackTrace();
            return false;
            //dando certo ou errado executa o finally
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros "
                        + "da conexão"
                        + "\n Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> listar() {
        //Cria a variavel responsável por retornar a matriz (lista) do BD
        List<Object> resultado = new ArrayList<>();
        //Permite a manipulação de dados
        PreparedStatement stmt = null;
        //armazena as informações do BD
        ResultSet rs = null;
        String sql = "SELECT * from pessoa";

        try {
            //Prepara a conexão
            stmt = conn.prepareStatement(sql);
            //executa e armazena
            rs = stmt.executeQuery();
            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setIdPessoa(rs.getInt("idpessoa"));
                pessoa.setDataNascimentoPessoa(rs.getDate("datanascimentopessoa"));
                pessoa.setNomePessoa(rs.getString("nomepessoa"));
                pessoa.setResponsavelPessoa(rs.getString("responsavelpessoa"));
                pessoa.setTelefoneResponsavelPessoa("telefoneresponsavelpessoa");
                pessoa.setCepPessoa(rs.getString("ceppessoa"));
                pessoa.setCpfPessoa(rs.getString("cpfpessoa"));
                pessoa.setTelefonePessoa(rs.getString("telefonepessoa"));
                pessoa.setCelularPessoa(rs.getString("celularpessoa"));
                pessoa.setEnderecoPessoa(rs.getString("enderecopessoa"));
                pessoa.setBairroPessoa(rs.getString("bairropessoa"));
                pessoa.setCidadePessoa(rs.getString("cidadepessoa"));
                pessoa.setEstadoPessoa(rs.getString("estadopessoa"));
                pessoa.setNumeroEndPessoa(rs.getString("numeroendpessoa"));
                pessoa.setSexoPessoa(rs.getString("sexopessoa"));
                pessoa.setEmailPessoa(rs.getString("emailpessoa"));
                pessoa.setSenhaPessoa(rs.getString("senhapessoa"));
                pessoa.setStatusPessoa(rs.getString("statuspessoa"));
                pessoa.setPerfilPessoa(rs.getString("perfilpessoa"));
                resultado.add(pessoa);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar pessoa!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão!" + "\n Erro:" + ex.getMessage());
                ex.printStackTrace();
            }

        }
        return resultado;
    }

    @Override
    public void excluir(int idObject) {
        //permite modificar o banco
        PreparedStatement stmt = null;
        //SQL para excluir apenas uma pessoa através do ID
        //Clausula Where indica restrição/parametros
        String sql = "DELETE FROM pessoa"
                + " WHERE idpessoa = ? ;";
        try {
            stmt = conn.prepareStatement(sql);
            //Passa o parâmetro, no caso ID
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Erro ao excluir Pessoa!"
                    + "\n Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros da conexão"
                        + "\n Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Pessoa pessoa = null;
        String sql = "SELECT * FROM pessoa WHERE idpessoa=?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                pessoa = new Pessoa();
                pessoa.setIdPessoa(rs.getInt("idpessoa"));
                pessoa.setDataNascimentoPessoa(rs.getDate("datanascimentopessoa"));
                pessoa.setNomePessoa(rs.getString("nomepessoa"));
                pessoa.setResponsavelPessoa(rs.getString("responsavelpessoa"));
                pessoa.setTelefoneResponsavelPessoa("telefoneresponsavelpessoa");
                pessoa.setCepPessoa(rs.getString("ceppessoa"));
                pessoa.setCpfPessoa(rs.getString("cpfpessoa"));
                pessoa.setTelefonePessoa(rs.getString("telefonepessoa"));
                pessoa.setCelularPessoa(rs.getString("celularpessoa"));
                pessoa.setEnderecoPessoa(rs.getString("enderecopessoa"));
                pessoa.setBairroPessoa(rs.getString("bairropessoa"));
                pessoa.setCidadePessoa(rs.getString("cidadepessoa"));
                pessoa.setEstadoPessoa(rs.getString("estadopessoa"));
                pessoa.setNumeroEndPessoa(rs.getString("numeroendpessoa"));
                pessoa.setSexoPessoa(rs.getString("sexopessoa"));
                pessoa.setEmailPessoa(rs.getString("emailpessoa"));
                pessoa.setSenhaPessoa(rs.getString("senhapessoa"));
                pessoa.setStatusPessoa(rs.getString("statuspessoa"));
                pessoa.setPerfilPessoa(rs.getString("perfilpessoa"));

            }
        } catch (SQLException ex) {
            System.out.println("Erro ao carregar pessoa!"
                    + "\n Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar parâmetros de conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return pessoa;
    }

    @Override
    public Boolean alterar(Object object) {
        Pessoa pessoa = (Pessoa) object;
        PreparedStatement stmt = null;
        //Código sql para alterar com uptade, passando parametros
        String sql = "UPDATE pessoa SET"
                + " datanascimentopessoa = ?,"
                + " nomepessoa = ?,"
                + " responsavelpessoa = ?,"
                + " telefoneresponsavelpessoa = ?,"
                + " ceppessoa = ?,"
                + " cpfpessoa = ?,"
                + " telefonepessoa = ?,"
                + " celularpessoa = ?,"
                + " enderecopessoa = ?,"
                + " bairropessoa = ?,"
                + " cidadepessoa = ?,"
                + " estadopessoa = ?,"
                + " numeroendpessoa = ?,"
                + " sexopessoa = ?,"
                + " emailpessoa = ?,"
                + " senhapessoa = ?,"
                + " statuspessoa = ?,"
                + " perfilpessoa = ?"
                + " WHERE idpessoa = ? ; ";
        try {
            stmt = conn.prepareStatement(sql);

            stmt.setDate(1, new java.sql.Date(pessoa.getDataNascimentoPessoa().getTime()));
            stmt.setString(2, pessoa.getNomePessoa());
            stmt.setString(3, pessoa.getResponsavelPessoa());
            stmt.setString(4, pessoa.getTelefoneResponsavelPessoa());
            stmt.setString(5, pessoa.getCepPessoa());
            stmt.setString(6, pessoa.getCpfPessoa());
            stmt.setString(7, pessoa.getTelefonePessoa());
            stmt.setString(8, pessoa.getCelularPessoa());
            stmt.setString(9, pessoa.getEnderecoPessoa());
            stmt.setString(10, pessoa.getBairroPessoa());
            stmt.setString(11, pessoa.getCidadePessoa());
            stmt.setString(12, pessoa.getEstadoPessoa());
            stmt.setString(13, pessoa.getNumeroEndPessoa());
            stmt.setString(14, pessoa.getSexoPessoa());
            stmt.setString(15, pessoa.getEmailPessoa());
            stmt.setString(16, pessoa.getSenhaPessoa());
            stmt.setString(17, pessoa.getStatusPessoa());
            stmt.setString(18, pessoa.getPerfilPessoa());
            stmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao alterar Pessoa!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problema ao fechar os parâmetros da conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    public List<Object> listarParametros(Object object) {
        Pessoa pessoa = (Pessoa) object;
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT * from pessoa "
                + " WHERE nomepessoa LIKE ?";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + pessoa.getNomePessoa() + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                pessoa = new Pessoa();
                pessoa.setIdPessoa(rs.getInt("idpessoa"));
                pessoa.setDataNascimentoPessoa(rs.getDate("datanascimentopessoa"));
                pessoa.setNomePessoa(rs.getString("nomepessoa"));
                pessoa.setResponsavelPessoa(rs.getString("responsavelpessoa"));
                pessoa.setTelefoneResponsavelPessoa("telefoneresponsavelpessoa");
                pessoa.setCepPessoa(rs.getString("ceppessoa"));
                pessoa.setCpfPessoa(rs.getString("cpfpessoa"));
                pessoa.setTelefonePessoa(rs.getString("telefonepessoa"));
                pessoa.setCelularPessoa(rs.getString("celularpessoa"));
                pessoa.setEnderecoPessoa(rs.getString("enderecopessoa"));
                pessoa.setBairroPessoa(rs.getString("bairropessoa"));
                pessoa.setCidadePessoa(rs.getString("cidadepessoa"));
                pessoa.setEstadoPessoa(rs.getString("estadopessoa"));
                pessoa.setNumeroEndPessoa(rs.getString("numeroendpessoa"));
                pessoa.setSexoPessoa(rs.getString("sexopessoa"));
                pessoa.setEmailPessoa(rs.getString("emailpessoa"));
                pessoa.setStatusPessoa(rs.getString("statuspessoa"));
                pessoa.setPerfilPessoa(rs.getString("perfilpessoa"));
                resultado.add(pessoa);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar pessoa com parametros!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parametros da conexão"
                        + "\n Erro: " + ex.getMessage());
            }
        }
        return resultado;
    }

    public Pessoa logarPessoa(String emailpessoa, String senhapessoa) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Pessoa pessoa = null;
        String sql = "SELECT *"
                + " FROM pessoa"
                + " WHERE emailpessoa = ?"
                + " AND senhapessoa = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, emailpessoa);
            stmt.setString(2, senhapessoa);
            rs = stmt.executeQuery();
            if (rs.next()) {
                pessoa = new Pessoa();
                pessoa.setIdPessoa(rs.getInt("idpessoa"));
                pessoa.setDataNascimentoPessoa(rs.getDate("datanascimentopessoa"));
                pessoa.setNomePessoa(rs.getString("nomepessoa"));
                pessoa.setResponsavelPessoa(rs.getString("responsavelpessoa"));
                pessoa.setTelefoneResponsavelPessoa("telefoneresponsavelpessoa");
                pessoa.setCepPessoa(rs.getString("ceppessoa"));
                pessoa.setCpfPessoa(rs.getString("cpfpessoa"));
                pessoa.setTelefonePessoa(rs.getString("telefonepessoa"));
                pessoa.setCelularPessoa(rs.getString("celularpessoa"));
                pessoa.setEnderecoPessoa(rs.getString("enderecopessoa"));
                pessoa.setBairroPessoa(rs.getString("bairropessoa"));
                pessoa.setCidadePessoa(rs.getString("cidadepessoa"));
                pessoa.setEstadoPessoa(rs.getString("estadopessoa"));
                pessoa.setNumeroEndPessoa(rs.getString("numeroendpessoa"));
                pessoa.setSexoPessoa(rs.getString("sexopessoa"));
                pessoa.setEmailPessoa(rs.getString("emailpessoa"));
                pessoa.setStatusPessoa(rs.getString("statuspessoa"));
                pessoa.setPerfilPessoa(rs.getString("perfilpessoa"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao logar Pessoa!"
                    + "\n Errp:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao gechar os parâmetros de conexão"
                        + "\n Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return pessoa;
    }
}
