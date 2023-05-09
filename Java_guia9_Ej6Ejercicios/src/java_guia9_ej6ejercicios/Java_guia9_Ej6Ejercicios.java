
package java_guia9_ej6ejercicios;

import entidades.Curso;
import servicios.CursoServicio;


public class Java_guia9_Ej6Ejercicios {

    
  public static void main(String[] args) {

        String[] nomAlumnos = new String[5];
        CursoServicio cs = new CursoServicio();

        Curso c1 = new Curso();
        System.out.println(c1.toString());

        c1 = cs.crearCurso();

       

        nomAlumnos = c1.getAlumnos();

        for (int i = 0; i < 5; i++) {
            System.out.println(nomAlumnos[i]);
        }
        
        System.out.println("La ganancia semanal del curso " + c1.getNombreCurso() + " es " + cs.calcularGananciaSemanal(c1));

    }
}
