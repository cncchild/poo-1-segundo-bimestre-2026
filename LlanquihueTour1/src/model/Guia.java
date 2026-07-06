/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Representa a un guía turístico dentro del sistema.
 *
 * Guia hereda de Persona, por lo que obtiene
 * todos los atributos y comportamientos asociados
 * a una persona registrada.
 *
 * Esta relación corresponde a una herencia (IS-A),
 * ya que un Guía es una Persona.
 *
 * @author ADMIN
 */
public class Guia extends Persona {

    /**
     * Identificador único del guía.
     */
    private int idGuia;

    /**
     * Constructor de la clase Guia.
     *
     * @param nombre nombre del guía
     * @param telefono teléfono del guía
     * @param correo correo electrónico
     * @param direccion dirección asociada
     * @param rut rut asociado
     * @param idGuia identificador único del guía
     */
    public Guia(
            String nombre,
            String telefono,
            String correo,
            Direccion direccion,
            Rut rut,
            int idGuia) {

        super(
                nombre,
                telefono,
                correo,
                direccion,
                rut
        );

        setIdGuia(idGuia);
    }

    /**
     * Obtiene el identificador del guía.
     *
     * @return identificador del guía
     */
    public int getIdGuia() {
        return idGuia;
    }

    /**
     * Modifica el identificador del guía.
     *
     * @param idGuia nuevo identificador del guía
     * @throws IllegalArgumentException si el
     * identificador es menor o igual a cero
     */
    public void setIdGuia(int idGuia) {

        if (idGuia <= 0) {
            throw new IllegalArgumentException(
                    "El ID del guía debe ser mayor que cero.");
        }

        this.idGuia = idGuia;
    }

    /**
     * Retorna la información completa del guía.
     *
     * @return datos del guía
     */
    @Override
    public String toString() {

        return super.toString()
                + "\nID Guía: "
                + idGuia;
    }
}