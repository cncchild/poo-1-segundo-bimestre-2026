/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourS6.data;

import cl.llanquihueTourS6.model.ExcursionCultural;
import cl.llanquihueTourS6.model.PaseoLacustre;
import cl.llanquihueTourS6.model.RutaGastronomica;
/**
 * Clase encargada de gestionar y crear instancias de servicios turísticos.
 * En esta clase se generan objetos de prueba de las distintas subclases
 * de {ServicioTuristico} para validar la jerarquía de herencia
 * implementada en el sistema.
 */
public class GestorServicios {
    /**
     * Crea y muestra en consola distintos servicios turísticos
     * utilizando las clases de la jerarquía de herencia.
     */
    public void mostrarServicios() {

        RutaGastronomica ruta1 = new RutaGastronomica("Ruta Cervecera", 4, 5);

        RutaGastronomica ruta2 = new RutaGastronomica("Ruta Sabores del Sur", 3, 4);

        PaseoLacustre paseo1 = new PaseoLacustre("Lago Llanquihue", 2, "Catamarán");

        PaseoLacustre paseo2 = new PaseoLacustre("Navegación Frutillar", 3, "Lancha");

        ExcursionCultural excursion1 = new ExcursionCultural("Museo Colonial", 2, "Puerto Varas");

        ExcursionCultural excursion2 = new ExcursionCultural("Iglesias Patrimoniales", 5, "Chiloé");

        System.out.println(ruta1);
        System.out.println();

        System.out.println(ruta2);
        System.out.println();

        System.out.println(paseo1);
        System.out.println();

        System.out.println(paseo2);
        System.out.println();

        System.out.println(excursion1);
        System.out.println();

        System.out.println(excursion2);
    }
}