/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.util;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Tassia
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date timeStamp = Calendar.getInstance().getTime();

        System.out.println(timeStamp);
    }

}
