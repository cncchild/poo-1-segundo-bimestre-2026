/*

* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
  */
  package data;

import model.Tour;
import model.Guia;

import model.Transporte;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**

* Clase encargada de gestionar la lectura de datos
* desde archivos externos.
*
* En este caso, permite cargar los tours almacenados
* en el archivo tours.txt y convertir cada línea en
* un objeto de tipo Tour.
*
* Los objetos creados son almacenados en una colección
* ArrayList para posteriormente ser utilizados por la
* aplicación.
*
* @author ADMIN
  */
  public class GestorDatosTour {

  /**

  * Lee el archivo tours.txt y carga todos los tours
  * en una colección ArrayList.
  *
  * Formato esperado:
  *
  * Nombre;Tipo;Precio
  *
  * Ejemplo:
  * Volcan Osorno;Aventura;45000
  *
  * @return lista de tours cargados desde el archivo
    */
    public ArrayList<Tour> cargarTours() {

    ArrayList<Tour> listaTours = new ArrayList<>(); 
    try {

        try (BufferedReader lector = new BufferedReader(
                new FileReader("Resources/tours.txt"))) {
            String linea;
            
            while ((linea = lector.readLine()) != null) {
                
                String[] datos = linea.split(";");
     if (datos.length == 6) {

    int idTour = Integer.parseInt(datos[0]);
    String nombre = datos[1];
    String descripcion = datos[2];
    double precio = Double.parseDouble(datos[3]);

    int idGuia = Integer.parseInt(datos[4]);
    int idTransporte = Integer.parseInt(datos[5]);

    GestorDatosGuia gestorGuia =
            new GestorDatosGuia();

    GestorDatosTransporte gestorTransporte =
            new GestorDatosTransporte();

    Guia guia =
            gestorGuia.buscarPorId(idGuia);

    Transporte transporte =
            gestorTransporte.buscarPorId(idTransporte);

    Tour tour = new Tour(
            idTour,
            nombre,
            descripcion,
            precio,
            guia,
            transporte
    );

    listaTours.add(tour);
}
            } 
        }
        
   
    } catch (IOException | NumberFormatException e) {

    System.out.println(
             "Error al leer archivo: "
             + e.getMessage());
   
    }

    return listaTours;

  }

}
