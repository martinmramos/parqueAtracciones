package ProgramacionObjetos;

import java.util.HashSet;

public class ZonaTematica {
    private String nombre;
    private String descripcion;
    private String color;
    private HashSet<Atraccion> atraccion = new HashSet<Atraccion>();
    private HashSet<Restaurante> restaurante = new HashSet<Restaurante>();
    private HashSet<Espectaculo> espectaculo = new HashSet<Espectaculo>();

    public ZonaTematica(String nombre, String descripcion, String color, HashSet<Atraccion> atraccion, HashSet<Restaurante> restaurante,
                        HashSet<Espectaculo> espectaculo) throws Exception {

        if (atraccion.isEmpty()) throw new Exception("Faltan atracciones.");
        if (restaurante.isEmpty()) throw new Exception("Faltan restaurantes.");
        if (espectaculo.isEmpty()) throw new Exception("Faltan espectaculos.");

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.color = color;
        this.atraccion = atraccion;
        this.restaurante = restaurante;
        this.espectaculo = espectaculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Zona Tematica " + "\"" + nombre + "\"" +
                "\nDescripcion: " + descripcion +
                "\nColor: " + color +
                "\nAtraccion: " + atraccion +
                "\nRestaurante: " + restaurante +
                "\nEspectaculo: " + espectaculo;

    }
}
