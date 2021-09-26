package Chapter_9;

import java.util.Scanner;

public class PowerP {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		String inputStr = input.nextLine(); 
		double numInput = Double.parseDouble(inputStr.replace(',', '.'));
		int power = (int)(numInput * numInput);
		System.out.println("The power of " + inputStr + " is " + power);
		input.close();

	}

}
