package com.app.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "parking")

@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Parking {
	
	@Id
	@Column(name="vehicle_id")
	private String vid;
	
	@Column(name="vehicle_name")
	private String vname;
	
	

	@ManyToOne
	
	
	private Employee employee;



	public Parking() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Parking(String vid, String vname, Employee employee) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.employee = employee;
	}



	public String getVid() {
		return vid;
	}



	public void setVid(String vid) {
		this.vid = vid;
	}



	public String getVname() {
		return vname;
	}



	public void setVname(String vname) {
		this.vname = vname;
	}



	public Employee getEmployee() {
		return employee;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	

}
