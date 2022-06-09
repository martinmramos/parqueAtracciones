package ProgramacionObjetos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

    /*
    Para que un pase sea válido, tendremos que usar el método 'addEspectaculo' para añadirle un espectáculo
    en el momento de la venta del pase.
     */

public class Pase {

    private LocalDate hoy = LocalDate.now();
    private LocalTime horaActual = LocalTime.now();
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Espectaculo espectaculo;
    private HashSet<Entrada> entrada;

    public Pase(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, HashSet<Entrada> entrada) throws MiExcepcion {
        validarParametros(fecha, horaInicio, horaFin);
        if (entrada == null) throw new MiExcepcion("Las entradas no pueden ser null.");
        if (entrada.isEmpty()) throw new MiExcepcion("No puede haber un pase sin al menos una entrada.");
        this.entrada = entrada;
        this.espectaculo = null;
    }

    public Pase(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, Entrada entrada) throws MiExcepcion {
        validarParametros(fecha, horaInicio, horaFin);
        if (entrada == null) throw new MiExcepcion("Las entradas no pueden ser null.");
        this.entrada = new HashSet<>();
        this.entrada.add(entrada);
        this.espectaculo = null;
    }

    public void addEspectaculo(Espectaculo espectaculo) {
        this.espectaculo = espectaculo;
    }

    private void validarParametros(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin) throws MiExcepcion {
        if (horaInicio.isBefore(horaActual) && fecha.isEqual(hoy))
            throw new MiExcepcion("¡El pase ya se ha celebrado!");
        if (fecha.isBefore(hoy))
            throw new MiExcepcion("¡No se pueden sacar pases para días anteriores al de hoy!");
        this.fecha = fecha;
        if (horaInicio.isAfter(horaFin))
            throw new MiExcepcion("¡Horas incorrectas! La hora de comienzo no puede ser mayor que la hora de finalización");
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    @Override
    public String toString() {
        if (espectaculo == null) {
            return "Datos del pase" +
                    "\nDía: " + fecha +
                    "\nHora Inicio: " + horaInicio +
                    "\nHora Fin: " + horaFin +
                    "\nEspectadores: " + entrada.size();
        } else {
            return "Datos del pase" +
                    "\nEspectáculo: " + espectaculo.getNombre() +
                    "\nDía: " + fecha +
                    "\nHora Inicio: " + horaInicio +
                    "\nHora Fin: " + horaFin +
                    "\nEspectadores: " + entrada.size();
        }
    }
}
