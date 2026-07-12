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
import cl.llanquihueTourS7.model.Registrable;


/**
 * Clase encargada de gestionar los servicios turísticos de la agencia.
 * En esta clase se crea una colección de servicios turísticos utilizando
 * polimorfismo, almacenando objetos de distintas subclases en una misma lista.
 *
 * @author ADMIN
 */
public class GestorServicios {

    /** Lista que almacena los servicios turísticos. */
    private List<Registrable> registros;

    /**
     * Constructor de la clase GestorServicios.
     * Inicializa la colección y carga los servicios turísticos.
     */
    public GestorServicios() {

        registros = new ArrayList<>();

        registros.add(new RutaGastronomica("Ruta Cervecera", 4, 5));
        registros.add(new RutaGastronomica("Ruta Sabores del Sur", 3, 4));

        registros.add(new PaseoLacustre("Lago Llanquihue", 2, "Catamarán"));
        registros.add(new PaseoLacustre("Navegación Frutillar", 3, "Lancha"));

        registros.add(new ExcursionCultural("Museo Colonial", 2, "Puerto Varas"));
        registros.add(new ExcursionCultural("Iglesias Patrimoniales", 5, "Chiloé"));

    }

    /**
     * Recorre la colección de servicios turísticos y muestra la información
     * de cada uno aplicando polimorfismo.
     */
    public void mostrarServicios() {


   for (Registrable r : registros) {

    r.registrar();

    if (r instanceof RutaGastronomica) {

        System.out.println("Es una ruta gastronómica.");

    }

    if (r instanceof PaseoLacustre) {

        System.out.println("Es un paseo lacustre.");

    }

    if (r instanceof ExcursionCultural) {

        System.out.println("Es una excursión cultural.");

    }

}
    }
}