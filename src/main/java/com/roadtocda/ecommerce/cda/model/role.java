package com.roadtocda.ecommerce.cda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class role {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
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
	}
	
	

}
