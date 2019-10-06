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
@Table(name = "staff", catalog = "employee", schema = "")
@NamedQueries({
    @NamedQuery(name = "Staff_1.findAll", query = "SELECT s FROM Staff_1 s"),
    @NamedQuery(name = "Staff_1.findByStaffid", query = "SELECT s FROM Staff_1 s WHERE s.staffid = :staffid"),
    @NamedQuery(name = "Staff_1.findByName", query = "SELECT s FROM Staff_1 s WHERE s.name = :name"),
    @NamedQuery(name = "Staff_1.findBySurname", query = "SELECT s FROM Staff_1 s WHERE s.surname = :surname"),
    @NamedQuery(name = "Staff_1.findByAge", query = "SELECT s FROM Staff_1 s WHERE s.age = :age"),
    @NamedQuery(name = "Staff_1.findByGender", query = "SELECT s FROM Staff_1 s WHERE s.gender = :gender"),
    @NamedQuery(name = "Staff_1.findByShift", query = "SELECT s FROM Staff_1 s WHERE s.shift = :shift"),
    @NamedQuery(name = "Staff_1.findByPosition", query = "SELECT s FROM Staff_1 s WHERE s.position = :position"),
    @NamedQuery(name = "Staff_1.findBySalary", query = "SELECT s FROM Staff_1 s WHERE s.salary = :salary")})
public class Staff_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "staffid")
    private Integer staffid;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Surname")
    private String surname;
    @Basic(optional = false)
    @Column(name = "Age")
    private String age;
    @Basic(optional = false)
    @Column(name = "Gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "Shift")
    private String shift;
    @Basic(optional = false)
    @Column(name = "position")
    private String position;
    @Basic(optional = false)
    @Column(name = "salary")
    private String salary;

    public Staff_1() {
    }

    public Staff_1(Integer staffid) {
        this.staffid = staffid;
    }

    public Staff_1(Integer staffid, String name, String surname, String age, String gender, String shift, String position, String salary) {
        this.staffid = staffid;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.shift = shift;
        this.position = position;
        this.salary = salary;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        Integer oldStaffid = this.staffid;
        this.staffid = staffid;
        changeSupport.firePropertyChange("staffid", oldStaffid, staffid);
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

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        String oldShift = this.shift;
        this.shift = shift;
        changeSupport.firePropertyChange("shift", oldShift, shift);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        String oldPosition = this.position;
        this.position = position;
        changeSupport.firePropertyChange("position", oldPosition, position);
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        String oldSalary = this.salary;
        this.salary = salary;
        changeSupport.firePropertyChange("salary", oldSalary, salary);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffid != null ? staffid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Staff_1)) {
            return false;
        }
        Staff_1 other = (Staff_1) object;
        if ((this.staffid == null && other.staffid != null) || (this.staffid != null && !this.staffid.equals(other.staffid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "employee.Staff_1[ staffid=" + staffid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
