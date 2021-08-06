package com.app.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "code")
	private int code;
	
	
	@Column(name = "name")
	private String name;
	
	
	@Column(name="image")
	private Blob image;


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int code, String name, Blob image) {
		super();
		this.code = code;
		this.name = name;
		this.image = image;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Blob getImage() {
		return image;
	}


	public void setImage(Blob image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "Employee [code=" + code + ", name=" + name + ", image=" + image + "]";
	}
	
	

}
