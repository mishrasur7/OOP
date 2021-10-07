package chapter_11;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Item> itemList = new ArrayList<Item>(); 
	
	public ShoppingCart() {
		
	}
	
	public void add(Product product, int quantity) {
		itemList.add(new Item(product, quantity));  
	}
	 public void remove(Product product) {
		 itemList.remove(product); 
	 }
	 
	 public double getTotalPrice() {
		 double sum = 0.0; 
		 for(Item itemObj : itemList) {
			 sum += itemObj.getSubTotal(); 
		 }
		 return sum; 
	 }
	 
	 public String toString() {
		 System.out.println("=== Shopping cart ===");
		 return "su"; 
	 }
	
}
