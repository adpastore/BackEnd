package com.ap.ap.repository;

import com.ap.ap.models.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;


//Se relaciona con models
public interface IHabilidadesRepo extends JpaRepository<Habilidades, Long>{
    
}
