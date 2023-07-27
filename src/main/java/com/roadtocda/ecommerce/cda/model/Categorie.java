package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="categorie")
public class Categorie {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
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
=======
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
>>>>>>> branch 'main' of https://github.com/YassineElazzati/Ecommerce-Springboot.git
	}
	
	
	
}
