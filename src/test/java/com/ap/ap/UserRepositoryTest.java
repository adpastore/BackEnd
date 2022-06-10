package com.ap.ap;

import com.ap.ap.models.UserLog;
import com.ap.ap.repository.IUserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest{
    @Autowired
    IUserRepo repo;
    
    @Test
    public void testCreateUser(){
        PasswordEncoder passwordEncoder =new BCryptPasswordEncoder();
        String rawPassword = "123456";
        String encodePassword=passwordEncoder.encode(rawPassword);
        UserLog newUser= new UserLog("adpastore@gmail.com",encodePassword);
        UserLog savedUser=repo.save(newUser);
        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getId()).isGreaterThan(0);
    }
}
