package chapter_11;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Item> itemList = new ArrayList<Item>();

	public ShoppingCart() {

	}

	public void add(Product product, int quantity) {
		itemList.add(new Item(product, quantity));
	}

	public void remove(Product product) {
		int index = 0; 
		for (int i = 0; i < itemList.size(); i++) {
			if(product.equals(itemList.get(i).getProduct())) {
				index = i; 
			}
		}
		itemList.remove(index); 
	}

	public double getTotalPrice() {
		double sum = 0.00;
		for (Item itemObj : itemList) {
			sum += itemObj.getSubTotal();
		}
		return sum;
	}

	public String toString() {
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		String outPutText = "";
		if (getTotalPrice() == 0) {
			outPutText += "There are no items in the shopping cart.";
		} else {
			outPutText = "=== Shopping cart ===" + "\n";
			for (int i = 0; i < itemList.size(); i++) {
				outPutText += itemList.get(i).getProduct().getNumber() + ": " + itemList.get(i).getProduct().getName()
						+ ", " + "quantity: " + itemList.get(i).getQuantity() + ", " + "unit price: "
						+ twoDecimals.format(itemList.get(i).getProduct().getPrice()) + ", " + "subtotal: "
						+ twoDecimals.format(itemList.get(i).getSubTotal()) + "\n";
			}
			outPutText += "TOTAL PRICE: " + twoDecimals.format(getTotalPrice()) + " euros";

		}

		return outPutText;
	}

}
