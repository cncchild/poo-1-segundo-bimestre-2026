/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Representa un medio de transporte utilizado
 * para realizar los tours turísticos.
 *
 * Cada transporte posee un identificador único,
 * un tipo de vehículo y una capacidad máxima
 * de pasajeros.
 *
 * @author ADMIN
 */
public class Transporte {

    /**
     * Identificador único del transporte.
     */
    private int idTransporte;

    /**
     * Tipo de vehículo utilizado.
     */
    private String tipoVehiculo;

    /**
     * Capacidad máxima de pasajeros.
     */
    private int capacidad;

    /**
     * Constructor de la clase Transporte.
     *
     * @param idTransporte identificador único
     * del transporte
     * @param tipoVehiculo tipo de vehículo
     * utilizado
     * @param capacidad capacidad máxima
     * de pasajeros
     */
    public Transporte(
            int idTransporte,
            String tipoVehiculo,
            int capacidad) {

        setIdTransporte(idTransporte);
        setTipoVehiculo(tipoVehiculo);
        setCapacidad(capacidad);
    }

    /**
     * Obtiene el identificador del transporte.
     *
     * @return identificador del transporte
     */
    public int getIdTransporte() {
        return idTransporte;
    }

    /**
     * Modifica el identificador del transporte.
     *
     * @param idTransporte nuevo identificador
     * del transporte
     * @throws IllegalArgumentException si el
     * identificador es menor o igual a cero
     */
    public void setIdTransporte(int idTransporte) {

        if (idTransporte <= 0) {
            throw new IllegalArgumentException(
                    "ID inválido.");
        }

        this.idTransporte = idTransporte;
    }

    /**
     * Obtiene el tipo de vehículo.
     *
     * @return tipo de vehículo
     */
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    /**
     * Modifica el tipo de vehículo.
     *
     * @param tipoVehiculo nuevo tipo de vehículo
     * @throws IllegalArgumentException si el
     * valor es nulo o vacío
     */
    public void setTipoVehiculo(String tipoVehiculo) {

        if (tipoVehiculo == null
                || tipoVehiculo.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "El tipo de vehículo no puede estar vacío.");
        }

        this.tipoVehiculo = tipoVehiculo.trim();
    }

    /**
     * Obtiene la capacidad máxima de pasajeros.
     *
     * @return capacidad máxima
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Modifica la capacidad máxima de pasajeros.
     *
     * @param capacidad nueva capacidad
     * máxima de pasajeros
     * @throws IllegalArgumentException si la
     * capacidad es menor o igual a cero
     */
    public void setCapacidad(int capacidad) {

        if (capacidad <= 0) {

            throw new IllegalArgumentException(
                    "La capacidad debe ser mayor que cero.");
        }

        this.capacidad = capacidad;
    }

    /**
     * Retorna la información completa
     * del transporte.
     *
     * @return datos del transporte
     */
    @Override
    public String toString() {

        return "ID Transporte: " + idTransporte
                + "\nTipo Vehículo: " + tipoVehiculo
                + "\nCapacidad: " + capacidad;
    }
}