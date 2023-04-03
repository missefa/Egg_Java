/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
package Guia2_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej4_guia2Ejercicios {

    public static void main(String[] args) {
        System.out.println("Ingrese la temperatura en grados centígrados");
        Scanner ingresar = new Scanner (System.in);
        float CentGrados = ingresar.nextFloat();
        float FarGrados = 32 + (9 * CentGrados / 5);
        System.out.println("La temperatura ingresada en grados Farenheit es " + FarGrados);
        
    }

}
