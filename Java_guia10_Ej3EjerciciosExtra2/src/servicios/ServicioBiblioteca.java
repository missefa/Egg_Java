
package servicios;

import entidades.Libro;
import java.util.HashSet;
import java.util.Iterator;

import java.util.Scanner;

public class ServicioBiblioteca {

    Scanner leerNum = new Scanner(System.in);
    Scanner leerTexto = new Scanner(System.in).useDelimiter("\n");
    HashSet<Libro> biblioteca = new HashSet();

    public Libro agregarLibro() {

        Libro lb = new Libro();

        System.out.print("Ingrese el título del libro: ");
        lb.setTitulo(leerTexto.nextLine());
        System.out.print("Ingrese el autor del libro: ");
        lb.setAutor(leerTexto.nextLine());
        System.out.print("Ingrese los ejemplares en existencia del libro: ");
        lb.setNumEjemplares(leerNum.nextInt());

        return lb;
    }

    public void mostrarLibros() {

        biblioteca.forEach(System.out::println);

    }

    public void prestarLibro() {
        String titAPrestar;
        int numPrestados;

        Libro lb = new Libro();
        System.out.print("Ingrese el título del libro a prestar: ");
        titAPrestar = leerTexto.nextLine();

        lb = buscarLibro(titAPrestar);

        if (!(lb == null)) {

            if (lb.getNumEjemplares() > lb.getNumPrestados()) {

                numPrestados = lb.getNumPrestados();
                lb.setNumPrestados((numPrestados + 1));
                System.out.println("El libro se prestó correctamente");
            } else {
                System.out.println("No hay cantidad disponible del libro a prestar");
            }
        } else {
            System.out.println("El libro no existe");
        }

    }

    public void devolverLibro() {
        String titADevolver;
        int numPrestados;

        Libro lb = new Libro();
        System.out.print("Ingrese el título del libro a devolver: ");
        titADevolver = leerTexto.nextLine();

        lb = buscarLibro(titADevolver);

        if (!(lb == null)) {

            if (lb.getNumPrestados() > 0) {

                numPrestados = lb.getNumPrestados();
                lb.setNumPrestados((numPrestados - 1));
                System.out.println("El libro se devolvió correctamente");
            } else {
                System.out.println("No se puede devolver el libro");
            }
        } else {
            System.out.println("El libro no existe");
        }

    }

    public Libro buscarLibro(String libABuscar) {
        boolean respuesta = false;
        Libro lb;

        Iterator<Libro> it = biblioteca.iterator();

        while (it.hasNext()) {

            lb = it.next();

            if (lb.getTitulo().equalsIgnoreCase(libABuscar)) {
                return lb;
            }
        }

        return null;
    }

    public void menuBiblioteca() {
        int opcion;

        do {
            System.out.println(" ");
            System.out.println("*********************");
            System.out.println("Menú de opciones");
            System.out.println("*********************");
            System.out.println(" ");
            System.out.println("1 - Agregar Libro");
            System.out.println("2 - Prestar Libro");
            System.out.println("3 - Devolución Libro");
            System.out.println("4 - Mostrar Datos Libros");
            System.out.println("5 - Salir del sistema");
            System.out.println("*********************");
            System.out.print("Ingrese la opción deseada: ");
            opcion = leerNum.nextInt();
            System.out.println("*********************");

            switch (opcion) {
                case 1:
                    String respuesta;
                    do {
                        Libro lb = new Libro();

                        biblioteca.add(agregarLibro());

                        System.out.print("Desea seguir cargando libros? (S/N) : ");
                        respuesta = leerTexto.nextLine();

                    } while (respuesta.equalsIgnoreCase("s"));
                    break;

                case 2:
                    prestarLibro();
                    break;
                case 3:
                    devolverLibro();
                    break;

                case 4:
                    mostrarLibros();

                    break;

                case 5:
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (!(opcion == 5));

    }

}
