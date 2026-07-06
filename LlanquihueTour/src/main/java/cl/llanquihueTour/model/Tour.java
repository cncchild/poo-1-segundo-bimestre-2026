/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTour.model;
import cl.llanquihueTour.util.Validator;

/**
 * Representa un tour turístico.
 *
 * Un tour posee información básica como nombre,
 * descripción y precio, además de estar asociado
 * a un guía, transporte y conductor.
 *
 * @author ADMIN
 */
public class Tour {

    private int idTour;
    private String nombre;
    private String descripcion;
    private double precio;
    private Guia guia;
    private Transporte transporte;
    private Conductor conductor;
    private String categoria;

    /**
     * Constructor de la clase Tour.
     *
     * @param idTour identificador del tour
     * @param nombre nombre del tour
     * @param descripcion descripción del tour
     * @param precio precio del tour
     * @param guia guía asignado
     * @param transporte transporte asignado
     * @param conductor conductor asignado
     */
    public Tour(int idTour,
            String nombre,
            String descripcion,
            double precio,
            Guia guia,
            Transporte transporte,
            Conductor conductor) {

        setIdTour(idTour);
        setNombre(nombre);
        setDescripcion(descripcion);
        setPrecio(precio);
        setGuia(guia);
        setTransporte(transporte);
        setConductor(conductor);
    }

    /**
     * Obtiene el identificador del tour.
     *
     * @return identificador del tour
     */
    public int getIdTour() {
        return idTour;
    }

    /**
     * Modifica el identificador del tour.
     *
     * @param idTour nuevo identificador
     * @throws IllegalArgumentException si el id es inválido
     */
    public void setIdTour(int idTour) {

        if (!Validator.validarId(idTour)) {

            throw new IllegalArgumentException(
                    "El identificador del tour debe ser mayor que cero.");
        }

        this.idTour = idTour;
    }

    /**
     * Obtiene el nombre del tour.
     *
     * @return nombre del tour
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del tour.
     *
     * @param nombre nuevo nombre
     * @throws IllegalArgumentException si el nombre es inválido
     */
    public void setNombre(String nombre) {

        if (!Validator.noEsVacio(nombre)) {

            throw new IllegalArgumentException(
                    "El nombre del tour no puede estar vacío.");

        } else if (!Validator.longitudMinima(nombre, 3)) {

            throw new IllegalArgumentException(
                    "El nombre del tour debe tener al menos 3 caracteres.");
        }

        this.nombre = nombre.trim();
    }

    /**
     * Obtiene la descripción del tour.
     *
     * @return descripción del tour
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripción del tour.
     *
     * @param descripcion nueva descripción
     * @throws IllegalArgumentException si la descripción es inválida
     */
    public void setDescripcion(String descripcion) {

        if (!Validator.noEsVacio(descripcion)) {

            throw new IllegalArgumentException(
                    "La descripción no puede estar vacía.");

        } else if (!Validator.longitudMinima(descripcion, 5)) {

            throw new IllegalArgumentException(
                    "La descripción debe tener al menos 5 caracteres.");
        }

        this.descripcion = descripcion.trim();
    }

    /**
     * Obtiene el precio del tour.
     *
     * @return precio del tour
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Modifica el precio del tour.
     *
     * @param precio nuevo precio
     * @throws IllegalArgumentException si el precio es inválido
     */
    public void setPrecio(double precio) {

        if (precio <= 0) {

            throw new IllegalArgumentException(
                    "El precio debe ser mayor que cero.");
        }

        this.precio = precio;
    }

    /**
     * Obtiene el guía asociado.
     *
     * @return guía del tour
     */
    public Guia getGuia() {
        return guia;
    }

    /**
     * Modifica el guía asociado.
     *
     * @param guia nuevo guía
     * @throws IllegalArgumentException si el guía es nulo
     */
    public void setGuia(Guia guia) {

        if (guia == null) {

            throw new IllegalArgumentException(
                    "El guía no puede ser nulo.");
        }

        this.guia = guia;
    }

    /**
     * Obtiene el transporte asociado.
     *
     * @return transporte del tour
     */
    public Transporte getTransporte() {
        return transporte;
    }

    /**
     * Modifica el transporte asociado.
     *
     * @param transporte nuevo transporte
     * @throws IllegalArgumentException si el transporte es nulo
     */
    public void setTransporte(Transporte transporte) {

        if (transporte == null) {

            throw new IllegalArgumentException(
                    "El transporte no puede ser nulo.");
        }

        this.transporte = transporte;
    }

    /**
     * Obtiene el conductor asociado.
     *
     * @return conductor del tour
     */
    public Conductor getConductor() {
        return conductor;
    }

    /**
     * Modifica el conductor asociado.
     *
     * @param conductor nuevo conductor
     * @throws IllegalArgumentException si el conductor es nulo
     */
    public void setConductor(Conductor conductor) {

        if (conductor == null) {

            throw new IllegalArgumentException(
                    "El conductor no puede ser nulo.");
        }

        this.conductor = conductor;
    }

    /**
     * Retorna la información completa del tour.
     *
     * @return datos del tour
     */
    @Override
    public String toString() {

        return "ID Tour: " + idTour
                + "\nNombre: " + nombre
                + "\nDescripción: " + descripcion
                + "\nPrecio: $" + precio
                + "\nGuía: " + guia.getNombre()
                + "\nTransporte: " + transporte.getTipoVehiculo()
                + "\nConductor: " + conductor.getNombre();
    }
}