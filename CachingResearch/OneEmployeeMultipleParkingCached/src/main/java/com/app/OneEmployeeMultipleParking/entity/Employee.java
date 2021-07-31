package com.app.OneEmployeeMultipleParking.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "employee")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
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
	@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
	@JoinColumn(name = "emp_code")
	private List<Parking> parkingVehicles;


	@Override
	public String toString() {
		return "Employee [code=" + code + ", name=" + name + ", salary=" + salary + ", parkingVehicles="
				+ parkingVehicles + "]";
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public List<Parking> getParkingVehicles() {
		return parkingVehicles;
	}


	public void setParkingVehicles(List<Parking> parkingVehicles) {
		this.parkingVehicles = parkingVehicles;
	}



	
	

}
