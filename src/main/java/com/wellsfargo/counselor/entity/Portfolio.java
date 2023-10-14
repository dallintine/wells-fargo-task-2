package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


import java.util.Date;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;
    
    @ManyToOne
    private Client client;


    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }

   
//    @OneToMany(mappedBy = "portfolio")
//    private List<Security> securities;

    public Portfolio(Client client, String creationDate) {
    	this.client = client;
        this.creationDate = creationDate;

    }
    
    public long getportfolioId() {
    	return portfolioId;
    	
    }
    
    public Client getclient() {
    	return client; 
    }
    
    public String  getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
