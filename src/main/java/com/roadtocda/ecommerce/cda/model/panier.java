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
				+ "]";
	}
	
	
}
