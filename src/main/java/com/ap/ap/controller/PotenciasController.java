package com.ap.ap.controller;

import com.ap.ap.models.Potencias;
import com.ap.ap.services.PotenciasService;
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
@RequestMapping("/api/potencias")

public class PotenciasController {
     private final PotenciasService potenciasService;

    public PotenciasController(PotenciasService potenciasService) {
        this.potenciasService = potenciasService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Potencias>> obtenerPotencias(){
    List<Potencias> potencias=potenciasService.buscarPotencias();
    return new ResponseEntity<>(potencias, HttpStatus.OK);
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Potencias> editarPotencias(@RequestBody Potencias potencias)  {
        Potencias updatePotencias=potenciasService.editarPotencias(potencias);
        return new ResponseEntity<>(updatePotencias,HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Potencias> crearPotencias(@RequestBody Potencias potencias)  {
        Potencias nuevaPotencias=potenciasService.addPotencias(potencias);
        return new ResponseEntity<>(nuevaPotencias,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePotencias(@PathVariable("id")Long id)  {
        potenciasService.deletePotencias(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
