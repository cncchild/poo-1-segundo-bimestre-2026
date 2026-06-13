package model;
/**
 * Representa un tour turístico.
 *
 * Un tour posee información básica como nombre,
 * descripción y precio, además de estar asociado
 * a un guía y un transporte.
 *
 * @author ADMIN
 */
public class Tour {

    private int idTour;
    private String nombre;
    private String descripcion;
    private double precio;
    private Guia guia;
    private Transporte transporte;

    /**
     * Constructor de la clase Tour.
     *
     * @param idTour identificador del tour
     * @param nombre nombre del tour
     * @param descripcion descripción del tour
     * @param precio precio del tour
     * @param guia guía asignado
     * @param transporte transporte asignado
     */
    public Tour(int idTour,
                String nombre,
                String descripcion,
                double precio,
                Guia guia,
                Transporte transporte) {

        setIdTour(idTour);
        setNombre(nombre);
        setDescripcion(descripcion);
        setPrecio(precio);
        setGuia(guia);
        setTransporte(transporte);
    }

    public int getIdTour() {
        return idTour;
    }

    public void setIdTour(int idTour) {

        if (idTour <= 0) {
            throw new IllegalArgumentException(
                    "El ID del tour debe ser mayor que cero.");
        }

        this.idTour = idTour;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre del tour no puede estar vacío.");
        }

        this.nombre = nombre.trim();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {

        if (descripcion == null || descripcion.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "La descripción no puede estar vacía.");
        }

        this.descripcion = descripcion.trim();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        if (precio <= 0) {
            throw new IllegalArgumentException(
                    "El precio debe ser mayor que cero.");
        }

        this.precio = precio;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {

        if (guia == null) {
            throw new IllegalArgumentException(
                    "El guía no puede ser nulo.");
        }

        this.guia = guia;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {

        if (transporte == null) {
            throw new IllegalArgumentException(
                    "El transporte no puede ser nulo.");
        }

        this.transporte = transporte;
    }

    @Override
    public String toString() {

        return "ID Tour: " + idTour
                + "\nNombre: " + nombre
                + "\nDescripción: " + descripcion
                + "\nPrecio: $" + precio
                + "\nGuía: " + guia.getNombre()
                + "\nTransporte: " + transporte.getTipoVehiculo();
    }
}