package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Article {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Article;
    
    
    private String Image ; 
    private String QuantitéStock;
    private int Id_Couleur;
    private int Id_Taille;
    private int Id_TypeArticle;
    

    
	public int getId_Article() {
		return Id_Article;
	}
	public void setId_Article(int id_Article) {
		Id_Article = id_Article;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public String getQuantitéStock() {
		return QuantitéStock;
	}
	public void setQuantitéStock(String quantitéStock) {
		QuantitéStock = quantitéStock;
	}
	public int getId_Couleur() {
		return Id_Couleur;
	}
	public void setId_Couleur(int id_Couleur) {
		Id_Couleur = id_Couleur;
	}
	public int getId_Taille() {
		return Id_Taille;
	}
	public void setId_Taille(int id_Taille) {
		Id_Taille = id_Taille;
	}
	public int getId_TypeArticle() {
		return Id_TypeArticle;
	}
	public void setId_TypeArticle(int id_TypeArticle) {
		Id_TypeArticle = id_TypeArticle;
	}
	
	@Override
	public String toString() {
		return "Article [Id_Article=" + Id_Article + ", Image=" + Image + ", QuantitéStock=" + QuantitéStock
				+ ", Id_Couleur=" + Id_Couleur + ", Id_Taille=" + Id_Taille + ", Id_TypeArticle=" + Id_TypeArticle
				+ "]";
	}	    
}
