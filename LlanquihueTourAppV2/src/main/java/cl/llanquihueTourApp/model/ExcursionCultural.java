/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourApp.model;

import cl.llanquihueTourApp.util.Validator;

/**
 * Representa una excursión turística de carácter cultural.
 *
 * ExcursionCultural hereda de ServicioTuristico,
 * reutilizando los atributos generales del servicio
 * como nombre, descripción, duración, precio,
 * guía y transporte.
 *
 * La relación corresponde a una herencia (IS-A),
 * ya que una excursión cultural es un tipo
 * de servicio turístico.
 *
 * Utiliza transporte terrestre con conductor
 * y un guía especializado en patrimonio cultural.
 *
 * @author ADMIN
 */
public class ExcursionCultural extends ServicioTuristico {

    /**
     * Lugar cultural visitado durante la excursión.
     */
    private String lugarCultural;

    /**
     * Tipo de patrimonio visitado.
     *
     * Ejemplo:
     * Histórico, Natural, Arquitectónico.
     */
    private String tipoPatrimonio;

    /**
     * Indica si la entrada al lugar está incluida.
     */
    private boolean entradaIncluida;

    /**
     * Constructor de ExcursionCultural.
     *
     * @param id identificador del servicio
     * @param nombre nombre del servicio
     * @param descripcion descripción del servicio
     * @param duracion duración de la excursión
     * @param precio precio del servicio
     * @param guia guía responsable
     * @param transporte transporte utilizado
     * @param lugarCultural lugar visitado
     * @param tipoPatrimonio tipo de patrimonio
     * @param entradaIncluida indica si incluye entrada
     */
    public ExcursionCultural(
            int id,
            String nombre,
            String descripcion,
            String duracion,
            double precio,
            Guia guia,
            Transporte transporte,
            String lugarCultural,
            String tipoPatrimonio,
            boolean entradaIncluida) {


        super(
                id,
                nombre,
                descripcion,
                duracion,
                precio,
                guia,
                transporte
        );


        setLugarCultural(lugarCultural);
        setTipoPatrimonio(tipoPatrimonio);
        setEntradaIncluida(entradaIncluida);

    }

    /**
     * Obtiene el lugar cultural.
     *
     * @return lugar visitado
     */
    public String getLugarCultural() {

        return lugarCultural;
    }

    /**
     * Obtiene el tipo de patrimonio.
     *
     * @return tipo de patrimonio
     */
    public String getTipoPatrimonio() {

        return tipoPatrimonio;
    }

    /**
     * Obtiene si incluye entrada.
     *
     * @return true si incluye entrada
     */
    public boolean isEntradaIncluida() {

        return entradaIncluida;
    }

    /**
     * Modifica el lugar cultural.
     *
     * @param lugarCultural nuevo lugar cultural
     */
    public void setLugarCultural(String lugarCultural) {


        if (!Validator.noEsVacio(lugarCultural)) {

            throw new IllegalArgumentException(
                    "El lugar cultural no puede estar vacío.");

        } else if (!Validator.longitudMinima(lugarCultural, 3)) {

            throw new IllegalArgumentException(
                    "El lugar cultural debe tener al menos 3 caracteres.");

        }


        this.lugarCultural = lugarCultural.trim();

    }

    /**
     * Modifica el tipo de patrimonio.
     *
     * @param tipoPatrimonio nuevo tipo de patrimonio
     */
    public void setTipoPatrimonio(String tipoPatrimonio) {


        if (!Validator.noEsVacio(tipoPatrimonio)) {

            throw new IllegalArgumentException(
                    "El tipo de patrimonio no puede estar vacío.");

        } else if (!Validator.longitudMinima(tipoPatrimonio, 3)) {

            throw new IllegalArgumentException(
                    "El tipo de patrimonio debe tener al menos 3 caracteres.");

        }


        this.tipoPatrimonio = tipoPatrimonio.trim();

    }

    /**
     * Modifica si incluye entrada.
     *
     * @param entradaIncluida valor de entrada
     */
    public void setEntradaIncluida(boolean entradaIncluida) {

        this.entradaIncluida = entradaIncluida;

    }

    /**
     * Muestra un resumen de la excursión cultural.
     *
     * Método sobrescrito desde Registrable.
     *
     * @return resumen de la excursión
     */
    @Override
    public String mostrarResumen() {


        return "EXCURSIÓN CULTURAL"
                + "\nNombre: " + getNombre()
                + "\nLugar: " + lugarCultural
                + "\nPatrimonio: " + tipoPatrimonio
                + "\nEntrada incluida: "
                + (entradaIncluida ? "Sí" : "No")
                + "\nDuración: " + getDuracion()
                + "\nPrecio: $" + getPrecio()
                + "\nGuía: " + getGuia().getNombre()
                + "\nTransporte: "
                + getTransporte().getIdentificador();

    }

    /**
     * Retorna la información completa
     * de la excursión cultural.
     *
     * @return datos de la excursión
     */
    @Override
    public String toString() {


        return super.toString()
                + "\nLugar cultural: " + lugarCultural
                + "\nTipo patrimonio: " + tipoPatrimonio
                + "\nEntrada incluida: "
                + entradaIncluida;

    }

}