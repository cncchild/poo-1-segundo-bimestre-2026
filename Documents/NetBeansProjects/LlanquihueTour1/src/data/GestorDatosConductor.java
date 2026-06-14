/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.Conductor;
import model.Direccion;
import model.Rut;

/**
 *
 * @author ADMIN
 */
public class GestorDatosConductor {
        public ArrayList<Conductor> cargarConductor() {
        
        ArrayList<Conductor> listaConductor = new ArrayList<>();

        try (BufferedReader lector =
                new BufferedReader(
                        new FileReader("Resources/conductor.txt"))) {

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 8) {

                    int idConductor =
                            Integer.parseInt(datos[0]);

                    String nombre = datos[1];
                    String telefono = datos[2];
                    String correo = datos[3];

                    String calle = datos[4];
                    String numero = datos[5];
                    String comuna = datos[6];

                    String rutTexto = datos[7];

                    Direccion direccion =
                            new Direccion(
                                    calle,
                                    numero,
                                    comuna
                            );

                    Rut rut =
                            new Rut(rutTexto);

                    Conductor conductor=
                            new Conductor(
                                    nombre,
                                    telefono,
                                    correo,
                                    direccion,
                                    rut,
                                    idConductor
                            );

                    listaConductor.add(conductor);
                }
            }

        } catch (IOException |
                 NumberFormatException e) {

            System.out.println(
                    "Error al leer archivo: "
                    + e.getMessage());
        }

        return listaConductor;
    }
    public Conductor buscarPorId(int idConductor) {
    ArrayList<Conductor> lista = cargarConductor();

    for (Conductor conductor : lista) {
        if (conductor.getIdConductor() == idConductor) {
            return conductor;
        }
    }

    return null;

}
}
