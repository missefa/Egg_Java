/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Guia5_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej3_guia5Ejercicios_otro_VER {
    
    
  public static void main (String [] args){
       Scanner vScan = new Scanner(System.in);
        System.out.print("¿Cuántos números desea agregar? : ");
        int vSize = vScan.nextInt();
        String vNumber;
        int [] vArray = new int[5];
        for (int i = 0; i<vSize;i++) {
            do {
                System.out.println(" ");
                System.out.print("Ingrese un número (Maximo de 5 dígitos): ");
                vNumber = vScan.next();
            } while (vNumber.length()>5);
            switch (vNumber.length()){
                case 1 : vArray[0]++;
                case 2 : vArray[1]++;
                case 3 : vArray[2]++;
                case 4 : vArray[3]++;
                case 5 : vArray[4]++;
            }
        }
        System.out.println(" ");
        System.out.println("Números de 1 dígito: " +vArray[0]);
        System.out.println("Números de 2 dígitos: " +vArray[1]);
        System.out.println("Números de 3 dígitos: " +vArray[2]);
        System.out.println("Números de 4 dígitos: " +vArray[3]);
        System.out.println("Números de 5 dígitos: " +vArray[4]);
    }

  }
    

