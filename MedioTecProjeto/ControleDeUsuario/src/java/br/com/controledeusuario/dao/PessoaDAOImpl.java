/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controledeusuario.dao;

import br.com.controledeusuario.model.Pessoa;
import br.com.controledeusuario.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Tassia
 */
public class PessoaDAOImpl {

    private Connection conn;
    
    public PessoaDAOImpl() throws Exception {
        try{
            conn= ConnectionFactory.conectar();
            System.out.println("Conectado com Sucesso");
        }catch(Exception ex){
            //mensagem com o motivo do erro...
            //detalhamento do erro
            throw new Exception(ex.getMessage());
        }    
    }    
    
    //cadastrar
    public Integer cadastrar(Pessoa pessoa){
        PreparedStatement stmt = null;//Permite manipular SQL
        ResultSet rs = null;//Armazena Retorno
        Integer idPessoa= null;
        String sql = "INSERT INTO PESSOA "
                + "(cpf, nome, datanascimento, login,"
                + " senha, idcidade) "
                + "VALUES (?,?,?,?,?,?) RETURNING (idpessoa)";
        
        try{
            //Passa o SQL para o stmt....
            stmt = conn.prepareStatement(sql);
            //Passagem de Parametros
            stmt.setString(1, pessoa.getCpf());
            stmt.setString(2, pessoa.getNome());
            stmt.setDate(3, new java.sql.Date
                         (pessoa.getDatanascimento().getTime()));
            stmt.setString(4, pessoa.getLogin());
            stmt.setString(5, pessoa.getSenha());
            stmt.setInt(6, pessoa.getCidade().getIdCidade());
            rs = stmt.executeQuery();   
            
            if(rs.next()){
                idPessoa = rs.getInt("idpessoa");
            }            
        }catch(Exception ex){
                System.out.println("Erro ao SalvarPessoa Erro:"
                        + ex.getMessage());
                ex.printStackTrace();
        }finally{
            try{
                ConnectionFactory.fechar(conn, stmt, rs);
            }catch(Exception ex){
                System.out.println("Erro ao Fechar Conex??o Erro:"
                        + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return idPessoa;
    } 
}
