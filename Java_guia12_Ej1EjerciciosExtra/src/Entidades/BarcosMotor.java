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
public class BarcosMotor extends Barcos{
    protected double cv;

    public BarcosMotor() {
    }

    public BarcosMotor(double cv, int matricula, double eslora, int fabricacion) {
        super(matricula, eslora, fabricacion);
        this.cv = cv;
    }

    public double getCv() {
        return cv;
    }

    public void setCv(double cv) {
        this.cv = cv;
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
    
    //-------------------------------------------------------------------------//
    
   public BarcosMotor crearBarcoMotor(){
        Scanner read=new Scanner(System.in).useDelimiter("\n");
        BarcosMotor m=new BarcosMotor();
        
        super.crearBarcos();
        System.out.println("Ingrese la potencia en CV: ");
        cv= read.nextDouble();
        
        m.setEslora(eslora);
        m.setFabricacion(fabricacion);
        m.setMatricula(matricula);
        m.setCv(cv);
        
        return m;
        
    } 
   @Override
    public double moduloBarco(){
            
        return 3;
    } 
   
}
