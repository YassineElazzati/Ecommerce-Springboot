package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class taille {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_Taille;
	
	
	private String Libelle;


	public int getId_Taille() {
		return Id_Taille;
	}


	public void setId_Taille(int id_Taille) {
		Id_Taille = id_Taille;
	}


	public String getLibelle() {
		return Libelle;
	}


	public void setLibelle(String libelle) {
		Libelle = libelle;
	}


	@Override
	public String toString() {
		return "taille [Id_Taille=" + Id_Taille + ", Libelle=" + Libelle + "]";
	}
	
		
	
}
