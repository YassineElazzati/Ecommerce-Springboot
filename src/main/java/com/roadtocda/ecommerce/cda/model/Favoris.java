package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "favoris")
public class Favoris {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_TypeArticle;
	private int Id_Utilisateur;

	public int getId_TypeArticle() {
		return Id_TypeArticle;
	}

	public void setId_TypeArticle(int id_TypeArticle) {
		Id_TypeArticle = id_TypeArticle;
	}

	public int getId_Utilisateur() {
		return Id_Utilisateur;
	}

	public void setId_Utilisateur(int id_Utilisateur) {
		Id_Utilisateur = id_Utilisateur;
	}

	@Override
	public String toString() {
		return "favoris [Id_TypeArticle=" + Id_TypeArticle + ", Id_Utilisateur=" + Id_Utilisateur + "]";
	}

}
