/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_Teoria;

import java.util.Scanner;

/**
 *
 * @author JuanMa
 */
public class Ej09_guia3Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        int num;
        int cont=20;
        int suma=0;
        do{
            System.out.println("Ingrese "+ cont +" números para sumar, si ingresa un cero sale del programa y si ingresa un número negativo no se sumara:");
            num = leer.nextInt();
            cont--;
            if (num >=0 ){
                suma= suma + num;
            }
            
            
            
        }while ( cont!=0 && num!=0);
        System.out.println("la suma total de los números ingresados es: " + suma);
    }
    
}

