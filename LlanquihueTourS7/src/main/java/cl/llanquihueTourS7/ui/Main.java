/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.llanquihueTourS7.ui;

import cl.llanquihueTourS7.data.GestorServicios;

/**
 * Clase principal del sistema Llanquihue Tour.
 *
 * Inicia la ejecución de la aplicación creando una instancia de
 * GestorServicios, que administra una colección de servicios turísticos
 * y muestra su información aplicando polimorfismo.
 *
 * @author ADMIN
 */
public class Main {

    /**
     * Método principal de la aplicación.
     *
     * Crea un objeto GestorServicios y muestra la información de los
     * servicios turísticos almacenados en una colección.
     *
     * @param args argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        GestorServicios gestor = new GestorServicios();

        gestor.mostrarServicios();

    }

}