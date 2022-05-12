/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ap.ap.models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;

    @Basic
    private String tituloEdu;
    private int fechaIniEdu;
    private int fechaFinEdu;
    private String descEdu;
    private String imagenEdu;

    public Educacion() {

    }

    public Educacion(Long idEdu, int fechaIniEdu, int fechaFinEdu, String descEdu, String imagenEdu) {
        this.idEdu = idEdu;
        this.fechaIniEdu = fechaIniEdu;
        this.fechaFinEdu = fechaFinEdu;
        this.descEdu = descEdu;
        this.imagenEdu = imagenEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public int getFechaIniEdu() {
        return fechaIniEdu;
    }

    public void setFechaIniEdu(int fechaIniEdu) {
        this.fechaIniEdu = fechaIniEdu;
    }

    public int getFechaFinEdu() {
        return fechaFinEdu;
    }

    public void setFechaFinEdu(int fechaFinEdu) {
        this.fechaFinEdu = fechaFinEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public String getImagenEdu() {
        return imagenEdu;
    }

    public void setImagenEdu(String imagenEdu) {
        this.imagenEdu = imagenEdu;
    }

}
