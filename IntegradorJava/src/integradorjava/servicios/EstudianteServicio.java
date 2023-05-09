/*
Ejercicio integrador
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el
examen final. La escuela nos ha pedido que calculemos el promedio de notas
final de todos sus alumnos y saber qué alumnos han recibido una nota por
encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final).
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.
1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
 */
package integradorjava.servicios;

import integradorjava.entidades.Estudiante;
import java.text.DecimalFormat;
import java.util.Arrays;


public class EstudianteServicio {

    private double promedio;
//    Scanner sc=new Scanner(System.in);
    DecimalFormat formato = new DecimalFormat("#.#");
/**
* Este método crea un arreglo de 8 objetos tipo estudiante, primero pregunta el nombre de cada estudiante
* y luego pregunta por la nota obtenida en el examen final. 
 * @return un Estudiante[], con un tamaño de 8.
 */
    public Estudiante[] crearEstudiante() {
        Estudiante[] arrayEst = new Estudiante[8];
        for (int i = 0; i < arrayEst.length; i++) {
            System.out.println("Ingresar el nombre del estudiante número " + (i + 1) + ":");
//            String nombre=sc.nextLine();
            String nombre = "Estudiante " + (i + 1);
            System.out.println(nombre);
            System.out.println("Ingresar la nota final del estudiante número" + (i + 1) + ":");
//            double nota=sc.nextDouble();
            double nota = Double.parseDouble(formato.format((Math.random() * 6) + 4).replace(",", "."));
            System.out.println(nota);
            arrayEst[i] = new Estudiante(nombre, nota);
        }
        return arrayEst;
    }
/**
 * El método muestra por pantalla la nota promedio del examen final de la clase.
 * @param arrayEst un arreglo de 8 objetos tipo Estudiante.
 */
    public void muestraPromedio(Estudiante[] arrayEst) {
        double sum = 0;
        for (Estudiante est : arrayEst) {
            sum += est.getNota();
        }
        promedio = Double.parseDouble(formato.format(sum / 8).replace(",", "."));
        System.out.println("La nota promedio en la clase es: " + promedio);
    }
/**
 * 
 * @param arrayEst un arreglo de 8 objetos tipo Estudiante.
 * @return un String[], llenado con nombres, cada uno de los cuales pertenece a un estudiante con nota mayor al promedio.
 */
    public String[] superaPromedio(Estudiante[] arrayEst) {
        String[] aux = new String[arrayEst.length];
        int cont = 0;
        for (Estudiante est : arrayEst) {
            if (est.getNota() > promedio) {
                aux[cont] = est.getNombre();
                cont++;
            }
        }
        return Arrays.copyOf(aux, cont);
    }
/**
 * Este método muestra por pantalla los nombres y las notas, para la lista de estudiantes con nota más alta 
 * que el promedio de la clase.
 * @param superaPromedio un String[], llenado con nombres, cada uno de los cuales pertenece a un estudiante con 
 * nota más alta que el promedio.
 * @param arrayEst un array de 8 objetos tipo Estudiante.
 */
    public void muestraSuperaPromedio(String[] superaPromedio, Estudiante[] arrayEst) {
        System.out.println("Listar estudiantes con nota mayor al promedio:");
        for (String nombre : superaPromedio) {
            for (Estudiante est : arrayEst) {
                if (est.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println(est);
                }
            }
        }
    }
    /**
     * Invocar todos los métodos creados previamente y solicitar la información necesaria (nombres, notas),
     * calcular and mostrar la nota promedio, y finalmente listar a los estudiantes con nota
     * más alta al promedio de la clase.
     */
    public void calcularPromedio() {
        Estudiante[] arrayEst;
        arrayEst=crearEstudiante();
        muestraPromedio(arrayEst);
        muestraSuperaPromedio(superaPromedio(arrayEst),arrayEst);
    }

}
