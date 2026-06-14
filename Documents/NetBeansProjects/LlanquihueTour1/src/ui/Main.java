/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;
import data.GestorDatosCliente;
import data.GestorDatosGuia;
import data.GestorDatosTour;
import data.GestorDatosTransporte;
import data.GestorDatosConductor;
import model.Cliente;
import model.Guia;
import model.Tour;
import model.Transporte;
import model.Conductor;
import java.util.ArrayList;

/**
 * Clase principal de la aplicación.
 *
 * Esta clase permite probar la carga de datos desde
 * los archivos de texto mediante los gestores de datos.
 *
 * Muestra por consola la información de:
 * - Guías turísticos.
 * - Transportes disponibles.
 * - Tours registrados.
 *
 * Utiliza colecciones ArrayList para almacenar los
 * objetos cargados desde los archivos externos.
 *
 * @author ADMIN
 */
public class Main {

    /**
     * Método principal de ejecución.
     *
     * Carga y muestra por consola los guías,
     * transportes y tours almacenados en los
     * archivos de texto del sistema.
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {

        // Ver todos los guías
        GestorDatosGuia gestorGuia =
                new GestorDatosGuia();

        ArrayList<Guia> listaGuias =
                gestorGuia.cargarGuias();

        System.out.println("=== GUÍAS ===");

        for (Guia guia : listaGuias) {

            System.out.println(guia);
            System.out.println("----------------");
        }
        // Ver todos los clientes
        GestorDatosCliente gestorCliente =
                new GestorDatosCliente();

        ArrayList<Cliente> listaClientes =
                gestorCliente.cargarClientes();

        System.out.println("=== CLIENTES ===");

        for (Cliente cliente : listaClientes) {

            System.out.println(cliente);
            System.out.println("----------------");
        }
        // Ver todos los transportes
        GestorDatosTransporte gestorTransporte =
                new GestorDatosTransporte();

        ArrayList<Transporte> listaTransportes =
                gestorTransporte.cargarTransportes();

        System.out.println("=== TRANSPORTES ===");

        for (Transporte transporte : listaTransportes) {

            System.out.println(transporte);
            System.out.println("----------------");
        }

        // Ver todos los tours
        GestorDatosTour gestorTour =
                new GestorDatosTour();

        ArrayList<Tour> listaTours =
                gestorTour.cargarTours();

        System.out.println("=== TOURS ===");

        for (Tour tour : listaTours) {

            System.out.println(tour);
            System.out.println("----------------");
        }
    }
}