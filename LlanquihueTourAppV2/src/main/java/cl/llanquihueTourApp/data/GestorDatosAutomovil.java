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
 * Clase encargada de cargar los automoviles
 * almacenados en el archivo automoviles.txt.
 *
 * Permite leer los registros del archivo,
 * crear objetos de tipo automoviles y
 * almacenarlos en una colección ArrayList.
 *
 * @author ADMIN
 */
public class GestorDatosAutomovil {
     /**
     * Carga todos los automoviles desde
     * el archivo automoviles.txt.
     *
     * @return lista de automoviles cargados
     * desde el archivo
     */
    public ArrayList<Automovil> cargarAutomoviles() {

        ArrayList<Automovil> listaAutomovil =
                new ArrayList<>();

        try (BufferedReader lector =
            new BufferedReader(
                        new FileReader(
                                "resources/automoviles.txt"))) {

            String linea;

            while ((linea = lector.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue;
                }
                            String[] datos = linea.split(";");

                if (datos.length == 8) {

                    int id = Integer.parseInt(datos[0]);

                    String patente = datos[1];

                    int capacidad = Integer.parseInt(datos[2]);

                    String estado = datos[3];

                    int idConductor = Integer.parseInt(datos[4]);

                    String marca = datos[5];

                    String modelo = datos[6];

                    int anio = Integer.parseInt(datos[7]);




                GestorDatosConductor gestorConductor =
                        new GestorDatosConductor();

                Conductor conductor =
                        gestorConductor.buscarPorId(idConductor);
                           if (conductor != null) {
        
                Automovil automovil =
                 new Automovil(
                     id,
                     patente,
                     capacidad,
                     estado,
                     conductor,
                     marca,
                     modelo,
                     anio
                );

                 listaAutomovil.add(automovil);
                     } else {
                        System.out.println(
                 "No se encontró el conductor con ID: "
                 + idConductor);
                }
            }
         }

        } catch (IOException |
                 NumberFormatException e) {

            System.out.println(
                    "Error al leer archivo TXT de automoviles: "
                    + e.getMessage());
        }

        return listaAutomovil;
    }
    /**
     * Busca un automovil utilizando
     * su identificador.
     *
     * @param id identificador
     * del automovil a buscar
     * @return objeto automovil encontrado
     * o null si no existe
     */
    public Automovil buscarPorId(int id) {

        ArrayList<Automovil> lista =
                cargarAutomoviles();

        for (Automovil auto : lista) {

            if (auto.getId() == id) {
                return auto;
            }
        }

        return null;
    }
}

