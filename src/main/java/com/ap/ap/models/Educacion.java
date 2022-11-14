package com.ap.ap.models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
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
    private String sedeEdu;

    public Educacion() {

    }

    public Educacion(Long idEdu, String tituloEdu, int fechaIniEdu, int fechaFinEdu, String descEdu, String imagenEdu, String sedeEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaIniEdu = fechaIniEdu;
        this.fechaFinEdu = fechaFinEdu;
        this.descEdu = descEdu;
        this.imagenEdu = imagenEdu;
        this.sedeEdu = sedeEdu;
    }

}
