/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import util.Validator;

/**
 *
 * @author ADMIN
 */
public final class Rut {
        /**
     * RUT de la persona.
     */
    private String rut;

 
      /*
     * @param rut RUT de la persona
*/
       public Rut(String rut) {


        setRut(rut);

    }
          /**
     * Obtiene el RUT de la persona.
     *
     * @return RUT de la persona
     */
    public String getRut() {
        return rut;
    }
     /**
     * Modifica el RUT de la persona.
     *
     * @param rut nuevo RUT
     * @throws IllegalArgumentException si el RUT es inválido
     */
    public void setRut(String rut) {

    if (!Validator.noEsVacio(rut)) {

        throw new IllegalArgumentException(
                "El rut no puede estar vacío.");

    } else if (!Validator.validarRut(rut)) {

        throw new IllegalArgumentException(
                "El formato del rut es inválido.");

    }
    this.rut = rut.trim();
}
     /**
     * Retorna la información de la persona en formato texto.
     *
     * @return datos completos de la persona
     */
    @Override
    public String toString() {

       return rut;

    }
}
  

