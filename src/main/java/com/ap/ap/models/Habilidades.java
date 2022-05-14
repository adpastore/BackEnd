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
public class Habilidades {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHab;

    @Basic
    private String nombreHab;
    private String descHab;
    private String imagenHab;
    private int porcHab;

    public Habilidades() {

    }

    public Habilidades(Long idHab, String nombreHab, String descHab, String imagenHab, int porcHab) {
        this.idHab = idHab;
        this.nombreHab = nombreHab;
        this.descHab = descHab;
        this.imagenHab = imagenHab;
        this.porcHab = porcHab;
    }
}