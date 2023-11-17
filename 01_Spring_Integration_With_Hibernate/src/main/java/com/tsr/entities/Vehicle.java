package com.tsr.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vehicleNo;
	@Column(name = "model_name")
	private String modelName;
	private String manufacturer;
	private String color;
	@Column(name = "fuel_type")
	private String fuelType;
	@Column(name = "lease_amount")
	private double leaseAmount;
	
	public Vehicle() {
		super();
	}

	public Vehicle(int vehicleNo, String modelName, String manufacturer, String color, String fuelType,
			double leaseAmount) {
		super();
		this.vehicleNo = vehicleNo;
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.color = color;
		this.fuelType = fuelType;
		this.leaseAmount = leaseAmount;
	}

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getLeaseAmount() {
		return leaseAmount;
	}

	public void setLeaseAmount(double leaseAmount) {
		this.leaseAmount = leaseAmount;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleNo=" + vehicleNo + ", modelName=" + modelName + ", manufacturer=" + manufacturer
				+ ", color=" + color + ", fuelType=" + fuelType + ", leaseAmount=" + leaseAmount + "]";
	}
	
}
