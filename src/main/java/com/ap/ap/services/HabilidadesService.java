package com.ap.ap.services;

import com.ap.ap.models.Habilidades;
import com.ap.ap.repository.HabilidadesRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //declaracion del servicio
@Transactional //union con el controlador y control de metodos
public class HabilidadesService {
    
    private final HabilidadesRepo habilidadesRepo;
    
    @Autowired
    public HabilidadesService(HabilidadesRepo habilidadesRepo)  {
        this.habilidadesRepo = habilidadesRepo;
    }
    
    //Declaramos el CRUM
    public Habilidades addHabilidades(Habilidades habilidades){
        return habilidadesRepo.save(habilidades);
    }
    
    public List<Habilidades> buscarHabilidades(){
        return habilidadesRepo.findAll();
    }
    
    public Habilidades editarExperiencia(Habilidades habilidades){
        return habilidadesRepo.save(habilidades);
    }
    
    public void borrarExperiencia(Long id){
        habilidadesRepo.deleteById(id);
    }
}

