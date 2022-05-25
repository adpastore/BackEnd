package com.ap.ap.controller;

import com.ap.ap.services.PotenciasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/potencias")

public class PotenciasController {
     private final PotenciasService potenciasService;

    public PotenciasController(PotenciasService potenciasService) {
        this.potenciasService = potenciasService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Potencias>> obtenerPotencias(){
    List<Potencias> experiencia=potenciasService.buscarPotencias();
    return new ResponseEntity<>(experiencia, HttpStatus.OK);
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
