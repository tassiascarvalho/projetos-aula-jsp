/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.util;

import java.sql.Connection;

/**
 *
 * @author Tassia
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       
        Connection conn = ConnectionFactory.conexao();
        if (conn != null)
             System.out.println("Conectado");
        else
            System.out.println("Não Conectou");
    }

}
