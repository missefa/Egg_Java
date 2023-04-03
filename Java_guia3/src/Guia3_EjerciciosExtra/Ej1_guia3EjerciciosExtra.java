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
public class Ej1_guia3EjerciciosExtra {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vMin, dias, horas;
        System.out.println("Ingrese la cantidad de minutos que quiere calcular");
        vMin = leer.nextInt();
        
        dias = Math.abs(vMin / 1440);
        System.out.println("Los dias son: " + dias);
        int restominuto = vMin - (dias * 1440);
        horas = Math.abs(restominuto / 60);
        System.out.println("Las horas son: " + horas);
    }
    
}
