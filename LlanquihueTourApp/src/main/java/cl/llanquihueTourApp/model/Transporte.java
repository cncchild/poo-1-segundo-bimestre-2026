/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourApp.model;
import cl.llanquihueTourApp.util.Validator;

/**
 * Representa un transporte utilizado por la agencia Llanquihue Tour.
 *
 * Transporte es una clase abstracta que define los atributos
 * y comportamientos comunes de los distintos medios de transporte
 * utilizados por los servicios turísticos.
 *
 * Las clases hijas como AutomovilTuristico y Embarcacion
 * heredan sus características y especializan su funcionamiento.
 *
 * Implementa la interfaz Registrable para permitir que los transportes
 * sean gestionados mediante polimorfismo junto a otras entidades
 * del sistema.
 *
 * @author ADMIN
 */
public abstract class Transporte implements Registrable {

    /**
     * Identificador único del transporte.
     */
    private int id;

    /**
     * Identificador físico del transporte.
     *
     * Puede representar una patente en vehículos
     * o matrícula en embarcaciones.
     */
    private String identificador;

    /**
     * Capacidad máxima de pasajeros.
     */
    private int capacidad;

    /**
     * Estado actual del transporte.
     */
    private String estado;

    /**
     * Persona responsable del transporte.
     *
     * Puede corresponder a un Conductor
     * o a un Capitán de Nave.
     */
    private Persona responsable;


    /**
     * Constructor de la clase Transporte.
     *
     * @param id identificador del transporte
     * @param identificador patente o matrícula
     * @param capacidad capacidad de pasajeros
     * @param estado estado del transporte
     * @param responsable persona encargada del transporte
     */
    public Transporte(
            int id,
            String identificador,
            int capacidad,
            String estado,
            Persona responsable) {

        setId(id);
        setIdentificador(identificador);
        setCapacidad(capacidad);
        setEstado(estado);
        setResponsable(responsable);

    }


    /**
     * Obtiene el identificador del transporte.
     *
     * @return id del transporte
     */
    public int getId() {
        return id;
    }


    /**
     * Obtiene la patente o matrícula.
     *
     * @return identificador del transporte
     */
    public String getIdentificador() {
        return identificador;
    }


    /**
     * Obtiene la capacidad del transporte.
     *
     * @return cantidad de pasajeros
     */
    public int getCapacidad() {
        return capacidad;
    }


    /**
     * Obtiene el estado del transporte.
     *
     * @return estado actual
     */
    public String getEstado() {
        return estado;
    }


    /**
     * Obtiene el responsable del transporte.
     *
     * @return persona responsable
     */
    public Persona getResponsable() {
        return responsable;
    }


    /**
     * Modifica el identificador del transporte.
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
     * Modifica la patente o matrícula.
     *
     * @param identificador nuevo identificador
     */
    public void setIdentificador(String identificador) {

        if (!Validator.noEsVacio(identificador)) {

            throw new IllegalArgumentException(
                    "El identificador no puede estar vacío.");

        } else if (!Validator.longitudMinima(identificador, 3)) {

            throw new IllegalArgumentException(
                    "El identificador debe tener al menos 3 caracteres.");

        }

        this.identificador = identificador.trim();
    }


    /**
     * Modifica la capacidad del transporte.
     *
     * @param capacidad nueva capacidad
     */
    public void setCapacidad(int capacidad) {

        if (!Validator.validarCapacidad(capacidad)) {

            throw new IllegalArgumentException(
                    "La capacidad debe ser mayor que cero.");

        }

        this.capacidad = capacidad;
    }


    /**
     * Modifica el estado del transporte.
     *
     * @param estado nuevo estado
     */
    public void setEstado(String estado) {

        if (!Validator.noEsVacio(estado)) {

            throw new IllegalArgumentException(
                    "El estado no puede estar vacío.");

        }

        this.estado = estado.trim();
    }


    /**
     * Modifica el responsable del transporte.
     *
     * @param responsable persona encargada
     */
    public void setResponsable(Persona responsable) {

        if (responsable == null) {

            throw new IllegalArgumentException(
                    "El responsable no puede ser nulo.");

        }

        this.responsable = responsable;
    }


    /**
     * Método abstracto que será implementado
     * por cada tipo de transporte.
     *
     * @return resumen del transporte
     */
    @Override
    public abstract String mostrarResumen();



    /**
     * Retorna la información completa del transporte.
     *
     * @return datos del transporte
     */
    @Override
    public String toString() {

        return "ID: " + id
                + "\nIdentificador: " + identificador
                + "\nCapacidad: " + capacidad
                + "\nEstado: " + estado
                + "\nResponsable: " + responsable.getNombre();

    }

}