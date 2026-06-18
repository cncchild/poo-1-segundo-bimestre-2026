/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTour.data;

import cl.llanquihueTour.model.Direccion;
import cl.llanquihueTour.model.Guia;
import cl.llanquihueTour.model.Rut;
import cl.llanquihueTour.util.Constants;

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

        try (BufferedReader lector =
                new BufferedReader(
                        new FileReader(Constants.ARCHIVO_GUIAS))) {

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 8) {

                    int idGuia =
                            Integer.parseInt(datos[0]);

                    String nombre = datos[1];
                    String telefono = datos[2];
                    String correo = datos[3];

                    String calle = datos[4];
                    String numero = datos[5];
                    String comuna = datos[6];

                    String rutTexto = datos[7];

                    Direccion direccion =
                            new Direccion(
                                    calle,
                                    numero,
                                    comuna
                            );

                    Rut rut =
                            new Rut(rutTexto);

                    Guia guia =
                            new Guia(
                                    nombre,
                                    telefono,
                                    correo,
                                    direccion,
                                    rut,
                                    idGuia
                            );

                    listaGuias.add(guia);
                }
            }

        } catch (IOException |
                 NumberFormatException e) {

            System.out.println(
                    "Error al leer archivo: "
                    + e.getMessage());
        }

        return listaGuias;
    }

    /**
     * Busca un guía utilizando
     * su identificador.
     *
     * @param idGuia identificador
     * del guía a buscar
     * @return objeto Guia encontrado
     * o null si no existe
     */
    public Guia buscarPorId(int idGuia) {

        ArrayList<Guia> lista =
                cargarGuias();

        for (Guia guia : lista) {

            if (guia.getIdGuia() == idGuia) {
                return guia;
            }
        }

        return null;
    }
}