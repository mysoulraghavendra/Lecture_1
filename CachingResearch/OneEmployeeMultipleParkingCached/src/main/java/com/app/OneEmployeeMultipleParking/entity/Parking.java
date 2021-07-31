package com.app.OneEmployeeMultipleParking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	@Column(name="vehicle_type")
	private String vtype;
	
	
	
	@ManyToOne
	@JoinColumn(name = "emp_code")
	private Employee employee;



	public Parking() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Parking(String vid, String vtype, Employee employee) {
		super();
		this.vid = vid;
		this.vtype = vtype;
		this.employee = employee;
	}



	public String getVid() {
		return vid;
	}



	public void setVid(String vid) {
		this.vid = vid;
	}



	public String getVtype() {
		return vtype;
	}



	public void setVtype(String vtype) {
		this.vtype = vtype;
	}



	public Employee getEmployee() {
		return employee;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



	@Override
	public String toString() {
		return "Parking [vid=" + vid + ", vtype=" + vtype + "]";
	}



}
