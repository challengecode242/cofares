package com.codechallenge.springboot.app.customers.models.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customers") 
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Basic(optional = true)
    @Column(nullable = false)
    private Long uuidcustomer;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private String name;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private String surname;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private String address;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private String email;
    
    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    } 

    public Long getUuidcustomer() {
        return uuidcustomer;
    }
    
    public void setUuidcustomer(Long uuidcustomer) {
        this.uuidcustomer = uuidcustomer;
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
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Id Customer: " + uuidcustomer + ";");
        buffer.append("Name: " + name + ";");
        buffer.append("Surname: " + surname + ";");
        buffer.append("Address: " + address + ";");
        buffer.append("Email: " + email + ";");
        return buffer.toString();
    }
}