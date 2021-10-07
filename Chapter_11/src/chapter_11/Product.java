package chapter_11;

public class Product {
	private int number; 
	private String name; 
	private double price; 
	
	public Product(int number, String name, double price) {
		this.number = number; 
		this.name = name; 
		this.price = price; 
	}
	
	public void setNumber(int number) {
		this.number = number; 
	}
	
	public int getNumber() {
		return number; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public String getName() {
		return name; 
	}
	
	public void setPrice(double price) {
		this.price = price; 
	}
	
	public double getPrice() {
		return price; 
	}

}
