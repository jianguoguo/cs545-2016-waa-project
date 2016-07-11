package edu.mum.waa.amazing.service;

import edu.mum.waa.amazing.domain.Order;

public interface OrderService {
	
	void processOrder(String  productId, long quantity);
	
	Long saveOrder(Order order);
}
