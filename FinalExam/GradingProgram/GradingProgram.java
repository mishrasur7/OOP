package GradingProgram;

import java.util.Scanner;

public class GradingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int maximun = 0;
		int points = 0;

		System.out.print("Enter Maximum: ");
		maximun = Integer.parseInt(input.nextLine());

		System.out.print("Enter exam points: ");

		try {
			points = Integer.parseInt(input.nextLine());

			System.out.println("\n" + grade(maximun, points));
		}

		catch (NumberFormatException nfr) {
			System.out.println("\n" + "Invalid exam points");
		}

		input.close();
	}

	public static String grade(int maximun, int points) {

		String result = "Invalid exam points";

		if (points < 0 || points > maximun) {
			result = "Invalid exam points";
		} else if (points < maximun / 2) {
			result = "Failed!";
		} else if (points < maximun * 0.7) {
			result = "Passed!";
		} else if (points < maximun * 0.9) {
			result = "Good!";
		} else if (points <= maximun) {
			result = "Excellent!";
		}

		return result;
	}

}
