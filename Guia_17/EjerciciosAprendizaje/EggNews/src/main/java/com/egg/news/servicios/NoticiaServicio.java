package com.egg.news.servicios;

import com.egg.news.entidades.Imagen;
import com.egg.news.entidades.Noticia;
import com.egg.news.excepciones.MiException;
import com.egg.news.repositorios.NoticiaRepositorio;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
public class NoticiaServicio {

    @Autowired
    private NoticiaRepositorio noticiaRepositorio;
    
    @Autowired
    private ImagenServicio imagenServicio;

    @Transactional
    public void crearNoticia(String titulo, String cuerpo, MultipartFile archivo) throws MiException {
        validar(titulo, cuerpo);
        Noticia noticia = new Noticia();
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        Imagen imagen = imagenServicio.guardar(archivo);
        noticia.setImagen(imagen);
        noticiaRepositorio.save(noticia);
    }
    
    private void validar(String titulo, String cuerpo) throws MiException {
        if (titulo.isEmpty() || titulo == null) {
            throw new MiException("El titulo no puede ser nulo o vacio.");
        }
        if (cuerpo.isEmpty() || cuerpo == null) {
            throw new MiException("El cuerpo no puede ser nulo o vacio.");
        }
    }

    @Transactional(readOnly = true)
    public Noticia getOne(Integer id) {
        return noticiaRepositorio.getOne(id);
    }

    public List<Noticia> listarNoticias() {
        List<Noticia> noticias = new ArrayList();
        noticias = noticiaRepositorio.findAll();
        return noticias;
    }

    @Transactional
    public void modificarNoticia(String titulo, String cuerpo, Integer id, MultipartFile archivo) throws MiException {
        validar(titulo, cuerpo);
        if (id < 0) {
            throw new MiException("El id no puede ser nulo.");
        }
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();
            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);
            int idImagen = 0;
            if(noticia.getImagen() != null) {
                idImagen = noticia.getImagen().getId();
            }
            Imagen imagen = imagenServicio.actualizar(archivo, idImagen);
            noticia.setImagen(imagen);
            noticiaRepositorio.save(noticia);
        }
    }

    @Transactional
    public void eliminar(Integer id) {
        Noticia noticia = noticiaRepositorio.getById(id);
        noticiaRepositorio.delete(noticia);
    }

}
