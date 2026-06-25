/*

* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
  */
package data;

import model.Tour;
import model.Guia;
import model.Conductor;
import model.Transporte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase encargada de cargar los tours
 * almacenados en el archivo tours.txt.
 *
 * Permite leer los registros del archivo,
 * crear objetos de tipo Tour y almacenarlos
 * en una colección ArrayList para su uso
 * dentro de la aplicación.
 *
 * @author ADMIN
 */
public class GestorDatosTour {

    /**
     * Colección utilizada para almacenar
     * los tours cargados en memoria.
     */
    private ArrayList<Tour> tours = new ArrayList<>();

    /**
     * Carga todos los tours desde el
     * archivo tours.txt.
     *
     * Cada registro contiene la información
     * básica del tour junto con los
     * identificadores del guía, transporte
     * y conductor asociados.
     *
     * @return lista de tours cargados
     * desde el archivo
     */
    public ArrayList<Tour> cargarTours() {

        ArrayList<Tour> listaTours = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(
                new FileReader("resources/tours.txt"))) {

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 7) {

                    int idTour = Integer.parseInt(datos[0]);
                    String nombre = datos[1];
                    String descripcion = datos[2];
                    double precio = Double.parseDouble(datos[3]);

                    int idGuia = Integer.parseInt(datos[4]);
                    int idTransporte = Integer.parseInt(datos[5]);
                    int idConductor = Integer.parseInt(datos[6]);

                    Guia guia =
                            new GestorDatosGuia().buscarPorId(idGuia);

                    Transporte transporte =
                            new GestorDatosTransporte().buscarPorId(idTransporte);

                    Conductor conductor =
                            new GestorDatosConductor().buscarPorId(idConductor);

                    Tour tour = new Tour(
                            idTour,
                            nombre,
                            descripcion,
                            precio,
                            guia,
                            transporte,
                            conductor
                    );

                    listaTours.add(tour);
                }
            }

            this.tours = listaTours;

        } catch (IOException | NumberFormatException e) {

            System.out.println(
                    "Error al leer archivo: "
                    + e.getMessage());
        }

        return listaTours;
    }

    /**
     * Busca un tour utilizando
     * su identificador.
     *
     * Si la colección de tours se
     * encuentra vacía, primero se
     * cargan los datos desde el archivo.
     *
     * @param idTour identificador
     * del tour a buscar
     * @return objeto Tour encontrado
     * o null si no existe
     */
    public Tour buscarPorId(int idTour) {

        if (tours.isEmpty()) {
            cargarTours();
        }

        for (Tour tour : tours) {

            if (tour.getIdTour() == idTour) {
                return tour;
            }
        }

        return null;
    }
}