package com.egg.news.controladores;

import com.egg.news.entidades.Noticia;
import com.egg.news.excepciones.MiException;
import com.egg.news.servicios.NoticiaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/eggnews")
public class NoticiaControlador {

    @Autowired
    private NoticiaServicio noticiaServicio;

    @GetMapping("/noticia")
    public String noticias(ModelMap modelo) {
        List<Noticia> noticias = noticiaServicio.listarNoticias();
        modelo.addAttribute("noticias", noticias);
        return "noticia.html";
    }
    
    @GetMapping("/vistaNoticia/{id}")
    public String vistaNoticia(@PathVariable Integer id, ModelMap modelo) {
        modelo.put("noticia", noticiaServicio.getOne(id));
        return "vistaNoticia.html";
    }
    

    @GetMapping("/crearNoticia")
    public String crearNotica() {
        return "crearNoticia.html";
    }

    @PostMapping("/redactarNoticia")
    public String redactarNoticia(@RequestParam String titulo, @RequestParam String cuerpo, MultipartFile archivo, ModelMap modelo) {
        try {
            noticiaServicio.crearNoticia(titulo, cuerpo, archivo);
            modelo.put("exito","Notica creada correctamente.");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "crearNoticia.html";
        }
        return "noticia.html";
    }

    @GetMapping("/modificarNoticia/{id}")
    public String modificarNoticia(@PathVariable Integer id, ModelMap modelo) {
        modelo.put("noticia", noticiaServicio.getOne(id));
        return "modificarNoticia.html";
    }

    @PostMapping("/modificarNoticia/{id}")
    public String modificarNoticia(@PathVariable Integer id, String titulo, String cuerpo, MultipartFile archivo, ModelMap modelo) {
        try {
            noticiaServicio.modificarNoticia(titulo, cuerpo, id, archivo);
            modelo.put("exito", "Noticia modificada correctamente.");
            return "noticia.html";
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "noticia.html";
        }
    }

    public String eliminar(@PathVariable Integer id, ModelMap modelo) {
        noticiaServicio.eliminar(id);
        return "noticia.html";
    }

}
