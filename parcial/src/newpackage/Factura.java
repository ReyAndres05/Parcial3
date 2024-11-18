/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ANDRES
 */
@Entity
@Table(name = "Factura")
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f"),
    @NamedQuery(name = "Factura.findByIdFactura", query = "SELECT f FROM Factura f WHERE f.idFactura = :idFactura"),
    @NamedQuery(name = "Factura.findByNombre", query = "SELECT f FROM Factura f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Factura.findByPasaporte", query = "SELECT f FROM Factura f WHERE f.pasaporte = :pasaporte"),
    @NamedQuery(name = "Factura.findByNacionalidad", query = "SELECT f FROM Factura f WHERE f.nacionalidad = :nacionalidad"),
    @NamedQuery(name = "Factura.findByNombreAeropuerto", query = "SELECT f FROM Factura f WHERE f.nombreAeropuerto = :nombreAeropuerto"),
    @NamedQuery(name = "Factura.findByNombreCompania", query = "SELECT f FROM Factura f WHERE f.nombreCompania = :nombreCompania"),
    @NamedQuery(name = "Factura.findBySubvencion", query = "SELECT f FROM Factura f WHERE f.subvencion = :subvencion")})
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idFactura")
    private Integer idFactura;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "pasaporte")
    private String pasaporte;
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Column(name = "nombreAeropuerto")
    private String nombreAeropuerto;
    @Column(name = "nombreCompania")
    private String nombreCompania;
    @Column(name = "subvencion")
    private String subvencion;

    public Factura() {
    }

    public Factura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
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

    public String getNombreAeropuerto() {
        return nombreAeropuerto;
    }

    public void setNombreAeropuerto(String nombreAeropuerto) {
        this.nombreAeropuerto = nombreAeropuerto;
    }

    public String getNombreCompania() {
        return nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

    public String getSubvencion() {
        return subvencion;
    }

    public void setSubvencion(String subvencion) {
        this.subvencion = subvencion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFactura != null ? idFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.idFactura == null && other.idFactura != null) || (this.idFactura != null && !this.idFactura.equals(other.idFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "newpackage.Factura[ idFactura=" + idFactura + " ]";
    }
    
}
