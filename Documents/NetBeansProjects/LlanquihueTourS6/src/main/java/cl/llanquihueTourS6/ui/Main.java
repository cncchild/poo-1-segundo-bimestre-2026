/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cl.llanquihueTourS6.ui;

import cl.llanquihueTourS6.data.GestorServicios;

/**
 * Clase principal del sistema Llanquihue Tour.
 * <p>
 * Esta clase inicia la ejecución de la aplicación creando una instancia
 * de GestorServicios para generar y mostrar los servicios turísticos
 * implementados mediante herencia simple.
 * </p>
 *
 * @author ADMIN
 */
public class Main {

    /**
     * Método principal de la aplicación.
     * Crea un objeto GestorServicios y ejecuta el método que muestra
     * los servicios turísticos registrados.
     *
     * @param args argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        gestor.mostrarServicios();
    }
}