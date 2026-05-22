/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Clase que representa a un estudiante institucional
 */
package semana1poo;

public class EstudianteInstitucional {

    // ATRIBUTOS PRIVADOS

    // Nombre del estudiante
    private String nombre;
    // Edad del estudiante
    private int edad;
    // Carrera que estudia
    private String carrera;
    // Estado de matrícula (true = activa / false = inactiva)
    private boolean estadoMatricula;
    // Promedio del estudiante
    private double promedio;

    // CONSTRUCTOR VACÍO

    // Asigna valores por defecto
    public EstudianteInstitucional() {

        this.nombre = "Sin nombre";
        this.edad = 0;
        this.carrera = "Sin carrera";
        this.estadoMatricula = true;
        this.promedio = 0;

    }
    // CONSTRUCTOR CON PARÁMETROS

    // Inicializa todos los atributos
    public EstudianteInstitucional(
            String nombre,
            int edad,
            String carrera,
            boolean estadoMatricula,
            double promedio) {

        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.estadoMatricula = estadoMatricula;
        this.promedio = promedio;

    }
    // GETTERS

    // Obtener nombre
    public String getNombre() {
        return nombre;
    }

    // Obtener edad
    public int getEdad() {
        return edad;
    }

    // Obtener carrera
    public String getCarrera() {
        return carrera;
    }

    // Obtener estado de matrícula
    public boolean getEstadoMatricula() {
        return estadoMatricula;
    }

    // Obtener promedio
    public double getPromedio() {
        return promedio;
    }

    // SETTERS

    // Modificar nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Modificar edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Modificar carrera
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Modificar estado matrícula
    public void setEstadoMatricula(boolean estadoMatricula) {
        this.estadoMatricula = estadoMatricula;
    }

    // Modificar promedio
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // MÉTODO toString

    // Mostrar información del objeto
    @Override
    public String toString() {

        return "Nombre: " + nombre +
               "\nEdad: " + edad +
               "\nCarrera: " + carrera +
               "\nEstado matrícula: " + estadoMatricula +
               "\nPromedio: " + promedio;

    }

}
