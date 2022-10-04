package edificio;

public class EdificioDeOficinas extends Edificio {

    private Integer nroOficinas;
    private Integer cantPersonas;
    private Integer nroPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer nroOficinas, Integer cantPersonas, Integer nroPisos) {
        this.nroOficinas = nroOficinas;
        this.cantPersonas = cantPersonas;
        this.nroPisos = nroPisos;
    }

    public EdificioDeOficinas(Integer nroOficinas, Integer cantPersonas, Integer nroPisos, Integer alto, Integer ancho, Integer largo) {
        super(alto, ancho, largo);
        this.nroOficinas = nroOficinas;
        this.cantPersonas = cantPersonas;
        this.nroPisos = nroPisos;
    }

    public Integer getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(Integer nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public Integer getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(Integer cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Integer getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(Integer nroPisos) {
        this.nroPisos = nroPisos;
    }

    @Override
    public void calcularSuperficie() {
        int superficie = this.ancho * this.largo;
        System.out.println("La superficie del edificio es: " + superficie + " mts^2.");
    }

    @Override
    public void calcularVolumen() {
        int volumen = this.alto * this.ancho * this.largo;
        System.out.println("El volumen del edificio es: " + volumen + " mts^3.");
    }

    public void cantPersonas() {
        int perPiso = this.cantPersonas * this.nroOficinas;
        System.out.println("La cantidad de personas por piso es: " + perPiso + " personas.");
        int perEdificio = perPiso * this.nroPisos;
        System.out.println("La cantidad de personas por edificio es: " + perEdificio + " personas.");
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "nro de ficinas: " + nroOficinas + ", cant de personas:" + cantPersonas + ""
                + "\n, nro de pisos:" + nroPisos + super.toString() + '}';
    }

}
