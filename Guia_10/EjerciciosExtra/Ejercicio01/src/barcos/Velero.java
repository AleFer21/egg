package barcos;

public class Velero extends Barco {

    protected Integer nroMastil;

    public Velero() {
    }

    public Velero(Integer nroMastil) {
        this.nroMastil = nroMastil;
    }

    public Velero(Integer nroMastil, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.nroMastil = nroMastil;
    }

    public Integer getNroMastil() {
        return nroMastil;
    }

    public void setNroMastil(Integer nroMastil) {
        this.nroMastil = nroMastil;
    }

    @Override
    public String toString() {
        return "Velero{" + super.toString() + " nro de mastil: " + nroMastil + '}';
    }

}
