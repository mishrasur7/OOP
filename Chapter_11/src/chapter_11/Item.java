package chapter_11;

public class Item {
	private Product product;
	private int quantity;

	public Item(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getSubTotal() {
		return product.getPrice() * quantity;
	}

}
