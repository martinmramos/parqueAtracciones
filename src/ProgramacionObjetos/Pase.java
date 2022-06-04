package ProgramacionObjetos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class Pase {

    private LocalDate hoy = LocalDate.now();
    private LocalTime horaActual = LocalTime.now();
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Espectaculo espectaculo;
    private HashSet<Entrada> entrada;

    public Pase(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, Espectaculo espectaculo, HashSet<Entrada> entrada) throws Exception {
        if (horaInicio.isAfter(horaFin))
            throw new Exception("¡Horas incorrectas! La hora de comienzo no puede ser mayor que la hora de finalización");
        if (fecha.isBefore(hoy))
            throw new Exception("¡No se pueden sacar pases para días anteriores al de hoy!");
        if (horaInicio.isBefore(horaActual) && fecha.isEqual(hoy))
            throw new Exception("¡El pase ya se ha celebrado!");
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.espectaculo = espectaculo;
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "Datos del pase para el espectáculo " + "\"" + espectaculo + "\"" +
                "\nDía: " + fecha +
                "\nHora Inicio: " + horaInicio +
                "\nHora Fin: " + horaFin +
                "\nEspectadores: " + entrada.size();
    }
}
