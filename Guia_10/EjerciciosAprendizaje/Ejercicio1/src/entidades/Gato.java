package entidades;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String toString() {
        return "Gato" + super.toString();
    }

    @Override
    public void alimentarse() {
        System.out.println("El gato come " + alimento);
    }

}
