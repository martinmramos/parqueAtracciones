package ProgramacionObjetos;

public class Entrada {
    private int asiento;
    private float precio;
    private Ticket ticket;

    public Entrada(int asiento, float precio) {
        this.asiento = asiento;
        this.precio = precio;
        this.ticket = null;
    }

    public Entrada(int asiento, float precio, Ticket ticket) {
        this.asiento = asiento;
        this.precio = precio;
        this.ticket = ticket;
    }

    public boolean tieneTicket() {
        if (ticket == null) return false;
        return true;
    }

    @Override
    public String toString() {
        if (tieneTicket()) {
            return "Entrada:" +
                    "\nAsiento: " + asiento;
        } else {
            return "Entrada:" +
                    "\nAsiento: " + asiento +
                    "\nPrecio: " + precio;
        }
    }
}
