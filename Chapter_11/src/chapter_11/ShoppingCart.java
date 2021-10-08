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
		double sum = 0.00;
		for (Item itemObj : itemList) {
			sum += itemObj.getSubTotal();
		}
		return sum;
	}

	public String toString() {

		System.out.println("=== Shopping cart ===");
		String outPut = "";
		for (int i = 0; i < itemList.size(); i++) {
			outPut += itemList.get(i).getProduct().getNumber() + ": " + itemList.get(i).getProduct().getName() + ", "
					+ "quantity: " + itemList.get(i).getQuantity() + ", " + "unit price: "
					+ itemList.get(i).getProduct().getPrice() + ", " + "subtotal: " + itemList.get(i).getSubTotal() + "\n";
		}
		return outPut + "TOTAL PRICE: " + getTotalPrice();
	}

}
