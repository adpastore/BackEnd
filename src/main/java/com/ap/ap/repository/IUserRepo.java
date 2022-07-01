package com.ap.ap.repository;

import com.ap.ap.models.UserLog;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<UserLog, Integer>{
    
    Optional<UserLog> findByEmail(String email);
    
}
