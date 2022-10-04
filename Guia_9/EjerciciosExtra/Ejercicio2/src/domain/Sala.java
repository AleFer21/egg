package domain;

public class Sala {

    private char letra;
    private Integer fila;
    private Espectador espectador;

    public Sala() {
    }

    public Sala(char letra, Integer fila) {
        this.letra = letra;
        this.fila = fila;
        this.espectador = null;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Sala{" + "letra: " + letra + ", fila: " + fila + ", espectador: " + espectador + '}';
    }

}
