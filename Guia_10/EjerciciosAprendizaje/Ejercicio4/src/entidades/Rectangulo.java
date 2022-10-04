package entidades;

import interfaces.calculosFormas;

public class Rectangulo implements calculosFormas {

    protected Double altura;
    protected Double base;

    public Rectangulo() {
    }

    public Rectangulo(Double altura, Double base) {
        this.altura = altura;
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        double area = base * altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (base + altura) * 2;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "altura: " + altura + ", base: " + base + '}';
    }

}
