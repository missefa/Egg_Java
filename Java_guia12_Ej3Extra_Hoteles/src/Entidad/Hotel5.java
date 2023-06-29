/*
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.

Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
*/

package Entidad;

public class Hotel5 extends Hotel4{
   protected Integer cantidadSalonesDeConferencia;
   protected Integer cantidadDeSuites;
   protected Integer cantidadDeLimosinas; 

    public Hotel5(Integer cantidadSalonesDeConferencia, Integer cantidadDeSuites, Integer cantidadDeLimosinas, Integer cantidadDeHabitaciones, Integer numeroDeCamas, Integer cantidadDePisos, Integer precioDeHabitaciones, Boolean gimnasio, String nombreDelRestaurante, Integer capacidadDelRestaurante, String nombre, Integer dirección, String localidad, String gerenteEncargado, Boolean alojamiento) {
        super(cantidadDeHabitaciones, numeroDeCamas, cantidadDePisos, precioDeHabitaciones, gimnasio, nombreDelRestaurante, capacidadDelRestaurante, nombre, dirección, localidad, gerenteEncargado, alojamiento);
        this.cantidadSalonesDeConferencia = cantidadSalonesDeConferencia;
        this.cantidadDeSuites = cantidadDeSuites;
        this.cantidadDeLimosinas = cantidadDeLimosinas;
    }

    public Integer getCantidadSalonesDeConferencia() {
        return cantidadSalonesDeConferencia;
    }

    public void setCantidadSalonesDeConferencia(Integer cantidadSalonesDeConferencia) {
        this.cantidadSalonesDeConferencia = cantidadSalonesDeConferencia;
    }

    public Integer getCantidadDeSuites() {
        return cantidadDeSuites;
    }

    public void setCantidadDeSuites(Integer cantidadDeSuites) {
        this.cantidadDeSuites = cantidadDeSuites;
    }

    
    public void setCantidadDeLimosinas(Integer cantidadDeLimosinas) {
        this.cantidadDeLimosinas = cantidadDeLimosinas;
    }

     @Override
    public void alojamiento() {
        precioDeHabitaciones = 50 + capacidadHotel() + capacidadRest() + capacidadGim() + (15 *cantidadDeLimosinas);
    }
   
    @Override
    public void mostrar() {
        System.out.println("5estre");
    }
   
}
