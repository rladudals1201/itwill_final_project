package site.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import site.itwill.dto.Cart;
import site.itwill.mapper.CartMapper;

@Repository
public class CartDAOImpl implements CartDAO{
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<Cart> selectCartList() {
		
		return sqlSession.getMapper(CartMapper.class).selectCartList();
	}

	@Override
	public int insertCart(Cart cart) {
		return sqlSession.getMapper(CartMapper.class).insertCart(cart);
	}

	@Override
	public Cart selectCart(int cartNo) {
		return sqlSession.getMapper(CartMapper.class).selectCart(cartNo);
	}

	@Override
	public int deleteCart(int cartNo) {
		return sqlSession.getMapper(CartMapper.class).deleteCart(cartNo);
	}
	
	
	
}
