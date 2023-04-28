package site.itwill.dao;

import java.util.List;

import site.itwill.dto.Cart;

public interface CartDAO {
	List<Cart> selectCartList();
	int insertCart(Cart cart);
 	Cart selectCart(int cartNo);
 	int deleteCart(int cartNo);
}
