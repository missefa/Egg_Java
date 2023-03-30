/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8_guiateorica3_otro;

import java.util.Scanner;

/**
 *
 * @author Gastón
 */
public class Ej8_guiaTeorica3_otro {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
     
        int nota;
        System.out.println("ingrese una nota entre 0 y 10");
        Scanner leer = new Scanner(System.in);
        nota = leer.nextInt();  
      
        while (nota <0 || nota > 10){
            System.out.println("ingrese una nota dentro de los parametros");
            nota = leer.nextInt();
        }
        System.out.println("La nota ingresada " + nota + " es valida!!");
    }
    
}
