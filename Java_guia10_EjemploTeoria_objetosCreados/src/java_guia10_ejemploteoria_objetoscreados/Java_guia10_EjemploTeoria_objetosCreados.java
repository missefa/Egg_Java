/*
 De la misma manera que podemos crear colecciones con los tipos de datos de Java, podemos
crear colecciones de algún objeto, de una clase creada por nosotros, previamente. Esto, nos
servirá para manejar varios objetos al mismo tiempo y acceder a ellos de una manera más sencilla.
Por ejemplo, tener una lista de alumnos, siendo cada Alumno un objeto con sus atributos.
AÑADIR UN OBJETO A UNA COLECCIÓN
Para añadir un objeto a una colección tenemos que primero crear el objeto que queremos trabajar
y después crear una colección donde su tipo de dato sea dicho objeto.
La manera de agregar los objetos a la colección es muy parecida a lo que habíamos visto
previamente.
 */
package java_guia10_ejemploteoria_objetoscreados;

import java.util.ArrayList;



public class Java_guia10_EjemploTeoria_objetosCreados {

    
    public static void main(String[] args) {
        
        //LISTAS:
        ArrayList<Libro> books = new ArrayList();
        Libro book = new Libro();
        books.add(book);
        
        
        //CONJUNTOS (SETS):
        HashSet<Perro> dogs = new HashSet();
        Perro dog = new Perro();
        dogs.add(dog);
        
        
        //MAPAS:
        HashMap<Integer, Alumno> students = new HashMap();
        int dni = 45445445;
        Alumno student = new Alumno("Abel","Flaco")
        students.put(dni, student);
        
    }
    
}
