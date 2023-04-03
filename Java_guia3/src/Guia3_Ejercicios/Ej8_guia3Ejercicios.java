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
public class Ej8_guia3Ejercicios {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la longitud de lado del cuadrado");
        int N = leer.nextInt();
        for (int i = 1 ; i <= N; i++){
            System.out.println("");
            for ( int j = 1; j <= N; j ++ ){
                if(i==1 || i==N || j == 1 || j == N){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            
        }
        System.out.print("\n\n\n");
    
    
  
    }
    
}
