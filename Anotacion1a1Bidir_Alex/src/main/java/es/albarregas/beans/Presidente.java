/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 *
 * @author Alex
 */
@Entity
@Table(name = "presidente1a1Anot")
public class Presidente implements Serializable {

    @Id
    @GeneratedValue(generator = "gen")
    @GenericGenerator(name = "gen", strategy = "foreign", parameters = @Parameter(name = "property", value = "pais"))
    @Column(name = "idPresidente")
    private int idPresidente;

    
    @Column(name = "nombrePresidente", length = 30, nullable = false)
    private String nombrePresidente;

    
    @OneToOne(cascade = {CascadeType.ALL})
    @PrimaryKeyJoinColumn
    private Pais pais;

    public Presidente() {
    }

    public Presidente(int idPresidente, String nombrePresidente, Pais pais) {
        this.idPresidente = idPresidente;
        this.nombrePresidente = nombrePresidente;
        this.pais = pais;
    }

    public int getIdPresidente() {
        return idPresidente;
    }

    public void setIdPresidente(int idPresidente) {
        this.idPresidente = idPresidente;
    }

    public String getNombrePresidente() {
        return nombrePresidente;
    }

    public void setNombrePresidente(String nombrePresidente) {
        this.nombrePresidente = nombrePresidente;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
