
package com.roadtocda.ecommercecda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "commande")
public class Commande {
	
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long	Id_Commande;
	private Long  Id_Utilisateur;
 	private Long Id_Status;
	private	double Total;
 	private	double Frais_de_livraison;
 	private String	Adresse_postal;
 	private int Quantite;
 	
	public Long getId_Commande() {
		return Id_Commande;
	}
	public void setId_Commande(Long id_Commande) {
		this.Id_Commande = id_Commande;
	}
	
	public Long getId_Utilisateur() {
		return Id_Utilisateur;
	}
	public void setId_Utilisateur(Long id_Utilisateur) {
		this.Id_Utilisateur = id_Utilisateur;
	}
	
	public Long getId_Status() {
		return Id_Status;
	}
	public void setId_Status(Long id_Status) {
		this.Id_Status = id_Status;
	}
	
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		this.Total = total;
	}
	public double getFrais_de_livraison() {
		return Frais_de_livraison;
	}
	public void setFrais_de_livraison(double frais_de_livraison) {
		this.Frais_de_livraison = frais_de_livraison;
	}
	public String getAdresse_postal() {
		return Adresse_postal;
	}
	public void setAdresse_postal(String adresse_postal) {
		this.Adresse_postal = adresse_postal;
	}
	public int getQuantite() {
		return Quantite;
	}
	public void setQuantite(int quantite) {
		this.Quantite = quantite;
	}
	
	@Override
	public String toString() {
		return "commande [Id_Commande=" + Id_Commande + ", Total=" + Total + ", Frais_de_livraison="
				+ Frais_de_livraison + ", Adresse_postal=" + Adresse_postal + ", Quantite=" + Quantite
				+ ", Id_Utilisateur=" + Id_Utilisateur + ", Id_Status=" + Id_Status + "]";
	}

}