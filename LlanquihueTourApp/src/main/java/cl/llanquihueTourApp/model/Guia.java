/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourApp.model;

import cl.llanquihueTourApp.util.Validator;
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
public class Guia extends Persona{

/**
 * Especialidad del guía.
 */
private String especialidad;

/**
 * Idioma que habla el guía.
 */
private String idioma;

    /**
   * Constructor de la clase Guia.
    * @param id id del guía
   * @param nombre nombre del guía
   * @param telefono teléfono del guía
   * @param correo correo electrónico del guía
   * @param direccion dirección asociada al guía
   * @param rut rut asociado al guía
   * @param especialidad especialidad del guía
   * @param idioma del guía
   */
    public Guia(
            int id,
            String nombre,
            String telefono,
            String correo,
            Direccion direccion,
            Rut rut,
            String especialidad,
            String idioma) {

        super(id,
              nombre,
              telefono,
              correo,
              direccion,
              rut);

        setEspecialidad(especialidad);
        setIdioma(idioma);

    }

    /**
     * Obtiene la especialidad del guía.
     *
     * @return especialidad del guía
     */
    public String getEspecialidad(){
        return especialidad;
    }
    /**
     * Obtiene el idioma del guía.
     *
     * @return idioma del guía
     */
    public String getIdioma(){
        return idioma;
    }
  /**
 * Modifica la especialidad del guía.
 *
 * @param especialidad nueva especialidad del guía
 * @throws IllegalArgumentException si la especialidad es inválida
 */
      public void setEspecialidad(String especialidad){

      if (!Validator.noEsVacio(especialidad)){

               throw new IllegalArgumentException(
                       "La especialidad no puede estar vacía.");

           }else if (!Validator.longitudMinima(especialidad, 3)) {

               throw new IllegalArgumentException(
                       "La especialidad debe tener al menos 3 caracteres.");

           }else if (!Validator.soloLetras(especialidad)){

    throw new IllegalArgumentException(
            "La especialidad solo puede contener letras.");

}

           this.especialidad = especialidad.trim();
    }
 /**
 * Modifica el idioma del guía.
 *
 * @param idioma nuevo idioma del guía
 * @throws IllegalArgumentException si el idioma es inválido
 */
      public void setIdioma(String idioma){

      if (!Validator.noEsVacio(idioma)){

               throw new IllegalArgumentException(
                       "El idioma no puede estar vacío.");

           }else if (!Validator.longitudMinima(idioma, 3)) {

               throw new IllegalArgumentException(
                       "El idioma debe tener al menos 3 caracteres.");

           }else if (!Validator.soloLetras(idioma)){

    throw new IllegalArgumentException(
            "El idioma solo puede contener letras.");

}

           this.idioma = idioma.trim();
    }
    /**
     * Retorna la información completa del guía.
     *
     * @return datos del guía
     */
 @Override
public String mostrarResumen() {

    return "GUÍA TURÍSTICO"
             + "ID: " + getId() + "\n"
            + "Nombre: " + getNombre() + "\n"
            + "Telefono: " + getTelefono() + "\n"
            + "Correo: " + getCorreo() + "\n"
            + "Rut: " + getRut().getRut() + "\n"
            + "Dirección: " 
            + getDireccion().getCalle()
            + ", " 
            + getDireccion().getCiudad()
            + ", "
            + getDireccion().getRegion()
            + "\n"
            + "Especialidad: " + getEspecialidad()
            + "\nIdioma: " + getIdioma();

}
@Override
public String toString() {

    return super.toString()
           + "\nEspecialidad: " + getEspecialidad()
+ "\nIdioma: " + getIdioma();

}
   

}