package ProgramacionObjetos;

import java.time.LocalDate;

public class Ticket {
    private LocalDate hoy = LocalDate.now();
    private LocalDate fecha;
    private float precio;
    private Cliente cliente;
    private Espectaculo espectaculo;

    public Ticket(LocalDate fecha, float precio, Cliente cliente) throws Exception {
        if (cliente.equals(null)) throw new Exception("El Ticket tiene que tener un cliente asociado.");
        if (fecha.isBefore(hoy)) throw new Exception("No se pueden sacar ticket para días anteriores.");
        this.fecha = fecha;
        this.precio = precio;
        this.cliente = cliente;
        this.espectaculo = null;
    }

    public Ticket(LocalDate hoy, LocalDate fecha, float precio, Cliente cliente, Espectaculo espectaculo) throws Exception {
        if (cliente.equals(null)) throw new Exception("El Ticket tiene que tener un cliente asociado.");
        if (fecha.isBefore(hoy)) throw new Exception("No se pueden sacar ticket para días anteriores.");
        this.hoy = hoy;
        this.fecha = fecha;
        this.precio = precio;
        this.cliente = cliente;
        this.espectaculo = espectaculo;
    }

    public boolean tieneEspectaculo(){
        if (espectaculo == null) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Datos Entrada al parque: " +
                "\nFecha: " + fecha +
                "\nPrecio: " + precio +
                "\nCliente: " + cliente +
                "\n¿Acceso a espectáculos?: " + tieneEspectaculo();
    }
}
