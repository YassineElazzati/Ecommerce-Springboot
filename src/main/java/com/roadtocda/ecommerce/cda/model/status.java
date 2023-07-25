package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class status {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_Status;
	private String Etat;
	public int getId_Status() {
		return Id_Status;
	}
	public void setId_Status(int id_Status) {
		Id_Status = id_Status;
	}
	public String getEtat() {
		return Etat;
	}
	public void setEtat(String etat) {
		Etat = etat;
	}
	
	@Override
	public String toString() {
		return "status [Id_Status=" + Id_Status + ", Etat=" + Etat + "]";
	}
	

}
