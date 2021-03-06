/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "district")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "District.findAll", query = "SELECT d FROM District d"),
    @NamedQuery(name = "District.findByDistrictid", query = "SELECT d FROM District d WHERE d.districtid = :districtid"),
    @NamedQuery(name = "District.findByName", query = "SELECT d FROM District d WHERE d.name = :name"),
    @NamedQuery(name = "District.findByType", query = "SELECT d FROM District d WHERE d.type = :type"),
    @NamedQuery(name = "District.findByLocation", query = "SELECT d FROM District d WHERE d.location = :location"),
    @NamedQuery(name = "District.findByProvinceid", query = "SELECT d FROM District d WHERE d.provinceid = :provinceid")})
public class District implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "districtid")
    private String districtid;
    @Basic(optional = false)
    @Column(name = "name")
     String name;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "location")
    private String location;
    @Basic(optional = false)
    @Column(name = "provinceid")
    private String provinceid;

    public District() {
    }

    public District(String districtid) {
        this.districtid = districtid;
    }

    public District(String districtid, String name, String type, String location, String provinceid) {
        this.districtid = districtid;
        this.name = name;
        this.type = type;
        this.location = location;
        this.provinceid = provinceid;
    }

    public String getDistrictid() {
        return districtid;
    }

    public void setDistrictid(String districtid) {
        this.districtid = districtid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (districtid != null ? districtid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof District)) {
            return false;
        }
        District other = (District) object;
        if ((this.districtid == null && other.districtid != null) || (this.districtid != null && !this.districtid.equals(other.districtid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "midterm.District[ districtid=" + districtid + " ]";
    }

    void setDistrictid(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
