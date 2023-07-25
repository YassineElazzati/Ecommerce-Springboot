
package com.roadtocda.ecommercecda.model;

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
	private Long Id_TypeArticle;
	private Long Id_Utilisateur;
	
	
	public Long getId_TypeArticle() {
		return Id_TypeArticle;
	}
	public void setId_TypeArticle(Long id_TypeArticle) {
		this.Id_TypeArticle = id_TypeArticle;
	}
	
	public Long getId_Utilisateur() {
		return Id_Utilisateur;
	}
	public void setId_Utilisateur(Long id_Utilisateur) {
		this.Id_Utilisateur = id_Utilisateur;
	}
	
	@Override
	public String toString() {
		return "favoris [Id_TypeArticle=" + Id_TypeArticle + ", Id_Utilisateur=" + Id_Utilisateur + "]";
	}
	
	
	
}