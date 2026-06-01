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

        this.nombre = "nombre por defecto";
        this.edad = 0;
        this.carrera = "carrera por defecto";
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

        setNombre(nombre);
        setEdad(edad);
        setCarrera(carrera);
        setEstadoMatricula(estadoMatricula);
        setPromedio(promedio);

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

        if (nombre != null &&
            !nombre.trim().isEmpty() &&
            nombre.trim().length() >= 3) {

            this.nombre = nombre;

        } else {

            System.out.println("Error: el nombre no puede estar vacío y debe tener al menos 3 caracteres.");
        }
    }

    // Modificar edad
    public void setEdad(int edad) {

        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: la edad debe ser mayor a 0");
        }

    }

    // Modificar carrera
    public void setCarrera(String carrera) {

        if (carrera != null && !carrera.trim().isEmpty() &&
                carrera.trim().length() >= 3) {
            this.carrera = carrera;
        } else {
            System.out.println("Error: la carrera no puede estar vacía y debe tener al menos 3 caracteres");
        }

    }

    // Modificar estado matrícula
    public void setEstadoMatricula(boolean estadoMatricula) {
        this.estadoMatricula = estadoMatricula;
    }
    
    // Modificar promedio
    public void setPromedio(double promedio) {

        if (promedio >= 1.0 && promedio <= 7.0) {
            this.promedio = promedio;
        } else {
            System.out.println("Error: el promedio debe estar entre 1.0 y 7.0");
        }

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
