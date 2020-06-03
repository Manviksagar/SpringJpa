package com.example.SpringJPA;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class StuJPA {
	@Id
	public int id;
	public String name;
	public String role;
	public StuJPA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StuJPA(int id, String name,String role) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
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

}
