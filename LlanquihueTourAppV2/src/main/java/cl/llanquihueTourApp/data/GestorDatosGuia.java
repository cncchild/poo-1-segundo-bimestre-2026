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
 * Clase encargada de cargar los guías
 * almacenados en el archivo guias.txt.
 *
 * Permite leer los registros del archivo,
 * crear objetos de tipo Guia y
 * almacenarlos en una colección ArrayList.
 *
 * @author ADMIN
 */
public class GestorDatosGuia {

    /**
     * Carga todos los guías desde
     * el archivo guias.txt.
     *
     * @return lista de guías cargados
     * desde el archivo
     */
    public ArrayList<Guia> cargarGuias() {

        ArrayList<Guia> listaGuias = new ArrayList<>();
        java.io.File archivo = new java.io.File("resources/guias.txt");

        System.out.println(archivo.getAbsolutePath());
        System.out.println("Existe: " + archivo.exists());
            try (BufferedReader lector =
                    new BufferedReader(
                            new FileReader("resources/guias.txt"))) {

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
                    String especialidad = datos[8];
                    String idioma = datos[9];
                    Guia guia =
                            new Guia(
                                    id,
                                    nombre,
                                    telefono,
                                    correo,
                                    direccion,
                                    rut,
                                    especialidad,
                                    idioma
                            );

                    listaGuias.add(guia);
                }
            }

        } catch (IOException 
                
                |  NumberFormatException e) {
            

            System.out.println(
                    "Error al cargar guias.txt: "
                    + e.getMessage());
        }

        return listaGuias;
    }

    /**
     * Busca un guía utilizando
     * su identificador.
     *
     * @param id identificador
     * del guía a buscar
     * @return objeto Guia encontrado
     * o null si no existe
     */
    public Guia buscarPorId(int id) {

        ArrayList<Guia> lista =
                cargarGuias();

        for (Guia guia : lista) {

            if (guia.getId() == id) {
                return guia;
            }
        }

        return null;
    }
}