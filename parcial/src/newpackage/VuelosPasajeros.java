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
@Table(name = "vuelos_pasajeros")
@NamedQueries({
    @NamedQuery(name = "VuelosPasajeros.findAll", query = "SELECT v FROM VuelosPasajeros v"),
    @NamedQuery(name = "VuelosPasajeros.findById", query = "SELECT v FROM VuelosPasajeros v WHERE v.id = :id")})
public class VuelosPasajeros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "idPasajero", referencedColumnName = "idPasajero")
    @ManyToOne(optional = false)
    private Pasajeros idPasajero;
    @JoinColumn(name = "idVuelo", referencedColumnName = "idVuelo")
    @ManyToOne(optional = false)
    private Vuelos idVuelo;

    public VuelosPasajeros() {
    }

    public VuelosPasajeros(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pasajeros getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(Pasajeros idPasajero) {
        this.idPasajero = idPasajero;
    }

    public Vuelos getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(Vuelos idVuelo) {
        this.idVuelo = idVuelo;
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
        if (!(object instanceof VuelosPasajeros)) {
            return false;
        }
        VuelosPasajeros other = (VuelosPasajeros) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "newpackage.VuelosPasajeros[ id=" + id + " ]";
    }
    
}
