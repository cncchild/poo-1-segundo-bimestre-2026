/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import util.Validator;

/**
 * Representa un medio de transporte utilizado por la agencia de turismo.
 *
 * Esta clase almacena información básica como la patente del vehículo
 * y su capacidad de pasajeros.
 *
 * Se aplica encapsulamiento mediante atributos privados,
 * validación de datos en setters y manejo de errores con
 * IllegalArgumentException.
 *
 * @author ADMIN
 */
public class Transporte {

    /**
     * Patente del vehículo.
     */
    private String patente;

    /**
     * Capacidad de pasajeros del transporte.
     */
    private int capacidad;

    /**
     * Constructor de la clase Transporte.
     *
     * @param patente patente del vehículo
     * @param capacidad capacidad de pasajeros
     */
    public Transporte(String patente, int capacidad) {

        setPatente(patente);
        setCapacidad(capacidad);
    }

    /**
     * Obtiene la patente del vehículo.
     *
     * @return patente del transporte
     */
    public String getPatente() {
        return patente;
    }

    /**
     * Obtiene la capacidad del vehículo.
     *
     * @return capacidad de pasajeros
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Modifica la patente del transporte.
     *
     * La patente no puede estar vacía y debe tener formato válido.
     *
     * @param patente nueva patente
     * @throws IllegalArgumentException si la patente es inválida
     */
    public void setPatente(String patente) {

        if (!Validator.noEsVacio(patente)) {
            throw new IllegalArgumentException(
                    "La patente no puede estar vacía.");
        }

        if (!Validator.longitudMinima(patente, 5)) {
            throw new IllegalArgumentException(
                    "La patente debe tener al menos 5 caracteres.");
        }

        this.patente = patente.trim();
    }

    /**
     * Modifica la capacidad del transporte.
     *
     * @param capacidad número de pasajeros
     * @throws IllegalArgumentException si la capacidad es menor o igual a 0
     */
    public void setCapacidad(int capacidad) {

        if (capacidad <= 0) {
            throw new IllegalArgumentException(
                    "La capacidad debe ser mayor a cero.");
        }

        if (capacidad > 10) {
            throw new IllegalArgumentException(
                    "La capacidad no puede superar 60 pasajeros.");
        }

        this.capacidad = capacidad;
    }

    /**
     * Retorna la información del transporte en formato texto.
     *
     * @return datos del transporte
     */
    @Override
    public String toString() {

        return "Patente: " + patente
                + "\nCapacidad: " + capacidad;
    }
}