package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="typearticle")
public class typearticle {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_TypeArticle;
	
	private String Libelle;
	private String Matière;
	private double Prix;
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
	public double getPrix() {
		return Prix;
	}
	public void setPrix(double prix) {
		Prix = prix;
	}
	@Override
	public String toString() {
		return "typearticle [Id_TypeArticle=" + Id_TypeArticle + ", Libelle="
				+ Libelle + ", Matière=" + Matière + ", Prix=" + Prix + "]";
	}
	
	

}
