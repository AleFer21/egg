package ahorcado;

public class Ahorcado {
    
    private char palabra[];
    private int cantidadLetras;
    private int cantidadJugadas;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int cantidadLetras, int cantidadJugadas) {
        this.palabra = palabra;
        this.cantidadLetras = cantidadLetras;
        this.cantidadJugadas = cantidadJugadas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
        this.cantidadJugadas = cantidadJugadas;
    }

}
