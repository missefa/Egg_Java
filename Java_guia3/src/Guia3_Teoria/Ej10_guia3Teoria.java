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
public class Ej10_guia3Teoria {

    /**
     * @param args the command line arguments

     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int vNum;
        
        for (int i = 0; i < 4; i++ ){
            
            System.out.println("Ingrese un numero comprendido entre el 1 y 20");
            vNum = read.nextInt();
            
            for (int j = 0; j < vNum; j++){
                System.out.print("*");
            }
        } 
    }
    
}
    
    

