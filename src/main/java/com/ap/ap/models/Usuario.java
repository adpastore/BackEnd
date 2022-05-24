package com.ap.ap.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Basic
    private String nombre;
    private String apellido;
    private String titulo;
    private String fotoPeril;
    private String acerca;
    private String acercas;
    private String acercas2;
    private String telefono;
    private String mail;
    private String facebook;
    private String github;
    private String instagram;
    private String imagen;

    //Se mapea con las Clases Educacion/Habilidades/Experiencias 
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idHab")
    private List<Habilidades> habilidadesList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String apellido, String titulo, String fotoPeril, 
            String acerca, String acercas, String acercas2,String telefono, String mail, String facebook, String github, 
            String instagram, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.fotoPeril = fotoPeril;
        this.acerca = acerca;
        this.acercas = acercas;
        this.acercas2 = acercas2;
        this.telefono = telefono;
        this.mail = mail;
        this.facebook = facebook;
        this.github = github;
        this.instagram = instagram;
        this.imagen = imagen;
    }

}
