package Prime;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int numInput = Integer.parseInt(input.nextLine());

		int count = 1;
		int startNum = 1;
		while (count <= numInput) {
			startNum++;
			if (isPrime(startNum) == true) {
				System.out.print(startNum + " ");
				count++;
			}	
		}

	}

	public static boolean isPrime(int num) {
		boolean isPrime = true;
		if (num > 1) {
			for (int i = 2; i < num; i++) {
				if ((num % i) == 0) {
					isPrime = false;
				}
			}
		} else {
			isPrime = false;
		}
		return isPrime;
	}

}
