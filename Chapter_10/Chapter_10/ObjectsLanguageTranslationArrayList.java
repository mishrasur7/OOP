package Chapter_10;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsLanguageTranslationArrayList {

	public static void main(String[] args) {
		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");
		
		ArrayList<String> englishWordList = new ArrayList<String>();
		ArrayList<String> finnishwordList = new ArrayList<String>(); 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an english word: ");
		String englishWord = input.nextLine();
		
		int count = 1; 
		while(!englishWord.equals("ok")) {
			englishWordList.add(englishWord); 
			System.out.print("Enter a finnish word: ");
			String finnishWord = input.nextLine();
			finnishwordList.add(finnishWord); 
			System.out.print("Enter an english word: ");
			englishWord = input.nextLine();
			count++; 
		}
		
	}

}
