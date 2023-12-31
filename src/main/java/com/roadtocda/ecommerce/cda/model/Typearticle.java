package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="typearticle", schema = "public")
public class Typearticle {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_typearticle;
	private String libelle;
	private String matiere;
	private double prix;
	
	@ManyToOne
	@JoinColumn(name="id_categorie")
	private Categorie categorie;
	
	public int getId_TypeArticle() {
		return id_typearticle;
	}
	public void setId_TypeArticle(int id_TypeArticle) {
		this.id_typearticle = id_TypeArticle;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public Categorie getCategorie() {
		return categorie;
	}
	public void setTaille(Categorie categorie) {
		this.categorie = categorie;
	}
	
	@Override
	public String toString() {
		return "typearticle [Id_TypeArticle=" + id_typearticle + ", Libelle="
				+ libelle + ", Matière=" + matiere + ", Prix=" + prix + "]";
	}
}
