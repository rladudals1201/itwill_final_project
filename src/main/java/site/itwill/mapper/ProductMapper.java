package site.itwill.mapper;

import java.util.List;

import site.itwill.dto.Product;

public interface ProductMapper {
	int insertProduct(Product product);
	List<Product> selectCategoryProductList();
	List<Product> selectCodeProduct(String code);
	Product selectProduct(int num);
	int updateProduct(Product product);
	int deleteProduct(int num);
	Product selectProductName(String name);
}
