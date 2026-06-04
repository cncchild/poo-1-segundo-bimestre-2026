/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import util.Validator;

/**
 * Representa un tour turístico ofrecido por la agencia.
 *
 * Esta clase actúa como clase base para los distintos tipos
 * de tours que puede ofrecer el sistema, como tours culturales,
 * de aventura o personalizados.
 *
 * Contiene los atributos comunes que comparten todos los tours:
 * nombre y precio.
 *
 * Las clases hijas heredarán estos atributos y métodos mediante
 * el mecanismo de herencia de Java utilizando la palabra clave
 * extends.
 *
 * @author ADMIN
 */
public  class Tour {

    /**
     * Nombre del tour.
     */
    private String nombre;

    /**
     * Precio del tour.
     */
    private double precio;

    /**
     * Constructor de la clase Tour.
     *
     * @param nombre nombre del tour
     * @param precio precio del tour
     */
    public Tour(String nombre, double precio) {

        setNombre(nombre);
        setPrecio(precio);
    }
    /**
     * Obtiene el nombre del tour.
     *
     * @return nombre del tour
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del tour.
     *
     * @return precio del tour
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Modifica el nombre del tour.
     *
     * @param nombre nuevo nombre del tour
     * @throws IllegalArgumentException si el nombre es inválido
     */
    public void setNombre(String nombre) {

        if (!Validator.noEsVacio(nombre)) {

            throw new IllegalArgumentException(
                    "El nombre del tour no puede estar vacío.");

        } else if (!Validator.longitudMinima(nombre, 3)) {

            throw new IllegalArgumentException(
                    "El nombre del tour debe tener al menos 3 caracteres.");

        }

        this.nombre = nombre.trim();
    }

    /**
     * Modifica el precio del tour.
     *
     * @param precio nuevo precio del tour
     * @throws IllegalArgumentException si el precio es menor o igual a cero
     */
    public void setPrecio(double precio) {

        if (precio < 0) {

            throw new IllegalArgumentException(
                    "El precio debe ser mayor a cero.");

        }

        this.precio = precio;
    }

    /**
     * Retorna la información del tour en formato texto.
     *
     * @return datos del tour
     */
    @Override
    public String toString() {

        return "Tour: " + nombre
                + "\nPrecio: $" + precio;

    }
}