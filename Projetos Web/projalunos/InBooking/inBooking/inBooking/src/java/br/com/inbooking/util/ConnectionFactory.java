package br.com.inbooking.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionFactory {
    //Realiza a conexão com o banco de dados 
    public static Connection getconnection() throws Exception {
        //Try - Catch - Tratamento de erro...
        try {
            //Tenta realizar uma conexão
            Class.forName("org.postgresql.Driver"); /*Classe do driver na propriedade do Driver */

            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/inbooking","postgres", "postdba");
        } catch (Exception ex) {
            //Se a conexão der errado executa o catch
            throw new Exception(ex.getMessage());
        }
    }

    private static void close(Connection conn, Statement stmt, ResultSet rs) throws Exception {
        //Connection conn- conecta projeto e banco
        //Statement stmt- permite que o java manipule o codigo sql do banco
        //ResultSet rs- seta os resultados que vem do banco
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    //Usando o método close
    public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) throws Exception{
        close(conn, stmt, rs);
    }
    public static void closeConnection(Connection conn, Statement stmt) throws Exception{
        close(conn, stmt, null);
    }
    public static void closeConnection(Connection conn) throws Exception{
        close(conn, null, null);
    }
}
