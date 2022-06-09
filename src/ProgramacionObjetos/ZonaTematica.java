package ProgramacionObjetos;

import java.util.HashSet;

    /*
    Podemos crear zonas temáticas con una lista o con elementos individuales de tipo Atracción, Restaurante y Espectáculo.
     */

public class ZonaTematica {
    private String nombre;
    private String descripcion;
    private String color;
    private HashSet<Atraccion> atraccion;
    private HashSet<Restaurante> restaurante;
    private HashSet<Espectaculo> espectaculo;

    public ZonaTematica(String nombre, String descripcion, String color, HashSet<Atraccion> atraccion, HashSet<Restaurante> restaurante,
                        HashSet<Espectaculo> espectaculo) throws MiExcepcion {
        validarParametros(nombre, descripcion, color);
        if (atraccion == null) throw new MiExcepcion("Las atracciones no pueden ser null.");
        if (atraccion.isEmpty()) throw new MiExcepcion("Faltan atracciones.");
        this.atraccion = atraccion;
        if (restaurante == null) throw new MiExcepcion("Los restaurantes no pueden ser null.");
        if (restaurante.isEmpty()) throw new MiExcepcion("Faltan restaurantes.");
        this.restaurante = restaurante;
        if (espectaculo == null) throw new MiExcepcion("Los espectaculos no pueden ser null.");
        if (espectaculo.isEmpty()) throw new MiExcepcion("Faltan espectaculos.");
        this.espectaculo = espectaculo;
    }

    public ZonaTematica(String nombre, String descripcion, String color, Atraccion atraccion, HashSet<Restaurante> restaurante,
                        HashSet<Espectaculo> espectaculo) throws MiExcepcion {
        validarParametros(nombre, descripcion, color);
        if (atraccion == null) throw new MiExcepcion("Las atracciones no pueden ser null.");
        this.atraccion = new HashSet<>();
        this.atraccion.add(atraccion);
        if (restaurante == null) throw new MiExcepcion("Los restaurantes no pueden ser null.");
        if (restaurante.isEmpty()) throw new MiExcepcion("Faltan restaurantes.");
        this.restaurante = restaurante;
        if (espectaculo == null) throw new MiExcepcion("Los espectaculos no pueden ser null.");
        if (espectaculo.isEmpty()) throw new MiExcepcion("Faltan espectaculos.");
        this.espectaculo = espectaculo;
    }

    public ZonaTematica(String nombre, String descripcion, String color, HashSet<Atraccion> atraccion, Restaurante restaurante,
                        HashSet<Espectaculo> espectaculo) throws MiExcepcion {
        validarParametros(nombre, descripcion, color);
        if (atraccion == null) throw new MiExcepcion("Las atracciones no pueden ser null.");
        if (atraccion.isEmpty()) throw new MiExcepcion("Faltan atracciones.");
        this.atraccion = atraccion;
        if (restaurante == null) throw new MiExcepcion("Los restaurantes no pueden ser null.");
        this.restaurante = new HashSet<>();
        this.restaurante.add(restaurante);
        if (espectaculo == null) throw new MiExcepcion("Los espectaculos no pueden ser null.");
        if (espectaculo.isEmpty()) throw new MiExcepcion("Faltan espectaculos.");
        this.espectaculo = espectaculo;
    }

    public ZonaTematica(String nombre, String descripcion, String color, HashSet<Atraccion> atraccion, HashSet<Restaurante> restaurante,
                        Espectaculo espectaculo) throws MiExcepcion {
        validarParametros(nombre, descripcion, color);
        if (atraccion == null) throw new MiExcepcion("Las atracciones no pueden ser null.");
        if (atraccion.isEmpty()) throw new MiExcepcion("Faltan atracciones.");
        this.atraccion = atraccion;
        if (restaurante == null) throw new MiExcepcion("Los restaurantes no pueden ser null.");
        if (restaurante.isEmpty()) throw new MiExcepcion("Faltan restaurantes.");
        this.restaurante = restaurante;
        if (espectaculo == null) throw new MiExcepcion("Los espectaculos no pueden ser null.");
        this.espectaculo = new HashSet<>();
        this.espectaculo.add(espectaculo);
    }

    public ZonaTematica(String nombre, String descripcion, String color, Atraccion atraccion, Restaurante restaurante,
                        HashSet<Espectaculo> espectaculo) throws MiExcepcion {
        validarParametros(nombre, descripcion, color);
        if (atraccion == null) throw new MiExcepcion("Las atracciones no pueden ser null.");
        this.atraccion = new HashSet<>();
        this.atraccion.add(atraccion);
        if (restaurante == null) throw new MiExcepcion("Los restaurantes no pueden ser null.");
        this.restaurante = new HashSet<>();
        this.restaurante.add(restaurante);
        if (espectaculo == null) throw new MiExcepcion("Los espectaculos no pueden ser null.");
        if (espectaculo.isEmpty()) throw new MiExcepcion("Faltan espectaculos.");
        this.espectaculo = espectaculo;
    }

    public ZonaTematica(String nombre, String descripcion, String color, Atraccion atraccion, HashSet<Restaurante> restaurante,
                        Espectaculo espectaculo) throws MiExcepcion {
        validarParametros(nombre, descripcion, color);
        if (atraccion == null) throw new MiExcepcion("Las atracciones no pueden ser null.");
        this.atraccion = new HashSet<>();
        this.atraccion.add(atraccion);
        if (restaurante == null) throw new MiExcepcion("Los restaurantes no pueden ser null.");
        if (restaurante.isEmpty()) throw new MiExcepcion("Faltan restaurantes.");
        this.restaurante = restaurante;
        if (espectaculo == null) throw new MiExcepcion("Los espectaculos no pueden ser null.");
        this.espectaculo = new HashSet<>();
        this.espectaculo.add(espectaculo);
    }

    public ZonaTematica(String nombre, String descripcion, String color, HashSet<Atraccion> atraccion, Restaurante restaurante,
                        Espectaculo espectaculo) throws MiExcepcion {
        validarParametros(nombre, descripcion, color);
        if (atraccion == null) throw new MiExcepcion("Las atracciones no pueden ser null.");
        if (atraccion.isEmpty()) throw new MiExcepcion("Faltan atracciones.");
        this.atraccion = atraccion;
        if (restaurante == null) throw new MiExcepcion("Los restaurantes no pueden ser null.");
        this.restaurante = new HashSet<>();
        this.restaurante.add(restaurante);
        if (espectaculo == null) throw new MiExcepcion("Los espectaculos no pueden ser null.");
        this.espectaculo = new HashSet<>();
        this.espectaculo.add(espectaculo);
    }

    public ZonaTematica(String nombre, String descripcion, String color, Atraccion atraccion, Restaurante restaurante,
                        Espectaculo espectaculo) throws MiExcepcion {
        validarParametros(nombre, descripcion, color);
        if (atraccion == null) throw new MiExcepcion("Las atracciones no pueden ser null.");
        this.atraccion = new HashSet<>();
        this.atraccion.add(atraccion);
        if (restaurante == null) throw new MiExcepcion("Los restaurantes no pueden ser null.");
        this.restaurante = new HashSet<>();
        this.restaurante.add(restaurante);
        if (espectaculo == null) throw new MiExcepcion("Los espectaculos no pueden ser null.");
        this.espectaculo = new HashSet<>();
        this.espectaculo.add(espectaculo);
    }

    private void validarParametros(String nombre, String descripcion, String color) throws MiExcepcion {
        if (nombre == null) throw new MiExcepcion("El nombre de la zona temática no puede ser null.");
        this.nombre = nombre;
        if (descripcion == null) throw new MiExcepcion("La descripción de la zona temática no puede ser null.");
        this.descripcion = descripcion;
        if (color == null) throw new MiExcepcion("El color de la zona temática no puede ser null.");
        this.color = color;
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
