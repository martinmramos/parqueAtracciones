package ProgramacionObjetos;

import java.util.HashSet;

    /*
    Un cliente no puede existir sin una entrada, ya que si no, no sería cliente del parque.
    Como las entradas son nominativas, un cliente puede sacar más de una entrada pero solo una para cada
    día.
     */

public class Cliente {
    private String nombre;
    private String apellido;
    private HashSet<Ticket> ticket;

    public Cliente(String nombre, String apellido, HashSet<Ticket> ticket) throws MiExcepcion {
        validarParametros(nombre, apellido);
        if (ticket == null) throw new MiExcepcion("El ticket no puede ser null.");
        if (ticket.isEmpty()) throw new MiExcepcion("El cliente no tiene ticket para acceder al parque.");
        this.ticket = ticket;
    }

    public Cliente (String nombre, String apellido, Ticket ticket) throws MiExcepcion {
        validarParametros(nombre, apellido);
        if (ticket == null) throw new MiExcepcion("El ticket no puede ser null.");
        this.ticket = new HashSet<>();
        this.ticket.add(ticket);
    }

    private void validarParametros(String nombre, String apellido) throws MiExcepcion {
        if (nombre == null) throw new MiExcepcion("El nombre no puede ser null.");
        this.nombre = nombre;
        if (apellido == null) throw new MiExcepcion("El apellido no puede ser null.");
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido +
                "\nDatos de ticket: " +
                '\n' + ticket;
    }
}
