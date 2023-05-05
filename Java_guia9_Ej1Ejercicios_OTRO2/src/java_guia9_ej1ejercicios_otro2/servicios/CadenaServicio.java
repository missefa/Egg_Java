/*
1. Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática. Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.
e) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
 */
package java_guia9_ej1ejercicios_otro2.servicios;

import java.util.Scanner;
import java_guia9_ej1ejercicios_otro2.entidades.Cadena;


public class CadenaServicio {
    Cadena cadena=new Cadena();
    Scanner read=new Scanner(System.in).useDelimiter("\n");
    
    public void crearFrase(){
        System.out.println("Escriba una Frase:");
        cadena.setCadena(read.next());
        cadena.setLongitud(cadena.getCadena().length());
    }
    
    public void mostrarVocales(){
        String phrace = cadena.getCadena();
        int character = phrace.length();
        int conA=0;
         
        for(int i =0; i<character; i++){
            
            switch(phrace.charAt(i)){
                case 'a':
                 conA++;
                break;
                case 'e':
                 conA++;
                break;
                case 'i':
                 conA++;
                break;
                case 'o':
                 conA++;
                break;
                case 'u':
                 conA++;
                break;
                case 'A':
                 conA++;
                break;
                case 'E':
                 conA++;
                break;
                case 'I':
                 conA++;
                break;
                case 'O':
                 conA++;
                break;
                case 'U':
                 conA++;
                break;
            }
        }
        System.out.println("La cantidad de vocales es: "+ conA);
        System.out.println("-------------------------------------");
    }
    
    public void invertirFrase(){
       
        for(int i = cadena.getLongitud(); i>0; i--){
            System.out.print(cadena.getCadena().substring(i-1,i));
        }
        System.out.println("");
        System.out.println("-------------------------------------");
    }
    public void vecesRepetido(){
        int C= 0;
        System.out.println("Escriba un unico caracter");
        String character =read.next();
        
        for(int i=0; i <cadena.getLongitud(); i++){
           if(cadena.getCadena().charAt(i)== character.charAt(0)){
               C++;
           }
        }
        System.out.println("La cantidad de "+ character + " se repite " + C + " veces");
        System.out.println("-------------------------------------");
    }
    
    public void compararLongitud(){
        System.out.println("Ingrese una nueva frase");
        String phrace= read.next();
        if(phrace.length()==cadena.getLongitud()){
            System.out.println("tienen la misma longitud");
        }else if(phrace.length()>cadena.getLongitud()){
          System.out.println("La frase original es mas larga");
        }else{
            System.out.println("La frase ingresada es mas larga");
        } 
         System.out.println("-------------------------------------");
    }
    
    public void unirFrases(){
     System.out.println("Ingrese una nueva frase");
     String phrace= read.next();
     System.out.println(cadena.getCadena()+" "+ phrace);
     System.out.println("-------------------------------------");
    }
    public void reemplazar(){
        System.out.println("¿Por que letra desea remplazar la letra 'a'?");
        String phrace= read.next(); 
        String newPhrace=cadena.getCadena().replace("a",phrace);
        System.out.println(newPhrace);
        System.out.println("-------------------------------------");
    }
    
    public boolean contiene(){
        boolean encontrar = false;
        System.out.println("¿Que letra desea encontrar?");
        String letra= read.next();  
        
        for(int i=0; i <cadena.getLongitud(); i++){
           if(cadena.getCadena().charAt(i)== letra.charAt(0)){
               encontrar = true;
               break;
           }
        }
        System.out.println("Se encontro la letra: "+encontrar);
         System.out.println("-------------------------------------");
        return encontrar;   
    }

}