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
<<<<<<< HEAD
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
=======
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
>>>>>>> branch 'main' of https://github.com/YassineElazzati/Ecommerce-Springboot.git
	}
	
		
	
}
