package edu.coffeeProductioon.entity;

public class Coffee {
       // This is a Coffee class with varities of coffees
	private int price;
	private String name;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Coffee(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	public Coffee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Coffee [price=" + price + ", name=" + name + "]";
	}
	

}
