
package com.roadtocda.ecommercecda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Correspondre {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
	}
	
	

}