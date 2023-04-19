/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_guia6_ej4ejercicios.entidades;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Rectangulo {
    private int base, altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    public void ingresarDatos(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese la base del rectangulo");
        base = leer.nextInt();
        System.out.println("ingrese la altura del rectangulo");
        altura = leer.nextInt();
    }
    
    public void perimetro(){
        double perim;
        perim = (base + altura) * 2;
        System.out.println("El perimetro es " + perim);
                
    }
    public void superficie(){
        double sup;
        sup = base * altura;
        System.out.println("la superficie es " + sup);
    }
    public void llenarRectangulo(){
        int i, j;
             i = 0;   
             j = 0;
             
        while(i<altura){
            while(j<base){
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
            j=0;
        }
    }
}
