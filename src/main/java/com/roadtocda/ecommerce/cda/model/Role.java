package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="role")
public class Role {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
	private int Id_Role;
	private String Designation;
	public int getId_Role() {
		return Id_Role;
	}
	public void setId_Role(int id_Role) {
		Id_Role = id_Role;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	@Override
	public String toString() {
		return "role [Id_Role=" + Id_Role + ", Designation=" + Designation + "]";
=======
	private int id_role;
	private String designation;
	
	public int getId_Role() {
		return id_role;
	}
	public void setId_Role(int id_role) {
		this.id_role = id_role;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "role [Id_Role=" + id_role + ", Designation=" + designation + "]";
>>>>>>> branch 'main' of https://github.com/YassineElazzati/Ecommerce-Springboot.git
	}
	
	

}
