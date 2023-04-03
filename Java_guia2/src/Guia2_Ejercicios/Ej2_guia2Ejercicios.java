/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */
package Guia2_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej2_guia2Ejercicios {
    
    public static void main(String[] args) {
        System.out.println("Ingresá tu nombre");
        Scanner ingresar = new Scanner(System.in);
        String nombre = ingresar.next ();
        System.out.println("El nombre ingresado es " + nombre);


    }
    
    
}
