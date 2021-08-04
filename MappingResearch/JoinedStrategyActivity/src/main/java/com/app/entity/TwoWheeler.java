package com.app.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="two_wheeler")
public class TwoWheeler extends Vehicle {
	
	
	@Column(name="steering_type")
	private String steeringTwoWheeler;
	
	

	public TwoWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public TwoWheeler(String steeringTwoWheeler) {
		super();
		this.steeringTwoWheeler = steeringTwoWheeler;
	}



	public TwoWheeler(String vehicleId, String vehicleName) {
		super(vehicleId, vehicleName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TwoWheeler [steeringTwoWheeler=" + steeringTwoWheeler + "]";
	}

	public String getSteeringTwoWheeler() {
		return steeringTwoWheeler;
	}

	public void setSteeringTwoWheeler(String steeringTwoWheeler) {
		this.steeringTwoWheeler = steeringTwoWheeler;
	}
	
	
	
	

}
