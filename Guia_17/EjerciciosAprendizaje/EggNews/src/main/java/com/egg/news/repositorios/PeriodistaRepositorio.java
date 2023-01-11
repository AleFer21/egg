package com.egg.news.repositorios;

import com.egg.news.entidades.Periodista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodistaRepositorio extends JpaRepository<Periodista, Integer> {
}
