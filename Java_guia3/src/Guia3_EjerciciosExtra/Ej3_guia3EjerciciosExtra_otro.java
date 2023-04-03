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
public class Ej3_guia3EjerciciosExtra_otro {
    
    public static void main(String[] args) {
        
    Scanner leer= new Scanner(System.in);
        int nume = 0;
        do {System.out.println("Ingrese un numero entre el 1 y el 10");
        nume = leer.nextInt();
        } while(nume <= 0 || nume > 10);
        switch(nume){
            case 1:
                System.out.println("el numero "+nume+" es I en nros romanos");
                break;
            case 2:
                System.out.println("el numero "+nume+" es II en nros romanos");
                break;
            case 3:
                System.out.println("el numero "+nume+" es III en nros romanos");
                break;
            case 4:
                System.out.println("el numero "+nume+" es IV en nros romanos");
                break;
            case 5:
                System.out.println("el numero "+nume+" es V en nros romanos");
                break;
            case 6:
                System.out.println("el numero "+nume+" es VI en nros romanos");
                break;
            case 7:
                System.out.println("el numero "+nume+" es VII en nros romanos");
                break;
            case 8:
                System.out.println("el numero "+nume+" es VIII en nros romanos");
                break;
            case 9:
                System.out.println("el numero "+nume+" es IX en nros romanos");
                break;
            case 10:
                System.out.println("el numero "+nume+" es X en nros romanos");
                break;
        }
        
        
    }
    
}
  

