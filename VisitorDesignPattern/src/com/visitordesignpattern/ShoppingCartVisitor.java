package com.visitordesignpattern;

public interface ShoppingCartVisitor {
	long visit(Mobile mobile);

	long visit(Fruit fruit);

}
