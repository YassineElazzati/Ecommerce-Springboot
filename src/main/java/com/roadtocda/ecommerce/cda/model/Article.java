package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="article", schema = "public")
public class Article {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_article;
    
    
    private String image ; 
    private String quantitestock;
    

    
	public int getId_Article() {
		return id_article;
	}
	public void setId_Article(int id_Article) {
		id_article = id_Article;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		image = image;
	}
	public String getQuantitéStock() {
		return quantitestock;
	}
	public void setQuantitéStock(String quantitéStock) {
		quantitestock = quantitéStock;
	}
	
	@Override
	public String toString() {
		return "Article [Id_Article=" + id_article + ", Image=" + image + ", QuantitéStock=" + quantitestock
				;
	}	    
}
