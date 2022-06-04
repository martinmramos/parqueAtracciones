package ProgramacionObjetos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class ParqueAtracciones {

    public static void main(String[] args) throws Exception {
        Atraccion canguro = new Atraccion("Canguro", 170, 30, 10);
        Atraccion pulpo = new Atraccion("Pulpo", 170, 30, 10);
        Restaurante telepizza = new Restaurante("Telepizza", "10:00 - 21:00", 10);
        Restaurante foster = new Restaurante("Foster", "10:00 - 21:00", 15);
        Espectaculo coches = new Espectaculo("Coches", "Acción", 30);
        HashSet<Atraccion> atracciones1 = new HashSet<>();
        HashSet<Restaurante> restaurante1 = new HashSet<>();
        HashSet<Espectaculo> espectaculo1 = new HashSet<>();
        atracciones1.add(canguro);
        atracciones1.add(pulpo);
        restaurante1.add(telepizza);
        restaurante1.add(foster);
        espectaculo1.add(coches);

        ZonaTematica comun = new ZonaTematica("Comun", "Ninguna", "Verde", atracciones1, restaurante1, espectaculo1);

        Cliente c1 = new Cliente("Martin", "Muñoz", 1);

        Ticket t1 = new Ticket(LocalDate.of(2022, 6, 4), 10, c1 );

        Entrada e1 = new Entrada(12, 20);
        HashSet<Entrada> pase1 = new HashSet<>();
        pase1.add(e1);

        Pase p1 = new Pase(LocalDate.of(2022, 6, 5), LocalTime.of(12,30), LocalTime.of(17,00), coches, pase1);
    }
}
