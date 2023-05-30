/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;



/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.

En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.

Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
*/
/**
 *
 * @author Usuario
 */
public class AlumnoService {
   
private ArrayList<Alumno> alumnos = new ArrayList();

public double FabricAlumnos(){
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String c;
   
    while (true) {
       
        alumnos.add(CrearAlumno());
        
        System.out.println("Desea continuar? s/n");
        c= leer.next();
        while(!c.equalsIgnoreCase("s")&& !c.equalsIgnoreCase("n")){
            System.out.println("Comando incorrecto, solo se aceptan 's' o 'n' ingrese nuevamente");
            c=leer.next();
        }
        if(c.equalsIgnoreCase("n")){
            break;
        }
    }
    System.out.println("Ingrese el nombre del alumno que desea revisar su promedio");
    return PromedioAlumno(leer.next());
}
private double PromedioAlumno(String nombre){
    int notas=0;
    for (Alumno alumno : alumnos) {
        if(alumno.getNombre().equalsIgnoreCase(nombre)){
            for (int nota : alumno.getNotas()) {
              notas+=nota;  
            }
            break;
        }
    }
    
    return (double)notas/3;
}


public Alumno CrearAlumno(){
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String Nombre;
    ArrayList<Integer> nota;
     Alumno a = new Alumno();
        nota=new ArrayList();
        System.out.println("Ingrese el nombre del alumno");
        a.setNombre( leer.next());
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota "+(i+1));
            nota.add(leer.nextInt());
        }
        a.setNotas(nota);
    return a;    
} 
    
}
