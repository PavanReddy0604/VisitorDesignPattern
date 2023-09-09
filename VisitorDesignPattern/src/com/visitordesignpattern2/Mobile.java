package com.visitordesignpattern2;

public class Mobile implements Item {
	
	private String modelNumber;
	private int mobileCost;
	
	
	public Mobile(String modelNumber, int mobileCost) {
		super();
		this.modelNumber = modelNumber;
		this.mobileCost = mobileCost;
	}
	
	



	public String getModelNumber() {
		return modelNumber;
	}

	public int getMobileCost() {
		return mobileCost;
	}





	@Override
	public long accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);

	}

}
