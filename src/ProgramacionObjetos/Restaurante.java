package ProgramacionObjetos;

public class Restaurante {
    private String nombre;
    private String horario;
    private double precioMedio;


    public Restaurante(String nombre, String horario, double precioMedio) throws MiExcepcion {
        if (nombre == null) throw new MiExcepcion("El nombre del restaurante no puede ser null.");
        this.nombre = nombre;
        if (horario == null) throw new MiExcepcion("El horario del restaurante no puede ser null.");
        this.horario = horario;
        if (precioMedio <= 0) throw new MiExcepcion("El precio medio no puede ser 0 o inferior.");
        this.precioMedio = precioMedio;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
