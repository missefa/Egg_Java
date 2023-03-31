/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_Teoria;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej06_guia3Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int num1, num2; 
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer número");
        num1 = leer.nextInt();
        System.out.println("ingrese el segundo número");
        num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25){
            System.out.println("los números ingresados son mayores a 25");
        }else if (num1 > 25){
            System.out.println("el primer numero es mayor a 25");
        }else if (num2 > 25) {
            System.out.println("el segundo número es mayor que 25");            
        }else{
            System.out.println("ninguno de los números ingresados es mayor a 25");
        }      
    }
}
