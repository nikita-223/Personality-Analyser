/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personality;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Mohit
 */
@Entity
@Table(name = "admin", catalog = "per", schema = "")
@NamedQueries({
    @NamedQuery(name = "Admin_1.findAll", query = "SELECT a FROM Admin_1 a")
    , @NamedQuery(name = "Admin_1.findByAname", query = "SELECT a FROM Admin_1 a WHERE a.aname = :aname")
    , @NamedQuery(name = "Admin_1.findByPass", query = "SELECT a FROM Admin_1 a WHERE a.pass = :pass")})
public class Admin_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "aname")
    private String aname;
    @Basic(optional = false)
    @Column(name = "pass")
    private String pass;

    public Admin_1() {
    }

    public Admin_1(String aname) {
        this.aname = aname;
    }

    public Admin_1(String aname, String pass) {
        this.aname = aname;
        this.pass = pass;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        String oldAname = this.aname;
        this.aname = aname;
        changeSupport.firePropertyChange("aname", oldAname, aname);
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        String oldPass = this.pass;
        this.pass = pass;
        changeSupport.firePropertyChange("pass", oldPass, pass);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aname != null ? aname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin_1)) {
            return false;
        }
        Admin_1 other = (Admin_1) object;
        if ((this.aname == null && other.aname != null) || (this.aname != null && !this.aname.equals(other.aname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "personality.Admin_1[ aname=" + aname + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
