package com.visitordesignpattern;

public interface Item {
	
	long accept(ShoppingCartVisitor visitor);

}
