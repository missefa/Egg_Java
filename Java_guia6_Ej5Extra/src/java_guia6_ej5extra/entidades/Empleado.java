/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_guia6_ej5extra.entidades;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Empleado {

    private String nombre;
    private int edad;
    private float salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int cargarDatos(Empleado datos) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su Nombre: ");
        datos.setNombre(read.nextLine());
        System.out.println("Ingrese su Edad: ");
        datos.setEdad(read.nextInt());
        System.out.println("Ingrese su Salario: ");
        datos.setSalario(read.nextFloat());
        return 0;
    }
    
    public double calcularAumento(Empleado aumento) {
        double sueldo = aumento.getSalario();
        if (aumento.getEdad() > 30) {
            System.out.println("Su aumento es de 10%");
            sueldo = aumento.getSalario() * 1.1;
        } else if (aumento.getEdad() <= 30) {
            System.out.println("Su aumento es de 5%");
            sueldo = aumento.getSalario() * 1.05;
        }
        return sueldo;
    }

}
