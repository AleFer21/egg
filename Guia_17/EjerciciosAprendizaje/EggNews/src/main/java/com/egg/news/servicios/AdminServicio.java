package com.egg.news.servicios;

import com.egg.news.entidades.Periodista;
import com.egg.news.enums.Rol;
import com.egg.news.excepciones.MiException;
import com.egg.news.repositorios.PeriodistaRepositorio;
import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminServicio {

    @Autowired
    private PeriodistaRepositorio periodistaRepositorio;

    public void crearPeriodista(String nombreUsuario, String password, int sueldoMensual) throws MiException {
        validar(nombreUsuario, password, sueldoMensual);
        Periodista periodista = new Periodista();
        periodista.setNombreUsuario(nombreUsuario);
        periodista.setPassword(new BCryptPasswordEncoder().encode(password));
        periodista.setSueldoMensual(sueldoMensual);
        Date fechaAlta = new Date();
        periodista.setFechaAlta(fechaAlta);
        periodista.setRol(Rol.PERIODISTA);
        Boolean activo = Boolean.TRUE;
        periodista.setActivo(activo);
        periodistaRepositorio.save(periodista);
    }

    public void darBaja(int id) throws MiException {
        if (id < 0) {
            throw new MiException("El id no puede ser nulo.");
        }
        Optional<Periodista> respuesta = periodistaRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Periodista periodista = respuesta.get();
            Boolean baja = Boolean.FALSE;
            periodista.setActivo(baja);
            periodistaRepositorio.save(periodista);
        }
    }

    public void modificarSueldo(int id, int sueldoMensual) throws MiException {
        if (id < 0) {
            throw new MiException("El id no puede ser nulo.");
        }
        if (sueldoMensual < 0) {
            throw new MiException("El sueldo no puede ser nulo.");
        }
        Optional<Periodista> respuesta = periodistaRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Periodista periodista = respuesta.get();
            periodista.setSueldoMensual(sueldoMensual);
            periodistaRepositorio.save(periodista);
        }
    }

    private void validar(String nombreUsuario, String password, int sueldoMensual) throws MiException {
        if (nombreUsuario.isEmpty() || nombreUsuario == null) {
            throw new MiException("El nombre de usuario es obligatorio.");
        }
        if (password.isEmpty() || password == null || password.length() <= 6) {
            throw new MiException("Por favor ingrese una contraseña de 6 o mas digitos.");
        }
        if (sueldoMensual < 0) {
            throw new MiException("Por favor asigne un sueldo al periodista.");
        }
    }

}
