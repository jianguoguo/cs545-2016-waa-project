package edu.mum.waa.amazing.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.waa.amazing.domain.Order;
import edu.mum.waa.amazing.domain.Product;
import edu.mum.waa.amazing.domain.repository.OrderRepository;
import edu.mum.waa.amazing.domain.repository.ProductRepository;
import edu.mum.waa.amazing.service.CartService;
import edu.mum.waa.amazing.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CartService cartService;

	
	public void processOrder(String productId, long quantity) {
		Product productById = productRepository.getProductById(productId);
		
		if(productById.getUnitsInStock() < quantity){
			throw new IllegalArgumentException("Out of Stock. Available Units in stock"+ productById.getUnitsInStock());
		}
		
		productById.setUnitsInStock(productById.getUnitsInStock() - quantity);
	}
	
	public Long saveOrder(Order order) {
		Long orderId = orderRepository.saveOrder(order);
		cartService.delete(order.getCart().getId());
		return orderId;
	}

}
