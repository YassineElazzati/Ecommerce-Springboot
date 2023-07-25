
package com.roadtocda.ecommercecda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "taille")
public class Taille {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Taille;
	private String Libelle;


	public Long getId_Taille() {
		return Id_Taille;
	}


	public void setId_Taille(Long id_Taille) {
		this.Id_Taille = id_Taille;
	}


	public String getLibelle() {
		return Libelle;
	}


	public void setLibelle(String libelle) {
		this.Libelle = libelle;
	}


	@Override
	public String toString() {
		return "taille [Id_Taille=" + Id_Taille + ", Libelle=" + Libelle + "]";
	}
	
		
	
}