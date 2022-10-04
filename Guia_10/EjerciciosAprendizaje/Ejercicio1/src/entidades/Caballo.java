package entidades;

public class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String toString() {
        return "Caballo" + super.toString();
    }

    @Override
    public void alimentarse() {
        System.out.println("El caballo come " + alimento);
    }

}
