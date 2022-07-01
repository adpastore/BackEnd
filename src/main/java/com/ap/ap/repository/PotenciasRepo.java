package com.ap.ap.repository;

import com.ap.ap.models.Potencias;
import org.springframework.data.jpa.repository.JpaRepository;

//Se relaciona con models
public interface PotenciasRepo  extends JpaRepository<Potencias, Long>{
    
}
