/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_guia11_ej2ejerciciosextra;

import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author JosePc
 */
public class Java_guia11_Ej2EjerciciosExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Espectador> listaEspectadores = new ArrayList<>();

        Cine cine = new Cine();

        Espectador esp = new Espectador();

        listaEspectadores = esp.creaEspectadores(listaEspectadores);

        cine.setPelRep(new Pelicula("La maldicion de la noche", 120, 21, "Francis Agüero"));
        cine.setPrecio(320);

        boolean salaAux[][] = new boolean[8][6];
        int indice = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {

                indice = (int) ((Math.random() * 50));

                esp = listaEspectadores.get(indice);

                if (esp.getEdad() > cine.getPelRep().getEdadMin() && esp.getDinero() >= cine.getPrecio()) {

                    salaAux[i][j] = true;
                }
            }

        }
        System.out.println("Película: " + cine.getPelRep().getTitulo());
        System.out.println("Duración: " + cine.getPelRep().getDuracion());
        System.out.println("Edad Mínima: " + cine.getPelRep().getEdadMin());
        System.out.println("Director: " + cine.getPelRep().getDirector());
        System.out.println("Ubicación de espectadores en la sala");
        System.out.println("------------------------------------------------");
        System.out.println("");
        
        cine.setSala(salaAux);
        String letra, letra1;
        letra1 = "";
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                if (salaAux[i][j]) {
                    letra = "X";
                } else {
                    letra = " ";
                }

                switch (j) {
                    case 0:
                        letra1 = "A";
                        break;
                    case 1:
                        letra1 = "B";
                        break;
                    case 2:
                        letra1 = "C";
                        break;
                    case 3:
                        letra1 = "D";
                        break;
                    case 4:
                        letra1 = "E";
                        break;
                    case 5:
                        letra1 = "F";
                        break;

                }

                System.out.print((i + 1) + letra1 + letra + "|");
            }
            System.out.println("");
        }

    }

}
