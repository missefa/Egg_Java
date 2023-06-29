/*
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.

Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. 

El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:

PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:

Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.

Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.

Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.

17
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.

Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.

*/
package Entidad;

import java.util.Collections;
import java.util.Comparator;

public class Hotel4 extends Alojamientos {

    protected Integer cantidadDeHabitaciones;
    protected Integer numeroDeCamas;
    protected Integer cantidadDePisos;
    protected Integer precioDeHabitaciones;
    protected Boolean gimnasio;
    protected String nombreDelRestaurante;
    protected Integer capacidadDelRestaurante;

    public Hotel4(Integer cantidadDeHabitaciones, Integer numeroDeCamas, Integer cantidadDePisos, Integer precioDeHabitaciones, Boolean gimnasio, String nombreDelRestaurante, Integer capacidadDelRestaurante, String nombre, Integer dirección, String localidad, String gerenteEncargado, Boolean alojamiento) {
        super(nombre, dirección, localidad, gerenteEncargado, alojamiento);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.numeroDeCamas = numeroDeCamas;
        this.cantidadDePisos = cantidadDePisos;
        this.precioDeHabitaciones = precioDeHabitaciones;
        this.gimnasio = gimnasio;
        this.nombreDelRestaurante = nombreDelRestaurante;
        this.capacidadDelRestaurante = capacidadDelRestaurante;
    }

    public Integer getCantidadDeHabitaciones() {
        return cantidadDeHabitaciones;
    }

    public void setCantidadDeHabitaciones(Integer cantidadDeHabitaciones) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }

    public Integer getNumeroDeCamas() {
        return numeroDeCamas;
    }

    public void setNumeroDeCamas(Integer numeroDeCamas) {
        this.numeroDeCamas = numeroDeCamas;
    }

    public Integer getCantidadDePisos() {
        return cantidadDePisos;
    }

    public void setCantidadDePisos(Integer cantidadDePisos) {
        this.cantidadDePisos = cantidadDePisos;
    }

    public Integer getPrecioDeHabitaciones() {
        return precioDeHabitaciones;
    }

    public void setPrecioDeHabitaciones(Integer precioDeHabitaciones) {
        this.precioDeHabitaciones = precioDeHabitaciones;
    }

    public Boolean getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreDelRestaurante() {
        return nombreDelRestaurante;
    }

    public void setNombreDelRestaurante(String nombreDelRestaurante) {
        this.nombreDelRestaurante = nombreDelRestaurante;
    }

    public void setCapacidadDelRestaurante(Integer capacidadDelRestaurante) {
        this.capacidadDelRestaurante = capacidadDelRestaurante;
    }

    public int capacidadHotel() {
        return cantidadDePisos * numeroDeCamas * cantidadDeHabitaciones;
    }

    public int capacidadRest() {
        if (capacidadDelRestaurante < 30) {
            return 10;
        } else if (capacidadDelRestaurante >= 30 && capacidadDelRestaurante <= 50) {
            return 30;
        }
        return 50;

    }

    public int capacidadGim() {
        if (alojamiento) {
            return 30;
        }
        
        return 50;
    }

    @Override
    public void alojamiento() {
        precioDeHabitaciones = 50 + capacidadHotel() + capacidadRest() + capacidadGim();
    }

    @Override
    public void mostrar() {
        System.out.println("4estre");
    }

public static Comparator<Hotel4> comparaPrecio = new Comparator<Hotel4>(){
	@Override
	public int compare(Hotel4 p1, Hotel4 p2) {
		return p1.getPrecioDeHabitaciones().compareTo(p2.getPrecioDeHabitaciones());
	}
};
    
}
