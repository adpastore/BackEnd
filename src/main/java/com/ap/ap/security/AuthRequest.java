package com.ap.ap.security;

import javax.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class AuthRequest {
    @Email
    @Length (min=4, max=50)
    private String email;
    @Length (min=4, max=50)
    private String password;
    
    public String getEmail(){
    return email;
}
    
}
