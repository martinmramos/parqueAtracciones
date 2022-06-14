package ProgramacionObjetos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class ParqueAtracciones {

    public static void main(String[] args) throws MiExcepcion, Exception {
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
        Ticket t1 = new Ticket(LocalDate.of(2022, 10, 4), 10);
        Ticket t2 = new Ticket(LocalDate.of(2022, 10, 5), 10);
        HashSet<Ticket> packTickets = new HashSet<>();
        packTickets.add(t1);
        packTickets.add(t2);

        Cliente c1 = new Cliente("Martin", "Muñoz", packTickets);


        Entrada e1 = new Entrada(10, 10, "vendida");
        Entrada e2 = new Entrada(12, 20, "disponible");

        HashSet<Entrada> pase1 = new HashSet<>();
        pase1.add(e1);
        pase1.add(e2);

        Pase p1 = new Pase(LocalDate.of(2022, 10, 5), LocalTime.of(12, 30), LocalTime.of(17, 00), pase1);

        HashSet<Pase> listaPases = new HashSet<>();
        listaPases.add(p1);
        coches.addLista(listaPases);

        e1.addTicket(t1);

        p1.addEspectaculo(coches);
        System.out.println(e1);
    }
}
