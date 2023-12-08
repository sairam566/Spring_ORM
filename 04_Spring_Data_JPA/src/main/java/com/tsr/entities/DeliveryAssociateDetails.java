package com.tsr.entities;

// Class Based Projection
public class DeliveryAssociateDetails {
	private int deliveryAssociateNo;
	private String associateName;
	private int experience;
	
	public DeliveryAssociateDetails() {
		super();
	}
	
	public DeliveryAssociateDetails(int deliveryAssociateNo, String associateName, int experience) {
		super();
		this.deliveryAssociateNo = deliveryAssociateNo;
		this.associateName = associateName;
		this.experience = experience;
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
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "DeliveryAssociateDetails [deliveryAssociateNo=" + deliveryAssociateNo + ", associateName="
				+ associateName + ", experience=" + experience + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((associateName == null) ? 0 : associateName.hashCode());
		result = prime * result + deliveryAssociateNo;
		result = prime * result + experience;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeliveryAssociateDetails other = (DeliveryAssociateDetails) obj;
		if (associateName == null) {
			if (other.associateName != null)
				return false;
		} else if (!associateName.equals(other.associateName))
			return false;
		if (deliveryAssociateNo != other.deliveryAssociateNo)
			return false;
		if (experience != other.experience)
			return false;
		return true;
	}
	
}
