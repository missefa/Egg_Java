/** 
 * Manos a la obra:
 * EJERCICIO COLECCIONES
 *  Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
 * 
 */
package java_guia10_ej1teoria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Erica
 */
public class Java_guia10_Ej1Teoria {

   
    public static void main(String[] args) {
      //LISTAS:
      ArrayList<Integer> numerosA = new ArrayList();
      int x = 20;
      int x2 = 3;
      int x3 = 50;
      int x4 = 10;
      int x5 = 11;
      
      numerosA.add(x);
      numerosA.add(x2);
      numerosA.add(x3);
      numerosA.add(x4);
      numerosA.add(x5);
   
        System.out.println(numerosA);
      
      //CONJUNTOS (SETS):
      HashSet<Integer> numerosB = new HashSet();
      Integer y = 20;
      Integer y2 = 21;
      Integer y3 = 22;
      Integer y4 = 23;
      Integer y5 = 24;
      
      numerosB.add(y);
      numerosB.add(y2);
      numerosB.add(y3);
      numerosB.add(y4);
      numerosB.add(y5);
        System.out.println(numerosB);
     
      //MAPAS:
      HashMap<Integer, String> alumnos = new HashMap(5);
      int dni = 34576189;
      String nombreAlumno = "Pepe";
      int dni2 = 34576181;
      String nombreAlumno2 = "Pepe";
      int dni3 = 34576182;
      String nombreAlumno3 = "Pepe";
      int dni4 = 34576183;
      String nombreAlumno4 = "Pepe";
      int dni5 = 34576185;
      String nombreAlumno5 = "Pepe";
      alumnos.put(dni, nombreAlumno); //Agregamos la llave y el valor
      alumnos.put(dni2, nombreAlumno2); //Agregamos la llave y el valor
      alumnos.put(dni3, nombreAlumno3); //Agregamos la llave y el valor
      alumnos.put(dni4, nombreAlumno4); //Agregamos la llave y el valor
      alumnos.put(dni5, nombreAlumno5); //Agregamos la llave y el valor
        System.out.println(alumnos);
      
      
    }
    
}
