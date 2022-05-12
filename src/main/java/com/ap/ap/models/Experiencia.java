package com.ap.ap.models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    public Experiencia() {

    }

    public Experiencia(Long idExp, String nombreExp, int fechaIniExp, int fechaFinExp, String descExp, String imagenExp) {
        this.idExp = idExp;
        this.nombreExp = nombreExp;
        this.fechaIniExp = fechaIniExp;
        this.fechaFinExp = fechaFinExp;
        this.descExp = descExp;
        this.imagenExp = imagenExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public int getFechaIniExp() {
        return fechaIniExp;
    }

    public void setFechaIniExp(int fechaIniExp) {
        this.fechaIniExp = fechaIniExp;
    }

    public int getFechaFinExp() {
        return fechaFinExp;
    }

    public void setFechaFinExp(int fechaFinExp) {
        this.fechaFinExp = fechaFinExp;
    }

    public String getDescExp() {
        return descExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }

    public String getImagenExp() {
        return imagenExp;
    }

    public void setImagenExp(String imagenExp) {
        this.imagenExp = imagenExp;
    }

}
