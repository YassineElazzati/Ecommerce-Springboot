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
<<<<<<< HEAD
	private int Id_Article;
	private int Id_Commande;
	
	public int getId_Article() {
		return Id_Article;
	}
	public void setId_Article(int id_Article) {
		Id_Article = id_Article;
	}
	public int getId_Commande() {
		return Id_Commande;
	}
	public void setId_Commande(int id_Commande) {
		Id_Commande = id_Commande;
	}
	
	
	@Override
	public String toString() {
		return "correspondre [Id_Article=" + Id_Article + ", Id_Commande=" + Id_Commande + "]";
=======
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
>>>>>>> branch 'main' of https://github.com/YassineElazzati/Ecommerce-Springboot.git
	}
	
	

}
