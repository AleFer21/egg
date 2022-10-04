package dni;

public class Dni {

    private String serie;
    private Integer numero;

    public Dni() {
    }

    public Dni(String serie, Integer numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dni{" + "serie: " + serie + ", numero: " + numero + '}';
    }

}
