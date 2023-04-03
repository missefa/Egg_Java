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
public class Ej3_guia3EjerciciosExtra {

    public static void main(String[] args) {

System.out.println("ingrese una letra");
    Scanner leer = new Scanner (System.in);   
    String letra = leer.nextLine();
        
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            
        System.out.println("el valor ingresado es una vocal");
            
            
        } else
            
        System.out.println("el valor ingresado no es una vocal");
        
        }

}
