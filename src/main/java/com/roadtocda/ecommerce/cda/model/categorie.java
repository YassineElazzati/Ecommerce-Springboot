package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class categorie {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  Id_Categorie;
    
    
	private String Libelle;
	
	public int getId_Categorie() {
		return Id_Categorie;
	}
	public void setId_Categorie(int id_Categorie) {
		Id_Categorie = id_Categorie;
	}
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	
	@Override
	public String toString() {
		return "categorie [Id_Categorie=" + Id_Categorie + ", Libelle=" + Libelle + "]";
	}
	
	
	
}
