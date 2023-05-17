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
        ArrayList<Integer> numeros = new ArrayList();
        Integer x = 2;
        Integer x2 = 0;
        Integer x3 = 1;
        Integer x4 = 10;
        Integer x5 = 1;

        numeros.add(x); //Agregamos un primer elemento al ArrayList
        numeros.add(x2); //Agregamos un segundo elemento al ArrayList
        numeros.add(x3); //Agregamos un tercer elemento al ArrayList
        numeros.add(x4); //Agregamos un cuarto elemento al ArrayList
        numeros.add(x5); //Agregamos un quinto elemento al ArrayList
        
        System.out.println(numeros); //Mostramos los elementos del ArrayList. Los coloca por orden de ingreso
        System.out.println(numeros.size()); //Mostramos dimensión del ArrayList

        numeros.remove(x4); //Removemos el elemento "x4" del ArrayList

        System.out.println(numeros);
        System.out.println(numeros.size());

        
        numeros.remove(0); //Removemos la posición 0 del ArrayList
        System.out.println(numeros);
        System.out.println(numeros.size());

        System.out.println("----------------");

        //CONJUNTOS (SETS):
        HashSet<String> palabras = new HashSet();
        String y = "loro";
        String y2 = "camino";
        String y3 = "artesana";
        String y4 = "sortija";
        String y5 = "pelota";

        palabras.add(y);
        palabras.add(y2);
        palabras.add(y3);
        palabras.add(y4);
        palabras.add(y5);
        System.out.println(palabras); //Mostramos los elementos del Set. Los ordena en forma aleatoria.
        
        palabras.remove(y3); //Removemos el elemento "y3" del set
        System.out.println(palabras);
        System.out.println(palabras.size());

        System.out.println("----------------");
        
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
        
        System.out.println(alumnos); //Mostramos los elementos del Map. Los ordena en forma aleatoria.
        
        alumnos.remove(dni4); //Removemos la llave (por identificador de elemento)
        System.out.println(alumnos);
        
        alumnos.remove(34576185); //Removemos la llave (por valor de elemento)
        System.out.println(alumnos);
        
        System.out.println("----------------");

    }
    
}
