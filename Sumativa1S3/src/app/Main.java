/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import data.GestorDatos;
import java.util.ArrayList;
import model.Cliente;
import model.Direccion;
import model.Rut;
import model.Tour;

import model.TransporteRegular;
import model.TransporteEspecial;
import model.TransportePersonalizado;

/**
 * Clase principal del sistema de la Agencia de Turismo Llanquihue Tour.
 *
 * En esta clase se realizan pruebas de funcionamiento del sistema,
 * creando instancias de las principales entidades del dominio:
 *
 * - Persona (cliente)
 * - Dirección (composición)
 * - Rut (composición)
 * - Tours (herencia)
 * - Transportes (herencia)
 *
 * Se utiliza System.out.println para visualizar los datos
 * mediante el método toString() de cada clase.
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        try {

            // =========================
            // 📍 DIRECCIÓN, RUT Y PERSONA
            // =========================
            Direccion direccion = new Direccion(
                    "Av. Costanera 123",
                    "Llanquihue",
                    "Los Lagos"
            );
            Rut rut = new Rut(
                    "12345678-9"
            );
            Cliente cliente1 = new Cliente(
                    "Cristian",
                    "+56912345678",
                    "correo@gmail.com",
                    direccion,
                    rut,
                     1
            );
            // =========================
            // TOURS (HERENCIA)
            // =========================
    
            // =========================
            // TOURS DESDE ARCHIVO TXT
            // =========================
            // =========================
            // TOURS DESDE ARCHIVO TXT
            // =========================

            /*
             * Se crea una instancia de la clase GestorDatos,
             * encargada de leer la información almacenada
             * en el archivo tours.txt ubicado en la carpeta
             * Resources del proyecto.
             *
             * Cada línea del archivo representa un tour y
             * contiene sus datos separados por punto y coma (;).
             *
             * Los datos son convertidos en objetos Tour y
             * almacenados en una colección ArrayList para
             * facilitar su recorrido y filtrado.
             */            
            
            GestorDatos gestor = new GestorDatos();

            ArrayList<Tour> tours = gestor.cargarTours();
            // =========================
            // TRANSPORTES (HERENCIA)
            // =========================
            TransporteEspecial especial = new TransporteEspecial(
                    "DRLT65",
                    3,
                    true
            );
            TransporteRegular regular = new TransporteRegular(
                    "PPTT68",
                    4,
                    "08:00 - 18:00"
            );
            TransportePersonalizado personalizado = new TransportePersonalizado(
                    "CCTV60",
                    6,
                    "Ruta Ensenada, Puerto Varas, Los Lagos, canal de Chiloe"
            );
            // =========================
            // SALIDA
            // =========================

            System.out.println("========== CLIENTE===========");
            System.out.println(cliente1);

            // =========================
            // MOSTRAR TODOS LOS TOURS
            // =========================

            /*
             * Recorre la colección de tours utilizando
             * un ciclo for-each y muestra la información
             * completa de cada objeto Tour mediante
             * el método toString().
             */
            System.out.println("\n========== TODOS LOS TOURS ==========");

            for (Tour tour : tours) {

                System.out.println(tour);
                System.out.println("--------------------------------");

            }
        // =========================
        // FILTRAR TOURS
        // =========================
       /*
        * Muestra únicamente los tours cuyo precio
        * sea menor a $30.000.
        *
        * Se utiliza una estructura condicional
        * dentro del recorrido de la colección.
        */ 
       System.out.println("\n===== TOURS MENORES $30.000 =====");

        for (Tour tour : tours) {

            if (tour.getPrecio() < 30000) {

                System.out.println(tour);
                System.out.println("--------------------------------");

            }

        }
        /*
         * Muestra solamente los tours cuyo tipo
         * corresponde a "Aventura".
         *
         * Se utiliza equalsIgnoreCase() para
         * evitar problemas con mayúsculas y
         * minúsculas en la comparación.
         */
        System.out.println("\n===== TOURS DE AVENTURA =====");

        for (Tour tour : tours) {

            if (tour.getTipo().equalsIgnoreCase("Aventura")) {

                System.out.println(tour);
                System.out.println("--------------------------------");

            }

        }



            System.out.println("\n========== TRANSPORTES =======");
            System.out.println("\n========== Especial ==========");
            System.out.println(especial);
            System.out.println();
            System.out.println("\n========== Regular ==========");
            System.out.println(regular);
            System.out.println();
            System.out.println("\n========== Personalizado =====");
            System.out.println(personalizado);

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}