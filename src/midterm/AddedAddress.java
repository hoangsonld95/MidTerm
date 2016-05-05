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
@Table(name = "AddedAddress")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AddedAddress.findAll", query = "SELECT a FROM AddedAddress a"),
    @NamedQuery(name = "AddedAddress.findByProvinceName", query = "SELECT a FROM AddedAddress a WHERE a.provinceName = :provinceName"),
    @NamedQuery(name = "AddedAddress.findByDistrictName", query = "SELECT a FROM AddedAddress a WHERE a.districtName = :districtName"),
    @NamedQuery(name = "AddedAddress.findByWardName", query = "SELECT a FROM AddedAddress a WHERE a.wardName = :wardName"),
    @NamedQuery(name = "AddedAddress.findByHomeNumber", query = "SELECT a FROM AddedAddress a WHERE a.homeNumber = :homeNumber")})
public class AddedAddress implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "provinceName")
    private String provinceName;
    @Column(name = "districtName")
    private String districtName;
    @Column(name = "wardName")
    private String wardName;
    @Id
    @Basic(optional = false)
    @Column(name = "HomeNumber")
    private Integer homeNumber;

    public AddedAddress() {
    }

    public AddedAddress(Integer homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public Integer getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(Integer homeNumber) {
        this.homeNumber = homeNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (homeNumber != null ? homeNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AddedAddress)) {
            return false;
        }
        AddedAddress other = (AddedAddress) object;
        if ((this.homeNumber == null && other.homeNumber != null) || (this.homeNumber != null && !this.homeNumber.equals(other.homeNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "midterm.AddedAddress[ homeNumber=" + homeNumber + " ]";
    }
    
}
