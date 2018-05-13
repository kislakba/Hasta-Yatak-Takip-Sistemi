/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odevim;

import java.io.Serializable;
import java.math.BigInteger;
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
 * @author baris
 */
@Entity
@Table(name = "PATIENTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patients.findAll", query = "SELECT p FROM Patients p")
    , @NamedQuery(name = "Patients.findByCitizennumber", query = "SELECT p FROM Patients p WHERE p.citizennumber = :citizennumber")
    , @NamedQuery(name = "Patients.findByName", query = "SELECT p FROM Patients p WHERE p.name = :name")
    , @NamedQuery(name = "Patients.findBySurname", query = "SELECT p FROM Patients p WHERE p.surname = :surname")
    , @NamedQuery(name = "Patients.findByAge", query = "SELECT p FROM Patients p WHERE p.age = :age")
    , @NamedQuery(name = "Patients.findByPassword", query = "SELECT p FROM Patients p WHERE p.password = :password")
    , @NamedQuery(name = "Patients.findByHasapointment", query = "SELECT p FROM Patients p WHERE p.hasapointment = :hasapointment")})
public class Patients implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CITIZENNUMBER")
    private Long citizennumber;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "PASSWORD")
    private Long password;
    @Column(name = "HASAPOINTMENT")
    private Integer hasapointment;

    public Patients() {
    }

    public Patients(Long citizennumber) {
        this.citizennumber = citizennumber;
    }

    public Long getCitizennumber() {
        return citizennumber;
    }

    public void setCitizennumber(Long citizennumber) {
        this.citizennumber = citizennumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getPassword() {
        return password;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

    public Integer getHasapointment() {
        return hasapointment;
    }

    public void setHasapointment(Integer hasapointment) {
        this.hasapointment = hasapointment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (citizennumber != null ? citizennumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patients)) {
            return false;
        }
        Patients other = (Patients) object;
        if ((this.citizennumber == null && other.citizennumber != null) || (this.citizennumber != null && !this.citizennumber.equals(other.citizennumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "odevim.Patients[ citizennumber=" + citizennumber + " ]";
    }
    
}
