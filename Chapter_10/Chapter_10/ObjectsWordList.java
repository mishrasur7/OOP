package Chapter_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsWordList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word (quit ends): ");
		String strInput = input.nextLine();

		ArrayList<String> str = new ArrayList<String>();
		int count = 1;
		while (!strInput.equals("quit")) {
			str.add(strInput);
			System.out.print("Enter a word (quit ends): ");
			strInput = input.nextLine();
			count++;
		}

		Collections.sort(str);
		

		for (int i = 0; i < str.size(); i++) {
			System.out.println(str.get(i));
		}
		input.close();

	}

}
