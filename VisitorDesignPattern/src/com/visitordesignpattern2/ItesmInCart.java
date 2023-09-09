package com.visitordesignpattern2;

public class ItesmInCart implements ShoppingCartVisitor {

	@Override
	public long visit(Mobile mobile) {
		int mobileCost = mobile.getMobileCost();
		System.out.println("the cost of  "+mobile.getModelNumber()+" mobile/s  is : "+mobile.getMobileCost());
		return mobileCost;
	}

	@Override
	public long visit(Fruit fruit) {
		int fruitsCost=fruit.getPrice();
		System.out.println("The cost of "+fruit.getFruitName()+" is :"+fruit.getPrice());
		return fruitsCost;
	}



}
