/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author JosePc
 */
public class Carta {

    private int numero;
    private String palo;
    private boolean salio;

    public Carta() {
    }

    public Carta(int numero, String palo, boolean salio) {
        this.numero = numero;
        this.palo = palo;
        this.salio = salio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public boolean isSalio() {
        return salio;
    }

    public void setSalio(boolean salio) {
        this.salio = salio;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo;
    }

    public ArrayList generarCartas() {

        //     Carta car = new Carta();
        ArrayList<Carta> mazo = new ArrayList<>();

        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};

        for (String palo : palos) {

            //     System.out.println(palo);
            for (int i = 1; i < 13; i++) {
                if (i != 8 && i != 9) {
                    Carta car = new Carta();
                    car.setNumero(i);
                    car.setPalo(palo);
                    car.setSalio(false);

                    //      System.out.println(car.toString());
                    mazo.add(car);

                }

            }

        }
        return mazo;
    }

    public void mostrarBaraja(ArrayList mazo) {

        for (int i = 0; i < mazo.size(); i++) {

            Carta car = new Carta();

            car = (Carta) mazo.get(i);

            System.out.println(car.getNumero());
            System.out.println(car.getPalo());
            System.out.println(car.isSalio());

        }

    }

}

//   System.out.println("paso por aca");
//    System.out.println(mazo);
//     System.out.println("Número: " + cart.getNumero() + " Palo: " + cart.getPalo() + " Salio: " + cart.isSalio());
//     }

