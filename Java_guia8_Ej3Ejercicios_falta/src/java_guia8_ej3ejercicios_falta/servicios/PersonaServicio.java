/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_guia8_ej3ejercicios_falta.servicios;


import java_guia8_ej3ejercicios_falta.entidades.Persona;
import java.util.Scanner;

/**
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos: Método esMayorDeEdad(): 
 * indica si la persona es mayor de edad. La función devuelve un booleano. 
 */
public class PersonaServicio {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public boolean esMayorDeEdad(Persona p1) {
        boolean mayor = false;

        if (p1.getEdad() >= 18) {
            mayor = true;
            System.out.println("es mayor");
            return mayor;
        } else {
            System.out.println("es menor");
            return mayor;
        }
    }
    
//    Metodo crearPersona():
// * el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos
// * para llenar el objeto Persona.
    public Persona CrearPersona(){
        System.out.println("ingrese nombre de la persona\n");
        String nombre = leer.next();
        System.out.println("ingrese edad e la persona\n");
        int edad = leer.nextInt();
        System.out.println("ingrese sexo de la persona\n");
        String sexo;
        do {
            System.out.println("ingrese un caracter\n h\n m\n o");
        sexo = leer.next();
        
        }while(!sexo.equalsIgnoreCase("h")&&!sexo.equalsIgnoreCase("m")&&!sexo.equalsIgnoreCase("o") );
        
        System.out.println("ingrese peso de la persona\n");
        float peso = leer.nextFloat();
        System.out.println("ingrese altura de la persona\n");
        float altura = leer.nextFloat();
        return new Persona(nombre, edad, sexo, peso, altura);
        
        
    }
//     Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
//significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, 
//si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
//A continuación, en la clase main hacer lo siguiente:
     public int CalcularIMC(Persona looneytunes){
        double PesoIdeal=looneytunes.getPeso()/(Math.pow(looneytunes.getAltura(),2));
        
        if(PesoIdeal<20){
            return -1;
        }else if(PesoIdeal>25){
            return 1;
        }else{
            return 0;
        }
    }
 
    
}
