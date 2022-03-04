


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controledeusuario.dao;

import br.com.controledeusuario.model.Cidade;
import br.com.controledeusuario.model.Pessoa;
import br.com.controledeusuario.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Tassia
 */
public class PessoaDAOImpl {
    private Connection conn;

    public PessoaDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.conectar();
            System.out.println("Conectado com Sucesso");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    
    //Cadastrar da Pessoa
    public Integer cadastrar(Pessoa pessoa) {
        PreparedStatement stmt = null;
        Integer idPessoa = null;
        ResultSet rs = null;
        String sql = "INSERT INTO pessoa("
                + " cpf, nome, datanascimento, login, "
                + " senha, idcidade)"
                + " VALUES(?, ?, ?, ?, ?, ?) RETURNING idpessoa";         
        try{
            stmt= conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getCpf());
            stmt.setString(2, pessoa.getNome());
            stmt.setDate(3, new java.sql.Date(pessoa.getDatanascimento().getTime()));            
            stmt.setString(4, pessoa.getLogin());
            stmt.setString(5, pessoa.getSenha());
            stmt.setInt(6, pessoa.getCidade().getIdCidade());
            rs = stmt.executeQuery();
            
            if(rs.next()){
                idPessoa = rs.getInt("idpessoa");
            }            
        }catch (SQLException ex) {//Caso dê problema
            System.out.println("Problemas ao cadastrar cliente \n Erro:" 
                    + ex.getMessage());
            ex.printStackTrace();            
        } finally {//Executa de qualquer forma       
            try {
                ConnectionFactory.fechar(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão \n Erro:" + ex.getMessage());
                ex.printStackTrace();
            }            
        }
        return idPessoa;
    } 
}
