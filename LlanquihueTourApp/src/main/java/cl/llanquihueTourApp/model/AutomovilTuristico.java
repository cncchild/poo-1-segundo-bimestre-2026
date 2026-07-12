/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourApp.model;
import cl.llanquihueTourApp.util.Validator;

/**
 * Representa un automóvil turístico utilizado
 * por la agencia Llanquihue Tour.
 *
 * AutomovilTuristico hereda de Transporte,
 * reutilizando sus atributos comunes y agregando
 * información específica de vehículos terrestres.
 *
 * La relación corresponde a una herencia (IS-A),
 * ya que un automóvil turístico es un tipo de transporte.
 *
 * @author ADMIN
 */
public class AutomovilTuristico extends Transporte {


    /**
     * Marca del automóvil.
     */
    private String marca;


    /**
     * Modelo del automóvil.
     */
    private String modelo;


    /**
     * Año de fabricación del automóvil.
     */
    private int anio;



    /**
     * Constructor de la clase AutomovilTuristico.
     *
     * @param id identificador del transporte
     * @param patente patente del vehículo
     * @param capacidad capacidad de pasajeros
     * @param estado estado del vehículo
     * @param responsable conductor asignado
     * @param marca marca del automóvil
     * @param modelo modelo del automóvil
     * @param anio año del automóvil
     */
    public AutomovilTuristico(
            int id,
            String patente,
            int capacidad,
            String estado,
            Persona responsable,
            String marca,
            String modelo,
            int anio) {


        super(
                id,
                patente,
                capacidad,
                estado,
                responsable
        );


        setMarca(marca);
        setModelo(modelo);
        setAnio(anio);

    }



    /**
     * Obtiene la marca del automóvil.
     *
     * @return marca del vehículo
     */
    public String getMarca() {
        return marca;
    }


    /**
     * Obtiene el modelo del automóvil.
     *
     * @return modelo del vehículo
     */
    public String getModelo() {
        return modelo;
    }


    /**
     * Obtiene el año del automóvil.
     *
     * @return año del vehículo
     */
    public int getAnio() {
        return anio;
    }



    /**
     * Modifica la marca del automóvil.
     *
     * @param marca nueva marca
     */
    public void setMarca(String marca) {


        if (!Validator.noEsVacio(marca)) {

            throw new IllegalArgumentException(
                    "La marca no puede estar vacía.");

        } else if (!Validator.longitudMinima(marca, 2)) {

            throw new IllegalArgumentException(
                    "La marca debe tener al menos 2 caracteres.");

        }


        this.marca = marca.trim();

    }



    /**
     * Modifica el modelo del automóvil.
     *
     * @param modelo nuevo modelo
     */
    public void setModelo(String modelo) {


        if (!Validator.noEsVacio(modelo)) {

            throw new IllegalArgumentException(
                    "El modelo no puede estar vacío.");

        } else if (!Validator.longitudMinima(modelo, 2)) {

            throw new IllegalArgumentException(
                    "El modelo debe tener al menos 2 caracteres.");

        }


        this.modelo = modelo.trim();

    }



    /**
     * Modifica el año del automóvil.
     *
     * @param anio nuevo año
     */
    public void setAnio(int anio) {


        if (anio < 2000) {

            throw new IllegalArgumentException(
                    "El año del vehículo no es válido.");

        }


        this.anio = anio;

    }



    /**
     * Muestra un resumen del automóvil.
     *
     * Método sobrescrito desde Registrable.
     *
     * @return resumen del automóvil
     */
    @Override
    public String mostrarResumen() {


        return "AUTOMÓVIL TURÍSTICO"
                + "\nPatente: " + getIdentificador()
                + "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nCapacidad: " + getCapacidad()
                + " pasajeros"
                + "\nConductor: "
                + getResponsable().getNombre();

    }



    /**
     * Retorna la información completa del automóvil.
     *
     * @return datos del automóvil
     */
    @Override
    public String toString() {


        return super.toString()
                + "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nAño: " + anio;

    }

}
