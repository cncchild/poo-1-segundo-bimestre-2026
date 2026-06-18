/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTour.data;

import java.time.LocalDate;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import cl.llanquihueTour.model.Cliente;
import cl.llanquihueTour.model.Reserva;
import cl.llanquihueTour.model.Tour;
import cl.llanquihueTour.util.Constants;

/**
 * Clase encargada de cargar las reservas
 * almacenadas en el archivo reservas.txt.
 *
 * Permite leer los registros del archivo,
 * crear objetos de tipo Reserva y
 * almacenarlos en una colección ArrayList.
 *
 * Cada reserva relaciona un cliente,
 * un tour y una fecha de reserva.
 *
 * @author ADMIN
 */
public class GestorDatosReserva {

    /**
     * Carga todas las reservas desde
     * el archivo reservas.txt.
     *
     * Utiliza los identificadores de
     * clientes y tours para recuperar
     * los objetos correspondientes
     * mediante sus gestores de datos.
     *
     * @return lista de reservas cargadas
     * desde el archivo
     */
    public ArrayList<Reserva> cargarReservas() {

        ArrayList<Reserva> listaReservas = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(
                new FileReader(Constants.ARCHIVO_RESERVAS))) {

            String linea;

            GestorDatosCliente gestorCliente =
                    new GestorDatosCliente();

            GestorDatosTour gestorTour =
                    new GestorDatosTour();

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 4) {

                    int idReserva =
                            Integer.parseInt(datos[0]);

                    int idCliente =
                            Integer.parseInt(datos[1]);

                    int idTour =
                            Integer.parseInt(datos[2]);

                    LocalDate fechaReserva =
                            LocalDate.parse(datos[3]);

                    Cliente cliente =
                            gestorCliente.buscarPorId(idCliente);

                    Tour tour =
                            gestorTour.buscarPorId(idTour);

                    if (cliente != null && tour != null) {

                        Reserva reserva =
                                new Reserva(
                                        idReserva,
                                        cliente,
                                        tour,
                                        fechaReserva
                                );

                        listaReservas.add(reserva);
                    }
                }
            }

        } catch (IOException |
                 NumberFormatException e) {

            System.out.println(
                    "Error al leer archivo: "
                    + e.getMessage());
        }

        return listaReservas;
    }

    /**
     * Busca una reserva utilizando
     * su identificador.
     *
     * @param idReserva identificador
     * de la reserva a buscar
     * @return objeto Reserva encontrado
     * o null si no existe
     */
    public Reserva buscarPorId(int idReserva) {

        ArrayList<Reserva> reservas =
                cargarReservas();

        for (Reserva reserva : reservas) {

            if (reserva.getIdReserva() == idReserva) {
                return reserva;
            }
        }

        return null;
    }
}
