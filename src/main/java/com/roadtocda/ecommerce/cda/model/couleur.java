package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="couleur")
public class couleur {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_couleur;
	private String libelle;


	public int getId_Couleur() {
		return id_couleur;
	}


	public void setId_Couleur(int id_Couleur) {
		this.id_couleur = id_Couleur;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	@Override
	public String toString() {
		return "couleur [Id_Couleur=" + id_couleur + ", Libelle=" + libelle + "]";
	}
	
	

}
