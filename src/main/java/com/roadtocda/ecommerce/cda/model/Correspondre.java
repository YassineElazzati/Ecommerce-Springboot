package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="correspondre")
public class Correspondre {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_article;
	private int id_commande;
	
	public int getId_Article() {
		return id_article;
	}
	public void setId_Article(int id_article) {
		this.id_article = id_article;
	}
	public int getId_Commande() {
		return id_commande;
	}
	public void setId_Commande(int id_commande) {
		this.id_commande = id_commande;
	}
	
	
	@Override
	public String toString() {
		return "correspondre [Id_Article=" + id_article + ", Id_Commande=" + id_commande + "]";
	}
	
	

}
