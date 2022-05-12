package com.ap.ap.services;

import com.ap.ap.models.Usuario;
import com.ap.ap.repository.UsuarioRepo;
import java.util.List;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService {

    private final UsuarioRepo usuarioRepo;

    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo) {
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
    public void borrarUsuario(Long id) {
        usuarioRepo.deleteById(id());
    }
}
