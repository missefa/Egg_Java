/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
import java.util.Scanner;
import Entidades.Barcos;
import Entidades.Veleros;

/**
 *
 * @author Darius
 */
public class Alquiler {
    
    private String nombre;
    private long documento;
    private LocalDate alquiler;
    private LocalDate devolucion;
    private int posicion;
    private Barcos embarcacion;

    public Alquiler() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public LocalDate getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(LocalDate alquiler) {
        this.alquiler = alquiler;
    }

    public LocalDate getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(LocalDate devolucion) {
        this.devolucion = devolucion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Barcos getEmbarcacion() {
        return embarcacion;
    }

    public void setEmbarcacion(Barcos embarcacion) {
        this.embarcacion = embarcacion;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", alquiler=" + alquiler + ", devolucion=" + devolucion + ", posicion=" + posicion + ", embarcacion=" + embarcacion + '}';
    }
    
//------------------------------------SERVICIOS-------------------------------------//
    Barcos barco=new Barcos();
    Veleros velero=new Veleros();
    BarcosMotor motor=new BarcosMotor();
    Yates yate=new Yates();
    
    public Alquiler crearAlquiler(){
        Scanner read=new Scanner(System.in).useDelimiter("\n");
        Alquiler a=new Alquiler();
        
        System.out.print("Ingrese el NOMBRE: ");
        nombre = read.next();
        
        System.out.print("Ingrese el DOCUMENTO del barco: ");
        documento = read.nextInt();
        
        System.out.println("Fecha de ALQUILER.\nAño: ");
        int anio = read.nextInt();
        System.out.println("Mes: ");
        int mes = read.nextInt();
        System.out.println("Día: ");
        int dia = read.nextInt();
        alquiler = LocalDate.of(anio, mes, dia);//.of crea una fecha especifica.
        
        System.out.println("¿Durante cuantos dias desea ALQUILAR?");
        int dias = read.nextInt();
        devolucion = alquiler.plusDays(dias);
        
        System.out.println("La posicion del AMARRE es:");
        posicion = read.nextInt();
        
        System.out.println("¿Que tipo de Barco desea alquilar?");
        System.out.println("A-Barco comun");
        System.out.println("B-Velero");
        System.out.println("C-Barco a Motor");
        System.out.println("D-Yate");
        
        char opcion = read.next().toUpperCase().charAt(0);
        
        switch(opcion){
            case 'A':
                barco = barco.crearBarcos();
                embarcacion=barco;
                break;
            case 'B':
                velero = velero.crearVelero();
                embarcacion=velero;
                break;
            case 'C':
                motor = motor.crearBarcoMotor();
                embarcacion=motor;
                break;
            case 'D':
                yate = yate.crearYates();
                embarcacion=yate;
                
            break;
        }
        
        a.setNombre(nombre);
        a.setDocumento(documento);
        a.setAlquiler(alquiler);
        a.setDevolucion(devolucion);
        a.setPosicion(posicion);
        a.setEmbarcacion(embarcacion);
        
        calculoAlquiler();
        
        return a;
    }
  
    public void calculoAlquiler(){
        //precio= (modulo * eslora)+vela+motor+camarote
        
        double modulo = 100.00;
        int mastiles = velero.getMastiles();
        double cv = motor.getCv();
        int camarotes = yate.getCamarotes();
        double eslora = barco.getEslora();
        
        
        if( embarcacion instanceof Veleros){
            System.out.println("Es un Velero");
            modulo = modulo + mastiles;
            eslora=  velero.getEslora();
        }
        if( embarcacion instanceof BarcosMotor){
            System.out.println("Es un Barco a Motor");
            modulo = modulo + cv;
            eslora= motor.getEslora();
        }
        if( embarcacion instanceof Yates){
            System.out.println("Es un Yate");
            cv = yate.getCv();
            modulo = modulo + cv + camarotes;
            eslora = yate.getEslora();
        }
        
        System.out.println("Eslora= "+eslora);
        System.out.println("Modulo= "+modulo);
        
        double precio = modulo * eslora;
        
        System.out.println("Precio= "+precio);
    }
}
