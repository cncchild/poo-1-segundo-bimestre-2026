/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



/**
 * Representa la dirección de una persona dentro del sistema.
 *
 * Esta clase almacena información relacionada con la ubicación
 * física de una persona, incluyendo calle, ciudad y región.
 *
 * Aplica encapsulamiento mediante atributos privados y utiliza
 * la clase Validator para validar los datos ingresados.
 *
 * La clase es utilizada mediante composición por otras entidades
 * del sistema, siguiendo el principio "has-a".
 *
 * @author ADMIN
 */
public final class Direccion {

    /**
     * Calle de la dirección.
     */
    private String calle;

    /**
     * Ciudad de la dirección.
     */
    private String ciudad;

    /**
     * Región de la dirección.
     */
    private String region;

    /**
     * Constructor de la clase Direccion.
     *
     * @param calle nombre de la calle
     * @param ciudad ciudad de residencia
     * @param region región de residencia
     * @throws IllegalArgumentException si alguno de los datos es inválido
     */
    public Direccion(String calle, String ciudad, String region) {

        setCalle(calle);
        setCiudad(ciudad);
        setRegion(region);

    }

    /**
     * Obtiene la calle de la dirección.
     *
     * @return calle registrada
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Obtiene la ciudad de la dirección.
     *
     * @return ciudad registrada
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Obtiene la región de la dirección.
     *
     * @return región registrada
     */
    public String getRegion() {
        return region;
    }

    /**
     * Modifica la calle de la dirección.
     *
     * @param calle nueva calle
     * @throws IllegalArgumentException si la calle es inválida
     */
 public void setCalle(String calle) {

    if (calle == null || calle.trim().isEmpty()) {

        throw new IllegalArgumentException(
                "La calle no puede estar vacío.");

    }

    if (calle.trim().length() < 3) {

        throw new IllegalArgumentException(
                "La calle debe tener al menos 3 caracteres.");

    }

    this.calle = calle.trim();
}

    /**
     * Modifica la ciudad de la dirección.
     *
     * @param ciudad nueva ciudad
     * @throws IllegalArgumentException si la ciudad es inválida
     */
public void setCiudad(String ciudad) {

    if (ciudad == null || ciudad.trim().isEmpty()) {

        throw new IllegalArgumentException(
                "La ciudad no puede estar vacío.");

    }

    if (ciudad.trim().length() < 3) {

        throw new IllegalArgumentException(
                "La region debe tener al menos 3 caracteres.");

    }

    this.ciudad = ciudad.trim();
}

    /**
     * Modifica la región de la dirección.
     *
     * @param region nueva región
     * @throws IllegalArgumentException si la región es inválida
     */
public void setRegion(String region) {

    if (region == null || region.trim().isEmpty()) {

        throw new IllegalArgumentException(
                "region no puede estar vacío.");

    }

    String reg = region.trim();

    if (reg.length() < 3 ) {

        throw new IllegalArgumentException(
                "Region debe tener entre 8 y 12 caracteres.");

    }

    this.region = reg;
}

    /**
     * Retorna la dirección en formato legible.
     *
     * @return dirección completa
     */
    @Override
    public String toString() {

        return calle + ", " + ciudad + ", " + region;

    }

}
