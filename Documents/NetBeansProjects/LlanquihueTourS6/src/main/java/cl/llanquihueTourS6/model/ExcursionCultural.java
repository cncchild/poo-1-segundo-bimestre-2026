/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourS6.model;

/**
 * Representa una excursión cultural ofrecida por la agencia Llanquihue Tour.
 * Esta clase hereda de {@code ServicioTuristico} e incorpora el atributo
 * específico lugar histórico, que indica el destino patrimonial o cultural
 * visitado durante la excursión.
 *
 * @author ADMIN
 */
public class ExcursionCultural extends ServicioTuristico {

    /** Lugar histórico o cultural que se visita en la excursión. */
    private String lugarHistorico;

    /**
     * Constructor de la clase ExcursionCultural.
     *
     * @param nombre nombre de la excursión cultural.
     * @param duracionHoras duración de la excursión en horas.
     * @param lugarHistorico lugar histórico visitado.
     */
    public ExcursionCultural(String nombre,
                             int duracionHoras,
                             String lugarHistorico) {

        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    /**
     * Devuelve una representación en texto de la excursión cultural,
     * incluyendo la información heredada y el lugar histórico visitado.
     *
     * @return información completa de la excursión cultural.
     */
    @Override
    public String toString() {

        return super.toString() +
               "\nLugar histórico: " + lugarHistorico;
    }
}