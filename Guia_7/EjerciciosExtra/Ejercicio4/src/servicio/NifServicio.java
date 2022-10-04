package servicio;

import java.util.Scanner;
import nif.Nif;

public class NifServicio {

    Scanner scanner = new Scanner(System.in);

    public Nif crearNif() {
        Nif nif = new Nif();
        System.out.println("Ingrese numero de DNI:");
        nif.setDni(scanner.nextLong());
        return nif;
    }

    public void mostrar(Nif nif) {
        String cantidad = Long.toString(nif.getDni());
        switch (cantidad.length() - 1) {
            case 0 -> nif.setLetra('T');
            case 1 -> nif.setLetra('R');
            case 2 -> nif.setLetra('W');
            case 3 -> nif.setLetra('A');
            case 4 -> nif.setLetra('G');
            case 5 -> nif.setLetra('M');
            case 6 -> nif.setLetra('Y');
            case 7 -> nif.setLetra('F');
            case 8 -> nif.setLetra('P');
            case 9 -> nif.setLetra('D');
            case 10 -> nif.setLetra('X');
            case 11 -> nif.setLetra('B');
            case 12 -> nif.setLetra('N');
            case 13 -> nif.setLetra('J');
            case 14 -> nif.setLetra('Z');
            case 15 -> nif.setLetra('S');
            case 16 -> nif.setLetra('Q');
            case 17 -> nif.setLetra('V');
            case 18 -> nif.setLetra('H');
            case 19 -> nif.setLetra('L');
            case 20 -> nif.setLetra('C');
            case 21 -> nif.setLetra('K');
            case 22 -> nif.setLetra('E');
            default -> System.out.println("ERROR");
        }
        System.out.println(nif.getDni() + "-" + nif.getLetra());
    }

}
