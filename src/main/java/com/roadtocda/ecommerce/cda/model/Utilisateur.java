package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
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
=======
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="utilisateur", schema = "public")

public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_utilisateur;
	private String mail;
	private String nom;
	private String password;
	private String prenom;
	private String telephone;
	
    @ManyToOne // Relation Many-to-One, un article appartient à une catégorie
    @JoinColumn(name = "id_role") // Clé étrangère pour relier à la catégorie
    private Role role ;

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
>>>>>>> branch 'main' of https://github.com/YassineElazzati/Ecommerce-Springboot.git
	}	
}
