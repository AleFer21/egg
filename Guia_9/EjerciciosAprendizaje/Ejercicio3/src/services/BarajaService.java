package services;

import domain.Baraja;
import domain.Carta;
import enums.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaService {

    private Baraja mazoInicial = new Baraja();
    private Baraja cartasEntregadas = new Baraja();
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    private Collections c;

    public Baraja crearBaraja() {
        System.out.println("Abriendo la baraja.");
        ArrayList<Carta> cs = new ArrayList();
        ArrayList<Carta> out = new ArrayList();
        cartasEntregadas.setCartas(out);
        for (Palo aux : Palo.values()) {
            String p = aux.getNombre();
            for (int i = 1; i <= 12; i++) {
                if (i == 8 || i == 9) {
                    //NO HACE NADA
                } else {
                    Carta c = new Carta(i, aux);
                    cs.add(c);
                }
            }
        }
        mazoInicial.setCartas(cs);
        System.out.println("Baraja abierta.");
        return mazoInicial;
    }

    public void barajar() {
        c.shuffle(mazoInicial.getCartas());
    }

    public Carta siguienteCarta() {
        Carta c = mazoInicial.getCartas().get(0);
        System.out.println("La siguiente carta es: " + mazoInicial.getCartas().get(0).toString());
        return c;
    }

    public void cartasDisponibles() {
        System.out.println("Las cartas disponibles son: " + mazoInicial.getCartas().size());
    }

    public void darCartas() {
        System.out.println("Cuatas cartas se van a repartir?");
        int cantidad = scanner.nextInt();
        if (cantidad <= mazoInicial.getCartas().size()) {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Se le da el " + mazoInicial.getCartas().toString() + " al jugador.");
            }
            for (int i = 0; i < cantidad; i++) {
                cartasEntregadas.getCartas().add(mazoInicial.getCartas().get(0));
                mazoInicial.getCartas().remove(0);
            }
        } else {
            System.out.println("Se terminaron las cartas, no se reparten mas.");
            cartasDisponibles();
        }
    }

    public void cartasMonton() {
        if (cartasEntregadas.getCartas().size() == 0) {
            System.out.println("No se repartio la baraja.");
        } else {
            System.out.println("Cartas repartidas del monton:");
            String parrafo = "";
            int control = 0;
            for (Object aux : cartasEntregadas.getCartas()) {
                parrafo = parrafo.concat(aux.toString());
                parrafo = parrafo.concat(". ");
                control++;
                if (control == 10) {
                    System.out.println(parrafo);
                    parrafo = "";
                    control = 0;
                }
            }
        }
    }

    public void mostrarBaraja() {
        if (mazoInicial.getCartas().size() == 0) {
            System.out.println("No quedan cartas en el mazo.");
        } else {
            System.out.println("Cartas del mazo:");
            String parrafo = "";
            int control = 0;
            for (Object aux : mazoInicial.getCartas()) {
                parrafo = parrafo.concat(aux.toString());
                parrafo = parrafo.concat(". ");
                control++;
                if (control == 10) {
                    System.out.println(parrafo);
                    parrafo = "";
                    control = 0;
                }
            }
        }
    }

}
