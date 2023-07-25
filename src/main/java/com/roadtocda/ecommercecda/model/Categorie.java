package com.roadtocda.ecommercecda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorie")
public class Categorie {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Categorie;
    private String Libelle;
	
	public Long getId_Categorie() {
		return Id_Categorie;
	}
	public void setId_Categorie(Long id_Categorie) {
		this.Id_Categorie = id_Categorie;
	}
	
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		this.Libelle = libelle;
	}
	
	@Override
	public String toString() {
		return "categorie [Id_Categorie=" + Id_Categorie + ", Libelle=" + Libelle + "]";
	}
	
	
	
}