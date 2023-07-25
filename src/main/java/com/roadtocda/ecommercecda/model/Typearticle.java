
package com.roadtocda.ecommercecda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "typearticle")
public class Typearticle {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Categorie;
	private Long Id_TypeArticle;
	
	private String Libelle;
	private String Matière;
	private double Prix;
	
	
	public Long getId_Categorie() {
		return Id_Categorie;
	}
	public void setId_Categorie(Long id_Categorie) {
		this.Id_Categorie = id_Categorie;
	}
	
	public Long getId_TypeArticle() {
		return Id_TypeArticle;
	}
	public void setId_TypeArticle(Long id_TypeArticle) {
		this.Id_TypeArticle = id_TypeArticle;
	}
	
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		this.Libelle = libelle;
	}
	
	public String getMatière() {
		return Matière;
	}
	public void setMatière(String matière) {
		this.Matière = matière;
	}
	
	public double getPrix() {
		return Prix;
	}
	public void setPrix(double prix) {
		this.Prix = prix;
	}
	
	@Override
	public String toString() {
		return "typearticle [Id_Categorie=" + Id_Categorie + ", Id_TypeArticle=" + Id_TypeArticle + ", Libelle="
				+ Libelle + ", Matière=" + Matière + ", Prix=" + Prix + "]";
	}
	
	

}