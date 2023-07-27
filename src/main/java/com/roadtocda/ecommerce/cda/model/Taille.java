package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="taille")
public class Taille {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_taille;
	private String libelle;


	public int getId_Taille() {
		return id_taille;
	}
	public void setId_Taille(int id_taille) {
		this.id_taille = id_taille;
	}


	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	@Override
	public String toString() {
		return "taille [Id_Taille=" + id_taille + ", Libelle=" + libelle + "]";
	}
	
	
}
