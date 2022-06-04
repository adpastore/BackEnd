package com.ap.ap.services;

import com.ap.ap.exception.UserNotFoundException;
import com.ap.ap.models.Habilidades;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ap.ap.repository.IHabilidadesRepo;

@Service //declaracion del servicio
@Transactional //union con el controlador y control de metodos
public class HabilidadesService {
    
    private final IHabilidadesRepo habilidadesRepo;
    
    @Autowired
    public HabilidadesService(IHabilidadesRepo habilidadesRepo)  {
        this.habilidadesRepo = habilidadesRepo;
    }
    
    //Declaramos el CRUM
    public Habilidades addHabilidades(Habilidades habilidades){
        return habilidadesRepo.save(habilidades);
    }
    
    public List<Habilidades> buscarHabilidades(){
        return habilidadesRepo.findAll();
    }
    
    public Habilidades editarHabilidades(Habilidades habilidades){
        return habilidadesRepo.save(habilidades);
    }
    
    public void deleteHabilidades(Long id){
        habilidadesRepo.deleteById(id);
    }
    
    public Habilidades buscaHabilidadesPorId(Long id){
        return habilidadesRepo.findById(id).orElseThrow(()-> new UserNotFoundException("Habilidades no encontrada"));
    }
}

