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
@Table(name = "user_info", catalog = "employee", schema = "")
@NamedQueries({
    @NamedQuery(name = "UserInfo.findAll", query = "SELECT u FROM UserInfo u"),
    @NamedQuery(name = "UserInfo.findByEmployeeid", query = "SELECT u FROM UserInfo u WHERE u.employeeid = :employeeid"),
    @NamedQuery(name = "UserInfo.findByName", query = "SELECT u FROM UserInfo u WHERE u.name = :name"),
    @NamedQuery(name = "UserInfo.findBySurname", query = "SELECT u FROM UserInfo u WHERE u.surname = :surname"),
    @NamedQuery(name = "UserInfo.findByAge", query = "SELECT u FROM UserInfo u WHERE u.age = :age"),
    @NamedQuery(name = "UserInfo.findByGender", query = "SELECT u FROM UserInfo u WHERE u.gender = :gender"),
    @NamedQuery(name = "UserInfo.findByDepartment", query = "SELECT u FROM UserInfo u WHERE u.department = :department"),
    @NamedQuery(name = "UserInfo.findByShift", query = "SELECT u FROM UserInfo u WHERE u.shift = :shift"),
    @NamedQuery(name = "UserInfo.findByGp", query = "SELECT u FROM UserInfo u WHERE u.gp = :gp"),
    @NamedQuery(name = "UserInfo.findByDivision", query = "SELECT u FROM UserInfo u WHERE u.division = :division")})
public class UserInfo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Employeeid")
    private Integer employeeid;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Surname")
    private String surname;
    @Basic(optional = false)
    @Column(name = "Age")
    private int age;
    @Basic(optional = false)
    @Column(name = "Gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "Department")
    private String department;
    @Basic(optional = false)
    @Column(name = "Shift")
    private String shift;
    @Basic(optional = false)
    @Column(name = "Gp")
    private String gp;
    @Basic(optional = false)
    @Column(name = "Division")
    private String division;

    public UserInfo() {
    }

    public UserInfo(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public UserInfo(Integer employeeid, String name, String surname, int age, String gender, String department, String shift, String gp, String division) {
        this.employeeid = employeeid;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.shift = shift;
        this.gp = gp;
        this.division = division;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        Integer oldEmployeeid = this.employeeid;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        String oldSurname = this.surname;
        this.surname = surname;
        changeSupport.firePropertyChange("surname", oldSurname, surname);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int oldAge = this.age;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        String oldDepartment = this.department;
        this.department = department;
        changeSupport.firePropertyChange("department", oldDepartment, department);
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        String oldShift = this.shift;
        this.shift = shift;
        changeSupport.firePropertyChange("shift", oldShift, shift);
    }

    public String getGp() {
        return gp;
    }

    public void setGp(String gp) {
        String oldGp = this.gp;
        this.gp = gp;
        changeSupport.firePropertyChange("gp", oldGp, gp);
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        String oldDivision = this.division;
        this.division = division;
        changeSupport.firePropertyChange("division", oldDivision, division);
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
        if (!(object instanceof UserInfo)) {
            return false;
        }
        UserInfo other = (UserInfo) object;
        if ((this.employeeid == null && other.employeeid != null) || (this.employeeid != null && !this.employeeid.equals(other.employeeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "employee.UserInfo[ employeeid=" + employeeid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
