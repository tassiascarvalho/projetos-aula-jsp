package Br.com.ComboBox.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Conexao {
    String caminho = "jdbc:postgresql://localhost:5432/";
    String banco = "ComboBox";
    String usuario = "postgres";
    String senha = "1234";
    public Connection getConnection() {
         Connection con = null;
        try {
            
           Class.forName("org.postgresql.Driver");
           con = DriverManager.getConnection(caminho+banco,usuario,senha);
            
        } 
        catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"Não foi possivel se conectar ao banco de dados!");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
     return con;
    }
    
}
