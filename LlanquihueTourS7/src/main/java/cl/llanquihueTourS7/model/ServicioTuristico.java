/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourS7.model;

/**
 * Representa un servicio turístico genérico de la agencia Llanquihue Tour.
 *
 * Esta es la superclase de los distintos tipos de servicios turísticos.
 * Contiene los atributos comunes que heredarán las subclases, como el
 * nombre del servicio y su duración en horas.
 */
public class ServicioTuristico implements Registrable {

    /** Nombre del servicio turístico. */
    private String nombre;

    /** Duración del servicio expresada en horas. */
    private int duracionHoras;

    /**
     * Constructor de la clase ServicioTuristico.
     * @param nombre nombre del servicio turístico.
     * @param duracionHoras duración del servicio en horas.
     */
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    /**
     * Muestra la información básica del servicio turístico.
     * Este método será sobrescrito por las subclases para
     * incorporar información específica de cada tipo de servicio.
     */
    public void mostrarInformacion() {
        System.out.println(toString());
    }
    /**
     * Registra el servicio turístico mostrando su información.
     */
    @Override
    public void registrar() {
        mostrarInformacion();
    }
    /**
     * Devuelve una representación en texto del servicio turístico.
     * @return información del servicio, incluyendo nombre y duración.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nDuración: " + duracionHoras + " horas";
    }
}