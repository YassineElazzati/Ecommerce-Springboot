package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Status {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_status;
	private String etat;
	
	
	public int getId_Status() {
		return id_status;
	}
	public void setId_Status(int id_Status) {
		this.id_status = id_Status;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	@Override
	public String toString() {
		return "status [Id_Status=" + id_status + ", Etat=" + etat + "]";
	}
	

}
