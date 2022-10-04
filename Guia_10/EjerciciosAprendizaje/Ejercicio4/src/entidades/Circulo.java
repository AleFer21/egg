package entidades;

import interfaces.calculosFormas;

public class Circulo implements calculosFormas {

    protected static final Double PI = 3.14;
    protected Double radio;
    protected Double diametro;

    public Circulo() {
    }

    public Circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double calcularArea() {
        double area = PI * radio * radio;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = PI * diametro;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio: " + radio + ", diametro: " + diametro + '}';
    }

}
