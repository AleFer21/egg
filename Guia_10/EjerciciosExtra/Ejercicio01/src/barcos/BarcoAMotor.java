package barcos;

public class BarcoAMotor extends Barco {

    private Integer potencia;

    public BarcoAMotor() {
    }

    public BarcoAMotor(Integer potencia) {
        this.potencia = potencia;
    }

    public BarcoAMotor(Integer potencia, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "BarcoAMotor{" + super.toString() + " potencia: " + potencia + '}';
    }

}
