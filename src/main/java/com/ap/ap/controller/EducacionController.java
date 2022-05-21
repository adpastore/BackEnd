package com.ap.ap.controller;

import com.ap.ap.models.Educacion;
import com.ap.ap.services.EducacionService;
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
@RequestMapping("/educacion")

public class EducacionController {
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> obtenerEducacion(){
    List<Educacion> educaciones=educacionService.buscarEducacion();
    return new ResponseEntity<>(educaciones, HttpStatus.OK);
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion)  {
        Educacion updateEducacion=educacionService.editarEducacion(educacion);
        return new ResponseEntity<>(updateEducacion,HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion)  {
        Educacion nuevaEducacion=educacionService.addEducacion(educacion);
        return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducacion(@PathVariable("id")Long id){
        educacionService.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
