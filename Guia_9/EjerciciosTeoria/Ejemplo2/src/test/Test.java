package test;

import equipo.Equipo;
import java.util.*;
import jugador.Jugador;

public class Test {

    public static void main(String[] args) {
        
        Jugador j1 = new Jugador("Agustin", "Rossi", "Arquero", 1);
        Jugador j2 = new Jugador("Carlos", "Izquierdoz", "Defensor", 2);
        Jugador j3 = new Jugador("Frank", "Fabra", "Defensor", 3);
        Jugador j4 = new Jugador("Luis", "Advincula", "Defensor", 4);
        Jugador j5 = new Jugador("Alan", "Varela", "Mediocampista", 5);
        Jugador j6 = new Jugador("Marcos", "Rojo", "Defensor", 6);
        Jugador j7 = new Jugador("Ezequiel", "Zeballos", "Delantero", 7);
        Jugador j8 = new Jugador("Pol", "Fernandez", "Mediocampista", 8);
        Jugador j9 = new Jugador("Dario", "Benedetto", "Delantero", 9);
        Jugador j10 = new Jugador("Oscar", "Romero", "Mediocampista", 10);
        Jugador j11 = new Jugador("Sebastian", "Villa", "Delantero", 11);
        
        
        List<Jugador> jugadores = new ArrayList();
        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);
        jugadores.add(j4);
        jugadores.add(j5);
        jugadores.add(j6);
        jugadores.add(j7);
        jugadores.add(j8);
        jugadores.add(j9);
        jugadores.add(j10);
        jugadores.add(j11);
        
        Equipo boca = new Equipo();
        boca.setNombre("C.A. Boca Juniors");
        boca.setJugadores(jugadores);
        
        System.out.println(boca.toString());
        
        
    }
    
}
