package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="commande")
public class Commande {
	
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
	private int	Id_Commande;
	
	
 	private	double Total;
 	private	double Frais_de_livraison;
 	private String	Adresse_postal;
 	private int Quantite;
	public int getId_Commande() {
		return Id_Commande;
	}
	public void setId_Commande(int id_Commande) {
		Id_Commande = id_Commande;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	public double getFrais_de_livraison() {
		return Frais_de_livraison;
	}
	public void setFrais_de_livraison(double frais_de_livraison) {
		Frais_de_livraison = frais_de_livraison;
	}
	public String getAdresse_postal() {
		return Adresse_postal;
	}
	public void setAdresse_postal(String adresse_postal) {
		Adresse_postal = adresse_postal;
	}
	public int getQuantite() {
		return Quantite;
	}
	public void setQuantite(int quantite) {
		Quantite = quantite;
	}
	@Override
	public String toString() {
		return "commande [Id_Commande=" + Id_Commande + ", Total=" + Total + ", Frais_de_livraison="
				+ Frais_de_livraison + ", Adresse_postal=" + Adresse_postal + ", Quantite=" + Quantite
=======
	private int	id_commande;
	
	
 	private	double total;
 	private	double frais_de_livraison;
 	private String	adresse_postal;
 	private int quantite;
	public int getId_Commande() {
		return id_commande;
	}
	public void setId_Commande(int id_commande) {
		this.id_commande = id_commande;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getFrais_de_livraison() {
		return frais_de_livraison;
	}
	public void setFrais_de_livraison(double frais_de_livraison) {
		this.frais_de_livraison = frais_de_livraison;
	}
	public String getAdresse_postal() {
		return adresse_postal;
	}
	public void setAdresse_postal(String adresse_postal) {
		this.adresse_postal = adresse_postal;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	@Override
	public String toString() {
		return "commande [Id_Commande=" + id_commande + ", Total=" + total + ", Frais_de_livraison="
				+ frais_de_livraison + ", Adresse_postal=" + adresse_postal + ", Quantite=" + quantite
>>>>>>> branch 'main' of https://github.com/YassineElazzati/Ecommerce-Springboot.git
				;
	}
 	
 	

}
