package com.ap.ap.repository;

import com.ap.ap.models.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;


//Se relaciona con models
public interface EducacionRepo extends JpaRepository<Educacion, Long>{

}
