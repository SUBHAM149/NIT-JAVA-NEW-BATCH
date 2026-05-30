package com.nit.beans;

public class Insurance {
	private String policyId;
	private String companyName;
	private double premiumAmount;

	public Insurance(String policyId, String companyName, double premiumAmount) {
		this.policyId = policyId;
		this.companyName = companyName;
		this.premiumAmount = premiumAmount;
	}

	@Override
	public String toString() {
		return "Insurance [policyId=" + policyId + ", companyName=" + companyName + ", premiumAmount=" + premiumAmount
				+ "]";
	}
}
