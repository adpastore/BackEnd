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
public class Potencias {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPot;

    @Basic
    private String potencia;
    private int valor;

    public Potencias() {
    }

    public Potencias(Long idPot, String potencia, int valor) {
        this.idPot = idPot;
        this.potencia = potencia;
        this.valor = valor;
    }

   
}
