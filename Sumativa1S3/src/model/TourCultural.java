/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import util.Validator;

/**
 * Representa un tour cultural ofrecido por la agencia.
 *
 * Esta clase hereda de la clase Tour mediante el uso
 * de la palabra clave extends.
 *
 * Un TourCultural posee todas las características
 * generales de un tour:
 * - nombre
 * - precio
 *
 * Además, agrega un atributo específico llamado
 * lugarCultural, que representa el museo, monumento,
 * centro cultural o sitio histórico que será visitado
 * durante el recorrido.
 *
 * Ejemplo:
 * - Museo Colonial Alemán
 * - Teatro del Lago
 * - Fuerte San Antonio
 * - Museo Pablo Fierro
 *
 * @author ADMIN
 */
public class TourCultural extends Tour {

    /**
     * Lugar cultural que será visitado durante el tour.
     */
    private String lugarCultural;

    /**
     * Constructor de la clase TourCultural.
     *
     * @param nombre nombre del tour
     * @param precio precio del tour
     * @param lugarCultural lugar cultural a visitar
     */
    public TourCultural(String nombre,
                        double precio,
                        String lugarCultural) {

        super(nombre, precio);
         setLugarCultural(lugarCultural);

    }

    /**
     * Obtiene el lugar cultural del tour.
     *
     * @return lugar cultural
     */
    public String getLugarCultural() {
        return lugarCultural;
    }

    /**
     * Modifica el lugar cultural del tour.
     *
     * @param lugarCultural nuevo lugar cultural
     */
  

     public void setLugarCultural(String lugarCultural) {

    if (!Validator.noEsVacio(lugarCultural)) {

        throw new IllegalArgumentException(
                "El lugar Cultural no puede estar vacío.");

    } else if (!Validator.soloLetras(lugarCultural)) {

        throw new IllegalArgumentException(
                "El lugar Cultural solo puede contener letras.");

    } else if (!Validator.longitudMinima(lugarCultural, 3)) {

        throw new IllegalArgumentException(
                "El lugar Cultural debe tener al menos 3 caracteres.");

    }

    this.lugarCultural = lugarCultural.trim();
}
    /**
     * Retorna la información completa del tour cultural.
     *
     * Se reutiliza la información heredada de la clase
     * Tour mediante super.toString() y luego se agrega
     * el lugar cultural.
     *
     * @return datos completos del tour cultural
     */
    @Override
    public String toString() {

        return super.toString()
                + "\nLugar cultural: " + lugarCultural;

    }
}
