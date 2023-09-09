package com.visitordesignpattern;

public class Fruit implements Item{
	private String fruitId;
	private String fruitName;
	private int price;
	private int noOfFruits;
	
	
	
	
	
	/**
	 * @param fruitId
	 * @param fruitName
	 * @param price
	 * @param noOfFruits
	 */
	public Fruit(String fruitId, String fruitName, int price, int noOfFruits) {
		super();
		this.fruitId = fruitId;
		this.fruitName = fruitName;
		this.price = price;
		this.noOfFruits = noOfFruits;
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






	public int getNoOfFruits() {
		return noOfFruits;
	}






	@Override
	public long accept(ShoppingCartVisitor visitor) {
		
		return visitor.visit(this);
	}
	
	

}
