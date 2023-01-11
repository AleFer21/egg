package com.egg.news.servicios;

import com.egg.news.entidades.Periodista;
import com.egg.news.repositorios.PeriodistaRepositorio;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PeriodistaServicio {
    
    @Autowired
    private PeriodistaRepositorio periodistaRepositorio;
    
    public List<Periodista> listarPeriodistas() {
        List<Periodista> periodistas = new ArrayList();
        periodistas = periodistaRepositorio.findAll();
        return periodistas;
    }
    
    @Transactional(readOnly = true)
    public Periodista getOne(Integer id) {
        return periodistaRepositorio.getOne(id);
    }
    
}
