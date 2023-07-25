
package com.roadtocda.ecommercecda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "panier")
public class Panier {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Article;
	private Long Id_Utilisateur;
	
	private int Quantite;
	
	
	public Long getId_Article() {
		return Id_Article;
	}
	public void setId_Article(Long id_Article) {
		this.Id_Article = id_Article;
	}


	public Long getId_Utilisateur() {
		return Id_Utilisateur;
	}
	public void setId_Utilisateur(Long id_Utilisateur) {
		this.Id_Utilisateur = id_Utilisateur;
	}


	public int getQuantite() {
		return Quantite;
	}
	public void setQuantite(int quantite) {
		this.Quantite = quantite;
	}


	@Override
	public String toString() {
		return "panier [Id_Article=" + Id_Article + ", Id_Utilisateur=" + Id_Utilisateur + ", Quantite=" + Quantite
				+ "]";
	}
	
	
}