package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="utilisateur")

public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_Utilisateur;
	
	private String Mail;
	private String Nom;
	private String Password;
	private String Prenom;
	private String Telephone;
	
	public int getId_Utilisateur() {
		return Id_Utilisateur;
	}
	public void setId_Utilisateur(int id_Utilisateur) {
		Id_Utilisateur = id_Utilisateur;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	
	@Override
	public String toString() {
		return "utilisateur [Id_Utilisateur=" + Id_Utilisateur + ", Mail=" + Mail + ", Nom="
				+ Nom + ", Password=" + Password + ", Prenom=" + Prenom + ", Telephone=" + Telephone + "]";
	}	
}
