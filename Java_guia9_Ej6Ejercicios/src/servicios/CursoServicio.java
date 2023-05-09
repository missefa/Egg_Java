/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author JosePc
 */
public class CursoServicio {
    
    public String[] cargarAlumnos() {
        Scanner leerTexto = new Scanner(System.in);
        
        String[] listaAlumnos = new String[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno: " + (i + 1) + " : ");
            listaAlumnos[i] = leerTexto.nextLine();
        }
        
        return listaAlumnos;
    }

    /*Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. 
    En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
     */
    public Curso crearCurso() {
        
        Scanner leerTexto = new Scanner(System.in);
        Scanner leerNum = new Scanner(System.in);
        
        Curso c1 = new Curso();
        String nomCurso, auxTurno;
        int cantHD, cantDS, auxPre;
        
        System.out.println("Ingrese el nombre del curso: ");
        nomCurso = leerTexto.nextLine();
        System.out.println("Ingrese la cantidad de horas por día: ");
        cantHD = leerNum.nextInt();
        System.out.println("Ingrese la cantidad de días por semana: ");
        cantDS = leerNum.nextInt();
        System.out.println("Ingrese el turno: ");
        auxTurno = leerTexto.nextLine();
        System.out.println("Ingrese el precio por hora: ");
        auxPre = leerNum.nextInt();
        
        c1.setNombreCurso(nomCurso);
        c1.setCantHorasPorDia(cantHD);
        c1.setCantidadDiasPorSemana(cantDS);
        c1.setTurno(auxTurno);
        c1.setPrecioPorHora(auxPre);
        c1.setAlumnos(cargarAlumnos());
        
        return c1;
    }
    
    /*Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso.
    Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
*/
  public  Double calcularGananciaSemanal(Curso c1){
      double ganancia = c1.getCantHorasPorDia() * c1.getPrecioPorHora() * 5 * c1.getCantidadDiasPorSemana();
      return ganancia;
      
    
      
  }
  }
