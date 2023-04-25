/*Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
*/

package java_guia8_ej1ejercicios;

import java.util.Scanner;
import java_guia8_ej1ejercicios.servicios.CuentaBancariaServicio;

public class Java_guia8_Ej1Ejercicios {

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
