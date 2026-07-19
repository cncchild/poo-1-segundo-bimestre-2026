/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourApp.model;
import cl.llanquihueTourApp.util.Validator;

/**
 * Representa a un capitán de nave dentro del sistema.
 *
 * CapitanNave hereda de Persona, por lo que obtiene
 * todos los atributos y comportamientos asociados
 * a una persona registrada.
 *
 * Esta relación corresponde a una herencia (IS-A),
 * ya que un Capitán de Nave es una Persona.
 *
 * @author ADMIN
 */
public class CapitanNave extends Persona {

    /**
     * Licencia náutica del capitán.
     */
    private String licenciaNautica;

    /**
     * Categoría de embarcación autorizada.
     */
    private String categoriaEmbarcacion;

    /**
     * Constructor de la clase CapitanNave.
     *
     * @param id id del capitán
     * @param nombre nombre del capitán
     * @param telefono teléfono del capitán
     * @param correo correo electrónico
     * @param direccion dirección asociada
     * @param rut rut asociado
     * @param licenciaNautica licencia náutica del capitán
     * @param categoriaEmbarcacion categoría de embarcación autorizada
     */
    public CapitanNave(
            int id,
            String nombre,
            String telefono,
            String correo,
            Direccion direccion,
            Rut rut,
            String licenciaNautica,
            String categoriaEmbarcacion) {

        super(
                id,
                nombre,
                telefono,
                correo,
                direccion,
                rut
        );

        setLicenciaNautica(licenciaNautica);
        setCategoriaEmbarcacion(categoriaEmbarcacion);

    }

    /**
     * Obtiene la licencia náutica.
     *
     * @return licencia náutica
     */
    public String getLicenciaNautica() {
        return licenciaNautica;
    }

    /**
     * Obtiene la categoría de embarcación.
     *
     * @return categoría de embarcación
     */
    public String getCategoriaEmbarcacion() {
        return categoriaEmbarcacion;
    }

    /**
     * Modifica la licencia náutica.
     *
     * @param licenciaNautica nueva licencia náutica
     * @throws IllegalArgumentException si la licencia es inválida
     */
    public void setLicenciaNautica(String licenciaNautica) {

        if (!Validator.noEsVacio(licenciaNautica)) {

            throw new IllegalArgumentException(
                    "La licencia náutica no puede estar vacía.");

        } else if (!Validator.longitudMinima(licenciaNautica, 3)) {

            throw new IllegalArgumentException(
                    "La licencia náutica debe tener al menos 3 caracteres.");

        }

        this.licenciaNautica = licenciaNautica.trim();
    }

    /**
     * Modifica la categoría de embarcación.
     *
     * @param categoriaEmbarcacion nueva categoría de embarcación
     * @throws IllegalArgumentException si la categoría es inválida
     */
    public void setCategoriaEmbarcacion(String categoriaEmbarcacion) {

        if (!Validator.noEsVacio(categoriaEmbarcacion)) {

            throw new IllegalArgumentException(
                    "La categoría de embarcación no puede estar vacía.");

        } else if (!Validator.longitudMinima(categoriaEmbarcacion, 3)) {

            throw new IllegalArgumentException(
                    "La categoría de embarcación debe tener al menos 3 caracteres.");

        }

        this.categoriaEmbarcacion = categoriaEmbarcacion.trim();
    }

    /**
     * Retorna un resumen del capitán.
     *
     * @return resumen del capitán
     */
    @Override
    public String mostrarResumen() {

        return "CAPITÁN DE NAVE\n"
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
            + "\nLicencia Náutica: " + getLicenciaNautica()
            + "\nCategoría Embarcación: " + getCategoriaEmbarcacion() + "\n";

    }

    /**
     * Retorna la información completa del capitán.
     *
     * @return datos del capitán
     */
    @Override
    public String toString() {

        return super.toString()
                + "\nLicencia Náutica: " + licenciaNautica
                + "\nCategoría Embarcación: " + categoriaEmbarcacion;

    }

}