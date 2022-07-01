package com.ap.ap.models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;

    @Basic
    private String nombreExp;
    private int fechaIniExp;
    private int fechaFinExp;
    private String descExp;
    private String imagenExp;
    private String lugarExp;
    private String asigExp;

    public Experiencia() {

    }

    public Experiencia(Long idExp, String nombreExp, int fechaIniExp, int fechaFinExp, String descExp, String imagenExp, String lugarExp, String asigExp) {
        this.idExp = idExp;
        this.nombreExp = nombreExp;
        this.fechaIniExp = fechaIniExp;
        this.fechaFinExp = fechaFinExp;
        this.descExp = descExp;
        this.imagenExp = imagenExp;
        this.lugarExp = lugarExp;
        this.asigExp = asigExp;
    }
}
