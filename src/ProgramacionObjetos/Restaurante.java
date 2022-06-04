package ProgramacionObjetos;

public class Restaurante {
    private String nombre;
    private String horario;
    private double precioMedio;


    public Restaurante(String nombre, String horario, double precioMedio) {
        this.nombre = nombre;
        this.horario = horario;
        this.precioMedio = precioMedio;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
