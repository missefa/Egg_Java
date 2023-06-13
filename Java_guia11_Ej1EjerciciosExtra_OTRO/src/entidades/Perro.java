
package entidades;

import java.util.ArrayList;
import java.util.Scanner;


public class Perro {
     Scanner leerTexto = new Scanner(System.in);
    Scanner leerNum = new Scanner(System.in);
    
 private String nombre;
 private String raza;
 private int edad;
 private String tam;
 private boolean adoptado;
 

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tam, boolean adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tam = tam;
        this.adoptado = adoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tam=" + tam + ", adoptado=" + adoptado + '}';
    }

    
     public Perro crearPerro() {
        Perro pe = new Perro();

        System.out.println("Ingrese el nombre del perro: ");
        pe.nombre = leerTexto.nextLine();
        System.out.println("Ingrese la raza del perro: ");
        pe.raza = leerTexto.nextLine();
        System.out.println("Ingrese la edad del perro: ");
        pe.edad = leerNum.nextInt();
        System.out.println("Ingrese el tamaño del perro: ");
        pe.tam = leerTexto.nextLine();
        pe.adoptado=false;
        return pe;

    }
    
    public void listaPerros(ArrayList<Perro> listaPerros){
    
    
    for (Perro pe : listaPerros) {
        System.out.println(pe.toString());
       
    }
        
    }
     public void listaPerrosDisponibles(ArrayList<Perro> listaPerros){
    
    
    for (Perro pe : listaPerros) {
        if (!pe.adoptado){
            System.out.println(pe.toString());
        }
            
        
         
        
        
    }
        
    }
    
}

  