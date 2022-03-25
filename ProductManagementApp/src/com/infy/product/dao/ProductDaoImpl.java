package com.infy.product.dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import com.infy.product.model.Product;

public class ProductDaoImpl implements ProductDao {

	LinkedHashMap<Integer, Product> products = new LinkedHashMap<Integer, Product>();

	@Override
	public Product addProduct(Product p) {// 123
		products.put(p.getId(), p);
		return products.get(p.getId());
	}

	@Override
	public Product updateProduct(Product p) {// 123

		return products.put(p.getId(), p);
	}

	@Override
	public String deleteProduct(int id) {
		Product product = products.remove(id);
		if (product != null)
			return "deleted successfully";
		else
			return "enter valid product id";
	}

	@Override
	public Product getProductById(int id) {

		return products.get(id);
	}

	@Override
	public Set<Product> getAllProductsByName(String name) {// laptop
		Set<Entry<Integer, Product>> entries = products.entrySet();// will convert map to set
		Iterator<Entry<Integer, Product>> itr = entries.iterator();
		Set<Product> products = new HashSet<Product>();
		while (itr.hasNext()) {

			Entry<Integer, Product> entry = itr.next();
			Product product = entry.getValue();
			if (product.getName().equals(name)) {
				products.add(product);
			}
		}

		return products;
	}

	@Override			//	900,1000,2000,1500,2500		// 1000					2000
	public Set<Product> getAllProductsInBetweenPrice(int minAmount, int maxAmount) {
		Set<Entry<Integer, Product>> entries = products.entrySet();// will convert map to set
		Iterator<Entry<Integer, Product>> itr = entries.iterator();
		Set<Product> products = new HashSet<Product>();
		while (itr.hasNext()) {

			Entry<Integer, Product> entry = itr.next();
			Product product = entry.getValue();
			int productPrice = product.getAmount();//
			if (minAmount <= productPrice && productPrice <= maxAmount) {
				products.add(product);
			}
		}
		return products;
	}

	@Override
	public Set<Product> getAllProducts() {
		Set<Entry<Integer, Product>> entries = products.entrySet();// will convert map to set
		Iterator<Entry<Integer, Product>> itr = entries.iterator();
		Set<Product> products = new HashSet<Product>();
		while (itr.hasNext()) {

			Entry<Integer, Product> entry = itr.next();
			Product product = entry.getValue();
			products.add(product);
		}
		return products;
	}

	@Override
	public Set<Product> getAllProductsInOrder() {
		Set<Entry<Integer, Product>> entries = products.entrySet();// will convert map to set
		Iterator<Entry<Integer, Product>> itr = entries.iterator();
		TreeSet<Product> products = new TreeSet<Product>();
		while (itr.hasNext()) {

			Entry<Integer, Product> entry = itr.next();
			Product product = entry.getValue();
			products.add(product);
		}
		return products;
	}

}
