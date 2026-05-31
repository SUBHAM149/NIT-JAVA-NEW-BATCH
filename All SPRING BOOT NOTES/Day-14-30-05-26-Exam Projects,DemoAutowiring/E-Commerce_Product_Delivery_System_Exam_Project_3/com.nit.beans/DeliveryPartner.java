package com.nit.beans;

public class DeliveryPartner {
	private String partnerId;
	private String partnerName;
	private String contactNumber;

	public DeliveryPartner(String partnerId, String partnerName, String contactNumber) {
		this.partnerId = partnerId;
		this.partnerName = partnerName;
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "DeliveryPartner [partnerId=" + partnerId + ", partnerName=" + partnerName + ", contactNumber="
				+ contactNumber + "]";
	}
}
