/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej4_guia3EjerciciosExtra {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero del 1 al 10");
        int num = leer.nextInt();
     
        switch (num) {
            case 1:
                System.out.println("el valor en numeros romanos es: I");
                break;
            case 2:
                System.out.println("el valor en numeros romanos es: II");
                break;
            case 3:
                System.out.println("el valor en numeros romanos es: III");
                break;
            case 4:
                System.out.println("el valor en numeros romanos es: IV");
                break;
            case 5:
                System.out.println("el valor en numeros romanos es: V");
                break;
            case 6:
                System.out.println("el valor en numeros romanos es: VI");
                break;
            case 7:
                System.out.println("el valor en numeros romanos es: VII|");
                break;
            case 8:
                System.out.println("el valor en numeros romanos es: VIII");
                break;
            case 9:
                System.out.println("el valor en numeros romanos es: IX");
                break;
            case 10:
                System.out.println("el valor en numeros romanos es: X");
                break;
            default : 
                System.out.println("el numero ingresado no lo sabemos calcular");
            
            
        }

    }

}

