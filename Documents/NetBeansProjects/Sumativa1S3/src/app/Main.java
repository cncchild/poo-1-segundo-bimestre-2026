/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import model.Persona;
import model.Direccion;
import model.Rut;
import model.TourCultural;
import model.TourAventura;
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
            Persona persona = new Persona(
                    "Cristian",
                    "+56912345678",
                    "correo@gmail.com",
                    direccion,
                    rut
            );
            // =========================
            // TOURS (HERENCIA)
            // =========================
            TourCultural cultural = new TourCultural(
                    "Ruta Patrimonial",
                    25000,
                    "Museo Colonial Alemán"
            );
            TourAventura aventura = new TourAventura(
                    "Volcán Osorno",
                    45000,
                    "Trekking"
            );
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

            System.out.println("========== PERSONA ===========");
            System.out.println(persona);

            System.out.println("\n========== TOURS =============");
            System.out.println("\n========== Cultural ==========");
            System.out.println(cultural);
            System.out.println();
            System.out.println("\n========== Aventura ==========");
            System.out.println(aventura);

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