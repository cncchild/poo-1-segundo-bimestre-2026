/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTour.util;

/**
 * Clase utilitaria que centraliza las constantes
 * utilizadas por la aplicación.
 *
 * Contiene las rutas de los archivos de datos
 * utilizados para almacenar la información de
 * clientes, guías, conductores, transportes,
 * tours y reservas.
 *
 * El uso de constantes evita la duplicación
 * de valores literales y facilita el mantenimiento
 * del sistema.
 *
 * @author ADMIN
 */
public final class Constants {

    /**
     * Ruta del archivo de clientes.
     */
    public static final String ARCHIVO_CLIENTES =
            "src/main/resources/clientes.txt";

    /**
     * Ruta del archivo de guías.
     */
    public static final String ARCHIVO_GUIAS =
            "src/main/resources/guias.txt";

    /**
     * Ruta del archivo de conductores.
     */
    public static final String ARCHIVO_CONDUCTORES =
            "src/main/resources/conductor.txt";

    /**
     * Ruta del archivo de transportes.
     */
    public static final String ARCHIVO_TRANSPORTES =
            "src/main/resources/transportes.txt";

    /**
     * Ruta del archivo de tours.
     */
    public static final String ARCHIVO_TOURS =
            "src/main/resources/tours.txt";

    /**
     * Ruta del archivo de reservas.
     */
    public static final String ARCHIVO_RESERVAS =
            "src/main/resources/reservas.txt";

    /**
     * Constructor privado para evitar
     * la creación de instancias.
     */
    private Constants() {
    }
}