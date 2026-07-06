/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourS7.model;

/**
 * Representa una ruta gastronómica ofrecida por la agencia Llanquihue Tour.
 * Esta clase hereda de {@code ServicioTuristico} e incorpora el atributo
 * específico número de paradas, que indica la cantidad de lugares que se
 * visitarán durante el recorrido.
 *
 * @author ADMIN
 */
public class RutaGastronomica extends ServicioTuristico {

    /** Cantidad de paradas que realiza la ruta gastronómica. */
    private int numeroDeParadas;

    /**
     * Constructor de la clase RutaGastronomica.
     * @param nombre nombre de la ruta gastronómica.
     * @param duracionHoras duración de la ruta en horas.
     * @param numeroDeParadas cantidad de paradas que contempla la ruta.
     */
    public RutaGastronomica(String nombre,
                            int duracionHoras,
                            int numeroDeParadas) {

        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    /**
     * Muestra la información de la ruta gastronómica.
     */
    @Override
    public void mostrarInformacion() {

        System.out.println(toString());

    }

    /**
     * Devuelve una representación en texto de la ruta gastronómica,
     * incluyendo la información heredada y el número de paradas.
     * @return información completa de la ruta gastronómica.
     */
    @Override
    public String toString() {

        return super.toString()
                + "\nNúmero de paradas: " + numeroDeParadas;

    }
}