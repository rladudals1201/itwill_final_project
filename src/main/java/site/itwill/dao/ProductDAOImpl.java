package site.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import site.itwill.dto.Product;
import site.itwill.mapper.ProductMapper;

@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertProduct(Product product) {
		return sqlSession.getMapper(ProductMapper.class).insertProduct(product);
	}

	@Override
	public List<Product> selectCategoryProductList() {
		return sqlSession.getMapper(ProductMapper.class).selectCategoryProductList();
	}

	@Override
	public List<Product> selectCodeProduct(String code) {
		return sqlSession.getMapper(ProductMapper.class).selectCodeProduct(code);
	}

	@Override
	public Product selectProduct(int num) {
		return sqlSession.getMapper(ProductMapper.class).selectProduct(num);
	}

	@Override
	public int updateProduct(Product product) {
		return sqlSession.getMapper(ProductMapper.class).updateProduct(product);
	}

	@Override
	public int deleteProduct(int num) {
		return sqlSession.getMapper(ProductMapper.class).deleteProduct(num);
	}

	@Override
	public Product selectProductName(String name) {
		return sqlSession.getMapper(ProductMapper.class).selectProductName(name);
	}
	


}
