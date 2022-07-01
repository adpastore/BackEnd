package com.ap.ap.services;

import com.ap.ap.exception.UserNotFoundException;
import com.ap.ap.models.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ap.ap.repository.IExperienciaRepo;

@Service //declaracion del servicio
@Transactional //union con el controlador y control de metodos
public class ExperienciaService {
    
    private final IExperienciaRepo experienciaRepo;
    
    @Autowired
    public ExperienciaService(IExperienciaRepo experienciaRepo){
        this.experienciaRepo = experienciaRepo;
    }
    
    //Declaramos el CRUM
    public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    
    public List<Experiencia> buscarExperiencias(){
        return experienciaRepo.findAll();
    }
    
    public Experiencia editarExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    
    public void deleteExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
    
    public Experiencia buscaExperienciaPorId(Long id){
        return experienciaRepo.findById(id).orElseThrow(()-> new UserNotFoundException("Experiencia no encontrada"));
    }
}