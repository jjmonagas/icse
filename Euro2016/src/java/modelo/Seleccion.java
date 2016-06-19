/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jjmonagas
 */
@Entity
@Table(name = "seleccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seleccion.findAll", query = "SELECT s FROM Seleccion s"),
    @NamedQuery(name = "Seleccion.findById", query = "SELECT s FROM Seleccion s WHERE s.id = :id"),
    @NamedQuery(name = "Seleccion.findByNombre", query = "SELECT s FROM Seleccion s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "Seleccion.findByGrupo", query = "SELECT s FROM Seleccion s WHERE s.grupo = :grupo"),
    @NamedQuery(name = "Seleccion.findByPuntos", query = "SELECT s FROM Seleccion s WHERE s.puntos = :puntos"),
    @NamedQuery(name = "Seleccion.findByPj", query = "SELECT s FROM Seleccion s WHERE s.pj = :pj"),
    @NamedQuery(name = "Seleccion.findByPg", query = "SELECT s FROM Seleccion s WHERE s.pg = :pg"),
    @NamedQuery(name = "Seleccion.findByPe", query = "SELECT s FROM Seleccion s WHERE s.pe = :pe"),
    @NamedQuery(name = "Seleccion.findByPp", query = "SELECT s FROM Seleccion s WHERE s.pp = :pp"),
    @NamedQuery(name = "Seleccion.findByGf", query = "SELECT s FROM Seleccion s WHERE s.gf = :gf"),
    @NamedQuery(name = "Seleccion.findByGc", query = "SELECT s FROM Seleccion s WHERE s.gc = :gc")})
public class Seleccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "grupo")
    private String grupo;
    @Basic(optional = false)
    @Column(name = "puntos")
    private int puntos;
    @Basic(optional = false)
    @Column(name = "pj")
    private int pj;
    @Basic(optional = false)
    @Column(name = "pg")
    private int pg;
    @Basic(optional = false)
    @Column(name = "pe")
    private int pe;
    @Basic(optional = false)
    @Column(name = "pp")
    private int pp;
    @Basic(optional = false)
    @Column(name = "gf")
    private int gf;
    @Basic(optional = false)
    @Column(name = "gc")
    private int gc;

    public Seleccion() {
    }

    public Seleccion(Integer id) {
        this.id = id;
    }

    public Seleccion(Integer id, String nombre, String grupo, int puntos, int pj, int pg, int pe, int pp, int gf, int gc) {
        this.id = id;
        this.nombre = nombre;
        this.grupo = grupo;
        this.puntos = puntos;
        this.pj = pj;
        this.pg = pg;
        this.pe = pe;
        this.pp = pp;
        this.gf = gf;
        this.gc = gc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPj() {
        return pj;
    }

    public void setPj(int pj) {
        this.pj = pj;
    }

    public int getPg() {
        return pg;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }

    public int getPe() {
        return pe;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getGf() {
        return gf;
    }

    public void setGf(int gf) {
        this.gf = gf;
    }

    public int getGc() {
        return gc;
    }

    public void setGc(int gc) {
        this.gc = gc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seleccion)) {
            return false;
        }
        Seleccion other = (Seleccion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Seleccion[ id=" + id + " ]";
    }
    
}
