/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_guia10_ejperro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
*/
/**
 *
 * @author Usuario
 */
public class Java_guia10_EjPerro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos el arrayList
        ArrayList<String> razas= new ArrayList<>();
        //creamos el scanner
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //creamos la variable que almacenara el valor que nos permitira decidir si queremos continuar o no, y la iniciamos al valor vacio
        String c="";
        while (true) {
            //mostramos mensaje de agregar raza y lo agregamos al arrayList
            System.out.println("Ingrese una raza de perro");
            razas.add(leer.next());
            //confirmacion para seguir agregando
            do{
                System.out.println("Desea continuar? s/n");
                c = leer.next();
            }while(!c.equalsIgnoreCase("s")&& !c.equalsIgnoreCase("n"));
            //condicional que evalua si seguir en el bucle o no
            if(c.equalsIgnoreCase("n")){
                break;
            }
        }
       
        
        System.out.println("Las razas de perro (que se mostraran 2 veces por que uso 2 metodos distintos) son:");
        //creamos el iterator para mostrar los resultados
        Iterator it = razas.iterator();
        //creamos el while para mostrar el contenido del ArrayList
        while(it.hasNext()){
            System.out.print(it.next()+", ");
        }
        System.out.println("");
        //otra forma mas mejor de mostrar los elementos de una lista
        razas.forEach((r)->System.out.print(r+", "));
        
        System.out.println("\nmostradas ya las razas, ingrese una raza para eliminar de la lista");
        String re = leer.next();
        
       if(razas.contains(re)){
           razas.remove(re);
       }else{
           System.out.println("Esa raza no se encuentra en la lista");
       }
       
       razas.forEach(r->System.out.print(r+", "));
        
    }
    
}
