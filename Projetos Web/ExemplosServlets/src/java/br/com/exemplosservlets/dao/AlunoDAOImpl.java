/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exemplosservlets.dao;

import br.com.exemplosservlets.model.Aluno;
import br.com.exemplosservlets.util.ConnectionFactory;
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
public class AlunoDAOImpl implements GenericDAO{
    //vai ficar todos os metodos relacionados a manipulação do Aluno no BD
    
    //Chamar o metodo de Conexão.
    private Connection conn;//Add Import
    
    public AlunoDAOImpl() throws Exception {
        //Conexão com BD
        try{
            conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com Sucesso");
        }catch(Exception ex){
            throw new Exception(ex.getMessage());     
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
       //Instanciar o objeto
       Aluno oAluno = (Aluno) object;
       PreparedStatement stmt = null; 
       String sql = "INSERT INTO aluno("
                   +"nomeAluno, "
                   +"enderecoAluno, "
                   +"numeroAluno, "
                   +"cidadeAluno, "
                   +"telefoneAluno, "
                   +"idadeAluno, "
                   +"emailAluno, "
                   +"senhaAluno)"
                   +"VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
       try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oAluno.getnomeAluno());
            stmt.setString(2, oAluno.getenderecoAluno());
            stmt.setString(3, oAluno.getnumeroAluno());
            stmt.setString(4, oAluno.getcidadeAluno());
            stmt.setString(5, oAluno.gettelefoneAluno());
            stmt.setInt(6, oAluno.getidadeAluno());
            stmt.setString(7, oAluno.getemailAluno());
            stmt.setString(8, oAluno.getsenhaAluno());
            stmt.execute();   
            return true;
       }
       catch(Exception ex){
           System.out.println("Erro ao cadastrar Aluno - DAO \n Erro: " +ex.getMessage());
           ex.printStackTrace();
           return false;
       }finally{
           try{
               ConnectionFactory.closeConnection(conn, stmt);
           }catch(Exception ex){
               System.out.println("Problemas ao fechar conn - DAO \n Erro: " +ex.getMessage());
               ex.printStackTrace();
           }
       }
    }

    @Override
    public List<Object> listar() {
        //Define as Classes e Variáveis que estão sendo utilizadas.
       //Registro - Linhas
       //Atributo - Colunas
       //Array Matriz (Linha e Coluna)
       
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String sql = "Select * from aluno";
        
        
        try{
            stmt = conn.prepareStatement(sql);
            
            //Executar o SQL
            rs = stmt.executeQuery();
            //Realizar a leitura do retorno do banco
            while(rs.next()){
                Aluno oAluno = new Aluno();
                oAluno.setidAluno(rs.getInt("idAluno"));
                oAluno.setnomeAluno(rs.getString("nomeAluno"));
                oAluno.setenderecoAluno(rs.getString("enderecoAluno"));
                oAluno.setnumeroAluno(rs.getString("numeroAluno"));
                oAluno.setcidadeAluno(rs.getString("cidadeAluno"));
                oAluno.settelefoneAluno(rs.getString("telefoneAluno"));
                oAluno.setidadeAluno(rs.getInt("idadeAluno"));
                oAluno.setemailAluno(rs.getString("emailAluno"));
                oAluno.setsenhaAluno(rs.getString("senhaAluno"));
                
                resultado.add(oAluno);
            }
        }
        catch(SQLException ex){
            System.out.println("Erro ao Listar Aluno." +ex.getMessage());
            ex.printStackTrace();
        }finally{
            try{
                ConnectionFactory.closeConnection(conn, stmt, rs);
                
            }
            catch(Exception ex){
                System.out.println("Problemas ao fechar parâmetros de execução." + ex.getMessage());
                 ex.printStackTrace();
            }
        }
         return resultado;
    }

    @Override
    public void excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object carregar(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
