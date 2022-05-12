package com.ap.ap.models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    public Long getIdHab() {
        return idHab;
    }

    public void setIdHab(Long idHab) {
        this.idHab = idHab;
    }

    public String getNombreHab() {
        return nombreHab;
    }

    public void setNombreHab(String nombreHab) {
        this.nombreHab = nombreHab;
    }

    public String getDescHab() {
        return descHab;
    }

    public void setDescHab(String descHab) {
        this.descHab = descHab;
    }

    public String getImagenHab() {
        return imagenHab;
    }

    public void setImagenHab(String imagenHab) {
        this.imagenHab = imagenHab;
    }

    public int getPorcHab() {
        return porcHab;
    }

    public void setPorcHab(int porcHab) {
        this.porcHab = porcHab;
    }
    
    
}