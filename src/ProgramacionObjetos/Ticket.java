package ProgramacionObjetos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;

    /*
    Pueden existir Tickets simples (fecha, precio) o paquetes que incluya una o varias entradas para espectáculos.
    Estos Tickets se van a asignar al cliente que lo compre.
    Un ticket se considera repetido si la fecha es la misma, ya que un cliente no puede comprar más de un ticket
    para el mismo día.
     */

public class Ticket {
    private LocalDate hoy = LocalDate.now();
    private LocalDate fecha;
    private float precio;
    private HashSet<Entrada> entrada;

    public Ticket(LocalDate fecha, float precio) throws MiExcepcion {
        validarParametros(fecha, precio);
        this.entrada = null;
    }

    public Ticket(LocalDate fecha, float precio, HashSet<Entrada> entrada) throws MiExcepcion {
        validarParametros(fecha, precio);
        if (entrada.isEmpty() || entrada == null) {
            this.entrada = null;
        } else {
            this.entrada = entrada;
        }
    }

    public Ticket(LocalDate fecha, float precio, Entrada entrada) throws MiExcepcion {
        validarParametros(fecha, precio);
        if (entrada == null) {
            this.entrada = null;
        } else {
            this.entrada = new HashSet<>();
            this.entrada.add(entrada);
        }
    }

    private void validarParametros(LocalDate fecha, float precio) throws MiExcepcion {
        if (fecha == null) throw new MiExcepcion("La fecha no puede ser null.");
        if (fecha.isBefore(hoy)) throw new MiExcepcion("No se pueden sacar ticket para días anteriores.");
        this.fecha = fecha;
        if (precio <= 0) throw new MiExcepcion("El precio no puede ser 0 o inferior.");
        this.precio = precio;
    }

    public boolean tieneEntrada() {
        if (entrada == null) return false;
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(fecha, ticket.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha);
    }

    @Override
    public String toString() {
        if (tieneEntrada()) {
            return "Datos Entrada al parque: " +
                    "\nFecha: " + fecha +
                    "\nPrecio: " + precio + "€" +
                    "\n¿Acceso a espectáculos?: " + tieneEntrada() +
                    "\nLos espectáculos a los que tiene acceso son: " + entrada;
        } else {
            return "Datos Entrada al parque: " +
                    "\nFecha: " + fecha +
                    "\nPrecio: " + precio + "€" +
                    "\n¿Acceso a espectáculos?: " + entrada;
        }
    }
}
