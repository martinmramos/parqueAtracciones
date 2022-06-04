package ProgramacionObjetos;

import java.util.HashSet;

public class Espectaculo {
    private String nombre;
    private String tipo;
    private int minutos;
    private HashSet<Pase> pase = new HashSet<Pase>();

    public Espectaculo(String nombre, String tipo, int minutos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.minutos = minutos;
    }

    public Espectaculo(String nombre, String tipo, int minutos, HashSet<Pase> pase) throws Exception {
        if (pase.isEmpty()) throw new Exception("Al no haber entradas vendidas, no se celebrará el espectáculo");
        this.nombre = nombre;
        this.tipo = tipo;
        this.minutos = minutos;
        this.pase = pase;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
