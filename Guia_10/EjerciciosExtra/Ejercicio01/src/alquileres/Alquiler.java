package alquileres;

import barcos.Barco;
import java.util.Date;

public class Alquiler {
    
    protected String nombreCliente;
    protected Integer dniCliente;
    protected Date fechaAlquiler;
    protected Date fechaDevolucion;
    protected String posicionAmarre;
    protected Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, Integer dniCliente, Date fechaAlquiler, Date fechaDevolucion, String posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Integer getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(Integer dniCliente) {
        this.dniCliente = dniCliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre del cliente: " + nombreCliente + ", dni del cliente: " + dniCliente +
                "\n, fecha de alquiler: " + fechaAlquiler + ", fecha de devolucion: " + fechaDevolucion + 
                "\n, posicion de amarre: " + posicionAmarre + ", barco: " + barco + '}';
    }
    
}
