/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Representa un transporte especial dentro del sistema de la agencia.
 *
 * Esta clase hereda de Transporte y agrega una característica adicional
 * relacionada con accesibilidad, indicando si el vehículo cuenta con
 * acceso universal para personas con movilidad reducida.
 *
 * Se utiliza herencia para reutilizar los atributos base:
 * - patente
 * - capacidad
 *
 * @author ADMIN
 */
public class TransporteEspecial extends Transporte {

    /**
     * Indica si el transporte cuenta con acceso universal.
     */
    private boolean accesoUniversal;

    /**
     * Constructor de TransporteEspecial.
     *
     * @param patente patente del vehículo
     * @param capacidad capacidad del transporte
     * @param accesoUniversal indica si tiene acceso universal
     */
    public TransporteEspecial(String patente,
                              int capacidad,
                              boolean accesoUniversal) {

        super(patente, capacidad);
        setAccesoUniversal(accesoUniversal);
    }

    /**
     * Obtiene si el transporte tiene acceso universal.
     *
     * @return true si tiene acceso universal, false si no
     */
    public boolean isAccesoUniversal() {
        return accesoUniversal;
    }

      /**
     * Modifica el estado de acceso universal del transporte.
     *
     * @param accesoUniversal indica si el transporte tiene acceso universal
     */
    public void setAccesoUniversal(boolean accesoUniversal) {

        this.accesoUniversal = accesoUniversal;
    }

    /**
     * Retorna la información completa del transporte especial.
     *
     * Se reutiliza la información de la clase padre mediante super.toString()
     * y se agrega la característica de accesibilidad.
     *
     * @return datos del transporte especial
     */
@Override
public String toString() {
    return super.toString()
            + "\nAcceso universal: "
            + (accesoUniversal ? "Sí" : "No");
}
}