/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import util.Validator;
/**
 * Representa un tour de aventura ofrecido por la agencia.
 *
 * Esta clase hereda de la clase Tour, por lo que obtiene
 * automáticamente los atributos y métodos comunes de un tour,
 * como el nombre y el precio.
 *
 * Además, agrega información específica relacionada con la
 * actividad de aventura que se realizará durante el tour.
 *
 * Ejemplos de actividades:
 * - Trekking
 * - Rafting
 * - Kayak
 * - Escalada
 *
 * @author ADMIN
 */
public class TourAventura extends Tour {

    /**
     * Actividad principal del tour.
     */
    private String actividad;

    /**
     * Constructor de la clase TourAventura.
     *
     * Utiliza la palabra clave super para invocar el constructor
     * de la clase padre Tour e inicializar los atributos heredados.
     *
     * @param nombre nombre del tour
     * @param precio precio del tour
     * @param actividad actividad principal del tour
     */
    public TourAventura(String nombre,
            double precio,
            String actividad) {

        super(nombre, precio);
            setActividad(actividad);
    }

    /**
     * Obtiene la actividad principal del tour.
     *
     * @return actividad del tour
     */
    public String getActividad() {
        return actividad;
    }

    /**
     * Modifica la actividad principal del tour.
     *
     * @param actividad nueva actividad
     */
 public void setActividad(String actividad) {

    if (!Validator.noEsVacio(actividad)) {

        throw new IllegalArgumentException(
                "La actividad no puede estar vacía.");

    } else if (!Validator.soloLetras(actividad)) {

        throw new IllegalArgumentException(
                "La actividad solo puede contener letras.");

    } else if (!Validator.longitudMinima(actividad, 3)) {

        throw new IllegalArgumentException(
                "La actividad debe tener al menos 3 caracteres.");

    }

    this.actividad = actividad.trim();
}

    /**
     * Retorna la información completa del tour.
     *
     * Utiliza super.toString() para reutilizar la información
     * generada por la clase padre y agregar los datos propios
     * de esta clase.
     *
     * @return datos completos del tour de aventura
     */
    @Override
    public String toString() {

        return super.toString()
                + "\nActividad: " + actividad;

    }
}
