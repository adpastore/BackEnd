package com.ap.ap.repository;

import com.ap.ap.models.Usuario;
import org.hibernate.criterion.IdentifierProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long> {

      public void deleteById(IdentifierProjection id);

      
        
}
