package com.infy.product.model;

public class Product {//ctrl+shift+f
	private int id;
	private String name;
	private int amount;
	private int code;
	private String addrs;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, int amount, int code, String addrs) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.code = code;
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", amount=" + amount + ", code=" + code + ", addrs=" + addrs
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

}
