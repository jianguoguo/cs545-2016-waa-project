package edu.mum.waa.amazing.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Cart implements Serializable{

	private static final long serialVersionUID = -4045729241960416615L;
	
	private String id;
        private User user;
	private Map<String,CartItem> cartItems;
	private BigDecimal grandTotal;
	
	public Cart() {
		cartItems = new HashMap<String, CartItem>();
		grandTotal = new BigDecimal(0);
	}
	
	public Cart(String id) {
		this();
		this.id = id;
	}
	

	public Map<String, CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(Map<String, CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public BigDecimal getGrandTotal() {
		return grandTotal;
	}
	
	public void addCartItem(CartItem item) {
		String productId = item.getProduct().getId();
		
		if(cartItems.containsKey(productId)) {
			CartItem existingCartItem = cartItems.get(productId);
			existingCartItem.setQuantity(existingCartItem.getQuantity()+ item.getQuantity());
			cartItems.put(productId, existingCartItem);
		} else {
			cartItems.put(productId, item);
		}
		updateGrandTotal();
	}
	
	public void removeCartItem(CartItem item) {
		String productId = item.getProduct().getId();
		cartItems.remove(productId);
		updateGrandTotal();
	}
	
	public void updateGrandTotal() {
		grandTotal= new BigDecimal(0);
		for(CartItem item : cartItems.values()){
			grandTotal = grandTotal.add(item.getTotalPrice());
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 71;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }
}
