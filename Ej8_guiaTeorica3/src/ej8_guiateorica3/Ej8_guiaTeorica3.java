/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package ej8_guiateorica3;

import java.util.Scanner;

/**
 *
 * @author Gastón
 */
public class Ej8_guiaTeorica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int nota;
        System.out.println("ingrese una nota entre 0 y 10");
        Scanner leer = new Scanner(System.in);
        nota = leer.nextInt();  
        while (nota <0 || nota > 10){
            System.out.println("ingrese una nota dentro de los parametros");
            nota = leer.nextInt();
        } 
    }
    
}