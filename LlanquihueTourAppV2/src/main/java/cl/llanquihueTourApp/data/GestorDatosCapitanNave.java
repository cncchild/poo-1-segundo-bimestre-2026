/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourApp.data;

import cl.llanquihueTourApp.model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase encargada de cargar los capitaneNaves
 * almacenados en el archivo capitanNaves.txt.
 *
 * Permite leer los registros del archivo,
 * crear objetos de tipo capitanes y
 * almacenarlos en una colección ArrayList.
 */
public class GestorDatosCapitanNave {
       /**
     * Carga todos los caitanes de nave desde
     * el archivo capitanNaves.txt.
     *
     * @return lista de capitanes cargados
     * desde el archivo
     */
    public ArrayList<CapitanNave> cargarCapitanNaves() {

        ArrayList<CapitanNave> listaCapitanes = new ArrayList<>();
        java.io.File archivo = new java.io.File("resources/capitanNaves.txt");

        System.out.println(archivo.getAbsolutePath());
        System.out.println("Existe: " + archivo.exists());
            try (BufferedReader lector =
                new BufferedReader(
                                new FileReader("resources/capitanNaves.txt"))) {

                String linea;

                while ((linea = lector.readLine()) != null) {

                    if (linea.trim().isEmpty()) {
                          continue;
                      }

                  System.out.println("Línea: " + linea);

                String[] datos = linea.split(";");

                System.out.println("Columnas: " + datos.length);

                if (datos.length == 10) {

                    int id =
                            Integer.parseInt(datos[0]);

                    String nombre = datos[1];
                    String telefono = datos[2];
                    String correo = datos[3];

                    String calle = datos[4];
                    String ciudad = datos[5];
                    String region = datos[6];

                    String rutTexto = datos[7];

                    Direccion direccion =
                            new Direccion(
                                    calle,
                                    ciudad,
                                    region
                            );

                    Rut rut =
                            new Rut(rutTexto);
                    String licenciaNautica = datos[8];
                    String categoriaEmbarcacion = datos[9];
                    CapitanNave capitan =
                            new CapitanNave(
                                    id,
                                    nombre,
                                    telefono,
                                    correo,
                                    direccion,
                                    rut,
                                    licenciaNautica,
                                    categoriaEmbarcacion
                        );

                        listaCapitanes.add(capitan);
                }
            }

        } catch (IOException 
                
                |  NumberFormatException e) {
            

            System.out.println(
                    "Error al cargar capitanes de nave.txt: "
                    + e.getMessage());
        }

        return listaCapitanes;
    }
        /**
     * Busca un capitan utilizando
     * su identificador.
     *
     * @param id identificador
     * del capitan a buscar
     * @return objeto capitan encontrado
     * o null si no existe
     */
    public CapitanNave buscarPorId(int id) {

        ArrayList<CapitanNave> lista =
                cargarCapitanNaves();

        for (CapitanNave capitan : lista) {

            if (capitan.getId() == id) {
                return capitan;
            }
        }

        return null;
    }
}
