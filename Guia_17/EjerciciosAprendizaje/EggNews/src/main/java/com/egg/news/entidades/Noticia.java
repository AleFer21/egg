package com.egg.news.entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Noticia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String titulo;
    private String cuerpo;
    
    @ManyToOne
    private Periodista periodista;

    @OneToOne
    private Imagen imagen;

    public Noticia() {
    }

    public Noticia(Integer id, String titulo, String cuerpo, Periodista periodista, Imagen imagen) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.periodista = periodista;
        this.imagen = imagen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Periodista getPeriodista() {
        return periodista;
    }

    public void setPeriodista(Periodista periodista) {
        this.periodista = periodista;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

}
