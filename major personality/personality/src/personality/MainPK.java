/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personality;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Mohit
 */
@Embeddable
public class MainPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "aadhar")
    private long aadhar;
    @Basic(optional = false)
    @Column(name = "roll")
    private String roll;

    public MainPK() {
    }

    public MainPK(long aadhar, String roll) {
        this.aadhar = aadhar;
        this.roll = roll;
    }

    public long getAadhar() {
        return aadhar;
    }

    public void setAadhar(long aadhar) {
        this.aadhar = aadhar;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) aadhar;
        hash += (roll != null ? roll.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MainPK)) {
            return false;
        }
        MainPK other = (MainPK) object;
        if (this.aadhar != other.aadhar) {
            return false;
        }
        if ((this.roll == null && other.roll != null) || (this.roll != null && !this.roll.equals(other.roll))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "personality.MainPK[ aadhar=" + aadhar + ", roll=" + roll + " ]";
    }
    
}
