package com.egg.news.entidades;

import com.egg.news.enums.Rol;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(Integer id, String nombreUsuario, String password, Date fechaAlta, Rol rol, Boolean activo) {
        super(id, nombreUsuario, password, fechaAlta, rol, activo);
    }

}
