/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_guia11_ej5ejerciciosextra;

import entidades.Alumno;
import entidades.Simulador;
import entidades.Voto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author JosePc
 */
public class Java_guia11_Ej5EjerciciosExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerNum = new Scanner(System.in);
        ArrayList<Alumno> listaAlu = new ArrayList();
        ArrayList<Voto> listaAlumnosVotos = new ArrayList();
        int cantAlum;
        
        Simulador sim = new Simulador();
        Alumno alu = new Alumno();
        
        System.out.println("Cuantos alumnos desea generar? : ");
        
       cantAlum = leerNum.nextInt();
        
        
        listaAlu = sim.generarAlumnos(listaAlu, cantAlum);
        
        
        alu.mostrarAlumnos(listaAlu);
        
        listaAlumnosVotos= sim.votacion(listaAlu);
        
        alu.mostrarAlumnosVotos(listaAlumnosVotos);
        
        alu.ordenarPorVotos(listaAlu);
        
        
        
        
        
    }
    
}
