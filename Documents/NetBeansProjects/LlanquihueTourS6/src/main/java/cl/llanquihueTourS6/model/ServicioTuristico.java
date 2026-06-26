/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourS6.model;

/**
 * Representa un servicio turístico genérico de la agencia Llanquihue Tour.
 * <p>
 * Esta es la superclase de los distintos tipos de servicios turísticos.
 * Contiene los atributos comunes que heredarán las subclases, como el
 * nombre del servicio y su duración en horas.
 * </p>
 *
 * @author ADMIN
 */
public class ServicioTuristico {

    /** Nombre del servicio turístico. */
    protected String nombre;

    /** Duración del servicio expresada en horas. */
    protected int duracionHoras;

    /**
     * Constructor de la clase ServicioTuristico.
     *
     * @param nombre nombre del servicio turístico.
     * @param duracionHoras duración del servicio en horas.
     */
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    /**
     * Devuelve una representación en texto del servicio turístico.
     *
     * @return información del servicio, incluyendo nombre y duración.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nDuración: " + duracionHoras + " horas";
    }
}