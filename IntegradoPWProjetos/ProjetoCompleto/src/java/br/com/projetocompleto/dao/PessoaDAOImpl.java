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
                + " (nomepessoa, emailpessoa)"
                + " values(?,?) RETURNING (idpessoa);";
        
        try{
            stmt = conn.prepareStatement(sql);            
            stmt.setString(1, pessoa.getNomePessoa());
            stmt.setString(2, pessoa.getEmailPessoa());
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
}
