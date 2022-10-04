package barcos;

public class Yate extends Barco {

    protected Integer potencia;
    protected Integer nroCamarotes;

    public Yate() {
    }

    public Yate(Integer potencia, Integer nroCamarotes) {
        this.potencia = potencia;
        this.nroCamarotes = nroCamarotes;
    }

    public Yate(Integer potencia, Integer nroCamarotes, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
        this.nroCamarotes = nroCamarotes;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Integer getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(Integer nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + super.toString() + " potencia: " + potencia + ", nro de camarotes: " + nroCamarotes + '}';
    }

}
