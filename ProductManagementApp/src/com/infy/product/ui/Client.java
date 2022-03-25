package com.infy.product.ui;

import java.util.Scanner;
import java.util.Set;

import com.infy.product.model.Product;
import com.infy.product.service.ProductService;
import com.infy.product.service.ProductServiceImpl;

public class Client {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"******************************** Product Management Application ********************************");
		ProductService service = new ProductServiceImpl();
		int id = 0;
		String name = null;
		String addr = null;
		int amt = 0;
		int code = 0;

		while (true) {
			System.out.println("1: Add Product");
			System.out.println("2: Updadte Product");
			System.out.println("3: Delete Product");
			System.out.println("4: Get product by id");
			System.out.println("5: get product by name");
			System.out.println("6: get all products in between price");
			System.out.println("7: get all products");
			System.out.println("8: get all products in order");
			System.out.println("9: exit");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter product information to add");
				System.out.println("enter product id");
				id = scanner.nextInt();
				System.out.println("enter product name");
				name = scanner.next();
				System.out.println("enter amount of product");
				amt = scanner.nextInt();
				System.out.println("enter code");
				code = scanner.nextInt();
				System.out.println("enter address");
				addr = scanner.next();

				// to add new product
				Product p1 = new Product(id, name, amt, code, addr);// domain object
				Product result1 = service.addProduct(p1);
				System.out.println(result1);
				break;
			case 2:
				System.out.println("Enter product information to update");
				System.out.println("enter product id");
				id = scanner.nextInt();
				System.out.println("enter product name");
				name = scanner.next();
				System.out.println("enter amount of product");
				amt = scanner.nextInt();
				System.out.println("enter code");
				code = scanner.nextInt();
				System.out.println("enter address");
				addr = scanner.next();

				// to add new product
				Product p2 = new Product(id, name, amt, code, addr);// domain object
				Product result2 = service.updateProduct(p2);
				System.out.println(result2);
				break;
			case 3:
				System.out.println("Enter Product Id To Delete :");

				id = scanner.nextInt();
				String result3 = service.deleteProduct(id);
				System.out.println(result3);
				break;
			case 4:
				System.out.println("enter the product id to get the productInfo");
				id = scanner.nextInt();
				Product result4 = service.getProductById(id);
				System.out.println(result4);
				break;
			case 5:
				System.out.println("enter the produt name to get the product");
				name = scanner.next();
				Set<Product> result5 = service.getAllProductsByName(name);
				System.out.println(result5);
				break;
			case 6:
				System.out.println("enter info of product to get between price");
				System.out.println("enter min price");
				int minamt = scanner.nextInt();
				System.out.println("enter max price");
				int maxamt = scanner.nextInt();
				Set<Product> result6 = service.getAllProductsInBetweenPrice(minamt, maxamt);
				System.out.println(result6);
				break;
			case 7:
				System.out.println("enter info to get all the products");
				Set<Product> set = service.getAllProducts();
				for(Product product:set)
				{
					System.out.println(product);
				}
				break;
			case 8:
				Set<Product> orderedProducts = service.getAllProductsInOrder();
				System.out.println("Products In Order :");
				for(Product product:orderedProducts)
				{
					System.out.println(product);
				}
			case 9:
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("wrong choice please enter valid no");
				break;
			}
		}
	}
}
