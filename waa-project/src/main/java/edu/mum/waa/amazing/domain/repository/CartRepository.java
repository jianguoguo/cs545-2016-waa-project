package edu.mum.waa.amazing.domain.repository;

import edu.mum.waa.amazing.domain.Cart;

public interface CartRepository {

	Cart create(Cart cart);
	
	Cart read(String cartId);
	
	void update(String cartId, Cart cart);
	
	void delete(String cartId);

}
