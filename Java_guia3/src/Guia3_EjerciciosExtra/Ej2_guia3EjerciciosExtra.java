/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_EjerciciosExtra;

/**
 *
 * @author Erica
 */
public class Ej2_guia3EjerciciosExtra {
    
 public static void main(String[] args) {
       int a , b , c , d , aux;
               
       a =  2;
       b =  5;
       c =  9;
       d = 26;
            
        System.out.println("Los valores iniciales de las variables son: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println(" ");
        
        aux = b;
        b   = c;
        c   = a;
        a   = d;
        d   = aux;
        
        System.out.println("Los valores cambiados son: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
   
    }

    
}
