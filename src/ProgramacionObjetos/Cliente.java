package ProgramacionObjetos;

public class Cliente {
    private String nombre;
    private String apellido;
    private int ticket;

    public Cliente(String nombre, String apellido, int ticket) throws Exception {
        if (ticket <= 0) throw new Exception("Falta el ticket");
        this.nombre = nombre;
        this.apellido = apellido;
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
