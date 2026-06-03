/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import util.Validator;

/**
 * Representa a una persona registrada en el sistema.
 *
 * Esta clase almacena la información básica de identificación
 * y contacto de una persona, incluyendo nombre, RUT,
 * teléfono y correo electrónico.
 *
 * Aplica encapsulamiento mediante atributos privados y
 * validación de datos a través de la clase Validator.
 *
 * @author ADMIN
 */
public final class Persona {

    /**
     * Nombre de la persona.
     */
    private String nombre;



    /**
     * Teléfono de contacto.
     */
    private String telefono;

    /**
     * Correo electrónico.
     */
    private String correo;
     /**
     * Composicion direccion
     */
    private Direccion direccion;
     /**
     * Composicion rut
     */
    private Rut rut;
/**
 * Constructor de la clase Persona.
 *
 * @param nombre nombre de la persona
 * @param telefono teléfono de contacto
 * @param correo correo electrónico
 * @param direccion dirección de la persona
 * @param rut rut de la persona
 * @throws IllegalArgumentException si algún dato es inválido
 */
    public Persona(String nombre,
            String telefono, String correo, Direccion direccion, Rut rut) {

        setNombre(nombre);
        setTelefono(telefono);
        setCorreo(correo);
        setDireccion(direccion);
        setRut(rut);


    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

 

    /**
     * Obtiene el teléfono de contacto.
     *
     * @return teléfono de la persona
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Obtiene el correo electrónico.
     *
     * @return correo electrónico de la persona
     */
    public String getCorreo() {
        return correo;
    }
    
    /**
 * Obtiene la dirección de la persona.
 *
 * @return dirección asociada a la persona
 */
public Direccion getDireccion() {
    return direccion;
}

    /**
 * Obtiene el rut de la persona.
 *
 * @return rut asociado a la persona
 */
public Rut getRut() {
    return rut;
}
    /**
     * Modifica el nombre de la persona.
     *
     * @param nombre nuevo nombre
     * @throws IllegalArgumentException si el nombre es inválido
     */
    public void setNombre(String nombre) {

          if (!Validator.noEsVacio(nombre)) {

        throw new IllegalArgumentException(
                "El nombre no puede estar vacío.");

    } else if (!Validator.soloLetras(nombre)) {

        throw new IllegalArgumentException(
                "El nombre solo puede contener letras.");

    } else if (!Validator.longitudMinima(nombre, 3)) {

        throw new IllegalArgumentException(
                "El nombre debe tener al menos 3 caracteres.");

    }
    this.nombre = nombre.trim();
    }
   
    /**
     * Modifica el teléfono de la persona.
     *
     * @param telefono nuevo teléfono
     * @throws IllegalArgumentException si el teléfono es inválido
     */
  public void setTelefono(String telefono) {

    if (!Validator.noEsVacio(telefono)) {

        throw new IllegalArgumentException(
                "El teléfono no puede estar vacío.");

    } else if (!Validator.validarTelefono(telefono)) {

        throw new IllegalArgumentException(
                "El teléfono debe contener entre 8 y 12 dígitos.");

    }

    this.telefono = telefono.trim();
}
    /**
     * Modifica el correo electrónico de la persona.
     *
     * @param correo nuevo correo electrónico
     * @throws IllegalArgumentException si el correo es inválido
     */
  public void setCorreo(String correo) {

    if (!Validator.noEsVacio(correo)) {

        throw new IllegalArgumentException(
                "El correo no puede estar vacío.");

    } else if (!Validator.validarCorreo(correo)) {

        throw new IllegalArgumentException(
                "El formato del correo es inválido.");

    }

    this.correo = correo.trim();
}
/**
 * Modifica la dirección de la persona.
 *
 * @param direccion nueva dirección
 * @throws IllegalArgumentException si la dirección es inválida
 */
    public void setDireccion(Direccion direccion) {

    if (direccion != null) {

        this.direccion = direccion;

    } else {

        throw new IllegalArgumentException(
                "La dirección no puede ser nula");

    }

}
/**
 * Modifica el rut de la persona.
 *
 * @param rut nuevo rut
 * @throws IllegalArgumentException si el rut es inválida
 */
    public void setRut(Rut rut) {

    if (rut != null) {

        this.rut = rut;

    } else {

        throw new IllegalArgumentException(
                "El rut no puede ser nulo");

    }

}
    /**
     * Retorna la información de la persona en formato texto.
     *
     * @return datos completos de la persona
     */
    @Override
    public String toString() {

        return "Nombre: " + nombre
                + "\nTeléfono: " + telefono
                + "\nCorreo: " + correo
                 + "\nDirección: " + direccion
                + "\nRut: " + rut; 

    }



}