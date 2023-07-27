package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.Table;

@Entity

public class Status {
	
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
=======

@Entity

public class Status {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_status;
	private String etat;
	
	
	public int getId_Status() {
		return id_status;
	}
	public void setId_Status(int id_status) {
		this.id_status = id_status;
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
>>>>>>> branch 'main' of https://github.com/YassineElazzati/Ecommerce-Springboot.git
	}
	

}
