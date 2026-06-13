/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.Cliente;
import model.Direccion;
import model.Rut;

/**
 * Clase encargada de cargar los clientes
 * almacenados en el archivo clientes.txt.
 *
 * @author ADMIN
 */
public class GestorDatosCliente {

    /**
     * Carga todos los clientes desde el archivo.
     *
     * @return lista de clientes
     */
    public ArrayList<Cliente> cargarClientes() {

        ArrayList<Cliente> listaClientes =
                new ArrayList<>();

        try (BufferedReader lector =
                new BufferedReader(
                        new FileReader(
                                "Resources/clientes.txt"))) {

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 8) {

                    int idCliente =
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

                    Cliente cliente =
                            new Cliente(
                                    nombre,
                                    telefono,
                                    correo,
                                    direccion,
                                    rut,
                                    idCliente
                            );

                    listaClientes.add(cliente);
                }
            }

        } catch (IOException |
                 NumberFormatException e) {

            System.out.println(
                    "Error al leer archivo: "
                    + e.getMessage());
        }

        return listaClientes;
    }
}