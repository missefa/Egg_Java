/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package Guia2_Ejercicios;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej3_guia2Ejercicios {
    
   public static void main (String [] args){
       System.out.println("Ingrese una frase");
       Scanner ingresar = new Scanner (System.in);
       String frase = ingresar.nextLine();
       System.out.println("la frase en mayúsculas es: " + frase.toUpperCase());
       System.out.println("la frase en minúsculas es: " + frase.toLowerCase());
       
       
       
       
   }
           
    
}
