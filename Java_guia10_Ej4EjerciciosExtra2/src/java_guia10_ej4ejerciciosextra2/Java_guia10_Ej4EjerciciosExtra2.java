
package java_guia10_ej4ejerciciosextra2;

import java.util.HashMap;
import java.util.Scanner;


public class Java_guia10_Ej4EjerciciosExtra2 {

    static HashMap<Integer, String> codPostales = new HashMap();
    static Scanner leerTexto = new Scanner(System.in).useDelimiter("\n");
    static Scanner leerNum = new Scanner(System.in);

    public static void main(String[] args) {

        cargarCodigos(3);
        mostrarCodigos();
        mostrarCiudad();
        cargarCodigos(1);
        mostrarCodigos();
        borrarCodigos(1);
        mostrarCodigos();
    }

    public static void cargarCodigos(Integer cant) {
        Integer auxNum;
        String auxCod;

        System.out.println("Ingrese " + cant + " códigos postales");

        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese el código postal: ");
            auxNum = leerNum.nextInt();

            System.out.print("Ingrese la ciudad: ");
            auxCod = leerTexto.nextLine();

            codPostales.put(auxNum, auxCod);

        }

    }

    public static void borrarCodigos(Integer cant) {
        Integer auxNum;

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el códiigo postal de la ciudad a borrar");
            auxNum = leerNum.nextInt();

            if (codPostales.containsKey(auxNum)) {
                codPostales.remove(auxNum);
                System.out.println("La ciudad se borró correctamente");

            } else {
                System.out.println("La ciudad buscada no existe");
            }

        }

    }

    public static void mostrarCodigos() {

        for (Integer llave : codPostales.keySet()) {

            System.out.println("Codigo Postal: " + llave + " - Ciudad: " + codPostales.get(llave));

        }
    }

    public static void mostrarCiudad() {
        Integer codBuscar;

        System.out.print("Ingrese el código postal a buscar: ");
        codBuscar = leerNum.nextInt();

        if (codPostales.containsKey(codBuscar)) {
            System.out.println("La ciudad buscada es: " + codPostales.get(codBuscar));

        } else {
            System.out.println("La ciudad buscada no existe");
        }

    }
}
