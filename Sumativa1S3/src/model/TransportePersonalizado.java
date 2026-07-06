/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import util.Validator;

/**
 * Representa un transporte personalizado dentro de la agencia.
 *
 * Esta clase hereda de Transporte y permite agregar
 * requerimientos específicos del cliente, como rutas especiales,
 * horarios personalizados o necesidades particulares.
 *
 * Se utiliza para servicios exclusivos o ajustados a la demanda
 * del cliente.
 *
 * @author ADMIN
 */
public class TransportePersonalizado extends Transporte {

    /**
     * Requerimiento especial solicitado por el cliente.
     */
    private String requerimientoCliente;

    /**
     * Constructor de TransportePersonalizado.
     *
     * @param patente patente del vehículo
     * @param capacidad capacidad del transporte
     * @param requerimientoCliente solicitud especial del cliente
     */
    public TransportePersonalizado(String patente,
                                  int capacidad,
                                  String requerimientoCliente) {

        super(patente, capacidad);
        setRequerimientoCliente(requerimientoCliente);
    }

    /**
     * Obtiene el requerimiento del cliente.
     *
     * @return requerimiento del cliente
     */
    public String getRequerimientoCliente() {
        return requerimientoCliente;
    }

    /**
     * Modifica el requerimiento del cliente.
     *
     * El requerimiento no puede estar vacío y debe tener una
     * longitud mínima para ser válido.
     *
     * @param requerimientoCliente nuevo requerimiento
     * @throws IllegalArgumentException si el dato es inválido
     */
    public void setRequerimientoCliente(String requerimientoCliente) {

        if (!Validator.noEsVacio(requerimientoCliente)) {
            throw new IllegalArgumentException(
                    "El requerimiento no puede estar vacío.");
        }

        if (!Validator.longitudMinima(requerimientoCliente, 5)) {
            throw new IllegalArgumentException(
                    "El requerimiento debe tener al menos 5 caracteres.");
        }

        this.requerimientoCliente = requerimientoCliente.trim();
    }

    /**
     * Retorna la información completa del transporte personalizado.
     *
     * @return datos del transporte personalizado
     */
    @Override
    public String toString() {

        return super.toString()
                + "\nRequerimiento: " + requerimientoCliente;
    }
}