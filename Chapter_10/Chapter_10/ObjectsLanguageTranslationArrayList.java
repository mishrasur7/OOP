package Chapter_10;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsLanguageTranslationArrayList {

	public static void main(String[] args) {
		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");

		ArrayList<String> englishWordList = new ArrayList<String>();
		ArrayList<String> finnishWordList = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an english word: ");
		String englishWord = input.nextLine();

		int count = 1;
		while (!englishWord.equals("ok")) {
			englishWordList.add(englishWord);
			System.out.print("Enter a finnish word: ");
			String finnishWord = input.nextLine();
			finnishWordList.add(finnishWord);
			System.out.print("Enter an english word: ");
			englishWord = input.nextLine();
			count++;
		}

		ArrayList<WordPair> wordPairList = new ArrayList<WordPair>();

		for (int i = 0; i < finnishWordList.size(); i++) {
			wordPairList.add(new WordPair(englishWordList.get(i), finnishWordList.get(i)));
		}

		System.out.println();
		System.out.println("=== English-Finnish translation service (quit ends) ===");
		System.out.print("Enter an english word: ");
		String engWord = input.nextLine();


		while (!engWord.equals("quit")) {
			boolean found = false;
			int index = 0;
			for (int i = 0; i < englishWordList.size(); i++) {
				if (engWord.equals(englishWordList.get(i))) {
					found = true;
					index = i;
				}
			}
			if (found == true) {
				System.out.println(wordPairList.get(index).getFinnishWord());
				System.out.print("Enter an english word: ");
				engWord = input.nextLine();
			} else if (found == false) {
				System.out.println("Unknown word");
				System.out.print("Enter an english word: ");
				engWord = input.nextLine();
			}
			
		}
		System.out.println("Bye!");
		input.close();

	}

}
