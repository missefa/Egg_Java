
package entidades;

import java.util.*;
import java.util.HashSet;
import java.util.Collections;


public class Alumno {
    
    private String nombre;
    private String dni;
    private Integer cantVotos;

    public Alumno() {
    }

    public Alumno(String nombre, String dni, Integer cantVotos) {
        this.nombre = nombre;
        this.dni = dni;
        this.cantVotos = cantVotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(Integer cantVotos) {
        this.cantVotos = cantVotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", dni=" + dni + ", cantVotos=" + cantVotos + '}';
    }
    
    public void mostrarAlumnos(ArrayList<Alumno> listaAlu){
        System.out.println("---------------------------------------------------------");
        System.out.println("--- LISTA DE ALUMNOS GENERADOS----");
        System.out.println("---------------------------------------------------------");
     for (Alumno al : listaAlu) {
            System.out.println(al);
        }
    
    }
    
    public void mostrarAlumnosVotos(ArrayList<Voto> aluVotos){
        System.out.println("---------------------------------------------------------");
        System.out.println("--- LISTA DE ALUMNOS CON SUS VOTOS----");
        System.out.println("---------------------------------------------------------");
     for (Voto alVotos : aluVotos) {
         System.out.println("");
         System.out.println("El alumno: " + alVotos.getAlu().getNombre());
         System.out.println("Tiene " + alVotos.getAlu().getCantVotos() + " votos");
         System.out.println("-----");
         
         System.out.println("Votó a: ");
         System.out.println(alVotos.getAluVotados().get(0));
         System.out.println(alVotos.getAluVotados().get(1));
         System.out.println(alVotos.getAluVotados().get(2));
       //     System.out.println(alVotos);
        }
    
    }
    
    public void ordenarPorVotos(ArrayList<Alumno> listaAlu){
        
        System.out.println("*********************");
        System.out.println("Votos Ordenados");
        System.out.println("*********************");
   
       listaAlu.sort(compararVotos);
  
       
        
        for (Alumno alumno : listaAlu) {
            System.out.println(alumno);
            
        }
            
        }
        
        public static Comparator<Alumno> compararVotos = new Comparator<Alumno>(){
            @Override
            public int compare(Alumno a1, Alumno a2){
                
                return a2.getCantVotos().compareTo(a1.getCantVotos());
            }      
            
        };
        
        
    }

