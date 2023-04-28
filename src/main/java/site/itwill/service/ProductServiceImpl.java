package site.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.itwill.dao.ProductDAO;
import site.itwill.dto.Product;
import site.itwill.exception.NotEnoughQtyException;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productDAO;

	@Override
	public void addProduct(Product product) {
		productDAO.insertProduct(product);
	}

	@Override
	public List<Product> getCategoryProductList() {
		return productDAO.selectCategoryProductList();
	}

	@Override
	public List<Product> getCodeProduct(String code) {
		return productDAO.selectCodeProduct(code);
	}

	@Override
	public Product getProduct(int num) {
		return productDAO.selectProduct(num);
	}

	@Override
	public void modifyProduct(Product product) throws NotEnoughQtyException {
		productDAO.updateProduct(product);
		
	}

	@Override
	public void removeProduct(int num) {
		productDAO.deleteProduct(num);
	}

	@Override
	public Product getProductName(String name) {
		
		return productDAO.selectProductName(name);
	}

	

}
