package java_guia7_ej1ejercicios.servicios;

import java.util.Scanner;
import java_guia7_ej1ejercicios.entidades.CuentaBancaria;

public class CuentaBancariaServicio {

    private CuentaBancaria c1 = new CuentaBancaria();

    public CuentaBancaria crearCuenta() {
        Scanner leerNum = new Scanner(System.in);

        System.out.println("**");
        System.out.println("** CREAR CUENTA **");
        System.out.println("**");
        System.out.println("");

        System.out.println("Ingrese el número de cuenta: ");
        c1.setNumeroCuenta(leerNum.nextInt());

        System.out.println("Ingrese el DNI del cliente: ");
        c1.setDniCliente(leerNum.nextLong());

        System.out.println("Ingrese el saldo actual: ");
        c1.setSaldoActual(leerNum.nextDouble());

        System.out.println("numero de cuenta grabada:");
        System.out.println(c1.getNumeroCuenta());

        return c1;
    }

    public void ingresarDinero() {
        Scanner leerNum = new Scanner(System.in);
        double pesos;

        System.out.println("**");
        System.out.println("** INGRESAR DINERO **");
        System.out.println("**");
        System.out.println("");

        System.out.println("Ingrese el dinero a ingresar: ");
        pesos = leerNum.nextDouble();

        c1.setSaldoActual(c1.getSaldoActual() + pesos);

        System.out.println("Nuevo saldo  " + c1.getSaldoActual());

    }

    public void retirarDinero() {
        Scanner leerNum = new Scanner(System.in);
        double pesos;

        System.out.println("**");
        System.out.println("** RETIRAR DINERO **");
        System.out.println("**");
        System.out.println("");

        System.out.println("Ingrese el dinero a retirar: ");
        pesos = leerNum.nextDouble();

        if (c1.getSaldoActual() < pesos) {

            System.out.println("Ud. pudo retirar:  " + c1.getSaldoActual());
            c1.setSaldoActual((double) 0);
        } else {

            c1.setSaldoActual(c1.getSaldoActual() - pesos);
        }

        System.out.println("Nuevo saldo  " + c1.getSaldoActual());

    }

    public void extraccionRapida() {
        Scanner leerNum = new Scanner(System.in);
        double pesos;

        System.out.println("**");
        System.out.println("** ESTRACCION RAPIDA **");
        System.out.println("**");
        System.out.println("");

        System.out.println("Ingrese el dinero a retirar: ");
        pesos = leerNum.nextDouble();

        if (pesos > (c1.getSaldoActual() * .2)) {
            System.out.println("Ud no puede retirar más del 20% del saldo");

        } else {

            c1.setSaldoActual(c1.getSaldoActual() - pesos);
        }

        System.out.println("Nuevo saldo  " + c1.getSaldoActual());

    }
    
    public void consultarSaldo() {
        

        System.out.println("**");
        System.out.println("** CONSULTAR SALDO **");
        System.out.println("**");
        System.out.println("");

        System.out.print("Su saldo actual es: " + c1.getSaldoActual());
        System.out.println("");
        

    }
    
    
    public void consultarDatos() {
        

        System.out.println("**");
        System.out.println("** CONSULTAR DATOS **");
        System.out.println("**");
        System.out.println("");

        System.out.print("Los datos de la cuenta son: ");
        System.out.println("");
        System.out.println("Número de cuenta: " + c1.getNumeroCuenta());
        System.out.println("Dni del cliente: " + c1.getDniCliente());
        System.out.println("Saldo actual de la cuenta: " + c1.getSaldoActual());
        System.out.println("");
        

    }
}
