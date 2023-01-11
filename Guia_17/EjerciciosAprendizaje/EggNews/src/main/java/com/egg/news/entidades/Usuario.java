package com.egg.news.entidades;

import com.egg.news.enums.Rol;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nombreUsuario;
    private String password;
    
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;
    
    @Enumerated(EnumType.STRING)
    private Rol rol;
    
    private Boolean activo;

    public Usuario() {
    }

    public Usuario(Integer id, String nombreUsuario, String password, Date fechaAlta, Rol rol, Boolean activo) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.fechaAlta = fechaAlta;
        this.rol = rol;
        this.activo = activo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
}
