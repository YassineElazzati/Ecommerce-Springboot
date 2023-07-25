
package com.roadtocda.ecommercecda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Role;
	private String Designation;
	
	public Long getId_Role() {
		return Id_Role;
	}
	public void setId_Role(Long id_Role) {
		this.Id_Role = id_Role;
	}
	
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		this.Designation = designation;
	}
	
	@Override
	public String toString() {
		return "role [Id_Role=" + Id_Role + ", Designation=" + Designation + "]";
	}
	
	

}