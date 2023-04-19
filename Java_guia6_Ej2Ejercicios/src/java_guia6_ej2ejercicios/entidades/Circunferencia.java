package java_guia6_ej2ejercicios.entidades;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circunferencia crearCircunferencia() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el radio: ");
        radio = leer.nextDouble();

        return new Circunferencia(radio);
    }

    public void area() {

        double area;
        area = Math.pow(Math.PI * radio, 2);

        System.out.println("El área de la circunferencia es :" + area);
    }

    public void perimetro() {

        double perimetro;
        perimetro = 2 * Math.PI * radio;

        System.out.println("El perímetro de la circunferencia es :" + perimetro);

    }
}
