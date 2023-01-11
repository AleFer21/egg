package com.egg.news.entidades;

import com.egg.news.enums.Rol;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Periodista extends Usuario {
    
    @OneToMany
    private List<Noticia> misNoticias;
    
    private Integer sueldoMensual;

    public Periodista() {
    }

    public Periodista(List<Noticia> misNoticias, Integer sueldoMensual) {
        this.misNoticias = misNoticias;
        this.sueldoMensual = sueldoMensual;
    }

    public Periodista(List<Noticia> misNoticias, Integer sueldoMensual, Integer id, String nombreUsuario, String password, Date fechaAlta, Rol rol, Boolean activo) {
        super(id, nombreUsuario, password, fechaAlta, rol, activo);
        this.misNoticias = misNoticias;
        this.sueldoMensual = sueldoMensual;
    }

    public List<Noticia> getMisNoticias() {
        return misNoticias;
    }

    public void setMisNoticias(List<Noticia> misNoticias) {
        this.misNoticias = misNoticias;
    }

    public Integer getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(Integer sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

}
