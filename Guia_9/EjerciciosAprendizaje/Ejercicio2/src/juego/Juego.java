package juego;

import jugador.Jugador;
import revolver.Revolver;

public class Juego {

    private Jugador[] jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(int numJugadores) {
        jugadores = new Jugador[comprobarJugadores(numJugadores)];
        crearJugadores();
        revolver = new Revolver();
    }

    private int comprobarJugadores(int numJugadores) {
        if (!(numJugadores >= 1 && numJugadores <= 6)) {
            numJugadores = 6;
        }
        return numJugadores;
    }

    private void crearJugadores() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador(i + 1);
        }
    }

    public boolean finJuego() {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].noEstaMojado()) {
                return true;
            }
        }
        return false; //No termina el juego
    }

    public void ronda() {
        for (int i = 0; i < 6; i++) {
            jugadores[i].disparo(revolver);
        }
    }

}
