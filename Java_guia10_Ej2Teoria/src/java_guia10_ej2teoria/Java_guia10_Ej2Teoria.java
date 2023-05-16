/*
/** 
 * Manos a la obra:
 * EJERCICIO COLECCIONES 2
 *  Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
cada forma que aprendiste arriba.
 * 
 */
package java_guia10_ej2teoria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Erica
 */
public class Java_guia10_Ej2Teoria {

   
    public static void main(String[] args) {
        //LISTAS:
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 2;
        int x2 = 0;
        int x3 = 1;
        int x4 = 10;
        int x5 = 1;

        numerosA.add(x);
        numerosA.add(x2);
        numerosA.add(x4);
        numerosA.add(x3);
        numerosA.add(x5);
        
        System.out.println(numerosA);
        System.out.println(numerosA.size());

        numerosA.remove(x5);

        System.out.println(numerosA);
        
        numerosA.remove(0); 
        System.out.println(numerosA);
        System.out.println(numerosA.size());


        //CONJUNTOS (SETS):
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 21;
        Integer y2 = 23;
        Integer y3 = 22;
        Integer y4 = 20;
        Integer y5 = 24;

        numerosB.add(y);
        numerosB.add(y2);
        numerosB.add(y3);
        numerosB.add(y4);
        numerosB.add(y5);
        System.out.println(numerosB);
        
        numerosB.remove(y4);
        System.out.println(numerosB);
        System.out.println(numerosB.size());


        //MAPAS:
        HashMap<Integer, String> alumnos = new HashMap();
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
        
        alumnos.remove(dni4);
        System.out.println(alumnos);

    }
    
}
