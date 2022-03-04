/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoupa.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Tassia
 */
public class ConnectionFactory {

    public static Connection abrirconexao() throws Exception {
        try {
            /*Classe do driver na propriedade do Driver*/
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(
                    /*url*/"jdbc:postgresql://localhost:5432/bdupa",
                    /*user*/ "postgres",
                    /*password*/ "postdba");
        } catch (Exception ex) {
            throw new Exception("Erro no conectar" + ex.getMessage());
        }
    }
    
    private static void fecharconexao(Connection conn, 
            Statement stmt, ResultSet rs) throws Exception{
            try{
                if(rs != null) rs.close();
                if(stmt != null) stmt. close();
                if(conn != null) conn.close();
            }catch(Exception ex){
                 throw new Exception(ex.getMessage());
            }
    }
    
    //Polimorfismo - 3 Métodos com o mesmo 
    //nome mas que exercem funções diferentes    
    public static void fechar(Connection conn) 
            throws Exception {
        fecharconexao(conn, null, null);
    }    
    public static void fechar(Connection conn,
            Statement stmt) throws Exception {
        fecharconexao(conn, stmt, null);
    }    
    public static void fechar(Connection conn, 
            Statement stmt, ResultSet rs) 
            throws Exception {
        fecharconexao(conn, stmt,rs);
    }
}
