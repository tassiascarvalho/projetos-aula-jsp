/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qa.util;

import java.sql.Connection;

/**
 *
 * @author Tassia
 */
public class TesteConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Connection conexao = ConnectionFactory.conectar();
            System.out.println("Conectou");
        } catch (Exception ex) {
            System.out.println("Não Conectou");
        }
    }

}
