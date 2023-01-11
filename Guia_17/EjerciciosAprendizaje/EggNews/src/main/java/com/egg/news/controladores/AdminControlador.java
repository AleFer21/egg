package com.egg.news.controladores;

import com.egg.news.entidades.Noticia;
import com.egg.news.entidades.Periodista;
import com.egg.news.excepciones.MiException;
import com.egg.news.servicios.AdminServicio;
import com.egg.news.servicios.NoticiaServicio;
import com.egg.news.servicios.PeriodistaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class AdminControlador {

    @Autowired
    private AdminServicio adminServicio;
    
    @Autowired
    private NoticiaServicio noticiaServicio;
    
    @Autowired
    private PeriodistaServicio periodistaServicio;

    @GetMapping("/dashboard")
    public String panelAdministrativo(ModelMap modelo) {
        List<Periodista> periodistas = periodistaServicio.listarPeriodistas();
        modelo.addAttribute("periodistas", periodistas);
        List<Noticia> noticias = noticiaServicio.listarNoticias();
        modelo.addAttribute("noticias", noticias);
        return "panel.html";
    }

    @GetMapping("/registroPeriodista")
    public String crearPeriodista() {
        return "registroPeriodista.html";
    }

    @PostMapping("/registroPeriodista")
    public String crearPeriodista(@RequestParam String nombreUsuario, @RequestParam String password, @RequestParam int sueldoMensual, ModelMap modelo) {
        try {
            adminServicio.crearPeriodista(nombreUsuario, password, sueldoMensual);
            modelo.put("exito", "Periodista registrado con exito!.");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            modelo.put("nombreUsuario", nombreUsuario);
            modelo.put("password", password);
            modelo.put("sueldoMensual", sueldoMensual);
        }
        return "panel.html";
    }
    
    @GetMapping("/darBaja/{id}")
    public String darBaja(@PathVariable int id, ModelMap modelo) {
        modelo.put("periodista", periodistaServicio.getOne(id));
        return "darBaja.html";
    }
    
    @PostMapping("/darBaja/{id}")
    public String darBaja(@PathVariable int id, String nombreUsuario, ModelMap modelo) {
        try {
            adminServicio.darBaja(id);
            modelo.put("exito", "Periodista dado de baja con exito!.");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
        }
        return "redirect:/admin/dashboard";
    }
    
    @GetMapping("/modificarSueldo/{id}")
    public String modificarSueldo(@PathVariable int id, ModelMap modelo) {
        modelo.put("periodista", periodistaServicio.getOne(id));
        return "modificarSueldo.html";
    }

    @PostMapping("/modificarSueldo/{id}")
    public String modificarSueldo(@PathVariable Integer id, int sueldoMensual, ModelMap modelo) {
        try {
            adminServicio.modificarSueldo(id, sueldoMensual);
            modelo.put("exito", "Periodista dado de baja con exito!.");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            modelo.put("sueldoMensual", sueldoMensual);
        }
        return "redirect:/admin/dashboard";
    }

}
