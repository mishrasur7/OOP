package Chapter_8;

import java.util.Scanner;

public class ObjectsApplicantProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Applicant[] applicantArray = new Applicant[4];

		for (int i = 0; i < applicantArray.length; i++) {
			System.out.print("Enter " + (i + 1) + ". name: ");
			String inputStr = input.nextLine();
			System.out.print("Enter points: ");
			int point = Integer.parseInt(input.nextLine());
			applicantArray[i] = new Applicant(inputStr, point);
		}
		
		System.out.println();
		System.out.print("Enter the minimum of required points: ");
		int minRequiredPoints = Integer.parseInt(input.nextLine());
		
		System.out.println("The following applicants achieved the minimum of " + minRequiredPoints + " points:");
		System.out.println();
		
		for (int i = 0; i < applicantArray.length; i++) {
			Applicant applicantObject = applicantArray[i];
			if (applicantObject.getPoints() >= minRequiredPoints) {
				System.out.println(applicantObject.getName() + ", " + applicantObject.getPoints() + " points");
			}
		}
		input.close();
	}

}
