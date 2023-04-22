package java_guia7_ej1ejercicios;

import java.util.Scanner;
import java_guia7_ej1ejercicios.servicios.CuentaBancariaServicio;

public class Java_guia7_Ej1Ejercicios {

    public static void main(String[] args) {
        Scanner leerNum = new Scanner(System.in);

        CuentaBancariaServicio c1 = new CuentaBancariaServicio();

        int opcion;

        do {
            System.out.println("");
            System.out.println("Menú de opciones: ");
            System.out.println("1 - Crear una cuenta ");
            System.out.println("2 - Ingresar dinero ");
            System.out.println("3 - Retirar dinero ");
            System.out.println("4 - Extracción rápida ");
            System.out.println("5 - Consultar saldo ");
            System.out.println("6 - Consultar datos ");
            System.out.println("7 - Salir del programa ");
            System.out.print("Ingrese la opción deseada: ");

            opcion = leerNum.nextInt();

            switch (opcion) {

                case 1:
                    c1.crearCuenta();
                    break;
                case 2:
                    c1.ingresarDinero();
                    break;
                case 3:
                    c1.retirarDinero();
                    break;
                case 4:
                    c1.extraccionRapida();
                    break;
                case 5:
                    c1.consultarSaldo();
                    break;
                case 6:
                    c1.consultarDatos();
                    break;
                case 7:

                    break;

                default:
                    System.out.println("La opción ingresada no existe");

            }

        } while (opcion != 7);

    }

}
