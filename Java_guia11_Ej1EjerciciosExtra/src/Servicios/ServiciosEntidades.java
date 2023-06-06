/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosEntidades {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Persona> personaArrayList = new ArrayList<>();
    ArrayList<Perro> perroArrayList = new ArrayList<>();

    Perro objetoPerro = new Perro();

    public Perro datosPerro() {
        Perro objetoPerro = new Perro();
        System.out.println("Ingrese el nombre del perro: ");
        String nombre = leer.next();
        System.out.println("Ingrese el raza del perro: ");
        String Raza = leer.next();
        System.out.println("Ingrese el edad del perro: ");
        int edad = leer.nextInt();
        System.out.println("Ingrese el tamaño del perro: ");
        String tamaño = leer.next();
        return new Perro(nombre, Raza, edad, tamaño);
    }

    public void crearPerro(Perro perro) {

        for (int i = 0; i < 2; i++) {
            perroArrayList.add(datosPerro());
        }
        for (Perro mostrar : perroArrayList) {
            System.out.println(mostrar);
        }
    }

    public void datosPersona() {

        for (int i = 0; i < 2; i++) {

            Persona objetoPersona = new Persona();
            System.out.println("Ingrese el nombre de la persona: ");
            objetoPersona.setNombrePersona(leer.next());

            System.out.println("Ingrese el apellido de la persona: ");
            objetoPersona.setApellidoPersona(leer.next());

            System.out.println("Ingrese el edad de la persona: ");
            objetoPersona.setEdadPersona(leer.nextInt());

            System.out.println("Ingrese el DNI de la persona: ");
            objetoPersona.setDocumento(leer.nextInt());

            objetoPersona.setMascota(elijaMascota());

            personaArrayList.add(objetoPersona);
        }
    }

    public void mostrar() {

        for (Persona mostrar : personaArrayList) {
            System.out.println(mostrar);
        }
    }

    public Perro elijaMascota() {
        String eleccionNombre;
        boolean adoptada = false;
        boolean nombreEncontrado = false;

        do {
            for (Perro mostrar : perroArrayList) {
                System.out.println(mostrar.getNombre());
            }
          
            do {
                System.out.print("Elija un Nombre de la lista: ");
                eleccionNombre = leer.next();
                for (Perro mostrar : perroArrayList) {
                    if (mostrar.getNombre().equalsIgnoreCase(eleccionNombre)) {
                        nombreEncontrado = true;
                        break;
                    }
                }
            } while (nombreEncontrado = false);

            for (Persona mostrar : personaArrayList) {
                if (mostrar.getMascota().getNombre().equalsIgnoreCase(eleccionNombre)) {
                    System.out.println("La mascota esta adoptada.");
                    adoptada = true;
 
                }
            }
        } while (adoptada);

        Perro mascotaAdoptada = new Perro();
        for (Perro nombrePerro : perroArrayList) {

            if (nombrePerro.getNombre().equalsIgnoreCase(eleccionNombre)) {
                mascotaAdoptada = nombrePerro;
                break;
            }
        }
        return mascotaAdoptada;
    }
}