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
public class Ej5_guia3Ejercicios {
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int vNumLim, vNum, vSuma;
        System.out.println("Ingrese el limite positivo");
        vNumLim = read.nextInt();
        vSuma = 0;
        while (vSuma <= vNumLim){
            System.out.println("Ingrese a continuacion numeros");
            vNum = read.nextInt();
            vSuma = vSuma + vNum;
        }
        System.out.println("Se ha superado al limite, la suma es: " + vSuma);
        
    }
    
}