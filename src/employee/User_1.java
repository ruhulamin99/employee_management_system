/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

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
 * @author Raju
 */
@Entity
@Table(name = "user", catalog = "employee", schema = "")
@NamedQueries({
    @NamedQuery(name = "User_1.findAll", query = "SELECT u FROM User_1 u"),
    @NamedQuery(name = "User_1.findByEmployeeid", query = "SELECT u FROM User_1 u WHERE u.employeeid = :employeeid"),
    @NamedQuery(name = "User_1.findByName", query = "SELECT u FROM User_1 u WHERE u.name = :name"),
    @NamedQuery(name = "User_1.findByAge", query = "SELECT u FROM User_1 u WHERE u.age = :age"),
    @NamedQuery(name = "User_1.findByGender", query = "SELECT u FROM User_1 u WHERE u.gender = :gender"),
    @NamedQuery(name = "User_1.findByDivision", query = "SELECT u FROM User_1 u WHERE u.division = :division"),
    @NamedQuery(name = "User_1.findByInbox", query = "SELECT u FROM User_1 u WHERE u.inbox = :inbox"),
    @NamedQuery(name = "User_1.findByFromD", query = "SELECT u FROM User_1 u WHERE u.fromD = :fromD"),
    @NamedQuery(name = "User_1.findByToD", query = "SELECT u FROM User_1 u WHERE u.toD = :toD")})
public class User_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Employeeid")
    private String employeeid;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Age")
    private String age;
    @Basic(optional = false)
    @Column(name = "Gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "Division")
    private String division;
    @Basic(optional = false)
    @Column(name = "Inbox")
    private String inbox;
    @Basic(optional = false)
    @Column(name = "From_D")
    private String fromD;
    @Basic(optional = false)
    @Column(name = "To_D")
    private String toD;

    public User_1() {
    }

    public User_1(String employeeid) {
        this.employeeid = employeeid;
    }

    public User_1(String employeeid, String name, String age, String gender, String division, String inbox, String fromD, String toD) {
        this.employeeid = employeeid;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.division = division;
        this.inbox = inbox;
        this.fromD = fromD;
        this.toD = toD;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        String oldEmployeeid = this.employeeid;
        this.employeeid = employeeid;
        changeSupport.firePropertyChange("employeeid", oldEmployeeid, employeeid);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        String oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        String oldDivision = this.division;
        this.division = division;
        changeSupport.firePropertyChange("division", oldDivision, division);
    }

    public String getInbox() {
        return inbox;
    }

    public void setInbox(String inbox) {
        String oldInbox = this.inbox;
        this.inbox = inbox;
        changeSupport.firePropertyChange("inbox", oldInbox, inbox);
    }

    public String getFromD() {
        return fromD;
    }

    public void setFromD(String fromD) {
        String oldFromD = this.fromD;
        this.fromD = fromD;
        changeSupport.firePropertyChange("fromD", oldFromD, fromD);
    }

    public String getToD() {
        return toD;
    }

    public void setToD(String toD) {
        String oldToD = this.toD;
        this.toD = toD;
        changeSupport.firePropertyChange("toD", oldToD, toD);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeid != null ? employeeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User_1)) {
            return false;
        }
        User_1 other = (User_1) object;
        if ((this.employeeid == null && other.employeeid != null) || (this.employeeid != null && !this.employeeid.equals(other.employeeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "employee.User_1[ employeeid=" + employeeid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
