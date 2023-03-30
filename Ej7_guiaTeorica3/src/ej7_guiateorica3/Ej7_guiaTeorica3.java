/*Ejercicio 7
Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
o	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
*/
package ej7_guiateorica3;
import java.util.Scanner;
/**
 *
 * @author Erica
 */
public class Ej7_guiaTeorica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int motor;
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de motor:");
        System.out.println("1 Bomba de Agua");
        System.out.println("2 Bomba de Gasoil");
        System.out.println("3 Bomba de Hormigon");
        System.out.println("4 Bomba de pasta alimenticia");
        motor =leer.nextInt();
        
        switch (motor) {
            case 1:
                System.out.println("La bomba elegida es de agua.");
                break;
            case 2:
                System.out.println("La bomba elegida es de Gasoil.");
                break;
            case 3:
                System.out.println("La bomba elegida es de Hormigon.");
                break;
            case 4:
                System.out.println("La bomba elegida es de Pasta Alimenticia.");
                break;
            default:
                System.out.println("Segui participando");
        }

        
        
    }
    
}
