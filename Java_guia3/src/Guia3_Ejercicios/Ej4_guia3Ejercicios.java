/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej4_guia3Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String vFrase; 
        
        System.out.println("Ingrese una frase o palabra");
        vFrase = read.next();
        
        if (vFrase.substring(0,1).equals("A")) {
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
        
    }
    
}