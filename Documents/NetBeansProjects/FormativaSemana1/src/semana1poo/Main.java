/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana1poo;

public class Main {

    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        // =========================
        // OBJETO 1
        // =========================

        EstudianteInstitucional estudiante1 =
                new EstudianteInstitucional(
                        "Cristian",
                        30,
                        "Diseño y Desarrollo Web",
                        true,
                        6.5
                );

        // =========================
        // OBJETO 2
        // =========================

        EstudianteInstitucional estudiante2 =
                new EstudianteInstitucional(
                        "Camila",
                        22,
                        "Enfermería",
                        true,
                        5.8
                );

        // =========================
        // MOSTRAR DATOS
        // =========================

        System.out.println(estudiante1);

        System.out.println("-------------------");

        System.out.println(estudiante2);

    }

}