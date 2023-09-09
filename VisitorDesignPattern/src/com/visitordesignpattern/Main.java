package com.visitordesignpattern;

public class Main {

	public static void main(String[] args) {
		Mobile m=new Mobile("samsung s20", 2, 43000);
		ItesmInCart ic=new ItesmInCart();
		 ic.visit(m);
		Mobile m2=new Mobile("Iphone12", 2,65000);	
		ic.visit(m2);
		Fruit f1=new Fruit("1", "banana", 5, 12);
		ic.visit(f1);
		ic.visit(new Fruit("1","banana",4,6));
		ic.visit(new Mobile("honor 6x",2,14007));
		ic.visit(new Mobile("Iphone12",3,65000));
		
		
		
		
	}

}
