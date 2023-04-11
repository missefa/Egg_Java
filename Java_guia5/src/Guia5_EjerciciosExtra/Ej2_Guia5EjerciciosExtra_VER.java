/*
 Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
package Guia5_EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej2_Guia5EjerciciosExtra_VER {
   public static void main(String[] args) {
        int n;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese el tamaño del vector: ");
            n = leer.nextInt();
        }while(n<1);
        
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        
        for(int i=0; i<n; i++){
            System.out.println("Ingrese el valor de la posicion: " +(i+1));
            vector1[i] = leer.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.println("Ingrese el valor de la posicion: " +(i+1));
            vector2[i] = leer.nextInt();
        }
        boolean comparacion = false;
        for (int i = 0; i <n; i++) {
            int contador = 0;
            if (vector1[i] != vector2[i]) {
               
            }
        }
        
    }
}
