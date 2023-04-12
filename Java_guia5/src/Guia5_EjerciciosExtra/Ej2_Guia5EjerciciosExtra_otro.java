/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_EjerciciosExtra;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej2_Guia5EjerciciosExtra_otro {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] vector1 = new int[3];
        int[] vector2 = new int[3];

        for (int i = 0; i < 3; i++) {

            vector1[i] = abs((int) (Math.random() * 10 - 5));
            vector2[i] = abs((int) (Math.random() * 10 - 5));

        }
        for (int i = 0; i < 3; i++) {
            System.out.print("[" + vector1[i] + "]");

        }
        System.out.println("");

        for (int i = 0; i < 3; i++) {

            System.out.print("[" + vector2[i] + "]");

        }
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            
            if (vector1[i] != vector2[i]) {
                System.out.println("los elementos son diferentes");
                
            break;
            } 
           
            else {
                    
                    
                System.out.println("son iguales");
            }

        }

    }

    }

