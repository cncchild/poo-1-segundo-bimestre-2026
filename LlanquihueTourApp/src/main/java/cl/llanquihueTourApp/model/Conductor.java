/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourApp.model;
import cl.llanquihueTourApp.util.Validator;

/**
 * Representa a un conductor dentro del sistema.
 *
 * Conductor hereda de Persona, por lo que obtiene
 * todos los atributos y comportamientos asociados
 * a una persona registrada.
 *
 * Esta relación corresponde a una herencia (IS-A),
 * ya que un Conductor es una Persona.
 *
 * @author ADMIN
 */
public class Conductor extends Persona{

    /**
     * Licencia del conductor.
     */
   private String licencia;
   /**
     * Categoria de licencia del conductor.
     */
private String categoriaLicencia;

    /**
     * Constructor de la clase Conductor.
     * @param id id del conductor
     * @param nombre nombre del conductor
     * @param telefono teléfono del conductor
     * @param correo correo electrónico
     * @param direccion dirección asociada
     * @param rut rut asociado
     * @param licencia licencia del conductor
     * @param categoriaLicencia categoria licencia del conductor
     * 
     */
    public Conductor(
            int id,
            String nombre,
            String telefono,
            String correo,
            Direccion direccion,
            Rut rut,
            String licencia,
            String categoriaLicencia
    ) {

        super(
                id,
                nombre,
                telefono,
                correo,
                direccion,
                rut
        );

        setLicencia(licencia);
        setCategoriaLicencia(categoriaLicencia);
    }

    /**
     * Obtiene la licencia del conductor.
     *
     * @return licencia del conductor
     */
    public String getLicencia(){
        return licencia;
    }
        /**
     * Obtiene la categoria de la Licencia del conductor.
     *
     * @return categoria Licencia del conductor
     */
    public String getCategoriaLicencia(){
        return categoriaLicencia;
    }
    /**
    * Modifica la licencia del conductor.
    *
    * @param licencia nuevo licencia del conductor
    * @throws IllegalArgumentException si la licencia es inválida
    */
    public void setLicencia(String licencia) {

       if (!Validator.validarNumeroLicencia(licencia)) {

           throw new IllegalArgumentException(
                   "La licencia es inválida.");

       }

       this.licencia = licencia.trim();
   }
      
       /**
    * Modifica la categoriaLicencia del conductor.
    *
    * @param categoriaLicencia nuevo categoriaLicencia del conductor
    * @throws IllegalArgumentException si la licencia es inválida
    */
    public void setCategoriaLicencia(String categoriaLicencia) {

       if (!Validator.validarCategoriaLicencia(categoriaLicencia)) {

           throw new IllegalArgumentException(
                   "La categoría de la licencia es inválida."
           );

       }

       this.categoriaLicencia = categoriaLicencia.trim();
   }

    
        /**
     * Retorna la información completa del conductor.
     *
     * @return datos del conductor
     */
    @Override
    public String mostrarResumen(){

        return "CONDUCTOR"
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
                + "Numero Licencia: " + getLicencia() + "\n"
                + "Categoria de licencia: " + getCategoriaLicencia() + "\n";

    }
    @Override
    public String toString() {

        return super.toString()
      + "\nTipo de licencia: " + licencia
                + "\nCategoria de la Licencia: " + categoriaLicencia;

    }
}

