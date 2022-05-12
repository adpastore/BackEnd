package com.ap.ap.repository;

import com.ap.ap.models.Experiencia;
import javax.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExperienciaRepo extends JpaRepository<Experiencia, Id> {
    
}
