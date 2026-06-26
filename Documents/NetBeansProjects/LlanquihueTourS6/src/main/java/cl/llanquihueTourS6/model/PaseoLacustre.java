/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourS6.model;

/**
 * Representa un paseo lacustre ofrecido por la agencia Llanquihue Tour.
 * <p>
 * Esta clase hereda de {@code ServicioTuristico} e incorpora el atributo
 * específico tipo de embarcación, que indica el medio de transporte
 * utilizado durante el recorrido por el lago.
 * </p>
 *
 * @author ADMIN
 */
public class PaseoLacustre extends ServicioTuristico {

    /** Tipo de embarcación utilizada en el paseo lacustre. */
    private String tipoEmbarcacion;

    /**
     * Constructor de la clase PaseoLacustre.
     *
     * @param nombre nombre del paseo lacustre.
     * @param duracionHoras duración del paseo en horas.
     * @param tipoEmbarcacion tipo de embarcación utilizada.
     */
    public PaseoLacustre(String nombre,
                         int duracionHoras,
                         String tipoEmbarcacion) {

        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    /**
     * Devuelve una representación en texto del paseo lacustre,
     * incluyendo la información heredada y el tipo de embarcación.
     *
     * @return información completa del paseo lacustre.
     */
    @Override
    public String toString() {

        return super.toString() +
               "\nTipo embarcación: " + tipoEmbarcacion;
    }
}