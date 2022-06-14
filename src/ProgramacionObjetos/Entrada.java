package ProgramacionObjetos;

import java.util.Objects;

public class Entrada {

    /*
    A una entrada creada podemos añadirle un ticket más adelante con el método 'addTicket'.
    También podemos añadir un pase con el método 'addPase'.
    Los métodos 'tieneTicket' y 'mostrarTicket' son simplemente para mostrar la información de la entrada.
    Una entrada sería repetida si tiene el mismo asiento.
     */

    /* Se ha establecido un aforo para cada espectáculo de 100 asientos. */

    private int asiento;
    private float precio;
    private String estado;
    private Ticket ticket;
    private Pase pase;

    public Entrada(int asiento, float precio, String estado) throws MiExcepcion {
        validarParametros(asiento, precio, estado);
        this.ticket = null;
    }

    private void validarParametros(int asiento, float precio, String estado) throws MiExcepcion {
        if (asiento <= 0 || asiento > 100)
            throw new MiExcepcion("Los asientos tienen que estar comprendidos entre 1 y 100.");
        this.asiento = asiento;
        if (precio <= 0) throw new MiExcepcion("El precio tiene que ser superior a 0.");
        this.precio = precio;
        if (estado == null) throw new MiExcepcion("La entrada tiene que estar en estado 'disponible' o 'vendida'");
        if (estado.equals("disponible") || estado.equals("vendida")) {
            this.estado = estado;
        } else {
            throw new MiExcepcion("La entrada tiene que estar en estado 'disponible' o 'vendida'");
        }
    }

    public void addTicket (Ticket ticket){
        this.ticket = ticket;
    }

    public void addPase (Pase pase){
        this.pase = pase;
    }

    public boolean tieneTicket() {
        if (ticket == null) return false;
        return true;
    }

    public String mostrarTicket() {
        if (tieneTicket()) return "Acceso con ticket.";
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entrada)) return false;
        Entrada entrada = (Entrada) o;
        return asiento == entrada.asiento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(asiento);
    }

    @Override
    public String toString() {
        if (tieneTicket()) {
            return "-Entrada-" +
                    "\nAsiento: " + asiento +
                    "\n" + mostrarTicket();
        } else {
            return "-Entrada-" +
                    "\nAsiento: " + asiento +
                    "\nPrecio: " + precio + "€";
        }
    }
}
