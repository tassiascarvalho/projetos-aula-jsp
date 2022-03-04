/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qa.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



/**
 *
 * @author Tassia
 */
public class ConnectionFactory {

    public static Connection conectar() throws  Exception {
          try {
            /*Classe do driver na propriedade do Driver*/
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(
            /*url*/     "jdbc:postgresql://localhost:5432/bdqa",
            /*user*/    "postgres", 
            /*password*/"postdba");
        } catch (Exception ex) {
            throw new Exception("Erro no conectar"
                    +ex.getMessage());
        }
    }

    private static void close(Connection conn, Statement stmt, ResultSet rs) throws Exception{
            try{
                if(rs != null) rs.close();
                if(stmt != null) stmt. close();
                if(conn != null) conn.close();
            }catch(Exception ex){
                 throw new Exception(ex.getMessage());
            }
    }
                       
    public static void closeConnection(Connection conn) throws Exception {
        close(conn, null, null);
    }
    
    public static void closeConnection(Connection conn, Statement stmt) throws Exception {
        close(conn, stmt, null);
    }
    
    public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) throws Exception {
        close(conn, stmt,rs);
    }
}
