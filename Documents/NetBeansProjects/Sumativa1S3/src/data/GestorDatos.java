/*

* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
  */
  package data;

import model.Tour;

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
  public class GestorDatos {

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
                new FileReader("resources/tours.txt"))) {
            String linea;
            
            while ((linea = lector.readLine()) != null) {
                
                String[] datos = linea.split(";");
             if(datos.length == 3){
                String nombre = datos[0];
                String tipo = datos[1];
                double precio =
                        Double.parseDouble(datos[2]);
                
                Tour tour = new Tour(nombre, tipo, precio);
                
                listaTours.add(tour);
             }
            }  }
   
    } catch (IOException | NumberFormatException e) {

    System.out.println(
             "Error al leer archivo: "
             + e.getMessage());
   
    }

    return listaTours;

  }

}
