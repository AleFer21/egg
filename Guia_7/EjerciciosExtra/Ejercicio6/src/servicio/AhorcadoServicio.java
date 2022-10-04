package servicio;

import ahorcado.Ahorcado;
import java.util.*;

public class AhorcadoServicio {

    Scanner scanner = new Scanner(System.in);

    public Ahorcado crearJuego() {
        Ahorcado ahorcado = new Ahorcado();
        System.out.println("Ingrese la palabra del juego:");
        String palabra = scanner.next().toLowerCase();
        System.out.println("Ingrese la cantidad de jugadas:");
        ahorcado.setCantidadJugadas(scanner.nextInt());
        char array[] = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            array[i] = palabra.charAt(i);
        }
        ahorcado.setPalabra(array);
        return ahorcado;
    }

    public int longitud(Ahorcado ahorcado) {
        return ahorcado.getPalabra().length;
    }

    public void buscar(Ahorcado ahorcado, char letra) {
        int posicion = 0;
        ahorcado.setCantidadJugadas(ahorcado.getCantidadJugadas() - 1);
        for (int i = 0; i < longitud(ahorcado); i++) {
            if (ahorcado.getPalabra()[i] == letra) {
                System.out.println("La letra pertenece a la palabra, en la posicion: " + posicion);
            }
            posicion = posicion + 1;
        }
    }

    public void encontradas(Ahorcado ahorcado, char letra) {
        boolean bandera = false;
        for (int i = 0; i < longitud(ahorcado); i++) {
            if (ahorcado.getPalabra()[i] == letra) {
                bandera = true;
                ahorcado.setCantidadLetras(ahorcado.getCantidadLetras() + 1);
            } else {
                bandera = false;
            }
        }
        int restantes = ahorcado.getPalabra().length - ahorcado.getCantidadLetras();
        System.out.println("Has encontrado " + ahorcado.getCantidadLetras() + " letras y faltan " + restantes);
    }

    public void intentos(Ahorcado ahorcado) {
        if (ahorcado.getCantidadJugadas() == 0) {
            System.out.println("Te has quedado sin intentos");
        } else {
            System.out.println("Restan " + ahorcado.getCantidadJugadas() + " intentos.");
        }
    }

}
