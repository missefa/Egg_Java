/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4_Teoria;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej12_guiaTeoria {
    
public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
      System.out.println("Ingrese un numero");
       int num= read.nextInt();
      System.out.println("Ingrese un segundo numero");
        int num2= read.nextInt(); 
      
        multiplo(num,num2);
        
        
    }
    public static void multiplo(int num, int num2) {
    
        float multiplo;
        multiplo = num % num2;
        
        if (multiplo == 0){
        System.out.println(num + " es multiplo de " + num2);
        }else{
        System.out.println(num + " NO es multiplo de " + num2);
        }
    }
}
    
    

