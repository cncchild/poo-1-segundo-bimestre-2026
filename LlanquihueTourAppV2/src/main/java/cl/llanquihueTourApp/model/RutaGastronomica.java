/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourApp.model;

import cl.llanquihueTourApp.util.Validator;

/**
 * Representa un servicio turístico enfocado
 * en experiencias gastronómicas.
 *
 * RutaGastronomica hereda de ServicioTuristico,
 * reutilizando atributos comunes como nombre,
 * descripción, duración, precio, guía y transporte.
 *
 * La relación corresponde a una herencia (IS-A),
 * ya que una ruta gastronómica es un tipo
 * de servicio turístico.
 *
 * Utiliza un transporte terrestre como automóvil
 * turístico con conductor asignado.
 *
 * @author ADMIN
 */
public class RutaGastronomica extends ServicioTuristico {

    /**
     * Restaurante principal de la ruta.
     */
    private String restaurante;


    /**
     * Tipo de gastronomía ofrecida.
     *
     * Ejemplo:
     * Tradicional, Artesanal, Marina.
     */
    private String tipoGastronomia;

    /**
     * Cantidad de lugares visitados durante la ruta.
     */
    private int cantidadParadas;

    /**
     * Constructor de RutaGastronomica.
     *
     * @param id identificador del servicio
     * @param nombre nombre del servicio
     * @param descripcion descripción del servicio
     * @param duracion duración del recorrido
     * @param precio precio del servicio
     * @param guia guía turístico responsable
     * @param transporte automóvil utilizado
     * @param restaurante restaurante principal
     * @param tipoGastronomia tipo de gastronomía
     * @param cantidadParadas cantidad de paradas
     */
    public RutaGastronomica(
            int id,
            String nombre,
            String descripcion,
            String duracion,
            double precio,
            Guia guia,
            Transporte transporte,
            String restaurante,
            String tipoGastronomia,
            int cantidadParadas) {


        super(
                id,
                nombre,
                descripcion,
                duracion,
                precio,
                guia,
                transporte
        );


        setRestaurante(restaurante);
        setTipoGastronomia(tipoGastronomia);
        setCantidadParadas(cantidadParadas);

    }

    /**
     * Obtiene el restaurante.
     *
     * @return restaurante asociado
     */
    public String getRestaurante() {

        return restaurante;
    }

    /**
     * Obtiene el tipo de gastronomía.
     *
     * @return tipo de gastronomía
     */
    public String getTipoGastronomia() {

        return tipoGastronomia;
    }

    /**
     * Obtiene la cantidad de paradas.
     *
     * @return cantidad de paradas
     */
    public int getCantidadParadas() {

        return cantidadParadas;
    }
    
    /**
     * Modifica el restaurante.
     *
     * @param restaurante nuevo restaurante
     */
    public void setRestaurante(String restaurante) {


        if (!Validator.noEsVacio(restaurante)) {

            throw new IllegalArgumentException(
                    "El restaurante no puede estar vacío.");

        } else if (!Validator.longitudMinima(restaurante, 3)) {

            throw new IllegalArgumentException(
                    "El restaurante debe tener al menos 3 caracteres.");

        }

        this.restaurante = restaurante.trim();

    }

    /**
     * Modifica el tipo de gastronomía.
     *
     * @param tipoGastronomia nuevo tipo gastronómico
     */
    public void setTipoGastronomia(String tipoGastronomia) {


        if (!Validator.noEsVacio(tipoGastronomia)) {

            throw new IllegalArgumentException(
                    "El tipo de gastronomía no puede estar vacío.");

        } else if (!Validator.longitudMinima(tipoGastronomia, 3)) {

            throw new IllegalArgumentException(
                    "El tipo de gastronomía debe tener al menos 3 caracteres.");

        }
        this.tipoGastronomia = tipoGastronomia.trim();

    }

    /**
     * Modifica la cantidad de paradas.
     *
     * @param cantidadParadas cantidad de lugares visitados
     */
    public void setCantidadParadas(int cantidadParadas) {


        if (!Validator.validarCapacidad(cantidadParadas)) {

            throw new IllegalArgumentException(
                    "La cantidad de paradas debe ser mayor que cero.");

        }


        this.cantidadParadas = cantidadParadas;

    }

    /**
     * Muestra un resumen del servicio.
     *
     * Implementa el método definido en Registrable.
     *
     * @return resumen de la ruta gastronómica
     */
    @Override
    public String mostrarResumen() {


        return "RUTA GASTRONÓMICA\n"
                + "\nNombre: " + getNombre()
                + "\nRestaurante: " + restaurante
                + "\nGastronomía: " + tipoGastronomia
                + "\nParadas: " + cantidadParadas
                + "\nDuración: " + getDuracion()
                + "\nPrecio: $" + getPrecio()
                + "\nGuía: " + getGuia().getNombre()
                + "\nTransporte: "
                + getTransporte().getIdentificador();

    }

    /**
     * Retorna información completa del servicio.
     *
     * @return datos de la ruta gastronómica
     */
    @Override
    public String toString() {


        return super.toString()
                + "\nRestaurante: " + restaurante
                + "\nTipo gastronomía: " + tipoGastronomia
                + "\nCantidad de paradas: " + cantidadParadas;

    }

}
