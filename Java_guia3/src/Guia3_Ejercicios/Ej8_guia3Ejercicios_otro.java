/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class Ej8_guia3Ejercicios_otro {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int vNum;
      
      System.out.println("Ingrese la longitud de lado del cuadrado");
      vNum = leer.nextInt();
      
      for (int i = 1 ; i <= vNum; i++){
          System.out.print("* ");
      }
      
      System.out.println("");
              
      
      for (int i = 1; (i <= vNum -2); i++) {
            System.out.print("* ");
            for (int j = 1; (j <= vNum -2); j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
      }
      for (int i = 1 ; i <= vNum; i++){
          System.out.print("* ");
      }
        System.out.println("");
        
    }
    
}
