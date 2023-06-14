package com.example.demo.payload;

import jakarta.validation.constraints.NotEmpty;

@NotEmpty

public class RequestData {
	
	@NotEmpty(message = "Product code should not be null or empty")
	private int productCode;
	
	private int age;
	
	private int sumInsured;
	
	private int adultCount;
	
	private int childCount;
	
	private String paymentPlan;
	
	private String starExtraProtect;
	
	private String policyType;

	private int oneThousand;
	
	private int twoThousand;
	
	private int threeThousand;
	
	private int policyDays;
	
	private String policyPlan;
	
	private String optionalCover;
	
	private int optionalSumInsured;

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(int sumInsured) {
		this.sumInsured = sumInsured;
	}

	public int getAdultCount() {
		return adultCount;
	}

	public void setAdultCount(int adultCount) {
		this.adultCount = adultCount;
	}

	public int getChildCount() {
		return childCount;
	}

	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}

	public String getPaymentPlan() {
		return paymentPlan;
	}

	public void setPaymentPlan(String paymentPlan) {
		this.paymentPlan = paymentPlan;
	}

	public String getStarExtraProtect() {
		return starExtraProtect;
	}

	public void setStarExtraProtect(String starExtraProtect) {
		this.starExtraProtect = starExtraProtect;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public int getOneThousand() {
		return oneThousand;
	}

	public void setOneThousand(int oneThousand) {
		this.oneThousand = oneThousand;
	}

	public int getTwoThousand() {
		return twoThousand;
	}

	public void setTwoThousand(int twoThousand) {
		this.twoThousand = twoThousand;
	}

	public int getThreeThousand() {
		return threeThousand;
	}

	public void setThreeThousand(int threeThousand) {
		this.threeThousand = threeThousand;
	}

	public int getPolicyDays() {
		return policyDays;
	}

	public void setPolicyDays(int policyDays) {
		this.policyDays = policyDays;
	}

	public String getPolicyPlan() {
		return policyPlan;
	}

	public void setPolicyPlan(String policyPlan) {
		this.policyPlan = policyPlan;
	}

	public String getOptionalCover() {
		return optionalCover;
	}

	public void setOptionalCover(String optionalCover) {
		this.optionalCover = optionalCover;
	}

	public int getOptionalSumInsured() {
		return optionalSumInsured;
	}

	public void setOptionalSumInsured(int optionalSumInsured) {
		this.optionalSumInsured = optionalSumInsured;
	}
	
	
	
	
}
