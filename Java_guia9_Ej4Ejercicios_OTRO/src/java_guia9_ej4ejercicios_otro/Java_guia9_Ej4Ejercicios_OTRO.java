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
package java_guia9_ej4ejercicios_otro;

import java.util.Date;
import java_guia9_ej4ejercicios_otro.servicios.FechaService;


public class Java_guia9_Ej4Ejercicios_OTRO {

    
    public static void main(String[] args) {
        FechaService fechaServicio = new FechaService();

        // Obtener la fecha de nacimiento del usuario
        Date fechaNacimiento = fechaServicio.fechaNacimiento();

        // Obtener la fecha actual
        Date fechaActual = fechaServicio.fechaActual();

        // Calcular la diferencia de años (edad del usuario)
        int edad = fechaServicio.diferencia(fechaNacimiento, fechaActual);

        System.out.println("Tu edad es: " + edad + " años");
    }
    
}
