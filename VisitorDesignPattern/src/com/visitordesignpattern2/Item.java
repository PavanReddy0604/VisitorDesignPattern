package com.visitordesignpattern2;

public interface Item {
	
	long accept(ShoppingCartVisitor visitor);

}
