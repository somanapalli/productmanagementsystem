package com.infy.product.service;

import java.util.Set;

import com.infy.product.dao.ProductDao;
import com.infy.product.dao.ProductDaoImpl;
import com.infy.product.model.Product;

public class ProductServiceImpl implements ProductService {

	ProductDao dao = new ProductDaoImpl();

	@Override
	public Product addProduct(Product p) {

		return dao.addProduct(p);
	}

	@Override
	public Product updateProduct(Product p) {

		return dao.updateProduct(p);
	}

	@Override
	public String deleteProduct(int id) {

		return dao.deleteProduct(id);
	}

	@Override
	public Product getProductById(int id) {

		return dao.getProductById(id);
	}

	@Override
	public Set<Product> getAllProductsByName(String name) {

		return dao.getAllProductsByName(name);
	}

	@Override
	public Set<Product> getAllProductsInBetweenPrice(int minAmount, int maxAmount) {
		return dao.getAllProductsInBetweenPrice(minAmount, maxAmount);
	}

	@Override
	public Set<Product> getAllProducts() {
		return dao.getAllProducts();
	}

	@Override
	public Set<Product> getAllProductsInOrder() {
		return dao.getAllProductsInOrder();
	}

}
