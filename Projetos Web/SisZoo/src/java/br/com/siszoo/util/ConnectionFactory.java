/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siszoo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author aluno
 */
public class ConnectionFactory {
    
    public static Connection getConnection() throws Exception{
        try {
            Class.forName("org.postgresql.Driver"); /*Classe do driver na propriedade do Driver*/
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/SisZoo", "postgres", "postdba"); /*url, user, password*/  
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    
    private static void close(Connection conn, Statement stmt, ResultSet rs) throws Exception{
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    
    public static void closeConnection (Connection conn) throws Exception{
        close(conn, null, null);
    }
    
    public static void closeConnection (Connection conn, Statement stmt) throws Exception{
        close(conn, stmt, null);
    }
    
    public static void closeConnection (Connection conn, Statement stmt, ResultSet rs) throws Exception{
        close(conn, stmt, rs);
    }
}
