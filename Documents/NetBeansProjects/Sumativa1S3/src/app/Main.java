/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import model.Persona;
import model.Direccion;
import model.Rut;

public class Main {

    public static void main(String[] args) {

        try {

            Direccion direccion = new Direccion(
                    "Av. Costanera 123",
                    "Llanquihue",
                    "Los Lagos");
            
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

            System.out.println(persona);

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}