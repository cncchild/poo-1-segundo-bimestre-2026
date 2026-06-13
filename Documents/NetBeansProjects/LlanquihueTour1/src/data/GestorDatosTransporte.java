/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import model.Transporte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase encargada de cargar los transportes
 * almacenados en el archivo transportes.txt.
 *
 * @author ADMIN
 */
public class GestorDatosTransporte {

    public ArrayList<Transporte> cargarTransportes() {

        ArrayList<Transporte> listaTransportes =
                new ArrayList<>();

        try (BufferedReader lector =
                new BufferedReader(
                        new FileReader(
                                "Resources/transportes.txt"))) {

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 3) {

                    int idTransporte =
                            Integer.parseInt(datos[0]);

                    String tipoVehiculo =
                            datos[1];

                    int capacidad =
                            Integer.parseInt(datos[2]);

                    Transporte transporte =
                            new Transporte(
                                    idTransporte,
                                    tipoVehiculo,
                                    capacidad
                            );

                    listaTransportes.add(transporte);
                }
            }

        } catch (IOException |
                 NumberFormatException e) {

            System.out.println(
                    "Error al leer archivo: "
                    + e.getMessage());
        }

        return listaTransportes;
    }

    /**
     * Busca un transporte por su ID.
     *
     * @param idTransporte ID a buscar
     * @return transporte encontrado o null
     */
    public Transporte buscarPorId(
            int idTransporte) {

        ArrayList<Transporte> lista =
                cargarTransportes();

        for (Transporte transporte : lista) {

            if (transporte.getIdTransporte()
                    == idTransporte) {

                return transporte;
            }
        }

        return null;
    }
}
