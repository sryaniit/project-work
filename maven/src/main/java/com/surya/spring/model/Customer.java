package com.surya.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*declaring student as a entity**/
@Entity
@Table(name="Customer")

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name="id")
    private int id;
	private String name;
	private String email;
	private String details;
	/* Implementing Getter and Setter methods Using Entity*/
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
}
