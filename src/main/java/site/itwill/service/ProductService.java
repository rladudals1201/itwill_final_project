package site.itwill.service;

import java.util.List;

import site.itwill.dto.Product;
import site.itwill.exception.NotEnoughQtyException;

public interface ProductService {
	void addProduct(Product product);
	List<Product> getCategoryProductList();
	List<Product> getCodeProduct(String code);
	Product getProduct(int num);
	void modifyProduct(Product product) throws NotEnoughQtyException;
	void removeProduct(int num);
	Product getProductName(String name);

}
