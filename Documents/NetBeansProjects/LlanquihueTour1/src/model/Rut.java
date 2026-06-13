/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
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
     * @return RUT de la persona
     */
    public String getRut() {
        return rut;
    }
     /**
     * Modifica el RUT de la persona.
     * @param rut nuevo RUT
     * @throws IllegalArgumentException si el RUT es inválido
     */
 public void setRut(String rut) {
    if (rut == null || rut.trim().isEmpty()) {
        throw new IllegalArgumentException(
                "El rut no puede estar vacío.");
    }
    if (!rut.trim().matches("\\d{7,8}-[0-9Kk]")) {

        throw new IllegalArgumentException(
                "El formato del rut es inválido.");
    }
    this.rut = rut.trim();
}
     /**
     * Retorna la información de la persona en formato texto.
     * @return datos completos de la persona
     */
    @Override
    public String toString() {
       return rut;
    }
}
  

