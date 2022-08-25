/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.dao;

import br.com.projetocompleto.model.Saida;
import br.com.projetocompleto.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Tassia
 */
public class SaidaDAOImpl implements GenericDAO{

    
    //Criar a ProdutoDAOImpl, adicionar o implements GenericDAO
    //Colocar a conexão com o BD
    Connection conn;
    
    public SaidaDAOImpl() throws Exception {
        //Conexão
        try{
            conn = ConnectionFactory.conexao();
            System.out.println("Conectado com Sucesso");
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }        
    }
        
    @Override
    public Boolean cadastrar(Object object) {
        PreparedStatement stmt = null;
        Saida oSaida = (Saida) object;
        
        String sql = "INSERT INTO saida (natopsaida, idfisica, statussaida, datacriacaosaida)"
                + " values(?, ?, ?, ?)";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "VENDA");
            stmt.setInt(2, oSaida.getoFisica().getIdFisica());
            stmt.setString(3, "A");// A de Aberta;            
	    
            Date data1 = new Date();
            SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");      
            formatador.format(data1);
            
            stmt.setDate(4, new java.sql.Date(data1.getTime()));//Recuperando a data atual
            
            stmt.execute();
            return true;
        }catch (Exception ex) {
            System.out.println("Erro ao cadastrar Saida! \n Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros da conexão! \n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }        
    }

    @Override
    public List<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Saida oSaida = null;
        
        String sql ="select * from saida, fisica " +
                    "where saida.idfisica = fisica.idfisica " +
                    "and saida.statussaida = 'A' " +
                    "and fisica.idpessoa =  ?;";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();            
            if(rs.next()){
                oSaida = new Saida();
                oSaida.setIdSaida(rs.getInt("idsaida"));
                oSaida.setStatusSaida(rs.getString("statussaida"));
            }
        }catch(SQLException ex){
            System.out.println("Erro ao CarregarSaida" +ex.getMessage());
            ex.printStackTrace();
        }finally{
            try{
                ConnectionFactory.fechar(conn, stmt, rs);
            }catch(Exception ex){
                System.out.println("Erro ao fechar conexão"+ex.getMessage());
                ex.printStackTrace();
            }
        }
        return oSaida; 
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
