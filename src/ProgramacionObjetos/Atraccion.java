package ProgramacionObjetos;

public class Atraccion {
    private String nombre;
    private int estatura;
    private int capacidad;
    private int duracion;

    public Atraccion(String nombre, int estatura, int capacidad, int duracion) throws MiExcepcion {
        if (nombre == null) throw new MiExcepcion("El nombre de la atracción no puede ser null.");
        this.nombre = nombre;
        if (estatura <= 0) throw new MiExcepcion("La estatura no puede ser 0 o inferior.");
        this.estatura = estatura;
        if (capacidad <= 0) throw new MiExcepcion("La capacidad no puede ser 0 o inferior.");
        this.capacidad = capacidad;
        if (duracion <= 0) throw new MiExcepcion("La duración no puede ser 0 o inferior.");
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
