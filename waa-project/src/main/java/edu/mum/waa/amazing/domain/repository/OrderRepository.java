package edu.mum.waa.amazing.domain.repository;

import edu.mum.waa.amazing.domain.Order;

public interface OrderRepository {
	Long saveOrder(Order order);
}
