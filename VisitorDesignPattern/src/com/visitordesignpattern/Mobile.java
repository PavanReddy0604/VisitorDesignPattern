package com.visitordesignpattern;

public class Mobile implements Item {
	
	private String modelNumber;
	private int noOfMobiles;
	private int mobileCost;
	
	
	public Mobile(String modelNumber, int noOfMobiles, int mobileCost) {
		super();
		this.modelNumber = modelNumber;
		this.noOfMobiles = noOfMobiles;
		this.mobileCost = mobileCost;
	}
	
	



	public String getModelNumber() {
		return modelNumber;
	}





	public int getNoOfMobiles() {
		return noOfMobiles;
	}





	public int getMobileCost() {
		return mobileCost;
	}





	@Override
	public long accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);

	}

}
