package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "favoris")
public class favoris {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_typearticle;
	private int id_utilisateur;

	public int getId_TypeArticle() {
		return id_typearticle;
	}

	public void setId_TypeArticle(int id_TypeArticle) {
		this.id_typearticle = id_TypeArticle;
	}

	public int getId_Utilisateur() {
		return id_utilisateur;
	}

	public void setId_Utilisateur(int id_Utilisateur) {
		this.id_utilisateur = id_Utilisateur;
	}

	@Override
	public String toString() {
		return "favoris [Id_TypeArticle=" + id_typearticle + ", Id_Utilisateur=" + id_utilisateur + "]";
	}

}
