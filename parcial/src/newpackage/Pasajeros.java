/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ANDRES
 */
@Entity
@Table(name = "pasajeros")
@NamedQueries({
    @NamedQuery(name = "Pasajeros.findAll", query = "SELECT p FROM Pasajeros p"),
    @NamedQuery(name = "Pasajeros.findByIdPasajero", query = "SELECT p FROM Pasajeros p WHERE p.idPasajero = :idPasajero"),
    @NamedQuery(name = "Pasajeros.findByNombre", query = "SELECT p FROM Pasajeros p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Pasajeros.findByPasaporte", query = "SELECT p FROM Pasajeros p WHERE p.pasaporte = :pasaporte"),
    @NamedQuery(name = "Pasajeros.findByNacionalidad", query = "SELECT p FROM Pasajeros p WHERE p.nacionalidad = :nacionalidad")})
public class Pasajeros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPasajero")
    private Integer idPasajero;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "pasaporte")
    private String pasaporte;
    @Basic(optional = false)
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPasajero")
    private Collection<VuelosPasajeros> vuelosPasajerosCollection;

    public Pasajeros() {
    }

    public Pasajeros(Integer idPasajero) {
        this.idPasajero = idPasajero;
    }

    public Pasajeros(Integer idPasajero, String nombre, String pasaporte, String nacionalidad) {
        this.idPasajero = idPasajero;
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
    }

    public Integer getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(Integer idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Collection<VuelosPasajeros> getVuelosPasajerosCollection() {
        return vuelosPasajerosCollection;
    }

    public void setVuelosPasajerosCollection(Collection<VuelosPasajeros> vuelosPasajerosCollection) {
        this.vuelosPasajerosCollection = vuelosPasajerosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPasajero != null ? idPasajero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pasajeros)) {
            return false;
        }
        Pasajeros other = (Pasajeros) object;
        if ((this.idPasajero == null && other.idPasajero != null) || (this.idPasajero != null && !this.idPasajero.equals(other.idPasajero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "newpackage.Pasajeros[ idPasajero=" + idPasajero + " ]";
    }
    
}
