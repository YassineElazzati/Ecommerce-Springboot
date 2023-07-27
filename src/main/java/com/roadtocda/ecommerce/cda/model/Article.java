package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="article", schema = "public")
public class Article {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_article;
    private String image ; 
    private String quantitestock;
    
    @ManyToOne // Relation Many-to-One, un article appartient à une catégorie
    @JoinColumn(name = "id_type_article") // Clé étrangère pour relier à la catégorie
    private Typearticle typearticle ;
    
    
    @ManyToOne // Relation Many-to-One, un article appartient à une catégorie
    @JoinColumn(name = "id_couleur") // Clé étrangère pour relier à la catégorie
    private Couleur couleur ;
    
	public int getId_article() {
		return id_article;
	}
	public void setId_article(int id_Article) {
		id_article = id_Article;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getQuantitestock() {
		return quantitestock;
	}
	public void setQuantitestock(String quantitéStock) {
		quantitestock = quantitéStock;
	}
	
	public Typearticle getTypearticle() {
		return typearticle;
	}
	public void setTypearticle(Typearticle typearticle) {
		this.typearticle = typearticle;
	}
	
	public Couleur getCouleur() {
		return couleur;
	}
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}	 
	
	@Override
	public String toString() {
		return "Article [Id_Article=" + id_article + ", Image=" + image + ", QuantitéStock=" + quantitestock
				;
	}
	
}
