/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Guia extends Persona {

    private int idGuia;

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
    public int getIdGuia() {
        return idGuia;
    }
    public void setIdGuia(int idGuia) {

        if (idGuia <= 0) {
            throw new IllegalArgumentException(
                    "El ID del guía debe ser mayor que cero.");
        }

        this.idGuia = idGuia;
    }
    @Override
    public String toString() {

        return super.toString()
                + "\nID Guía: "
                + idGuia;
    }
}
