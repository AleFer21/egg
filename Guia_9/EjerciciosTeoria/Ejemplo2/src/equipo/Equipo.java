package equipo;

import java.util.*;
import jugador.Jugador;

public class Equipo {

    private String nombre;
    private List<Jugador> jugadores;

    public Equipo() {
    }

    public Equipo(String nombre, List<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre: " + nombre + ", jugadores: \n" + jugadores + '}';
    }

}
