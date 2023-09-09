package com.visitordesignpattern2;

public class Fruit implements Item{
	private String fruitId;
	private String fruitName;
	private int price;

	
	
	
	
	
	/**
	 * @param fruitId
	 * @param fruitName
	 * @param price
	 * @param noOfFruits
	 */
	public Fruit(String fruitId, String fruitName, int price) {
		super();
		this.fruitId = fruitId;
		this.fruitName = fruitName;
		this.price = price;
	}

	




	public String getFruitId() {
		return fruitId;
	}






	public String getFruitName() {
		return fruitName;
	}






	public int getPrice() {
		return price;
	}










	@Override
	public long accept(ShoppingCartVisitor visitor) {
		
		return visitor.visit(this);
	}
	
	

}
