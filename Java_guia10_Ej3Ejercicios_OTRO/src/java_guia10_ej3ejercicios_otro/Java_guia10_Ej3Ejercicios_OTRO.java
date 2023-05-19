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

Pueden encontrar un ejemplo de Colección como Atributo en tu Aula
Virtual.

 */
package java_guia10_ej3ejercicios_otro;

import java_guia10_ej3ejercicios_otro.entidades.Alumno;
import java_guia10_ej3ejercicios_otro.servicios.AlumnoService;
import java.util.ArrayList;
import java.util.*;

public class Java_guia10_Ej3Ejercicios_OTRO {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        AlumnoService service = new AlumnoService();
        ArrayList<Alumno> alumnos = service.curso();;

        System.out.println("Ingresa el nombre del alumno del que quieras saber su promedio: ");
        String alumne = read.next();

        alumnos.forEach((d) -> {
            if (alumne.equalsIgnoreCase(d.getNombre())) {
                System.out.println("El promedio final de " + alumne + " es: " + service.notaFinal(d.getNotas()));
            }
        });
    }

}
