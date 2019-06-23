package com.SpringBoot.eCommerce;


import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection="employee")
public class Employee {
	@Id
	int id;
	
	String name;
	String salaty;
	public Employee(int id, String name, String salaty, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salaty = salaty;
		this.designation = designation;
	}
	String designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalaty() {
		return salaty;
	}
	public void setSalaty(String salaty) {
		this.salaty = salaty;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	

}
