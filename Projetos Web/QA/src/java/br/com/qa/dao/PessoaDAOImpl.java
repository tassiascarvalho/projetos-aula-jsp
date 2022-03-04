/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qa.dao;


import br.com.qa.model.Pessoa;
import br.com.qa.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Aluno
 */
public class PessoaDAOImpl {
    //não implementa GenericDAO

    private Connection conn;

    public PessoaDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.conectar();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    public Integer cadastrar(Pessoa pessoa) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer idPessoa = null;
        String sql = "INSERT INTO pessoa (nomepessoa, "
                + "cpfpessoa, "
                + "loginpessoa, "
                + "senhapessoa, "
                + "tipopessoa)"
                + " VALUES (?, ?, ?, ?, ?)"
                + " RETURNING (idpessoa);";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNomePessoa());
            stmt.setString(2, pessoa.getCpfPessoa());
            stmt.setString(3, pessoa.getLoginPessoa());
            stmt.setString(4, pessoa.getSenhaPessoa());
            stmt.setString(5, pessoa.getTipoPessoa());
            rs = stmt.executeQuery();

            if (rs.next()) {
                idPessoa = rs.getInt("idpessoa");
            }
        } catch (Exception ex) {
            System.out.println("Erro ao cadastrar Pessoa!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros da conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return idPessoa;
    }

    public Boolean alterar(Object object) {

        Pessoa pessoa = (Pessoa) object;
        PreparedStatement stmt = null;
        String sql = "UPDATE pessoa SET"
                + " nomepessoa = ?,"
                + " cpfpessoa = ?,"
                + " loginpessoa = ?,"
                + " senhapessoa = ?"
                + " WHERE idpessoa = ? ; ";
        try {
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, pessoa.getNomePessoa());
            stmt.setString(2, pessoa.getCpfPessoa());
            stmt.setString(3, pessoa.getLoginPessoa());
            stmt.setString(4, pessoa.getSenhaPessoa());
            stmt.setInt(5, pessoa.getIdPessoa());

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
                System.out.println("Problemas ao fechar os parâmetros da conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    public Pessoa logarPessoa(String login, String senha){
        PreparedStatement stmt= null;
        ResultSet rs= null;
        Pessoa pessoa=null;
        
        String sql="select * from pessoa  where loginpessoa = ? and senhapessoa = ?";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                pessoa = new Pessoa();
                
                pessoa.setIdPessoa(rs.getInt("idpessoa"));
                pessoa.setNomePessoa(rs.getString("nomepessoa"));
                pessoa.setLoginPessoa(rs.getString("loginpessoa"));
                pessoa.setTipoPessoa(rs.getString("tipopessoa"));
            }
        }catch(SQLException ex){
            System.out.println("Problemas ao logor Pessoa erro: " + ex.getMessage());
            ex.printStackTrace();
        }finally{
            try{
            ConnectionFactory.closeConnection(conn, stmt, rs);
            }catch(Exception ex){
                System.out.println("Problemas ao fechar conexão erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }        
        return pessoa;
    }
}
