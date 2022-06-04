package com.ap.ap.repository;

import com.ap.ap.models.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;


//Se relaciona con models
public interface IExperienciaRepo extends JpaRepository<Experiencia, Long> {
    
}
