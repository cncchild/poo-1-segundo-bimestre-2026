/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 * Representa a un cliente dentro del sistema.
 *
 * Cliente hereda de Persona, por lo que obtiene
 * todos los atributos y comportamientos asociados
 * a una persona registrada.
 *
 * Esta relación corresponde a una herencia (IS-A),
 * ya que un Cliente es una Persona.
 *
 * @author ADMIN
 */
public class Cliente extends Persona {

    /**
     * Identificador único del cliente.
     */
    private int idCliente;

    /**
     * Constructor de la clase Cliente.
     *
     * @param nombre nombre del cliente
     * @param telefono teléfono del cliente
     * @param correo correo electrónico
     * @param direccion dirección asociada
     * @param rut rut asociado
     * @param idCliente identificador único del cliente
     */
    public Cliente(
            String nombre,
            String telefono,
            String correo,
            Direccion direccion,
            Rut rut,
            int idCliente) {

        super(
                nombre,
                telefono,
                correo,
                direccion,
                rut
        );

        setIdCliente(idCliente);
    }

    /**
     * Obtiene el identificador del cliente.
     *
     * @return identificador del cliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Modifica el identificador del cliente.
     *
     * @param idCliente nuevo identificador del cliente
     * @throws IllegalArgumentException si el identificador es negativo
     */
   public void setIdCliente(int idCliente) {

    if (idCliente <= 0) {

        throw new IllegalArgumentException(
                "El identificador del cliente debe ser mayor que cero.");

    }

    this.idCliente = idCliente;
}

    /**
     * Retorna la información completa del cliente.
     *
     * @return datos del cliente
     */
    @Override
    public String toString() {

        return super.toString()
                + "\nID Cliente: "
                + idCliente;

    }
}
