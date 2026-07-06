/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTour.model;
import cl.llanquihueTour.util.Validator;

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
     * Identificador único del conductor.
     */
    private int idConductor;

    /**
     * Constructor de la clase Conductor.
     *
     * @param nombre nombre del conductor
     * @param telefono teléfono del conductor
     * @param correo correo electrónico
     * @param direccion dirección asociada
     * @param rut rut asociado
     * @param idConductor identificador único
     * del conductor
     */
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

    /**
     * Obtiene el identificador del conductor.
     *
     * @return identificador del conductor
     */
    public int getIdConductor(){
        return idConductor;
    }

    /**
     * Modifica el identificador del conductor.
     *
     * @param idConductor nuevo identificador
     * del conductor
     * @throws IllegalArgumentException si el
     * identificador es menor o igual a cero
     */    
      public void setIdConductor(int idConductor){

     if (!Validator.validarId(idConductor)){

         throw new IllegalArgumentException(
                 "El identificador del Conductor debe ser mayor que cero.");
     }
        this.idConductor = idConductor;
    }

    /**
     * Retorna la información completa
     * del conductor.
     *
     * @return datos del conductor
     */
    @Override
    public String toString(){

        return super.toString()
                + "\nID Conductor: "
                + idConductor;
    }
}
