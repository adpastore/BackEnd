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
    private int telefono;
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

    public Usuario(Long id, String nombre, String apellido, String titulo, String fotoPeril, String acerca, int telefono, String mail, String facebook, String github, String instagram, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.fotoPeril = fotoPeril;
        this.acerca = acerca;
        this.telefono = telefono;
        this.mail = mail;
        this.facebook = facebook;
        this.github = github;
        this.instagram = instagram;
        this.imagen = imagen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFotoPeril() {
        return fotoPeril;
    }

    public void setFotoPeril(String fotoPeril) {
        this.fotoPeril = fotoPeril;
    }

    public String getAcerca() {
        return acerca;
    }

    public void setAcerca(String acerca) {
        this.acerca = acerca;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
