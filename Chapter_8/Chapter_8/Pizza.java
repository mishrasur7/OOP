package Chapter_8;

import java.text.DecimalFormat;

public class Pizza {
	private String name;
	private double price;

	Pizza(String name, double price) {
		this.name = name;
		this.price = price;
	}

	String getName() {
		return name;
	}

	double getPrice() {
		return price;
	}

	public String toString() {
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		return name + " (" + twoDecimals.format(price).replace('.', ',') + " euros)";
	}

}
