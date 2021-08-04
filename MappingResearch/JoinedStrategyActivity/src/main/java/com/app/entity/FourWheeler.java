package com.app.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "four_wheeler")
public class FourWheeler extends Vehicle {
	
	
	@Column(name = "steering_type")
	private String steeringFourWheeler;

	public FourWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FourWheeler(String vehicleId, String vehicleName) {
		super(vehicleId, vehicleName);
		// TODO Auto-generated constructor stub
	}

	public String getSteeringFourWheeler() {
		return steeringFourWheeler;
	}

	public void setSteeringFourWheeler(String steeringFourWheeler) {
		this.steeringFourWheeler = steeringFourWheeler;
	}

	@Override
	public String toString() {
		return "FourWheeler [steeringFourWheeler=" + steeringFourWheeler + "]";
	}
	
	
	

}
