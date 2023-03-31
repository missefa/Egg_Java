/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej3_guia3Ejercicios {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner red =new Scanner (System.in);
      
        String  vfrase;
        System.out.println("ingrese la frase");
        vfrase= red.next();
        
        if (vfrase.length()==8) {
            
            System.out.println("correcto");
        }else {
            System.out.println("es incorrecto");
            
        }
    
}
}