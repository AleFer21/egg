package entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    protected Integer pulgadas;
    protected Boolean sintonizador;
    protected Scanner scanner;

    public Televisor() {
        this.scanner = new Scanner(System.in).useDelimiter("\n");
    }

    public Televisor(Integer pulgadas, Boolean sintonizador, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public Televisor crearTelevisor() {
        Televisor televisor = new Televisor();
        System.out.println("Ingrese las pulgadas del televisor:");
        pulgadas = scanner.nextInt();
        System.out.println("Posee TDT? Si/No");
        String decision = scanner.next();
        if (decision.equalsIgnoreCase("si")) {
            sintonizador = true;
        } else {
            sintonizador = false;
        }
        crearElectrodomestico();
        return televisor;
    }

    public void precioFinal(Televisor televisor) {
        switch (consumoEnergetico) {
            case 'A', 'a' ->
                precio = (precio + 1000);
            case 'B', 'b' ->
                precio = (precio + 800);
            case 'C', 'c' ->
                precio = (precio + 600);
            case 'D', 'd' ->
                precio = (precio + 500);
            case 'E', 'e' ->
                precio = (precio + 300);
            case 'F', 'f' ->
                precio = (precio + 100);
        }
        if (peso >= 1 && peso <= 19) {
            precio = (precio + 100);
        } else if (peso >= 20 && peso <= 49) {
            precio = (precio + 500);
        } else if (peso >= 50 && peso <= 79) {
            precio = (precio + 800);
        } else if (peso >= 80) {
            precio = (precio + 1000);
        }
        if (pulgadas > 40) {
            precio = ((precio * 0.3) + precio);
        }
        if (sintonizador == true) {
            precio = precio + 500;
        }
        System.out.println("El precio final del televisor es: $" + precio);
    }

    @Override
    public String toString() {
        return "Televisor{" + "pulgadas: " + pulgadas + ", sintonizador: " + sintonizador + ", " + super.toString();
    }

}
