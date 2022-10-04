package entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    protected Integer carga;
    protected Scanner scanner;

    public Lavadora() {
        this.scanner = new Scanner(System.in).useDelimiter("\n");
    }

    public Lavadora(Integer carga) {
        this.carga = carga;
    }

    public Lavadora(Integer carga, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora() {
        Lavadora lavadora = new Lavadora();
        System.out.println("Ingrese la capacidad de carga de la lavadora:");
        carga = scanner.nextInt();
        crearElectrodomestico();
        return lavadora;
    }

    public void precioFinal(Lavadora lavadora) {
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
        if (carga > 30) {
            precio = (precio + 500);
        }
        System.out.println("El precio final de la lavadora es: $" + precio);
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga: " + carga + ", " + super.toString();
    }
}
