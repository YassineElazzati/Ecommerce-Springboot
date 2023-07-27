package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="categorie")
public class categorie {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  id_categorie;
    private String libelle;
	
	public int getId_Categorie() {
		return id_categorie;
	}
	public void setId_Categorie(int id_categorie) {
		this.id_categorie = id_categorie;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	@Override
	public String toString() {
		return "categorie [Id_Categorie=" + id_categorie + ", Libelle=" + libelle + "]";
	}
	
	
	
}
