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
public class Ej1_guia3Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int vNum;
       
       System.out.println("Ingrese un numero entero");
       vNum = read.nextInt();
       
        if (vNum % 2 == 0) {
            System.out.println("El numero ingresado es par");
        }else {
            System.out.println("El numero ingresado es impar");
        }
    }
    
}
