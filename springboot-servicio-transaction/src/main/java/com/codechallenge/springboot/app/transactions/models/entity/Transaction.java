package com.codechallenge.springboot.app.transactions.models.entity;

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
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    
    @Basic(optional = true)
    @Column(nullable = false)
    private String order;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private Double ammount;

    @Basic(optional = true)
    @Column(nullable = false)
    private String originacc;
    
    @Basic(optional = true)
    @Column(nullable = false)
    private String destinationacc;
    
    @Basic(optional = true)
    @Column(name = "create_at")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-ddHH:mm:ss.SSSZ")
    private Date date;
    
    @Basic(optional = true)
    @Column(name = "order_at")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-ddHH:mm:ss.SSSZ")
    private Date orderdate;
    
    @Basic(optional = true)
    @Column(nullable = false)
    private String description;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    } 
    
    public String getOrder()
    {
        return order;
    }

    public void setOrder(String order)
    {
        this.order = order;
    } 

    public Double getAmmount() {
        return ammount;
    }
    
    public void setAmmount(Double ammount) {
        this.ammount = ammount;
    }
    
    public String getOriginacc() {
        return originacc;
    }
    
    public void setOriginacc(String originacc) {
        this.originacc = originacc;
    }
    
    public String getDestinationacc() {
        return destinationacc;
    }
    
    public void setDestinationacc(String destinationacc) {
        this.destinationacc = destinationacc;
    }
    
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getOrderdate() {
		return date;
	}

	public void setOrderDate(Date orderdate) {
		this.orderdate = orderdate;
	}
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
        
    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Order by: " + order + ";");
        buffer.append("Ammount: " + ammount + ";");
        buffer.append("Origin Account: " + originacc + ";");
        buffer.append("Destination Account: " + destinationacc + ";");
        buffer.append("Date: " + date + ";");
        buffer.append("OrderDate: " + orderdate + ";");
        buffer.append("Description: " + description);
        return buffer.toString();
    }
}