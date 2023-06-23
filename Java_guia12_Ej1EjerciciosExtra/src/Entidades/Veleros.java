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
public class Veleros extends Barcos{
    private int mastiles;

    public Veleros(){
    }

    public Veleros(int mastiles, int matricula, double eslora, int fabricacion) {
        super(matricula, eslora, fabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
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
        return "Veleros{" +super.toString()+ "mastiles=" + mastiles + '}';
    }
    
    
//-----------------------------------------------------------------------------//
    public Veleros crearVelero(){
        Scanner read=new Scanner(System.in).useDelimiter("\n");
        Veleros v=new Veleros();
        
        super.crearBarcos();
        System.out.println("Ingrese numero de MASTILES: ");
        mastiles= read.nextInt();
        
        v.setEslora(eslora);
        v.setFabricacion(fabricacion);
        v.setMatricula(matricula);
        v.setMastiles(mastiles);
        
        return v;
    }
    
    @Override
    public double moduloBarco(){
            
        return 2;
    } 
}
