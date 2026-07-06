/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourS7.data;

import java.util.ArrayList;
import java.util.List;

import cl.llanquihueTourS7.model.ExcursionCultural;
import cl.llanquihueTourS7.model.PaseoLacustre;
import cl.llanquihueTourS7.model.RutaGastronomica;
import cl.llanquihueTourS7.model.ServicioTuristico;

/**
 * Clase encargada de gestionar los servicios turísticos de la agencia.
 * En esta clase se crea una colección de servicios turísticos utilizando
 * polimorfismo, almacenando objetos de distintas subclases en una misma lista.
 *
 * @author ADMIN
 */
public class GestorServicios {

    /** Lista que almacena los servicios turísticos. */
    private List<ServicioTuristico> servicios;

    /**
     * Constructor de la clase GestorServicios.
     * Inicializa la colección y carga los servicios turísticos.
     */
    public GestorServicios() {

        servicios = new ArrayList<>();

        servicios.add(new RutaGastronomica("Ruta Cervecera", 4, 5));
        servicios.add(new RutaGastronomica("Ruta Sabores del Sur", 3, 4));

        servicios.add(new PaseoLacustre("Lago Llanquihue", 2, "Catamarán"));
        servicios.add(new PaseoLacustre("Navegación Frutillar", 3, "Lancha"));

        servicios.add(new ExcursionCultural("Museo Colonial", 2, "Puerto Varas"));
        servicios.add(new ExcursionCultural("Iglesias Patrimoniales", 5, "Chiloé"));

    }

    /**
     * Recorre la colección de servicios turísticos y muestra la información
     * de cada uno aplicando polimorfismo.
     */
    public void mostrarServicios() {

        for (ServicioTuristico servicio : servicios) {

            servicio.mostrarInformacion();

            System.out.println("------------------------------");
        }
    }
}