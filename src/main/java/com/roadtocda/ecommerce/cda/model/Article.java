package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Article")
public class Article {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Article;
    
    
    private String Image ; 
    private String QuantitéStock;
    

    
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
	
	@Override
	public String toString() {
		return "Article [Id_Article=" + Id_Article + ", Image=" + Image + ", QuantitéStock=" + QuantitéStock
				;
	}	    
}
