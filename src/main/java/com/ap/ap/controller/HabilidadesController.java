package com.ap.ap.controller;

import com.ap.ap.models.Habilidades;
import com.ap.ap.services.HabilidadesService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")

public class HabilidadesController {
    private final HabilidadesService habilidadesService;

    public HabilidadesController(HabilidadesService habilidadesService) {
        this.habilidadesService = habilidadesService;
    }
        
      @GetMapping("/all")
    public ResponseEntity<List<Habilidades>> obtenerHabilidades(){
    List<Habilidades> habilidades=habilidadesService.buscarHabilidades();
    return new ResponseEntity<>(habilidades, HttpStatus.OK);
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Habilidades> editarHabilidades(@RequestBody Habilidades habilidades)  {
        Habilidades updateHabilidades=habilidadesService.editarHabilidades(habilidades);
        return new ResponseEntity<>(updateHabilidades,HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Habilidades> crearHabilidades(@RequestBody Habilidades habilidades)  {
        Habilidades nuevaHabilidades=habilidadesService.addHabilidades(habilidades);
        return new ResponseEntity<>(nuevaHabilidades,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteHabilidades(@PathVariable("id")Long id)  {
        habilidadesService.deleteHabilidades(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
