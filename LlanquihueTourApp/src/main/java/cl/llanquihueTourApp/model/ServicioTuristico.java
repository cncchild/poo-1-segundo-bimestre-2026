/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourApp.model;

import cl.llanquihueTourApp.util.Validator;

/**
 * Representa un servicio turístico ofrecido por la agencia
 * Llanquihue Tour.
 *
 * Esta clase es abstracta y contiene los atributos y
 * comportamientos comunes de los distintos servicios
 * turísticos del sistema.
 *
 * Las clases hijas como PaseoLacustre, RutaGastronomica
 * y ExcursionCultural heredan sus características y
 * especializan el comportamiento mediante polimorfismo.
 *
 * Implementa la interfaz Registrable para permitir que
 * los servicios puedan ser administrados junto a otras
 * entidades del sistema mediante una colección común.
 *
 * @author ADMIN
 */
public abstract class ServicioTuristico implements Registrable {

    /**
     * Identificador único del servicio.
     */
    private int id;

    /**
     * Nombre del servicio turístico.
     */
    private String nombre;

    /**
     * Descripción del servicio.
     */
    private String descripcion;

    /**
     * Duración del servicio.
     */
    private String duracion;

    /**
     * Precio del servicio.
     */
    private double precio;

    /**
     * Guía encargado del servicio.
     */
    private Guia guia;

    /**
     * Transporte asociado al servicio.
     */
    private Transporte transporte;

    /**
     * Constructor de la clase ServicioTuristico.
     *
     * @param id identificador del servicio
     * @param nombre nombre del servicio
     * @param descripcion descripción del servicio
     * @param duracion duración del servicio
     * @param precio precio del servicio
     * @param guia guía responsable
     * @param transporte transporte utilizado
     */
    public ServicioTuristico(
            int id,
            String nombre,
            String descripcion,
            String duracion,
            double precio,
            Guia guia,
            Transporte transporte) {


        setId(id);
        setNombre(nombre);
        setDescripcion(descripcion);
        setDuracion(duracion);
        setPrecio(precio);
        setGuia(guia);
        setTransporte(transporte);

    }

    /**
     * Obtiene el identificador del servicio.
     *
     * @return id del servicio
     */
    public int getId() {

        return id;
    }

    /**
     * Obtiene el nombre del servicio.
     *
     * @return nombre del servicio
     */
    public String getNombre() {

        return nombre;
    }

    /**
     * Obtiene la descripción del servicio.
     *
     * @return descripción del servicio
     */
    public String getDescripcion() {

        return descripcion;
    }

    /**
     * Obtiene la duración del servicio.
     *
     * @return duración del servicio
     */
    public String getDuracion() {

        return duracion;
    }

    /**
     * Obtiene el precio del servicio.
     *
     * @return precio del servicio
     */
    public double getPrecio() {

        return precio;
    }

    /**
     * Obtiene el guía responsable.
     *
     * @return guía asignado al servicio
     */
    public Guia getGuia() {

        return guia;
    }

    /**
     * Obtiene el transporte asociado.
     *
     * @return transporte utilizado
     */
    public Transporte getTransporte() {

        return transporte;
    }

    /**
     * Modifica el identificador del servicio.
     *
     * @param id nuevo identificador
     */
    public void setId(int id) {


        if (!Validator.validarId(id)) {

            throw new IllegalArgumentException(
                    "El id debe ser mayor que cero.");

        }

        this.id = id;
    }

    /**
     * Modifica el nombre del servicio.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {


        if (!Validator.noEsVacio(nombre)) {

            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío.");

        }

        this.nombre = nombre.trim();

    }

    /**
     * Modifica la descripción del servicio.
     *
     * @param descripcion nueva descripción
     */
    public void setDescripcion(String descripcion) {


        if (!Validator.noEsVacio(descripcion)) {

            throw new IllegalArgumentException(
                    "La descripción no puede estar vacía.");

        }

        this.descripcion = descripcion.trim();

    }

    /**
     * Modifica la duración del servicio.
     *
     * @param duracion nueva duración
     */
    public void setDuracion(String duracion) {


        if (!Validator.noEsVacio(duracion)) {

            throw new IllegalArgumentException(
                    "La duración no puede estar vacía.");

        }

        this.duracion = duracion.trim();

    }
    
    /**
     * Modifica el precio del servicio.
     *
     * @param precio nuevo precio
     */
    public void setPrecio(double precio) {


        if (precio <= 0) {

            throw new IllegalArgumentException(
                    "El precio debe ser mayor que cero.");

        }

        this.precio = precio;

    }

    /**
     * Modifica el guía responsable.
     *
     * @param guia nuevo guía asignado
     */
    public void setGuia(Guia guia) {


        if (guia == null) {

            throw new IllegalArgumentException(
                    "El guía no puede ser nulo.");

        }

        this.guia = guia;

    }

    /**
     * Modifica el transporte asociado.
     *
     * @param transporte nuevo transporte
     */
    public void setTransporte(Transporte transporte) {


        if (transporte == null) {

            throw new IllegalArgumentException(
                    "El transporte no puede ser nulo.");

        }

        this.transporte = transporte;

    }

    /**
     * Método abstracto que debe ser implementado
     * por cada tipo de servicio turístico.
     *
     * @return resumen del servicio
     */
    @Override
    public abstract String mostrarResumen();



    /**
     * Retorna la información general del servicio.
     *
     * @return datos completos del servicio
     */
    @Override
    public String toString() {


        return "ID: " + id
                + "\nServicio: " + nombre
                + "\nDescripción: " + descripcion
                + "\nDuración: " + duracion
                + "\nPrecio: $" + precio
                + "\nGuía: " + guia.getNombre()
                + "\nTransporte: "
                + transporte.getIdentificador();

    }

}