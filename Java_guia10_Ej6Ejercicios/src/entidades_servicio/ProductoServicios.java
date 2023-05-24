package entidades_servicio;

import entidades.Producto;
import java.util.HashMap;
import java.util.Scanner;

public class ProductoServicios {

    Scanner leerTexto = new Scanner(System.in);
    Scanner leerNum = new Scanner(System.in);

    public HashMap cargarProducto(HashMap map) {
        Producto artNuevo = new Producto();

        System.out.print("Ingrese el nombre del producto: ");
        artNuevo.setNomProducto(leerTexto.nextLine());

        System.out.print("Ingrese el precio del producto: ");
        artNuevo.setPrecioProducto(leerNum.nextDouble());

        map.put(artNuevo.getNomProducto(), artNuevo.getPrecioProducto());

        return map;
    }

    public HashMap modificarProducto(HashMap map) {
        String nombre;
        //     Producto art = new Producto();

        System.out.print("Ingrese el nombre del producto a modificar: ");
        nombre = leerTexto.nextLine();

        if (map.containsKey(nombre)) {

            System.out.println("El precio anterior cargado es: " + map.get(nombre));
            System.out.print("Ingrese el nuevo precio: ");
            map.put(nombre, leerNum.nextDouble());
        }

        return map;
    }

    public HashMap eliminarProducto(HashMap map) {
        String nombre;

        System.out.print("Ingrese el nombre del producto a eliminar: ");
        nombre = leerTexto.nextLine();

        if (map.containsKey(nombre)) {

            System.out.print("El producto fue eliminado ");
            map.remove(nombre);

        }

        return map;
    }

    public void mostrarProductos(HashMap map) {

        for (Object key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }

    public void menuTienda() {
        int opcion;
        HashMap<String, Producto> map = new HashMap();

        do {
            System.out.println(" ");
            System.out.println("*********************");
            System.out.println("Menú de opciones");
            System.out.println("*********************");
            System.out.println(" ");
            System.out.println("1 - Agregar Producto");
            System.out.println("2 - Modificar Productos");
            System.out.println("3 - Eliminar Productos");
            System.out.println("4 - Mostrar Productos cargados");
            System.out.println("5 - Salir del sistema");
            System.out.println("*********************");
            System.out.print("Ingrese la opción deseada: ");
            opcion = leerNum.nextInt();
            System.out.println("*********************");

            switch (opcion) {
                case 1:
                    cargarProducto(map);
                    break;
                case 2:
                    modificarProducto(map);
                    break;
                case 3:
                    eliminarProducto(map);
                    break;

                case 4:
                    mostrarProductos(map);

                    break;

                case 5:
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (!(opcion == 5));

    }

}
