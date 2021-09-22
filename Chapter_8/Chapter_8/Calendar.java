package Chapter_8;


import java.time.LocalDate;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int yearInput = Integer.parseInt(input.nextLine());
		System.out.print("Enter month: ");
		int monthInput = Integer.parseInt(input.nextLine());
		System.out.println();
		printCalendar(yearInput, monthInput);
		input.close();
	}

	private static void printCalendar(int year, int month) {
		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		String[] weekNames = { " Mon ", "Tue ", "Wed ", "Thu ", "Fri ", "Sat ", "Sun" };
		LocalDate myDate = LocalDate.of(year, month, 1);
		int daysInMonth = myDate.lengthOfMonth();
		int dayOfWeek = myDate.getDayOfWeek().getValue();
		String monthName = monthNames[month - 1];
		System.out.println(" > " + monthName + " " + year + " <");
		
		for (int i = 0; i < weekNames.length; i++) {
			System.out.print(weekNames[i]);
		}

		System.out.println();
		int counter = 1;
		if (dayOfWeek < 8) {
			for (int i = 1; i < dayOfWeek; i++, counter++) {
				System.out.printf("%4s", "");
			}
		}

		for (int i = 1; i <= daysInMonth; i++, counter++) {
			System.out.printf("%4d", i);
			if (counter % 7 == 0) {
				System.out.println();
			}	
		}
		System.out.println();
	}

}
