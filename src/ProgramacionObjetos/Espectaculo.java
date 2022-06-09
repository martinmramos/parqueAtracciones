package ProgramacionObjetos;

import java.util.HashSet;
import java.util.Objects;

    /*
    Podemos añadir pases a cada espectáculo con los métodos 'addPase' para pases individuales o
    'addLista' para una lista de pases.
     */

public class Espectaculo {
    private String nombre;
    private String tipo;
    private int minutos;
    private HashSet<Pase> pase;

    public Espectaculo(String nombre, String tipo, int minutos) throws MiExcepcion {
        validarParametros(nombre, tipo, minutos);
        this.pase = new HashSet<>();
    }

    public Espectaculo(String nombre, String tipo, int minutos, HashSet<Pase> pase) throws MiExcepcion {
        validarParametros(nombre, tipo, minutos);
        if (pase == null) throw new MiExcepcion("La lista de pases no puede ser null.");
        this.pase = pase;
    }

    public Espectaculo(String nombre, String tipo, int minutos, Pase pase) throws MiExcepcion {
        validarParametros(nombre, tipo, minutos);
        if (pase == null) throw new MiExcepcion("El pase no puede ser null.");
        this.pase = new HashSet<>();
        this.pase.add(pase);
    }

    public String getNombre() {
        return nombre;
    }

    public void addPase(Pase pase) {
        this.pase.add(pase);
    }

    public void addLista(HashSet<Pase> pase) {
        this.pase = pase;
    }

    private void validarParametros(String nombre, String tipo, int minutos) throws MiExcepcion {
        if (nombre == null) throw new MiExcepcion("El nombre del espectaculo no puede ser null.");
        this.nombre = nombre;
        if (tipo == null) throw new MiExcepcion("El tipo del espectaculo no puede ser null.");
        this.tipo = tipo;
        if (minutos <= 0) throw new MiExcepcion("Los minutos no pueden ser 0 o inferior.");
        this.minutos = minutos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Espectaculo)) return false;
        Espectaculo espectaculo = (Espectaculo) o;
        return nombre.equals(espectaculo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        if (pase == null) {
            return nombre;
        } else {
            return nombre + " " + pase;
        }
    }
}
