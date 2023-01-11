package com.egg.news.servicios;

import com.egg.news.entidades.Usuario;
import com.egg.news.enums.Rol;
import com.egg.news.excepciones.MiException;
import com.egg.news.repositorios.UsuarioRepositorio;
import java.util.*;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Service
public class UsuarioServicio implements UserDetailsService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Transactional
    public void registrar(String nombreUsuario, String password) throws MiException {
        validar(nombreUsuario, password);
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario(nombreUsuario);
        usuario.setPassword(new BCryptPasswordEncoder().encode(password));
        Date fechaAlta = new Date();
        usuario.setFechaAlta(fechaAlta);
        usuario.setRol(Rol.USER);
        Boolean activo = Boolean.TRUE;
        usuario.setActivo(activo);
        usuarioRepositorio.save(usuario);
    }

    private void validar(String nombreUsuario, String password) throws MiException {
        if (nombreUsuario.isEmpty() || nombreUsuario == null) {
            throw new MiException("El nombre de usuario es obligatorio.");
        }
        if (password.isEmpty() || password == null || password.length() <= 6) {
            throw new MiException("Por favor ingrese una contraseña de 6 o mas digitos.");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepositorio.buscarPorNombreUsuario(username);
        if (usuario != null) {
            List<GrantedAuthority> permisos = new ArrayList();
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());
            permisos.add(p);
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession session = attr.getRequest().getSession(true);
            session.setAttribute("usuariosession", usuario);
            return new User(usuario.getNombreUsuario(), usuario.getPassword(), permisos);
        } else {
            return null;
        }
    }

}
