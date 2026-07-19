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
 * Clase encargada de cargar los conductores
 * almacenados en el archivo conductor.txt.
 *
 * Permite leer los registros del archivo,
 * crear objetos de tipo Conductor y
 * almacenarlos en una colección ArrayList.
 *
 * @author ADMIN
 */
public class GestorDatosConductor {

    /**
     * Carga todos los conductores desde
     * el archivo conductor.txt.
     *
     * @return lista de conductores cargados
     * desde el archivo
     */
    public ArrayList<Conductor> cargarConductores() {

        ArrayList<Conductor> listaConductor =
                new ArrayList<>();

        try (BufferedReader lector =
                new BufferedReader(
                        new FileReader(
                                "resources/conductores.txt"))) {

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(";");

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
                    String licencia = datos[8];

                    String categoriaLicencia = datos[9];
                    Conductor conductor =
                            new Conductor(
                                    id,
                                    nombre,
                                    telefono,
                                    correo,
                                    direccion,
                                    rut,
                                  licencia,
                                    categoriaLicencia
                            );

                    listaConductor.add(conductor);
                }
            }

        } catch (IOException |
                 NumberFormatException e) {

            System.out.println(
                    "Error al leer archivo TXT de conductores: "
                    + e.getMessage());
        }

        return listaConductor;
    }

    /**
     * Busca un conductor utilizando
     * su identificador.
     *
     * @param id identificador
     * del conductor a buscar
     * @return objeto Conductor encontrado
     * o null si no existe
     */
    public Conductor buscarPorId(int id) {

        ArrayList<Conductor> lista =
                cargarConductores();

        for (Conductor conductor : lista) {

            if (conductor.getId()
                    == id) {

                return conductor;
            }
        }

        return null;
    }
}