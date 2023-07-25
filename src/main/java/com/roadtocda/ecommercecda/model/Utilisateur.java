
package com.roadtocda.ecommercecda.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Role;	
	private Long Id_Utilisateur;
	
	@Column(name = "Nom")
	private String Nom;
	@Column(name = "Prenom")
	private String Prenom;
	
	private String Mail;
	private String Password;
	private String Telephone;
	
	public Long getId_Role() {
		return Id_Role;
	}
	public void setId_Role(Long id_Role) {
		this.Id_Role = id_Role;
	}
	
	public Long getId_Utilisateur() {
		return Id_Utilisateur;
	}
	public void setId_Utilisateur(Long id_Utilisateur) {
		this.Id_Utilisateur = id_Utilisateur;
	}
	
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		this.Mail = mail;
	}
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		this.Nom = nom;
	}
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		this.Prenom = prenom;
	}
	
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		this.Telephone = telephone;
	}
	
	@Override
	public String toString() {
		return "utilisateur [Id_Role=" + Id_Role + ", Id_Utilisateur=" + Id_Utilisateur + ", Mail=" + Mail + ", Nom="
				+ Nom + ", Password=" + Password + ", Prenom=" + Prenom + ", Telephone=" + Telephone + "]";
	}	
	
	
	
	
}