package com.ap.ap.services;

import com.ap.ap.exception.UserNotFoundException;
import com.ap.ap.models.Usuario;
import java.util.List;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ap.ap.repository.IUsuarioRepo;

@Service
@Transactional
public class UsuarioService {

    private final IUsuarioRepo usuarioRepo;

    @Autowired
    public UsuarioService(IUsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    //Se declara el CRUM
    public Usuario addUser(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }
    public List<Usuario> buscarUsuario() {
        return usuarioRepo.findAll();
    }
    public Usuario editarUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario); 
    }

    //Se declara sólo por tener todo declarado.
    public void deleteUsuario(Long id) {
        usuarioRepo.deleteById(id());
    }
    
    public Usuario buscaUsuarioPorId(Long id){
        return usuarioRepo.findById(id).orElseThrow(()-> new UserNotFoundException("Usuario no encontrado"));
    }

  }
