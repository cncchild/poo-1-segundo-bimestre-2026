/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author ADMIN
 */
public class Conductor extends Persona{
     private int idConductor;

    public Conductor(
            String nombre,
            String telefono,
            String correo,
            Direccion direccion,
            Rut rut,
            int idConductor) {

        super(
                nombre,
                telefono,
                correo,
                direccion,
                rut
        );
        setIdConductor(idConductor);
    }
    public int getIdConductor() {
        return idConductor;
    }
    public void setIdConductor(int idConductor) {

        if (idConductor <= 0) {
            throw new IllegalArgumentException(
                    "El ID del Conductor debe ser mayor que cero.");
        }

        this.idConductor = idConductor;
    }
    @Override
    public String toString() {

        return super.toString()
                + "\nID Conductor: "
                + idConductor;
    }
}
