package com.codechallenge.springboot.app.accounts.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="accounts") 
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Basic(optional = true)
    @Column(nullable = false)
    private String iban;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private Double overall;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private String producttype;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private String currency;
    

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    } 

    public String getIban() {
        return iban;
    }
    
    public void setIban(String iban) {
        this.iban = iban;
    }
    
    public Double getOverall() {
        return overall;
    }
    
    public void setOverall(Double overall) {
        this.overall = overall;
    }
    
    public String getProducttype() {
        return producttype;
    }
    
    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }
    
    public String getCurrency() {
        return currency;
    }
    
    public void setFee(String currency) {
        this.currency = currency;
    }
     
    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Iban: " + iban + ";");
        buffer.append("Overall: " + overall + ";");
        buffer.append("Prodcut Type: " + producttype + ";");
        buffer.append("Currency: " + currency + ";");
        return buffer.toString();
    }
}