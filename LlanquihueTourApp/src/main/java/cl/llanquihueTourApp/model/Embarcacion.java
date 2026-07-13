/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourApp.model;

import cl.llanquihueTourApp.util.Validator;

/**
 * Representa una embarcación utilizada por la agencia
 * Llanquihue Tour para servicios turísticos lacustres.
 *
 * Embarcacion hereda de Transporte, reutilizando sus
 * características generales y agregando información
 * específica de navegación.
 *
 * La relación corresponde a una herencia (IS-A),
 * ya que una embarcación es un tipo de transporte.
 *
 * @author ADMIN
 */
public class Embarcacion extends Transporte {


    /**
     * Tipo de embarcación.
     *
     * Ejemplo:
     * Catamarán, Lancha, Barco turístico.
     */
    private String tipo;

    /**
     * Largo de la embarcación en metros.
     */
    private double eslora;

    /**
     * Constructor de la clase Embarcacion.
     *
     * @param id identificador del transporte
     * @param matricula matrícula de la embarcación
     * @param capacidad capacidad de pasajeros
     * @param estado estado de la embarcación
     * @param responsable capitán asignado
     * @param tipo tipo de embarcación
     * @param eslora largo de la embarcación
     */
    public Embarcacion(
            int id,
            String matricula,
            int capacidad,
            String estado,
            Persona responsable,
            String tipo,
            double eslora) {


        super(
                id,
                matricula,
                capacidad,
                estado,
                responsable
        );


        setTipo(tipo);
        setEslora(eslora);

    }

    /**
     * Obtiene el tipo de embarcación.
     *
     * @return tipo de nave
     */
    public String getTipo() {

        return tipo;
    }
    
    /**
     * Obtiene la eslora.
     *
     * @return largo de la embarcación
     */
    public double getEslora() {

        return eslora;
    }

    /**
     * Modifica el tipo de embarcación.
     *
     * @param tipo nuevo tipo de nave
     */
    public void setTipo(String tipo) {


        if (!Validator.noEsVacio(tipo)) {


            throw new IllegalArgumentException(
                    "El tipo de embarcación no puede estar vacío.");

        } else if (!Validator.longitudMinima(tipo, 3)) {


            throw new IllegalArgumentException(
                    "El tipo de embarcación debe tener al menos 3 caracteres.");

        }
        this.tipo = tipo.trim();

    }

    /**
     * Modifica la eslora de la embarcación.
     *
     * @param eslora largo de la embarcación
     */
    public void setEslora(double eslora) {


        if (eslora <= 0) {


            throw new IllegalArgumentException(
                    "La eslora debe ser mayor que cero.");

        }


        this.eslora = eslora;

    }

    /**
     * Muestra un resumen de la embarcación.
     *
     * Método sobrescrito desde Registrable.
     *
     * @return resumen de la embarcación
     */
    @Override
    public String mostrarResumen() {


        return "EMBARCACIÓN"
                + "\nMatrícula: " + getIdentificador()
                + "\nTipo: " + tipo
                + "\nEslora: " + eslora + " metros"
                + "\nCapacidad: " + getCapacidad()
                + " pasajeros"
                + "\nCapitán: "
                + getResponsable().getNombre();

    }

    /**
     * Retorna la información completa
     * de la embarcación.
     *
     * @return datos de la embarcación
     */
    @Override
    public String toString() {


        return super.toString()
                + "\nTipo: " + tipo
                + "\nEslora: " + eslora + " metros";

    }

}