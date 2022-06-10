package com.ap.ap.security;

import javax.validation.constraints.Email;
import org.hibernate.validator.constraints.Length;

public class AuthRequest {
    @Email
    @Length (min=4, max=50)
    private String email;
    @Length (min=4, max=50)
    private String password;
    
    public String getEmail(){
    return email;
}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
