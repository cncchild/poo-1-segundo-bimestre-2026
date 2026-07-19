/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cl.llanquihueTourApp.ui;

/**
 * Clase principal de ejecución de la aplicación LlanquihueTour.
 *
 * Esta clase contiene el método {@code main()} que inicia la aplicación
 * gráfica utilizando la interfaz {@link FrmFront}.
 * La ejecución de la interfaz se realiza dentro del Event Dispatch Thread
 * (EDT) mediante {@link java.awt.EventQueue#invokeLater(Runnable)},
 * siguiendo las buenas prácticas de programación con Swing.
 *
 * @author Cris Contreras
 * @version 1.0
 */
public class Main {
    /**
     * Método principal que inicia la aplicación.
     *
     * Crea una instancia de la ventana principal {@link FrmFront},
     * centra la ventana en la pantalla y la hace visible para el usuario.
     *
     * @param args argumentos recibidos desde la línea de comandos
     */
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {

            FrmFront ventana = new FrmFront();

            ventana.setLocationRelativeTo(null);

            ventana.setVisible(true);

        });

    }

}