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
 * Permite leer los registros del archivo,
 * crear objetos de tipo Cliente y
 * almacenarlos en una colección ArrayList.
 *
 * @author ADMIN
 */
public class GestorDatosCliente {

    /**
     * Colección utilizada para almacenar
     * los clientes cargados en memoria.
     */
    private ArrayList<Cliente> clientes = new ArrayList<>();

    /**
     * Carga todos los clientes desde
     * el archivo clientes.txt.
     *
     * @return lista de clientes cargados
     * desde el archivo
     */
    public ArrayList<Cliente> cargarClientes() {

        ArrayList<Cliente> listaClientes = new ArrayList<>();

        try (BufferedReader lector =
                     new BufferedReader(
                             new FileReader("Resources/clientes.txt"))) {

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 8) {

                    int idCliente = Integer.parseInt(datos[0]);
                    String nombre = datos[1];
                    String telefono = datos[2];
                    String correo = datos[3];

                    String calle = datos[4];
                    String ciudad = datos[5];
                    String region = datos[6];

                    String rutTexto = datos[7];

                    Direccion direccion = new Direccion(
                            calle,
                            ciudad,
                            region
                    );

                    Rut rut = new Rut(rutTexto);

                    Cliente cliente = new Cliente(
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

            this.clientes = listaClientes;

        } catch (IOException | NumberFormatException e) {

            System.out.println(
                    "Error al leer archivo: "
                    + e.getMessage());
        }

        return listaClientes;
    }

    /**
     * Busca un cliente utilizando
     * su identificador.
     *
     * Si la colección de clientes se
     * encuentra vacía, primero se
     * cargan los datos desde el archivo.
     *
     * @param idCliente identificador
     * del cliente a buscar
     * @return objeto Cliente encontrado
     * o null si no existe
     */
    public Cliente buscarPorId(int idCliente) {

        if (clientes.isEmpty()) {
            cargarClientes();
        }

        for (Cliente cliente : clientes) {

            if (cliente.getIdCliente() == idCliente) {
                return cliente;
            }
        }

        return null;
    }
}