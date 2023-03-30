/*Ejercicio 7
Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
o	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
*/
package ej7_guiateorica3_otro;
import java.util.Scanner;
/**
 *
 * @author JuanMa
 */
public class Ej7_guiaTeorica3_otro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("Para elegir la bomba, presione la opción que corresponde:"); 
        System.out.println("1_Bomba de Agua\n2_Bomba de Gasolina\n3_Bomba de hormigon\n4_Bomba de pasta alimenticia" );
        opcion = leer.nextInt();
        switch(opcion){
            case 1:
                System.out.println("usted eligio una bomba de agua");
                break;
            case 2:
                System.out.println("usted eligio una bomba de gasolina");
                break;
            case 3:
                System.out.println("usted eligio una bomba de hormigon");
                break;
            case 4:
                System.out.println("usted eligio una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("la opcion elegida no corresponde a un tipo de bomba");
                        
        }
    
    }
    
}
