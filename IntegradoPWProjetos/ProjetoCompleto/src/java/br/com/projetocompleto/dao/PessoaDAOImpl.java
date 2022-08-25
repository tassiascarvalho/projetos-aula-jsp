/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.dao;

import br.com.projetocompleto.model.Pessoa;
import br.com.projetocompleto.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;

/**
 *
 * @author Tassia
 */
public class PessoaDAOImpl {
    //Data Access Object
    //Construtor com a conexão
    Connection conn;
    
    public PessoaDAOImpl() throws Exception {
        //Conexão
        try{
            conn = ConnectionFactory.conexao();
            System.out.println("Conectado com Sucesso");
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }        
    }
    
    //Cadastrar
    //tipodeacesso retorno nome(parametros)
    public Integer cadastrar(Pessoa pessoa){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer idPessoa = 0;
        
        String sql = "INSERT INTO PESSOA"
                + " (nomepessoa, emailpessoa, senhapessoa)"
                + " values(?,?,?) RETURNING (idpessoa);";
        
        try{
            stmt = conn.prepareStatement(sql);            
            stmt.setString(1, pessoa.getNomePessoa());
            stmt.setString(2, pessoa.getEmailPessoa());
            stmt.setString(3, pessoa.getSenhaPessoa());
            rs = stmt.executeQuery();
            
            if(rs.next()){
                idPessoa = rs.getInt("idpessoa");
            }
        }catch(Exception ex){
             System.out.println("Erro ao cadastrar Pessoa!"
                     + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
        }finally{
            try{
                ConnectionFactory.fechar(conn, stmt, rs);
            }catch(Exception ex){
                System.out.println("Problemas ao fechar Conexão");
                ex.printStackTrace();
            }
        }
        return idPessoa;
    }
    
    public Boolean alterar(Object object){
        Pessoa oPessoa = (Pessoa) object;
        PreparedStatement stmt = null;
        String sql = "UPDATE pessoa SET "
                + "nomepessoa = ?, emailpessoa = ? "
                + "WHERE idpessoa=?;";
        
        try{
            stmt= conn.prepareStatement(sql);
            stmt.setString(1, oPessoa.getNomePessoa());
            stmt.setString(2, oPessoa.getEmailPessoa());
            stmt.setInt(3, oPessoa.getIdPessoa());
            stmt.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.out.println("Erro ao Alterar Pessoa "+ ex.getMessage());
            ex.printStackTrace();
            return false;
        }finally{
            try{
                ConnectionFactory.fechar(conn, stmt, null);
            }catch(Exception ex){
                System.out.println("Erro ao fechar conexão "+ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    //Login
    public Pessoa logarPessoa(String email, String senha){
        PreparedStatement stmt= null;
        Pessoa oPessoa = null;   
        ResultSet rs=null;
        String sql= "select * from pessoa "
                + " where emailpessoa = ? "
                + " and senhapessoa = ? ;";        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                oPessoa = new Pessoa();
                oPessoa.setIdPessoa(rs.getInt("idpessoa"));
                oPessoa.setNomePessoa(rs.getString("nomepessoa"));
                oPessoa.setEmailPessoa(rs.getString("emailpessoa"));
            }
        }catch(SQLException ex){
            System.out.println("Erro ao LogarPessoa" +ex.getMessage());
            ex.printStackTrace();
        }finally{
            try{
                ConnectionFactory.fechar(conn, stmt, rs);
            }catch(Exception ex){
                System.out.println("Erro ao fechar conexão"+ex.getMessage());
                ex.printStackTrace();
            }
        }
        return oPessoa;
    }
}
