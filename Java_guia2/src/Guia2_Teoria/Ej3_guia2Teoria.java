/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2_Teoria;

/**
 *
 * @author Erica
 */
public class Ej3_guia2Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1 = 101;
       double num2 = 20.2;
       double division = num1 / num2;
       int mod = (int) (num1 % num2);
       boolean logico1 = num1 >= num2;
       num1++;
        double num3 = -num2;
       
        System.out.println(division + " " + mod + " " + logico1 + " " + num1++ + " " + num3);
    }
    
}
