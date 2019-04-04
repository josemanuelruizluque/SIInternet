/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Usuario
 */
@Entity
public class Joven extends Beneficiario implements Serializable {

    private static final long serialVersionUID = 1L;
    @OneToMany (mappedBy = "joven")
    private List<Beca> becas;
    
    @Column(nullable = false)
    private String apellidos;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_nacimiento;
    private Integer numero_familiares;
    private String situacion_economica;

    public List<Beca> getBecas() {
        return becas;
    }

    public void setBecas(List<Beca> becas) {
        this.becas = becas;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Integer getNumero_familiares() {
        return numero_familiares;
    }

    public void setNumero_familiares(Integer numero_familiares) {
        this.numero_familiares = numero_familiares;
    }

    public String getSituacion_economica() {
        return situacion_economica;
    }

    public void setSituacion_economica(String situacion_economica) {
        this.situacion_economica = situacion_economica;
    }

    public Joven() {
    }

    
   
}
