package Chapter_8;

import java.util.Scanner;

public class ObjectsLanguageTranslationArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an english word: ");
		String strInput = input.nextLine();
		
		WordPair[] wordArray = new WordPair[5];

		wordArray[0] = new WordPair("bird", "lintu");
		wordArray[1] = new WordPair("bus", "bussi");
		wordArray[2] = new WordPair("car", "auto");
		wordArray[3] = new WordPair("cat", "kissa");
		wordArray[4] = new WordPair("dog", "koira");
		
		boolean match = false; 
		int index = 0; 
		
		for(int i = 0; i < wordArray.length; i++) {
			if(strInput.equals(wordArray[i].getEnglishWord())) {
				match = true;
				index = i; 
			}
		}
		
		if (match == true) {
			System.out.println(wordArray[index].getFinnishWord());
		} else {
			System.out.println("Unknown word");
		}

		input.close();
	}

}
