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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Mohit
 */
@Entity
@Table(name = "main", catalog = "per", schema = "")
@NamedQueries({
    @NamedQuery(name = "Main.findAll", query = "SELECT m FROM Main m")
    , @NamedQuery(name = "Main.findByAadhar", query = "SELECT m FROM Main m WHERE m.mainPK.aadhar = :aadhar")
    , @NamedQuery(name = "Main.findByName", query = "SELECT m FROM Main m WHERE m.name = :name")
    , @NamedQuery(name = "Main.findByRoll", query = "SELECT m FROM Main m WHERE m.mainPK.roll = :roll")
    , @NamedQuery(name = "Main.findByGender", query = "SELECT m FROM Main m WHERE m.gender = :gender")
    , @NamedQuery(name = "Main.findByMobile", query = "SELECT m FROM Main m WHERE m.mobile = :mobile")
    , @NamedQuery(name = "Main.findByEmail", query = "SELECT m FROM Main m WHERE m.email = :email")
    , @NamedQuery(name = "Main.findByGname", query = "SELECT m FROM Main m WHERE m.gname = :gname")
    , @NamedQuery(name = "Main.findByGmobile", query = "SELECT m FROM Main m WHERE m.gmobile = :gmobile")
    , @NamedQuery(name = "Main.findByPoints", query = "SELECT m FROM Main m WHERE m.points = :points")
    , @NamedQuery(name = "Main.findByTotal", query = "SELECT m FROM Main m WHERE m.total = :total")})
public class Main implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MainPK mainPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "mobile")
    private long mobile;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "gname")
    private String gname;
    @Basic(optional = false)
    @Column(name = "gmobile")
    private long gmobile;
    @Basic(optional = false)
    @Column(name = "points")
    private double points;
    @Basic(optional = false)
    @Column(name = "total")
    private int total;

    public Main() {
    }

    public Main(MainPK mainPK) {
        this.mainPK = mainPK;
    }

    public Main(MainPK mainPK, String name, String gender, long mobile, String email, String gname, long gmobile, double points, int total) {
        this.mainPK = mainPK;
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;
        this.email = email;
        this.gname = gname;
        this.gmobile = gmobile;
        this.points = points;
        this.total = total;
    }

    public Main(long aadhar, String roll) {
        this.mainPK = new MainPK(aadhar, roll);
    }

    public MainPK getMainPK() {
        return mainPK;
    }

    public void setMainPK(MainPK mainPK) {
        this.mainPK = mainPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        long oldMobile = this.mobile;
        this.mobile = mobile;
        changeSupport.firePropertyChange("mobile", oldMobile, mobile);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        String oldGname = this.gname;
        this.gname = gname;
        changeSupport.firePropertyChange("gname", oldGname, gname);
    }

    public long getGmobile() {
        return gmobile;
    }

    public void setGmobile(long gmobile) {
        long oldGmobile = this.gmobile;
        this.gmobile = gmobile;
        changeSupport.firePropertyChange("gmobile", oldGmobile, gmobile);
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        double oldPoints = this.points;
        this.points = points;
        changeSupport.firePropertyChange("points", oldPoints, points);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        int oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mainPK != null ? mainPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Main)) {
            return false;
        }
        Main other = (Main) object;
        if ((this.mainPK == null && other.mainPK != null) || (this.mainPK != null && !this.mainPK.equals(other.mainPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "personality.Main[ mainPK=" + mainPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
