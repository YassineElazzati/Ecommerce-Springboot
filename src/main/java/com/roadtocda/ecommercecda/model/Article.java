package com.roadtocda.ecommercecda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "article")
public class Article {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_Article;
    private Long Id_Couleur;
    private Long Id_Taille;
    private Long Id_TypeArticle;
    private String Image ; 
    private String QuantiteStock;
    
	public Long getId_Article() {
		return Id_Article;
	}
	public void setId_Article(Long id_Article) {
		this.Id_Article = id_Article;
	}
	
	public Long getId_Couleur() {
		return Id_Couleur;
	}
	public void setId_Couleur(Long id_Couleur) {
		this.Id_Couleur = id_Couleur;
	}
	
	public Long getId_Taille() {
		return Id_Taille;
	}
	public void setId_Taille(Long id_Taille) {
		this.Id_Taille = id_Taille;
	}
	
	public Long getId_TypeArticle() {
		return Id_TypeArticle;
	}
	public void setId_TypeArticle(Long id_TypeArticle) {
		this.Id_TypeArticle = id_TypeArticle;
	}
	
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		this.Image = image;
	}
	
	public String getQuantiteStock() {
		return QuantiteStock;
	}
	public void setQuantitéStock(String quantiteStock) {
		this.QuantiteStock = quantiteStock;
	}

	
	@Override
	public String toString() {
		return "Article [Id_Article=" + Id_Article + ", Image=" + Image + ", QuantiteStock=" + QuantiteStock
				+ ", Id_Couleur=" + Id_Couleur + ", Id_Taille=" + Id_Taille + ", Id_TypeArticle=" + Id_TypeArticle
				+ "]";
	}	    
}