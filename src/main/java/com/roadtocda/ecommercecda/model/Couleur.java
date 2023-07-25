
package com.roadtocda.ecommercecda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "couleur")
public class Couleur {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Couleur;
	private String Libelle;


	public Long getId_Couleur() {
		return Id_Couleur;
	}
	public void setId_Couleur(Long id_Couleur) {
		this.Id_Couleur = id_Couleur;
	}

	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		this.Libelle = libelle;
	}


	@Override
	public String toString() {
		return "couleur [Id_Couleur=" + Id_Couleur + ", Libelle=" + Libelle + "]";
	}
	
	

}