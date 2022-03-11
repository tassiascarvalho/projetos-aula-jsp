/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.dao;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//inicio
        //Declaração de Variaveis
        Integer codigop;//sem casas decimais
        Double valorp; //casas decimais R$20,25
        Integer quantidade;
        //Informa que o sistema terá entrada
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o código do produto");
        codigop = ler.nextInt();
        System.out.println("Informe o valor do produto");
        valorp = ler.nextDouble();
        System.out.println("Informe a quantidade");
        quantidade = ler.nextInt();
        
        Double total = valorp * quantidade;
        
        System.out.println(codigop);
        System.out.println("Valor Total " + total);
    }//fim
    
}
