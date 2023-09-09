package com.visitordesignpattern;

import java.util.HashMap;
import java.util.Map;

public class ItesmInCart implements ShoppingCartVisitor {

	private  Map<String, Long> mobiles = new HashMap<String, Long>();
	private Map<String, Long> fruits=new HashMap<String,Long>();

	@Override
	public long visit(Mobile mobile) {
		this.storeMobiles(mobile);
		long totalCost = 0;
		for (Long price : mobiles.values()) {
			totalCost += price;
		}

		return totalCost;

	}

	private  void storeMobiles(Mobile mobile) {
		

		if (!mobiles.containsKey(mobile.getModelNumber())) {
			long price = mobile.getMobileCost()*mobile.getNoOfMobiles();
			mobiles.put(mobile.getModelNumber(), price);
			System.out.println("Hey customer the cost of "+mobile.getNoOfMobiles()+" "+mobile.getModelNumber()+" is "+price);
		} else {

			Long price = mobiles.get(mobile.getModelNumber()) + mobile.getMobileCost()*mobile.getNoOfMobiles();
			mobiles.put(mobile.getModelNumber(), price);
			System.out.println("Hey customer the cost of "+mobile.getNoOfMobiles()+" "+mobile.getModelNumber()+"s along with the previously added cart mobiles is "+price);
		}

	}

	@Override
	public long visit(Fruit fruit) {
		this.storeFruits(fruit);
		long totalCost=0;
		for(Long price:fruits.values()) {
			totalCost+=price;
		}
		return totalCost;
	}
	
	private void storeFruits(Fruit fruit) {
		if(!fruits.containsKey(fruit.getFruitId())){
			long price=fruit.getNoOfFruits()*fruit.getPrice();
			fruits.put(fruit.getFruitId(),price);
			System.out.println("Hey customer the cost of "+fruit.getNoOfFruits()+" "+fruit.getFruitName()+" is : "+price);
		}
		else {
			Long price=fruits.get(fruit.getFruitId())+fruit.getPrice()*fruit.getNoOfFruits();
			fruits.put(fruit.getFruitId(), price);
			System.out.println("Hey customer the cost of "+fruit.getNoOfFruits()+" "+fruit.getFruitName()+"s along with the previously added cart fruits is : "+price);
		}
	}

}
