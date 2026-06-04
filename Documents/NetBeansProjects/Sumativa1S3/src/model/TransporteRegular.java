/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import util.Validator;

/**
 * Representa un transporte regular dentro de la agencia de turismo.
 *
 * Este tipo de transporte funciona con horarios establecidos,
 * como salidas diarias o recorridos programados.
 *
 * Hereda de la clase Transporte, reutilizando sus atributos base
 * como patente y capacidad.
 *
 * @author ADMIN
 */
public class TransporteRegular extends Transporte {

    /**
     * Horario del transporte regular.
     */
    private String horario;

    /**
     * Constructor de TransporteRegular.
     *
     * @param patente patente del vehículo
     * @param capacidad capacidad del transporte
     * @param horario horario de funcionamiento
     */
    public TransporteRegular(String patente,
                             int capacidad,
                             String horario) {

        super(patente, capacidad);
        setHorario(horario);
    }

    /**
     * Obtiene el horario del transporte.
     *
     * @return horario del transporte
     */
    public String getHorario() {
        return horario;
    }

    /**
     * Modifica el horario del transporte.
     *
     * El horario no puede estar vacío y debe tener
     * una longitud mínima para ser válido.
     *
     * @param horario nuevo horario
     * @throws IllegalArgumentException si el horario es inválido
     */
   public void setHorario(String horario) {

    if (!Validator.longitudMinima(horario, 13)) {
        throw new IllegalArgumentException("El horario es demasiado corto.");
    }

    if (!Validator.validarHorario(horario)) {
        throw new IllegalArgumentException(
                "El horario debe tener formato HH:mm - HH:mm");
    }

    this.horario = horario.trim();
}
    /**
     * Retorna la información del transporte regular.
     *
     * @return datos del transporte regular
     */
    @Override
    public String toString() {

        return super.toString()
                + "\nHorario: " + horario;
    }
}