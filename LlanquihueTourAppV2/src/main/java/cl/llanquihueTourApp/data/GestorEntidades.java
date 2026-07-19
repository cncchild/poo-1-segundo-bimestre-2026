/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourApp.data;

import cl.llanquihueTourApp.model.Registrable;
import cl.llanquihueTourApp.model.Persona;
import cl.llanquihueTourApp.model.Guia;
import cl.llanquihueTourApp.model.Conductor;
import cl.llanquihueTourApp.model.CapitanNave;
import cl.llanquihueTourApp.model.PaseoLacustre;
import cl.llanquihueTourApp.model.RutaGastronomica;
import cl.llanquihueTourApp.model.ExcursionCultural;

import java.util.ArrayList;
import java.io.*;

/**
 * Gestiona las entidades registrables del sistema
 * Llanquihue Tour.
 *
 * Utiliza una colección genérica ArrayList de tipo
 * Registrable, permitiendo almacenar objetos de
 * distintas clases mediante polimorfismo.
 *
 * Las entidades pueden ser diferenciadas durante
 * la ejecución utilizando instanceof.
 *
 * @author ADMIN
 */
public class GestorEntidades {

    /**
     * Colección polimórfica de entidades.
     */
    private ArrayList<Registrable> entidades;
    public void limpiarEntidades(){

    entidades.clear();

}
    /**
     * Constructor del gestor.
     *
     * Inicializa la colección de entidades.
     */
    public GestorEntidades() {

        entidades = new ArrayList<>();

    }
private Registrable ultimaEntidadAgregada;
    /**
     * Agrega una entidad al sistema.
     *
     * Puede recibir cualquier objeto que implemente
     * la interfaz Registrable.
     *
     * @param entidad objeto registrable
     */
    public void agregarEntidad(Registrable entidad) {


        if (entidad == null) {

            throw new IllegalArgumentException(
                    "La entidad no puede ser nula.");

        }
        entidades.add(entidad);
   ultimaEntidadAgregada = entidad;
    }

    /**
     * Obtiene todas las entidades registradas.
     *
     * @return lista de entidades
     */
    public ArrayList<Registrable> getEntidades() {
            return new ArrayList<>(entidades);

    }

    /**
     * Genera un nuevo identificador para las entidades
     * que heredan de Persona.
     *
     * Busca el ID mayor existente y suma 1.
     *
     * @return nuevo ID disponible
     */
    public int generarNuevoId(){

        int mayor = 0;

        for(Registrable entidad : entidades){

            if(entidad instanceof Persona persona){

                if(persona.getId() > mayor){
                    mayor = persona.getId();
                }

            }
        }

        return mayor + 1;
    }

    /**
     * Muestra el resumen de todas las entidades.
     *
     * Recorre la colección aplicando polimorfismo.
     */
    public String mostrarEntidades() {

        StringBuilder resultado = new StringBuilder();

        for (Registrable entidad : entidades) {

            resultado.append(entidad.mostrarResumen());

            resultado.append("\n--------------------\n");

        }

        return resultado.toString();

    }
    public void cargarDatos() {

        entidades.clear();

        GestorDatosGuia gestorGuia = new GestorDatosGuia();

        entidades.addAll(gestorGuia.cargarGuias()
        );
        // Cargar conductores
        GestorDatosConductor gestorConductor = new GestorDatosConductor();

        entidades.addAll(
                gestorConductor.cargarConductores()
        );
            // Cargar capitanes
        GestorDatosCapitanNave gestorCapitan = new GestorDatosCapitanNave();

        entidades.addAll(
                gestorCapitan.cargarCapitanNaves()
        );
           // Cargar automóviles
        GestorDatosAutomovil gestorAutomovil =
                new GestorDatosAutomovil();

        entidades.addAll(
                gestorAutomovil.cargarAutomoviles()
        );

        // Cargar embarcaciones
        GestorDatosEmbarcacion gestorEmbarcacion =
                new GestorDatosEmbarcacion();

        entidades.addAll(
              gestorEmbarcacion.cargarEmbarcaciones()
       );

    }
    public boolean guardarDatos() {

        if (ultimaEntidadAgregada == null) {

            return false;

        }


    try (PrintWriter escritor = new PrintWriter(
            new FileWriter("resources/guias.txt"))) {


        for (Registrable entidad : entidades) {


            if (entidad instanceof Guia guia) {


                escritor.println(
                    guia.getId() +";" +
                    guia.getNombre() + ";" +
                    guia.getTelefono() + ";" +
                    guia.getCorreo() + ";" +
                    guia.getDireccion().getCalle() + ";" +
                    guia.getDireccion().getCiudad() + ";" +
                    guia.getDireccion().getRegion() + ";" +
                    guia.getRut() + ";" +
                    guia.getEspecialidad() + ";" +
                    guia.getIdioma()
                );

            }

        }


        ultimaEntidadAgregada = null;

        return true;


        } catch (IOException e) {


            System.out.println(
                "Error al guardar datos: " + e.getMessage()
            );


            return false;

        }

    }
      /**
      * Elimina la última entidad agregada en memoria.
      * No modifica los archivos TXT.
      */
     public boolean eliminarUltimaEntidad() {

        if (ultimaEntidadAgregada != null 
                && entidades.contains(ultimaEntidadAgregada)) {

            entidades.remove(ultimaEntidadAgregada);

            ultimaEntidadAgregada = null;

            return true;

        }

        return false;

    }
    /**
     * Recorre las entidades identificando
     * su tipo mediante instanceof.
     *
     * Permite ejecutar una lógica diferente
     * según la clase del objeto.
     */
    public void mostrarTipoEntidad() {


        for (Registrable entidad : entidades) {


            if (entidad instanceof Guia) {


                System.out.println(
                        "Entidad tipo: Guía turístico");


            } else if (entidad instanceof Conductor) {


                System.out.println(
                        "Entidad tipo: Conductor");


            } else if (entidad instanceof CapitanNave) {


                System.out.println(
                        "Entidad tipo: Capitán de nave");


            } else if (entidad instanceof PaseoLacustre) {


                System.out.println(
                        "Entidad tipo: Paseo lacustre");


            } else if (entidad instanceof RutaGastronomica) {


                System.out.println(
                        "Entidad tipo: Ruta gastronómica");


            } else if (entidad instanceof ExcursionCultural) {


                System.out.println(
                        "Entidad tipo: Excursión cultural");

            }
        }
    }
    
}
