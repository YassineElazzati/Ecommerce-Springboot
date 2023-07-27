package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="panier")
public class Panier {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
	private int Id_Article;
	private int Id_Utilisateur;
	
	
	private int Quantite;


	public int getId_Article() {
		return Id_Article;
	}


	public void setId_Article(int id_Article) {
		Id_Article = id_Article;
	}


	public int getId_Utilisateur() {
		return Id_Utilisateur;
	}


	public void setId_Utilisateur(int id_Utilisateur) {
		Id_Utilisateur = id_Utilisateur;
	}


	public int getQuantite() {
		return Quantite;
	}


	public void setQuantite(int quantite) {
		Quantite = quantite;
	}


	@Override
	public String toString() {
		return "panier [Id_Article=" + Id_Article + ", Id_Utilisateur=" + Id_Utilisateur + ", Quantite=" + Quantite
=======
	private int id_article;
	private int id_utilisateur;
	private int quantite;


	public int getId_Article() {
		return id_article;
	}


	public void setId_Article(int id_article) {
		this.id_article = id_article;
	}


	public int getId_Utilisateur() {
		return id_utilisateur;
	}


	public void setId_Utilisateur(int id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
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
>>>>>>> branch 'main' of https://github.com/YassineElazzati/Ecommerce-Springboot.git
				+ "]";
	}
	
	
}
