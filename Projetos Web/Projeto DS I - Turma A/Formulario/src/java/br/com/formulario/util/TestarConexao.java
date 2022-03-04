/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.formulario.util;

import java.sql.Connection;

/**
 *
 * @author Tassia
 */
public class TestarConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        try {
            Connection conexao = ConnectionFactory.abrirconexao();
            System.out.println("Conectou");
        } catch (Exception ex) {
            System.out.println("Não Conectou");
        }
    }
    
}
