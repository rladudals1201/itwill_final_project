package site.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.itwill.dao.CartDAO;
import site.itwill.dto.Cart;

@Service
public class CartServiceImpl implements CartService{
	@Autowired
	CartDAO cartDAO;
	
	@Override
	public List<Cart> getCartList() {
		return cartDAO.selectCartList();
	}

	@Override
	public void addCart(Cart cart) {
	cartDAO.insertCart(cart);
		
	}

	@Override
	public Cart getCart(int cartNo) {
		
		return cartDAO.selectCart(cartNo);
	}

	@Override
	public void removeCart(int cartNo) {
		cartDAO.deleteCart(cartNo);
		
	}

}
