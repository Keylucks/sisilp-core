package edu.ilp.sisgailp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "persona")
@Inheritance( strategy = InheritanceType.JOINED )
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona", length = 10)
    private Long idPersona;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;

    @Column(name = "fecha_nacimiento", length = 50)
    private Date fechaNacimiento;

    private String genero;

    public Persona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Persona(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    //get - set
    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
