package com.visitordesignpattern2;

public interface ShoppingCartVisitor {
	long visit(Mobile mobile);

	long visit(Fruit fruit);

}
