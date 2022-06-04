package ProgramacionObjetos;

public class Atraccion {
    private String nombre;
    private int estatura;
    private int capacidad;
    private int duracion;
    private String zona;

    public Atraccion(String nombre, int estatura, int capacidad, int duracion) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.capacidad = capacidad;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
