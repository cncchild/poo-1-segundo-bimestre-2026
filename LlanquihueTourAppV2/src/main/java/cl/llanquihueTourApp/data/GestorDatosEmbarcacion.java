/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourApp.data;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import cl.llanquihueTourApp.model.*;

/**
 * Clase encargada de cargar las embarcaciones
 * almacenados en el archivo embarcaciones.txt.
 *
 * Permite leer los registros del archivo,
 * crear objetos de tipo Embarcaciones y
 * almacenarlos en una colección ArrayList.
 *
 * @author ADMIN
 */
public class GestorDatosEmbarcacion {
     /**
     * Carga todos las embarcaciones desde
     * el archivo embarcaciones.txt.
     *
     * @return lista de embarcaciones cargados
     * desde el archivo
     */
    public ArrayList<Embarcacion> cargarEmbarcaciones() {

        ArrayList<Embarcacion> listaEmbarcacion =
                new ArrayList<>();

        try (BufferedReader lector =
                new BufferedReader(
                        new FileReader(
                                "resources/embarcaciones.txt"))) {

            String linea;

            while ((linea = lector.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue;
                }
                String[] datos = linea.split(";");

                if (datos.length == 7) {

                int id = Integer.parseInt(datos[0]);

                String matricula = datos[1];

                int capacidad = Integer.parseInt(datos[2]);

                String estado = datos[3];

                int idCapitan = Integer.parseInt(datos[4]);

                String tipo = datos[5];

                double eslora = Double.parseDouble(datos[6]);




                GestorDatosCapitanNave gestorDatosCapitanNave =
                        new GestorDatosCapitanNave();

                CapitanNave capitanNave =
                gestorDatosCapitanNave.buscarPorId(idCapitan);

                if (capitanNave != null) {
        
                Embarcacion embarcacion =
                new Embarcacion(
                id,
                matricula,
                capacidad,
                estado,
                capitanNave,
                tipo,
                eslora
                );

                listaEmbarcacion.add(embarcacion);
                    } else {
                       System.out.println(
                         "No se encontró la embarcacion con ID: "
                            + idCapitan);
               }
            }
         }

        } catch (IOException |
                 NumberFormatException e) {

            System.out.println(
                    "Error al leer archivo TXT de automoviles: "
                    + e.getMessage());
        }

        return listaEmbarcacion;
    }
    /**
     * Busca un automovil utilizando
     * su identificador.
     *
     * @param id identificador
     * la embarcacion a buscar
     * @return objeto embarcacion encontrado
     * o null si no existe
     */
    public Embarcacion buscarPorId(int id) {

        ArrayList<Embarcacion> lista =
                cargarEmbarcaciones();

        for (Embarcacion embarcacion : lista) {

            if (embarcacion.getId() == id) {
                return embarcacion;
            }
        }

        return null;
    }
}
