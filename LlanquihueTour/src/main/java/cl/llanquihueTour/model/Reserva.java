/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTour.model;
import cl.llanquihueTour.util.Validator;
import java.time.LocalDate;

/**
 * Representa una reserva realizada por un cliente
 * para participar en un tour turístico.
 *
 * Una reserva relaciona a un cliente con un tour
 * específico y registra la fecha en que se efectuó
 * la reserva.
 *
 * Esta relación corresponde a una asociación entre
 * las clases Cliente y Tour.
 *
 * @author ADMIN
 */
public class Reserva {

    /**
     * Identificador único de la reserva.
     */
    private int idReserva;

    /**
     * Cliente que realiza la reserva.
     */
    private Cliente cliente;

    /**
     * Tour asociado a la reserva.
     */
    private Tour tour;

    /**
     * Fecha en que se realizó la reserva.
     */
    private LocalDate fechaReserva;

    /**
     * Constructor de la clase Reserva.
     *
     * @param idReserva identificador único
     * de la reserva
     * @param cliente cliente asociado
     * a la reserva
     * @param tour tour asociado
     * a la reserva
     * @param fechaReserva fecha en que se
     * realizó la reserva
     */
    public Reserva(
            int idReserva,
            Cliente cliente,
            Tour tour,
            LocalDate fechaReserva) {

        setIdReserva(idReserva);
        setCliente(cliente);
        setTour(tour);
        setFechaReserva(fechaReserva);

    }

    /**
     * Obtiene el identificador de la reserva.
     *
     * @return identificador de la reserva
     */
    public int getIdReserva() {
        return idReserva;
    }

    /**
     * Modifica el identificador de la reserva.
     *
     * @param idReserva nuevo identificador
     * de la reserva
     * @throws IllegalArgumentException si el
     * identificador es menor o igual a cero
     */
     public void setIdReserva(int idReserva){

     if (!Validator.validarId(idReserva)){

         throw new IllegalArgumentException(
                 "El identificador de la Reserva debe ser mayor que cero.");
     }
        this.idReserva = idReserva;
    }

    /**
     * Obtiene el cliente asociado a la reserva.
     *
     * @return cliente de la reserva
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
    * Modifica el cliente asociado a la reserva.
    *
    * @param cliente nuevo cliente
    * @throws IllegalArgumentException si el cliente es nulo
    */
   public void setCliente(Cliente cliente) {

       if (cliente == null){

           throw new IllegalArgumentException(
                   "El cliente no puede ser nulo.");

       }

       this.cliente = cliente;
   }

    /**
     * Obtiene el tour asociado a la reserva.
     *
     * @return tour de la reserva
     */
    public Tour getTour(){
        return tour;
    }

    /**
     * Modifica el tour asociado a la reserva.
     *
     * @param tour nuevo tour
     * @throws IllegalArgumentException si el tour es nulo
     */
    public void setTour(Tour tour){

        if (tour == null){

            throw new IllegalArgumentException(
                    "El tour no puede ser nulo.");

        }

        this.tour = tour;
    }

    /**
     * Obtiene la fecha de la reserva.
     *
     * @return fecha de la reserva
     */
    public LocalDate getFechaReserva(){
        return fechaReserva;
    }

    /**
     * Modifica la fecha de la reserva.
     *
     * @param fechaReserva nueva fecha
     * de la reserva
     * @throws IllegalArgumentException si la
     * fecha es nula
     */
    public void setFechaReserva(LocalDate fechaReserva) {

    if (!Validator.validarFecha(fechaReserva)) {

        throw new IllegalArgumentException(
                "La fecha de reserva no puede ser nula.");

    }

    this.fechaReserva = fechaReserva;
}

    /**
     * Retorna la información completa
     * de la reserva.
     *
     * @return datos de la reserva
     */
    @Override
    public String toString() {

        return "Reserva N°: " + idReserva
                + "\nCliente: " + cliente.getNombre()
                + "\nTour: " + tour.getNombre()
                + "\nFecha Reserva: " + fechaReserva;
    }

}
