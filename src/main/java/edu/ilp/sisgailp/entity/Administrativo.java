package edu.ilp.sisgailp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Aministrativo")
@PrimaryKeyJoinColumn(referencedColumnName = "idadmin")
public class Administrativo extends Persona{

    @Column(name = "codigo", length = 10, nullable = false)
    private String codigo;

    @Column(name = "serie", length = 50)
    private String serie;

    public Administrativo(Long idPersona, String codigo, String serie) {
        super(idPersona);
        this.codigo = codigo;
        this.serie = serie;
    }

    public Administrativo(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, String codigo, String serie) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.codigo = codigo;
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Administrativo(Long idPersona) {
        super(idPersona);
    }

    public Administrativo(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
    }
}
