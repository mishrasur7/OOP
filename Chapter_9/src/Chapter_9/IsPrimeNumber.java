package Chapter_9;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number to be checked: ");
		int numInput = Integer.parseInt(input.nextLine());
		boolean isPrime = true;

		if(numInput > 1) {
			for(int i = 2; i < numInput; i++) {
				if(numInput % i == 0) {
					isPrime = false; 
				}
			}
		} else {
			isPrime = false; 
		}
		System.out.println(isPrime);
		input.close();

	}

}
