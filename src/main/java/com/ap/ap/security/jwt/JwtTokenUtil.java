package com.ap.ap.security.jwt;

import com.ap.ap.models.UserLog;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenUtil.class);
    private static final long EXPIRE_DURATION=2*60*60*1000;
    @Value("${app.jwt.secret}")
    private String secretKey;

    public String generateAccessToken(UserLog userLog) {
        return Jwts.builder()
                .setSubject(userLog.getId() + "," + userLog.getEmail())
                .setIssuer("CodeJava")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRE_DURATION))
                .signWith(SignatureAlgorithm.HS512, secretKey)
                .compact();
    }
    //Validaciones o errores de token
    public boolean validateAccessToken(String token) {
        try {
            Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
            return true;

        } catch (ExpiredJwtException ex) {
            LOGGER.error("El JWT expiró", ex);

        } catch (IllegalArgumentException ex) {
            LOGGER.error("El Token es nulo, está vacio o tiene espacios en blanco", ex);

        } catch (MalformedJwtException ex) {
            LOGGER.error("El JWT es invalido", ex);

        } catch (UnsupportedJwtException ex) {
            LOGGER.error("El JWT no es soportado", ex);

        } catch (SignatureException ex) {
            LOGGER.error("La validacion de firma falló", ex);

        }
        return false;
    }
    // Trae el sujeto del token
    public String getSubject(String token) {
        return parseClaims(token).getSubject();
    }

    private Claims parseClaims(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody();
    }
}
