package com.ap.ap.security;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthResponse {
    private String email;
    private String accesToken;

    public AuthResponse() {
    }

    public AuthResponse(String email, String accesToken) {
        this.email = email;
        this.accesToken = accesToken;
    }
    
    
}
