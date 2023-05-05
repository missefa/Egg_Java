/*
Clase Date
4. Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion
Oracle
 */
package java_guia9_ej4ejercicios.servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author JosePc
 */
public class FechaService {

    public Date fechaNacimiento() {
        Scanner leer = new Scanner(System.in);
        int dia, mes, anio;

        System.out.println("Ingrese el día de nacimiento: ");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        anio = leer.nextInt();

        return new Date((anio - 1900), (mes - 1), dia);

    }

    public Date fechaActual() {
        Date hoy = new Date();

        return hoy;
    }

    public int diferencia(Date fecha1, Date fecha2) {
        int edad = (fecha1.);
        return edad;
    }

    public Persona crearPersona(String nombre, Date fechaNacimiento) {
        Date fecha = new Date(fechaNacimiento.getYear() - 1900, fechaNacimiento.getMonth() - 1, fechaNacimiento.getDay());
        return new Persona(nombre, fecha);

    }
}
