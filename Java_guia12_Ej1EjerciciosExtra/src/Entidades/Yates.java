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
public class Yates extends BarcosMotor{
    
    public int camarotes;

    public Yates() {
    }
    
    public Yates(int camarotes, double cv, int matricula, double eslora, int fabricacion) {
        super(cv, matricula, eslora, fabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
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
    
   public Yates crearYates(){
        Scanner read=new Scanner(System.in).useDelimiter("\n");
        Yates b=new Yates();
        
        super.crearBarcoMotor();
        System.out.println("Ingrese numero de CAMAROTES: ");
        
        camarotes= read.nextInt();
        
        b.setEslora(eslora);
        b.setFabricacion(fabricacion);
        b.setMatricula(matricula);
        b.setCv(cv);
        b.setCamarotes(camarotes);
        
        return b;
    } 
   
   @Override
    public double moduloBarco(){
            
        return 4;
    } 
}
