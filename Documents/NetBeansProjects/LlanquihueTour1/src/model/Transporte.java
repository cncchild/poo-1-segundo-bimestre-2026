/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Transporte {

    private int idTransporte;
    private String tipoVehiculo;
    private int capacidad;

    public Transporte(
            int idTransporte,
            String tipoVehiculo,
            int capacidad) {

        setIdTransporte(idTransporte);
        setTipoVehiculo(tipoVehiculo);
        setCapacidad(capacidad);
    }

    public int getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(int idTransporte) {

        if (idTransporte <= 0) {
            throw new IllegalArgumentException(
                    "ID inválido.");
        }

        this.idTransporte = idTransporte;
    }
    
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
    public void setTipoVehiculo(String tipoVehiculo) {

        if (tipoVehiculo == null
                || tipoVehiculo.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "El tipo de vehículo no puede estar vacío.");
        }
        this.tipoVehiculo = tipoVehiculo.trim();
    }

    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {

        if (capacidad <= 0) {

            throw new IllegalArgumentException(
                    "La capacidad debe ser mayor que cero.");
        }

        this.capacidad = capacidad;
    }
    @Override
    public String toString() {

        return "ID Transporte: " + idTransporte
                + "\nTipo Vehículo: " + tipoVehiculo
                + "\nCapacidad: " + capacidad;
    }
}
