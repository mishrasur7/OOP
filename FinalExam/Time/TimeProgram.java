package Time;

import java.util.Scanner;

public class TimeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String time = "";

		while (!time.equals("exit")) {
			System.out.print("Enter time: ");
			time = input.nextLine();

			if (time.equals("exit")) {
				break;
			}

			boolean check = TimeTester.validateTimeFormat(time);

			if (time.equals("")) {
				System.out.println("No input!");
			} else {

				if (check == true) {
					System.out.println("OK");
				} else {
					System.out.println("Not ok");
				}
			}
			System.out.println();
		}
		input.close();
	}
}
