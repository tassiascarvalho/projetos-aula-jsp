/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.dao;

import br.com.projetocompleto.model.Fisica;
import br.com.projetocompleto.util.ConnectionFactory;
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
public class FisicaDAOImpl implements GenericDAO {

    //Criar Conexão
    Connection conn;

    public FisicaDAOImpl() throws Exception {
        try {
            conn = ConnectionFactory.conexao();
            System.out.println("Conectado com Sucesso");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        PreparedStatement stmt = null;
        Fisica oFisica = (Fisica) object;
        String sql = "INSERT INTO fisica "
                + "(cpffisica, apelidofisica, idpessoa)"
                + " values(?,?,?);";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oFisica.getCpfFisica());
            stmt.setString(2, oFisica.getApelidoFisica());

            try {
                //É aqui que acontece a associação
                PessoaDAOImpl dao = new PessoaDAOImpl();
                stmt.setInt(3, dao.cadastrar(oFisica));
            } catch (Exception ex) {
                System.out.println("Erro ao cadastrar Pessoa"
                        + ex.getMessage());
                ex.printStackTrace();
            }

            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao cadastrar Fisica Erro: "
                    + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Erro ao Fechar ConexãoErro: "
                        + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> listar() {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        List<Object> resultado = new ArrayList<>();
        String sql = "SELECT * FROM PESSOA, FISICA "
                + "WHERE PESSOA.IDPESSOA = FISICA.IDPESSOA ";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Fisica oFisica = new Fisica();

                oFisica.setIdPessoa(rs.getInt("idPessoa"));
                oFisica.setNomePessoa(rs.getString("nomePessoa"));
                oFisica.setEmailPessoa(rs.getString("emailPessoa"));
                oFisica.setIdFisica(rs.getInt("idFisica"));
                oFisica.setCpfFisica(rs.getString("cpfFisica"));
                oFisica.setApelidoFisica(rs.getString("apelidoFisica"));

                resultado.add(oFisica);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ListarFisica : " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão : " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return resultado;
    }

    @Override
    public void excluir(int idObject) {
        PreparedStatement stmt = null;

        String sql
                = "delete from fisica where idpessoa=?;"
                + "COMMIT;"
                + "delete from pessoa where idpessoa=?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.setInt(2, idObject);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao ExcluirPEssoaFisica : "
                    + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão : "
                        + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Object carregar(int idObject) {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Fisica oFisica = new Fisica();

        String sql = "SELECT * FROM PESSOA, FISICA "
                + "WHERE PESSOA.IDPESSOA = FISICA.IDPESSOA "
                + "AND PESSOA.IDPESSOA =?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();

            if (rs.next()) {
                oFisica.setIdPessoa(rs.getInt("idPessoa"));
                oFisica.setNomePessoa(rs.getString("nomePessoa"));
                oFisica.setEmailPessoa(rs.getString("emailPessoa"));
                oFisica.setIdFisica(rs.getInt("idFisica"));
                oFisica.setCpfFisica(rs.getString("cpfFisica"));
                oFisica.setApelidoFisica(rs.getString("apelidoFisica"));
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao CarregarFisica : " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão : " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return oFisica;
    }

    @Override
    public Boolean alterar(Object object) {
        PreparedStatement stmt = null;
        Fisica oFisica = (Fisica) object;
        String sql = "UPDATE fisica SET "
                + " cpffisica=?, apelidofisica=? "
                + " WHERE idpessoa = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oFisica.getCpfFisica());
            stmt.setString(2, oFisica.getApelidoFisica());
            stmt.setInt(3, oFisica.getIdPessoa());
            try {
                if (new PessoaDAOImpl().alterar(oFisica)) {
                    stmt.executeUpdate();
                    return true;
                } else {
                    return false;
                }
            }catch(Exception ex) {
                System.out.println("Erro ao Alterar Pessoa" + ex.getMessage());
                ex.printStackTrace();
                return false;
            }
        }catch(Exception ex){
              System.out.println("Erro ao Alterar PessoaFisica" + ex.getMessage());
              ex.printStackTrace();
              return false;
        }finally{
            try{
                ConnectionFactory.fechar(conn, stmt, null);
            }catch(Exception ex){
                System.out.println("Erro ao fechar conexao "+ ex.getMessage());
            }
        }
    }
 }
