package edu.mum.waa.amazing.domain.repository.impl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
import edu.mum.waa.amazing.domain.Cart;
import edu.mum.waa.amazing.domain.repository.CartRepository;

@Repository
public class InMemoryCartRepository implements CartRepository{
	
	private Map<String, Cart> listOfCarts;
	

	public InMemoryCartRepository() {
		listOfCarts = new HashMap<String,Cart>();
		
	}
	
	
	public Cart create(Cart cart) {
		if(listOfCarts.keySet().contains(cart.getId())) {
			throw new IllegalArgumentException(String.format("Can not create a cart. A cart with the give id (%) aldrady exist",cart.getId()));
		}

		listOfCarts.put(cart.getId(), cart);
		return cart;
	}
	
	
	public Cart read(String cartId) {
		return listOfCarts.get(cartId);
	}

	public void update(String cartId, Cart cart) {
		if(!listOfCarts.keySet().contains(cartId)) {
			throw new IllegalArgumentException(String.format("Can not update cart. The cart with the give id (%) does not does not exist",cartId));
		}

		listOfCarts.put(cartId, cart);
	}

	
	public void delete(String cartId) {
		if(!listOfCarts.keySet().contains(cartId)) {
			throw new IllegalArgumentException(String.format("Can not delete cart. The cart with the give id (%) does not does not exist",cartId));
		}

		listOfCarts.remove(cartId);
	}

}
