/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej1_guia2Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ingresar = new Scanner(System.in);
        int num1 = ingresar.nextInt();
        int num2 = ingresar.nextInt();     
        int suma = num1 + num2;
        System.out.println("La suma de " + num1 +" y "+ num2 + " es igual a " + suma);
    }

}
