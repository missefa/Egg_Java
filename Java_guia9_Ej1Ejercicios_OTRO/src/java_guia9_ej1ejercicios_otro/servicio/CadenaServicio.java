package java_guia9_ej1ejercicios_otro.servicio;

import java_guia9_ej1ejercicios_otro.entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena ingreseFrase() {
        String f1;
        int l1 = 0;

        System.out.print("Ingrese una Frase: ");
        f1 = leer.nextLine();
        l1 = f1.length();
        return new Cadena(f1, l1);
    }

    public static void mostrarVocales(Cadena x) {
        String vocal = "aeiouAEIOU";
        int con = 0;
        char z;
        for (int i = 0; i < x.getLongitud(); i++) {
            z = x.getFrase().charAt(i);
            if (vocal.indexOf(z) != -1) {
                con++;
            }
        }
        System.out.println("La frase tiene " + con + " vocales");
    }

    public static void invertirFrase(Cadena x) {

        StringBuilder sb = new StringBuilder(x.getFrase());
        sb.reverse();
        System.out.println("La frase invertida es: " + sb.toString());
        }
    }