package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="panier")
public class panier {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_article;
	private int id_utilisateur;
	private int quantite;


	public int getId_Article() {
		return id_article;
	}


	public void setId_Article(int id_Article) {
		this.id_article = id_Article;
	}


	public int getId_Utilisateur() {
		return id_utilisateur;
	}


	public void setId_Utilisateur(int id_Utilisateur) {
		this.id_utilisateur = id_Utilisateur;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	@Override
	public String toString() {
		return "panier [Id_Article=" + id_article + ", Id_Utilisateur=" + id_utilisateur + ", Quantite=" + quantite
				+ "]";
	}
	
	
}
