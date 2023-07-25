
package com.roadtocda.ecommercecda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "status")
public class Status {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Status;
	private String Etat;
	
	public Long getId_Status() {
		return Id_Status;
	}
	public void setId_Status(Long id_Status) {
		this.Id_Status = id_Status;
	}
	
	public String getEtat() {
		return Etat;
	}
	public void setEtat(String etat) {
		this.Etat = etat;
	}
	
	@Override
	public String toString() {
		return "status [Id_Status=" + Id_Status + ", Etat=" + Etat + "]";
	}
	

}