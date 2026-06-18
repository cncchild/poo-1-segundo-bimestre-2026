/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.llanquihueTour.ui;


import cl.llanquihueTour.data.GestorDatosCliente;
import cl.llanquihueTour.data.GestorDatosGuia;
import cl.llanquihueTour.data.GestorDatosTour;
import cl.llanquihueTour.data.GestorDatosTransporte;
import cl.llanquihueTour.data.GestorDatosReserva;

import cl.llanquihueTour.model.Reserva;
import cl.llanquihueTour.model.Cliente;
import cl.llanquihueTour.model.Guia;
import cl.llanquihueTour.model.Tour;
import cl.llanquihueTour.model.Transporte;

import java.util.ArrayList;

/**
 * Clase principal de la aplicación.
 *
 * Esta clase permite probar la carga de datos
 * desde los archivos de texto mediante los
 * distintos gestores de datos.
 *
 * Muestra por consola la información de:
 * - Guías turísticos.
 * - Clientes registrados.
 * - Transportes disponibles.
 * - Tours registrados.
 * - Reservas realizadas.
 *
 * Utiliza colecciones ArrayList para almacenar
 * los objetos cargados desde los archivos externos.
 *
 * @author ADMIN
 */
public class Main {

    /**
     * Método principal de ejecución.
     *
     * Carga y muestra por consola la información
     * almacenada en los distintos archivos de datos
     * del sistema.
     *
     * Permite verificar el correcto funcionamiento
     * de los gestores de datos y la creación de
     * los objetos del modelo.
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
           System.out.println("----------------");
        System.out.println("===LLANQUIHUE TOUR APP  ===");
System.out.println("===Bienvenido a nuestra guia virtual ===");
   System.out.println("----------------");
        // Ver todos los guías
        GestorDatosGuia gestorGuia =
                new GestorDatosGuia();

        ArrayList<Guia> listaGuias =
                gestorGuia.cargarGuias();

System.out.println("===NUESTROS SON GUÍAS  ===");
System.out.println("===Somos un equipo certificado  ===");


for (Guia guia : listaGuias) {

    System.out.println("Nombre: " + guia.getNombre());
    System.out.println("Número identificador: " + guia.getIdGuia());
    System.out.println("----------------");


}System.out.println("=== GUÍA DESTACADA ===");

for (Guia guia : listaGuias) {

    if (guia.getIdGuia() == 3) {

        System.out.println("Nombre: " + guia.getNombre());
        System.out.println("Teléfono: " + guia.getTelefono());
        System.out.println("Correo: " + guia.getCorreo());
        System.out.println("----------------");
    }
}

 

        // Ver todos los clientes
        GestorDatosCliente gestorCliente =
                new GestorDatosCliente();

        ArrayList<Cliente> listaClientes =
                gestorCliente.cargarClientes();
        

        System.out.println("=== CLIENTES FELICES  ===");

        for (Cliente cliente : listaClientes) {

         System.out.println("Nombre: " + cliente.getNombre());
    System.out.println("Correo Electronico: " + cliente.getCorreo());
    System.out.println("----------------");
        }

        // Ver todos los transportes
        GestorDatosTransporte gestorTransporte =
                new GestorDatosTransporte();

        ArrayList<Transporte> listaTransportes =
                gestorTransporte.cargarTransportes();

        System.out.println("=== LLANQUIHUE TOURS TE LLEVA A TODOS LOS RINCONES ===");

        for (Transporte transporte : listaTransportes) {

                     System.out.println("Nombre: " + transporte.getTipoVehiculo());
    System.out.println("Capacidad: " + transporte.getCapacidad());
            System.out.println("----------------");
        }

        // Ver todos los tours
        GestorDatosTour gestorTour =
                new GestorDatosTour();

        ArrayList<Tour> listaTours =
                gestorTour.cargarTours();

        System.out.println("===NUESTROS TOURS ===");

        for (Tour tour : listaTours) {

            System.out.println(tour);
            System.out.println("----------------");
        }

System.out.println("=== TOURS EN OFERTA (30.000 - 50.000) ===");

int contador = 0;

for (Tour tour : listaTours) {

    if (tour.getPrecio() >= 30000 && tour.getPrecio() <= 50000) {

        System.out.println("🔥 OFERTA:");
        System.out.println("Nombre: " + tour.getNombre());
        System.out.println("Precio: $" + tour.getPrecio());
        System.out.println("----------------");

        contador++;
    }
}

System.out.println("Total de tours en oferta: " + contador);
        System.out.println("================================");

        // Ver todas las reservas
        GestorDatosReserva gestorReserva =
                new GestorDatosReserva();

        ArrayList<Reserva> listaReservas =
                gestorReserva.cargarReservas();

        System.out.println("=== RESERVANDO EN ESTOS MOMENTOS ===");

        for (Reserva reserva : listaReservas) {

           System.out.println("ID Reserva: " + reserva.getIdReserva());
    System.out.println("Cliente: " + reserva.getCliente().getNombre());
    System.out.println("Tour: " + reserva.getTour().getNombre());
    System.out.println("Fecha: " + reserva.getFechaReserva());
    System.out.println("----------------");
        }
    }
}