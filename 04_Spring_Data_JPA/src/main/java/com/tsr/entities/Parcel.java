package com.tsr.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parcel")
public class Parcel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "parcel_no")
	protected int parcelNo;
	@Column(name = "charges")
	protected double charge;
	@Column(name = "delivery_type")
	protected String deliveryType;
	protected String description;
	protected int weight;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "delivery_associate_no")
	protected DeliveryAssociate deliveryAssociate;

	public Parcel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parcel(int parcelNo, double charge, String deliveryType, String description, int weight,
			DeliveryAssociate deliveryAssociate) {
		super();
		this.parcelNo = parcelNo;
		this.charge = charge;
		this.deliveryType = deliveryType;
		this.description = description;
		this.weight = weight;
		this.deliveryAssociate = deliveryAssociate;
	}

	public int getParcelNo() {
		return parcelNo;
	}

	public void setParcelNo(int parcelNo) {
		this.parcelNo = parcelNo;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public DeliveryAssociate getDeliveryAssociate() {
		return deliveryAssociate;
	}

	public void setDeliveryAssociate(DeliveryAssociate deliveryAssociate) {
		this.deliveryAssociate = deliveryAssociate;
	}

	@Override
	public String toString() {
		return "Parcel [parcelNo=" + parcelNo + ", charge=" + charge + ", deliveryType=" + deliveryType
				+ ", description=" + description + ", weight=" + weight + "]";
	}
	
}
