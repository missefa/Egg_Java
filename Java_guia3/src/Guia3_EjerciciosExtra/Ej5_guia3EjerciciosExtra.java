/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej5_guia3EjerciciosExtra {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("ingrese el tipo de asosiado que es");
        String clase = leer.nextLine();
        switch (clase){
            case "a": 
                System.out.println("ingrese el valor del tratamiento que se va a realizar");
                int tratamiento = leer.nextInt();
                int nuevoValor;
                System.out.println("tu tratamiento quedara en el valor de " + (nuevoValor = tratamiento/2));                             
                break;
            case "b":
                         System.out.println("ingrese el valor del tratamiento que se va a realizar");
                int tratamientob = leer.nextInt();
                double nuevoValorb;
                System.out.println("tu tratamiento quedara en el valor de " + (nuevoValorb = tratamientob*0.65)); 
                
                break;
                 case "c": 
                System.out.println("ingrese el valor del tratamiento que se va a realizar");
                int tratamientoc = leer.nextInt();
                System.out.println("tu tratamiento quedara en el valor de " + tratamientoc + "subi de categoria");                             
                break;
                
                 default :
                     System.out.println("tu clase no existe");
        }
       
    }
    
}

