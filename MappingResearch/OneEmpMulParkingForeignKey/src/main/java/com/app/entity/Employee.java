package com.app.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;

import net.sf.ehcache.hibernate.EhCacheProvider;


@Entity
@Table(name = "employee")

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "code")
	private int code;
	
	@Column(name="name")
	private String name;
	
	@Column(name = "salary")
	private double salary;

	
	
	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
	
	
	private List<Parking> parkingRecords;
	


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(String name, double salary, List<Parking> parkingRecords) {
		super();
		this.name = name;
		this.salary = salary;
		this.parkingRecords = parkingRecords;
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



	public List<Parking> getParkingRecords() {
		return parkingRecords;
	}



	public void setParkingRecords(List<Parking> parkingRecords) {
		this.parkingRecords = parkingRecords;
	}



	@Override
	public String toString() {
		return "Employee [code=" + code + ", name=" + name + ", salary=" + salary + ", parkingRecords=" + parkingRecords
				+ "]";
	}
	
	
	
	
}
