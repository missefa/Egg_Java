/*
 Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package Guia5_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej1_guia5EjerciciosExtra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[100];
        for (int i = 0; i <= 99; i++) {
            numeros[i] = (i + 1);
        }
        for (int i = 99; i >= 0; i--) {
            System.out.print(" [ " + numeros[i] + " ] ");
        }
        System.out.println("\n");
    }
}
