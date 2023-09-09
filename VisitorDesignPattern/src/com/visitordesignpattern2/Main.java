package com.visitordesignpattern2;

public class Main {

	public static void main(String[] args) {
		Item[] items = new Item[]{new Mobile("samsung",20000),new Mobile("Vivo",23000),
				new Fruit("BANANA","Banana",5), new Fruit("APPLE","Apple",20)};
		
		long total = calculatePrice(items);
		System.out.println("Total Cost = "+total);

	}
	
	private static long calculatePrice(Item[] items) {
		ShoppingCartVisitor visitor = new ItesmInCart();
		long sum=0;
		for(Item item : items){
			sum = sum + item.accept(visitor);
		}
		return sum;
	}


}
