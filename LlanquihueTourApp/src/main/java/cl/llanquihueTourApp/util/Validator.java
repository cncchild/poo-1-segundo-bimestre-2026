/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihueTourApp.util;
import java.time.LocalDate;

/**
 * Clase utilitaria que contiene métodos estáticos para validar
 * los datos ingresados al sistema.
 *
 * Permite verificar nombres, RUT, teléfonos, correos electrónicos
 * y reglas generales de texto.
 *
 * Todos los métodos retornan true cuando la validación es correcta
 * y false cuando el dato no cumple las reglas establecidas.
 *
 * @author ADMIN
 */
public final class Validator {
    /**
    * Constructor privado para evitar la creación
    * de objetos de la clase Validator.
    */
   private Validator() {
   }
    /**
     * Verifica que un texto no sea nulo ni esté vacío.
     *
     * @param texto texto a validar
     * @return true si el texto contiene información válida
     */
    public static boolean noEsVacio(String texto) {

        return texto != null
                && !texto.trim().isEmpty();

    }

    /**
     * Verifica que un texto contenga únicamente letras y espacios.
     *
     * @param texto texto a validar
     * @return true si contiene solo letras y espacios
     */
    public static boolean soloLetras(String texto) {

        return texto != null
                && texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");

    }
    

    /**
     * Verifica que un texto tenga una longitud mínima.
     *
     * @param texto texto a validar
     * @param minimo cantidad mínima de caracteres requerida
     * @return true si cumple la longitud mínima
     */
    public static boolean longitudMinima(String texto, int minimo) {

        return texto != null
                && texto.trim().length() >= minimo;

    }

    /**
     * Valida el formato de un RUT chileno.
     *
     * Formato esperado:
     * XXXXXXX-X o XXXXXXXX-X
     *
     * @param rut RUT a validar
     * @return true si el formato es válido
     */
    public static boolean validarRut(String rut) {

        return noEsVacio(rut)
                && rut.matches("[0-9]{7,8}-[0-9kK]");

    }

    /**
     * Valida el nombre de una persona.
     *
     * Debe contener solo letras, no estar vacío
     * y tener al menos 3 caracteres.
     *
     * @param nombre nombre a validar
     * @return true si el nombre es válido
     */
    public static boolean validarNombre(String nombre) {

        return noEsVacio(nombre)
                && soloLetras(nombre)
                && longitudMinima(nombre, 3);

    }

    /**
     * Valida un número telefónico.
     *
     * Permite números y el signo + con una longitud
     * entre 8 y 12 caracteres.
     *
     * @param telefono teléfono a validar
     * @return true si el teléfono es válido
     */
    public static boolean validarTelefono(String telefono) {

        return noEsVacio(telefono)
                && telefono.matches("[0-9+]{8,12}");

    }

    /**
     * Valida el formato de un correo electrónico.
     *
     * @param correo correo electrónico a validar
     * @return true si el correo tiene un formato válido
     */
    public static boolean validarCorreo(String correo) {

        return noEsVacio(correo)
                && correo.matches(
                        "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    }
    
    /**
     * Valida el formato de un horario.
     *
     * Formato esperado:
     * HH:mm - HH:mm
     *
     * @param horario horario a validar
     * @return true si el horario tiene un formato válido
     */
    public static boolean validarHorario(String horario) {

        return noEsVacio(horario)
                && horario.matches(
                        "^([01]\\d|2[0-3]):[0-5]\\d\\s-\\s([01]\\d|2[0-3]):[0-5]\\d$");

    }
    
    /**
    * Valida que un identificador sea mayor que cero.
    *
    * @param id identificador a validar
    * @return true si el identificador es válido
    */
   public static boolean validarId(int id) {

       return id > 0;

   }
   
   /**
    * Valida que una fecha no sea nula.
    *
    * @param fecha fecha a validar
    * @return true si la fecha es válida
    */
   public static boolean validarFecha(LocalDate fecha) {

       return fecha != null;

   }

    /**
     * Valida una capacidad.
     *
     * @param capacidad capacidad a validar
     * @return true si es mayor que cero
     */
    public static boolean validarCapacidad(int capacidad) {

        return capacidad > 0;

    }
    /**
    * Valida una licencia de conducir.
    *
    * @param licencia licencia a validar
    * @return true si la licencia es válida
    */
   public static boolean validarNumeroLicencia(String licencia) {

       return noEsVacio(licencia)
               && longitudMinima(licencia, 3);

   }

   /**
    * Valida la categoría de una licencia.
    *
    * Categorías permitidas:
    * A1, A2, A3, A4, A5, B, C, D, E y F.
    *
    * @param categoria categoría de licencia
    * @return true si la categoría es válida
    */
   public static boolean validarCategoriaLicencia(String categoria) {

       return noEsVacio(categoria)
               && categoria.trim().toUpperCase()
                       .matches("A[1-5]|B|C|D|E|F");

   }
}
