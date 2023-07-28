package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="utilisateur")

public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_utilisateur;
	private String mail;
	private String nom;
	private String password;
	private String prenom;
	private String telephone;
	
	@ManyToOne
	@JoinColumn(name = "id_role")
	private Role role;
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public int getId_Utilisateur() {
		return id_utilisateur;
	}
	public void setId_Utilisateur(int id_Utilisateur) {
		id_utilisateur = id_Utilisateur;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Override
	public String toString() {
		return "utilisateur [Id_Utilisateur=" + id_utilisateur + ", Mail=" + mail + ", Nom="
				+ nom + ", Password=" + password + ", Prenom=" + prenom + ", Telephone=" + telephone + "]";
	}	
}
