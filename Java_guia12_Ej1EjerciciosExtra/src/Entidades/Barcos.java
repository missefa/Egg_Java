/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Darius
 */
public class Barcos{
    
    protected int matricula;
    protected double eslora;
    protected int fabricacion; 

    public Barcos() {
    }

    public Barcos(int matricula, double eslora, int fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    @Override
    public String toString() {
        return "Barcos{" + "matricula=" + matricula + ", eslora=" + eslora + ", fabricacion=" + fabricacion + '}';
    }
    
    //------------------------------------------------------------------------//
    public Barcos crearBarcos(){
        Scanner read=new Scanner(System.in).useDelimiter("\n");
        
        Barcos b=new Barcos();
        
        System.out.println("Ingrese la MATRICULA: ");
        matricula = read.nextInt();
        
        System.out.println("Ingrese la ESLORA: ");
        eslora = read.nextDouble();
        
        System.out.println("Ingrese año de FABRICACION: ");
        fabricacion=read.nextInt();
        
        b.setEslora(eslora);
        b.setFabricacion(fabricacion);
        b.setMatricula(matricula);
        
        return b;
    }
    
    public double moduloBarco(){
            
        return 1;
    } 
    
}
