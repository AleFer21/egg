package entidades;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String toString() {
        return "Perro" + super.toString();
    }

    @Override
    public void alimentarse() {
        System.out.println("El perro come " + alimento);
    }

}
