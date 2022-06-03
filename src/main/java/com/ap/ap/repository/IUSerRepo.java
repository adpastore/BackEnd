package com.ap.ap.repository;

import com.ap.ap.models.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUSerRepo extends JpaRepository<UserLog, Integer>{
    
    
}
