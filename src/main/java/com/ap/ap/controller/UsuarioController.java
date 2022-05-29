package com.ap.ap.controller;

import com.ap.ap.models.Usuario;
import com.ap.ap.services.UsuarioService;
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
@RequestMapping("/usuario")

public class UsuarioController {
        
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id")Long id){
        Usuario usuario=usuarioService.buscaUsuarioPorId(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    
      @GetMapping("/all")
    public ResponseEntity<List<Usuario>> obtenerUsuario(){
    List<Usuario> usuario=usuarioService.buscarUsuario();
    return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    
    
    @PutMapping("/editar")
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario)  {
        Usuario updateUsuario=usuarioService.editarUsuario(usuario);
        return new ResponseEntity<>(updateUsuario,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario)  {
        Usuario nuevaUsuario=usuarioService.addUser(usuario);
        return new ResponseEntity<>(nuevaUsuario,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUsuario(@PathVariable("id")Long id){
        usuarioService.deleteUsuario(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
 