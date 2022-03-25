package com.infy.product.dao;

import java.util.Set;

import com.infy.product.model.Product;

public interface ProductDao {
	// add product
		Product addProduct(Product p);

		// update product
		Product updateProduct(Product p);

		// delete product
		String deleteProduct(int id);

		// get product by product id
		Product getProductById(int id);

		// get all products byname
		Set<Product> getAllProductsByName(String name);

		// get all products by price
		Set<Product> getAllProductsInBetweenPrice(int minAmount, int maxAmount);

		// get all products
		Set<Product> getAllProducts();

		// get all products in order
		Set<Product> getAllProductsInOrder();
}
