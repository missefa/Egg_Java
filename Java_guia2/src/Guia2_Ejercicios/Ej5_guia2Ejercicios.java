/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
package Guia2_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej5_guia2Ejercicios {
    
    public static void main (String [] args) {
        
        System.out.println("Ingrese un número entero");
        Scanner ingresar = new Scanner (System.in);
        int num = ingresar.nextInt();
        System.out.println("El doble del número ingresado es " + num*2 + ", el triple del número "
        + "ingresado es " + num*3 + " y la raíz cuadrada del número ingresado es " 
                + Math.sqrt(num));
        
    }
}
