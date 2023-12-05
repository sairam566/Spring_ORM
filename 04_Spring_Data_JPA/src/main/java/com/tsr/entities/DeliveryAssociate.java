package com.tsr.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "delivery_associate")
public class DeliveryAssociate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "delivery_associate_no")
	protected int deliveryAssociateNo;

	@Column(name = "associate_name")
	protected String associateName;

	@Column(name = "contact_no")
	protected String contactNo;
	protected String designation;
	protected int experience;
	
	@OneToMany(mappedBy = "deliveryAssociate",fetch = FetchType.EAGER)
	protected Set<Parcel> parcels;

	public DeliveryAssociate() {
		super();
	}

	public DeliveryAssociate(int deliveryAssociateNo, String associateName, String contactNo, String designation,
			int experience, Set<Parcel> parcels) {
		super();
		this.deliveryAssociateNo = deliveryAssociateNo;
		this.associateName = associateName;
		this.contactNo = contactNo;
		this.designation = designation;
		this.experience = experience;
		this.parcels = parcels;
	}

	public int getDeliveryAssociateNo() {
		return deliveryAssociateNo;
	}

	public void setDeliveryAssociateNo(int deliveryAssociateNo) {
		this.deliveryAssociateNo = deliveryAssociateNo;
	}

	public String getAssociateName() {
		return associateName;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Set<Parcel> getParcels() {
		return parcels;
	}

	public void setParcels(Set<Parcel> parcels) {
		this.parcels = parcels;
	}

	@Override
	public String toString() {
		return "DeliveryAssociate [deliveryAssociateNo=" + deliveryAssociateNo + ", associateName=" + associateName
				+ ", contactNo=" + contactNo + ", designation=" + designation + ", experience=" + experience
				+ ", parcels=" + parcels + "]";
	}
	
}
