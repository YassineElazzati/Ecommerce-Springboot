package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class typearticle {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_Categorie;
	private int Id_TypeArticle;
	
	private String Libelle;
	private String Matière;
	private int Prix;
	public int getId_Categorie() {
		return Id_Categorie;
	}
	public void setId_Categorie(int id_Categorie) {
		Id_Categorie = id_Categorie;
	}
	public int getId_TypeArticle() {
		return Id_TypeArticle;
	}
	public void setId_TypeArticle(int id_TypeArticle) {
		Id_TypeArticle = id_TypeArticle;
	}
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	public String getMatière() {
		return Matière;
	}
	public void setMatière(String matière) {
		Matière = matière;
	}
	public int getPrix() {
		return Prix;
	}
	public void setPrix(int prix) {
		Prix = prix;
	}
	@Override
	public String toString() {
		return "typearticle [Id_Categorie=" + Id_Categorie + ", Id_TypeArticle=" + Id_TypeArticle + ", Libelle="
				+ Libelle + ", Matière=" + Matière + ", Prix=" + Prix + "]";
	}
	
	

}
