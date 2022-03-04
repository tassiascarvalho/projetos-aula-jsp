/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exemplosservlets.dao;

import br.com.exemplosservlets.model.Disciplina;
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
public class DisciplinaDAOImpl implements GenericDAO{
    
    private Connection conn;//Add Import
    
    public DisciplinaDAOImpl() throws Exception {
        //Conexão com BD
        try{
            conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com Sucesso");
        }catch(Exception ex){
            throw new Exception(ex.getMessage());     
        }
    }
    
    @Override
    public Boolean cadastrar(Object object) 
    {
        //Instaciar o objeto
        Disciplina oDisciplina = (Disciplina) object;
        PreparedStatement stmt = null;//Adiciona Importanção
        //sql  - qry
        String sql= "INSERT INTO disciplina("
                  + " nomedisciplina, "
                  + " descricaodisciplina, "
                  + " ementadisciplina)"
                  + " VALUES(?, ?, ?)";        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oDisciplina.getnomeDisciplina());
            stmt.setString(2, oDisciplina.getdescricaoDisciplina());
            stmt.setString(3, oDisciplina.getementaDisciplina());            
            stmt.execute();            
            return true;
        }catch(Exception ex){
            System.out.println("Erro ao cadastrar Disciplina - DAO \n Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        }finally{
            try{
                ConnectionFactory.closeConnection(conn, stmt);
            }catch(Exception ex){
                System.out.println("Problemas ao fechar conn - DAO \n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }        
    }

    @Override
    public List<Object> listar() 
    {
       //Define as Classes e Variáveis que estão sendo utilizadas.
       //Registro - Linhas
       //Atributo - Colunas
       //Array Matriz (Linha e Coluna)
       
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String sql = "Select * from disciplina";
        
        
        try{
            stmt = conn.prepareStatement(sql);
            
            //Executar o SQL
            rs = stmt.executeQuery();
            //Realizar a leitura do retorno do banco
            while(rs.next()){
                Disciplina oDisciplina = new Disciplina();
                oDisciplina.setidDisciplina(rs.getInt("idDisciplina"));
                oDisciplina.setnomeDisciplina(rs.getString("nomeDisciplina"));
                oDisciplina.setdescricaoDisciplina(rs.getString("descricaoDisciplina"));
                oDisciplina.setementaDisciplina(rs.getString("ementaDisciplina"));
                
                resultado.add(oDisciplina);
            }
        }
        catch(SQLException ex){
            System.out.println("Erro ao Listar Disciplina." +ex.getMessage());
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
