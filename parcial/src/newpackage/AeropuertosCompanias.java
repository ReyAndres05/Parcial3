/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ANDRES
 */
@Entity
@Table(name = "aeropuertos_companias")
@NamedQueries({
    @NamedQuery(name = "AeropuertosCompanias.findAll", query = "SELECT a FROM AeropuertosCompanias a"),
    @NamedQuery(name = "AeropuertosCompanias.findById", query = "SELECT a FROM AeropuertosCompanias a WHERE a.id = :id")})
public class AeropuertosCompanias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "idAeropuerto", referencedColumnName = "idAeropuerto")
    @ManyToOne(optional = false)
    private Aeropuertos idAeropuerto;
    @JoinColumn(name = "idCompania", referencedColumnName = "idCompania")
    @ManyToOne(optional = false)
    private Companias idCompania;

    public AeropuertosCompanias() {
    }

    public AeropuertosCompanias(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Aeropuertos getIdAeropuerto() {
        return idAeropuerto;
    }

    public void setIdAeropuerto(Aeropuertos idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
    }

    public Companias getIdCompania() {
        return idCompania;
    }

    public void setIdCompania(Companias idCompania) {
        this.idCompania = idCompania;
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
        if (!(object instanceof AeropuertosCompanias)) {
            return false;
        }
        AeropuertosCompanias other = (AeropuertosCompanias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "newpackage.AeropuertosCompanias[ id=" + id + " ]";
    }
    
}
