/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourApp.model;

import cl.llanquihueTourApp.util.Validator;

/**
 * Representa un servicio turístico de navegación
 * ofrecido por Llanquihue Tour.
 *
 * PaseoLacustre hereda de ServicioTuristico,
 * reutilizando sus atributos comunes como nombre,
 * precio, guía y transporte.
 *
 * La relación corresponde a una herencia (IS-A),
 * ya que un paseo lacustre es un tipo de servicio turístico.
 *
 * Este servicio utiliza normalmente una embarcación
 * con un capitán asignado.
 *
 * @author ADMIN
 */
public class PaseoLacustre extends ServicioTuristico {

    /**
     * Nombre del lago donde se realiza el paseo.
     */
    private String lago;
    
    /**
     * Tipo de recorrido realizado.
     *
     * Ejemplo:
     * Panorámico, Histórico, Fotográfico.
     */
    private String tipoRecorrido;
    
    /**
     * Tipo de embarcacion.
     *
     * Ejemplo:
     * lancha, catamaran.
     */
    private String tipoEmbarcacion;
    /**
     * Constructor de la clase PaseoLacustre.
     *
     * @param id identificador del servicio
     * @param nombre nombre del servicio
     * @param descripcion descripción del servicio
     * @param duracion duración del paseo
     * @param precio precio del servicio
     * @param guia guía responsable
     * @param transporte embarcación utilizada
     * @param lago lago donde se realiza
     * @param tipoRecorrido tipo de recorrido
     */
    public PaseoLacustre(
            int id,
            String nombre,
            String descripcion,
            String duracion,
            double precio,
            Guia guia,
            Transporte transporte,
            String lago,
            String tipoRecorrido,
            String tipoEmbarcacion) {


        super(
                id,
                nombre,
                descripcion,
                duracion,
                precio,
                guia,
                transporte
        );


        setLago(lago);
        setTipoRecorrido(tipoRecorrido);
         setTipoEmbarcacion(tipoEmbarcacion);

    }

    /**
     * Obtiene el lago del paseo.
     *
     * @return nombre del lago
     */
    public String getLago() {

        return lago;
    }

    /**
     * Obtiene el tipo de recorrido.
     *
     * @return tipo de recorrido
     */
    public String getTipoRecorrido() {

        return tipoRecorrido;
    }
    
       /**
     * Obtiene el tipo de embarcacion.
     *
     * @return tipo de embarcacion
     */
    public String getTipoEmbarcacion() {

        return tipoEmbarcacion;
    }
    /**
     * Modifica el lago del paseo.
     *
     * @param lago nuevo lago
     */
    public void setLago(String lago) {


        if (!Validator.noEsVacio(lago)) {

            throw new IllegalArgumentException(
                    "El lago no puede estar vacío.");

        } else if (!Validator.longitudMinima(lago, 3)) {

            throw new IllegalArgumentException(
                    "El lago debe tener al menos 3 caracteres.");

        }
        this.lago = lago.trim();

    }

    /**
     * Modifica el tipo de recorrido.
     *
     * @param tipoRecorrido nuevo tipo de recorrido
     */
    public void setTipoRecorrido(String tipoRecorrido) {


        if (!Validator.noEsVacio(tipoRecorrido)) {

            throw new IllegalArgumentException(
                    "El tipo de recorrido no puede estar vacío.");

        } else if (!Validator.longitudMinima(tipoRecorrido, 3)) {

            throw new IllegalArgumentException(
                    "El tipo de recorrido debe tener al menos 3 caracteres.");

        }

        this.tipoRecorrido = tipoRecorrido.trim();

    }
    /**
     * Modifica el tipo de recorrido.
     *
     * @param tipoEmbarcacion nuevo tipo de recorrido
     */
    public void setTipoEmbarcacion(String tipoEmbarcacion) {


        if (!Validator.noEsVacio(tipoEmbarcacion)) {

            throw new IllegalArgumentException(
                    "El tipo de embarcación no puede estar vacío.");

        } else if (!Validator.longitudMinima(tipoEmbarcacion, 3)) {

            throw new IllegalArgumentException(
                    "El tipo de embarcacion debe tener al menos 3 caracteres.");

        }

        this.tipoEmbarcacion = tipoEmbarcacion.trim();

    }
    
    /**
     * Muestra un resumen del paseo lacustre.
     *
     * Método sobrescrito desde Registrable.
     *
     * @return resumen del servicio
     */
    @Override
    public String mostrarResumen() {


        return "PASEO LACUSTRE"
                + "\nNombre: " + getNombre()
                + "\nLago: " + lago
                + "\nRecorrido: " + tipoRecorrido
                 + "\nEmbarcacion: " + tipoEmbarcacion
                + "\nDuración: " + getDuracion()
                + "\nPrecio: $" + getPrecio()
                + "\nGuía: " + getGuia().getNombre()
                + "\nEmbarcación: "
                + getTransporte().getIdentificador();

    }
    
    /**
     * Retorna la información completa del paseo.
     *
     * @return datos del paseo lacustre
     */
    @Override
    public String toString() {


        return super.toString()
                + "\nLago: " + lago
                + "\nTipo de recorrido: " + tipoRecorrido
                 + "\nTipo de embarcación: " + tipoEmbarcacion;

    }

}
