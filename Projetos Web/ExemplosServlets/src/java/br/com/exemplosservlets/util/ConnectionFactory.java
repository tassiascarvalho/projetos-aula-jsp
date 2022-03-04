/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exemplosservlets.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Tassia
 */
public class ConnectionFactory {
    
    //Esta serve para gerenciar as conexões.
    
    //Abrir a conexão
    public static Connection getConnection() throws Exception{
        //Tratamento de erros
        try{
            //Abrir a conexão
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/exemplobd", /*url - caminho*/
                    "postgres",/*user*/ 
                    "postdba");/*password*/
            
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }        
    }
    //Connection - Resposável por gerenciar a conexão.
    //Statement - Gerenciar de SQL - Resposável pela manipulação de SQL
    //ResultSet - Resposável por armazenar os retornos do BD
    
    //Fechar a conexão
    private static void close(Connection conn, Statement stmt, ResultSet rs) throws Exception{
        try{
            if(rs!=null){
                rs.close();
            }
            if(stmt!=null){
                stmt.close();
            }
            if(conn!=null){
                conn.close();
            }            
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
    //Polimorfismo - Quando um método com o mesmo nome assume formas diferentes.
    public static void closeConnection(Connection conn) throws Exception{
        close(conn, null, null);
    }
    
    public static void closeConnection(Connection conn, Statement stmt) throws Exception{
        close(conn, stmt, null);
    }
    
    public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) throws Exception{
        close(conn, stmt, rs);
    }
}
