
package servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;


public class MenuPerros {

    Scanner leerNum = new Scanner(System.in);
    Scanner leerTexto = new Scanner(System.in);

    public void mostrarMenu() {

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        ArrayList<Perro> listaPerros = new ArrayList<>();
        Persona p = new Persona();
        Perro pe = new Perro();
        int opcion;

        do {
            System.out.println("Menu de opciones");
            System.out.println("-------------------------");
            System.out.println("");
            System.out.println("1 - Cargar personas");
            System.out.println("2 - Cargar perros");
            System.out.println("3 - Listar personas");
            System.out.println("4 - Listar perros");
            System.out.println("5 - Asignar perros a personas");
            System.out.println("6 - Devolver un perro");
            System.out.println("7 - Salir");
            System.out.println("");
            System.out.print("Ingrese la opción elejida: ");
            opcion = leerNum.nextInt();

            switch (opcion) {

                case 1:

                    listaPersonas.add(new Persona("Juan", "Sanchez", 30, 20341558, null));
                    listaPersonas.add(new Persona("Ana", "Ferrari", 18, 15546558, null));
                    listaPersonas.add(new Persona("Pedro", "Salazar", 15, 45656998, null));
                    listaPersonas.add(new Persona("Mariana", "Pedroti", 20, 42333585, null));
                    listaPersonas.add(new Persona("Alejandro", "García", 42, 22565444, null));
                    listaPersonas.add(new Persona("Fernanda", "Alegre", 25, 25898743, null));

                    //        listaPersonas.add(p.crearPersona());
                    break;

                case 2:
                    
                    listaPerros.add(new Perro("Chiquito", "Afgano", 3, "Grande", false));
                    listaPerros.add(new Perro("Toby", "Bull Terrier", 1, "Grande", false));
                    listaPerros.add(new Perro("Rocco", "Pomerania", 5, "Chico", false));
                    listaPerros.add(new Perro("Linda", "Sin definir", 7, "Mediano", false));
                    listaPerros.add(new Perro("Luna", "Pastor Aleman", 3, "Grande", false));
                    listaPerros.add(new Perro("Scooby", "Border Colie", 2, "Mediano", false));

                    // listaPerros.add(pe.crearPerro());
                    break;

                case 3:
                    p.listaPersonas(listaPersonas);
                    break;

                case 4:
                    pe.listaPerros(listaPerros);
                    break;
                case 5:
                    asignarPerros(listaPersonas, listaPerros);
                    break;
                case 6:
                    devolverPerros(listaPersonas, listaPerros);
                    break;
            }

        } while (opcion < 7);

    }

    public void asignarPerros(ArrayList<Persona> listaPersonas, ArrayList<Perro> listaPerros) {
        String nomPersona;
        String perrAdopta;
        boolean encontro = false;
        Persona buscaP = new Persona();
        Perro perr = new Perro();

        System.out.println("Ingrese el nombre de la persona que quiere adoptar un perro:");
        nomPersona = leerTexto.nextLine();

        int cont = 0;

        for (Persona p : listaPersonas) {
            if (p.getNombre().equalsIgnoreCase(nomPersona)) {
                System.out.println("lo encontro");
                System.out.println("indice:" + cont);

                System.out.println("Lista de perros disponibles:");
                System.out.println("*******************************");
                perr.listaPerrosDisponibles(listaPerros);

                System.out.println("Ingrese el nombre del perro a adoptar:");
                perrAdopta = leerTexto.nextLine();

                for (Perro pe : listaPerros) {
                    if (pe.getNombre().equalsIgnoreCase(perrAdopta)) {

                        p.setPerro(pe);
                        pe.setAdoptado(true);

                        break;

                    } else {
                        cont++;
                        System.out.println("no lo encontro");

                    }

                }

            }
        }
    }

    public void devolverPerros(ArrayList<Persona> listaPersonas, ArrayList<Perro> listaPerros) {
        String nomPersona;
        String perrAdopta;
        boolean encontro = false;
        Persona buscaP = new Persona();
        Perro perr = new Perro();
        String perrDevuelto;

        System.out.println("Ingrese el nombre de la persona que quiere devolver el un perro:");
        nomPersona = leerTexto.nextLine();

        int cont = 0;

        for (Persona p : listaPersonas) {
            if (p.getNombre().equalsIgnoreCase(nomPersona)) {
                System.out.println("lo encontro");
                System.out.println("indice:" + cont);
                perrDevuelto = p.getPerro().getNombre();
                p.setPerro(null);

                for (Perro pe : listaPerros) {
                    if (pe.getNombre().equalsIgnoreCase(perrDevuelto)) {

                        pe.setAdoptado(false);

                        break;

                    } else {
                        cont++;

                    }

                }

            }
        }
    }
}
