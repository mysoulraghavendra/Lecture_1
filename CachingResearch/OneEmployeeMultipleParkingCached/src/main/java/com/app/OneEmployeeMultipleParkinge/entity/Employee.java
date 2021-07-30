package com.app.OneEmployeeMultipleParkinge.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "code")
	private int code;
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="salary")
	private double salary;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_code")
	private Set<Parking> parkingVehicles;


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String name, Set<Parking> parkingVehicles) {
		super();
		this.name = name;
		this.parkingVehicles = parkingVehicles;
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


	public Set<Parking> getParkingVehicles() {
		return parkingVehicles;
	}


	public void setParkingVehicles(Set<Parking> parkingVehicles) {
		this.parkingVehicles = parkingVehicles;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [code=" + code + ", name=" + name + ", parkingVehicles=" + parkingVehicles + "]";
	}
	
	
	

}
