package entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;
    protected Scanner scanner;

    public Electrodomestico() {
        this.scanner = new Scanner(System.in).useDelimiter("\n");
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    protected void comprobarConsumoEnergetico() {
        if (consumoEnergetico == 'A' || consumoEnergetico == 'B' || consumoEnergetico == 'C' || consumoEnergetico == 'D'
                || consumoEnergetico == 'E' || consumoEnergetico == 'F') {
            System.out.println("El nivel de consumo energetico es: " + consumoEnergetico);
        } else {
            consumoEnergetico = 'F';
            System.out.println("El nivel de consumo energetico es: " + consumoEnergetico);
        }
    }

    protected void comprobarColor() {
        if (color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Rojo")
                || color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris")) {
            System.out.println("El color es: " + color);
        } else {
            color = "Blanco";
            System.out.println("El color es: " + color);
        }
    }

    public Electrodomestico crearElectrodomestico() {
        Electrodomestico electrodomestico = new Electrodomestico();
        System.out.println("Ingrese el color del electrodomestico:");
        color = scanner.next();
        System.out.println("Ingrese el nivel de consumo energetico:");
        consumoEnergetico = scanner.next().toUpperCase().charAt(0);
        System.out.println("Ingrese el peso del electrodomestico:");
        peso = scanner.nextDouble();
        precio = 1000d;
        comprobarConsumoEnergetico();
        comprobarColor();
        return electrodomestico;
    }

    public void precioFinal(Electrodomestico electrodomestico) {
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
        System.out.println("El precio final es: $" + precio);
    }

    @Override
    public String toString() {
        return "precio: " + precio + ", color: " + color + ", consumo energetico: " + consumoEnergetico + ", peso: " + peso + '}';
    }

}