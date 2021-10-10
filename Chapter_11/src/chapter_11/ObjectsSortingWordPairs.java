package chapter_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ObjectsSortingWordPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an English word (quit ends): ");
		String englishWord = input.nextLine();

		ArrayList<WordPair> wordList = new ArrayList<WordPair>();

		while (!englishWord.equals("quit")) {
			System.out.print("Enter a Finnish word: ");
			String finnishWord = input.nextLine();
			wordList.add(new WordPair(englishWord, finnishWord));
			System.out.print("Enter an English word (quit ends): ");
			englishWord = input.nextLine();
		}
		Collections.sort(wordList);

		for (WordPair wordPair : wordList) {
			System.out.println(wordPair.getEnglishWord() + " = " + wordPair.getFinnishWord());
		}
		
		System.out.println();
		
		
		Collections.reverse(wordList);
		
		Collections.sort(wordList);

		for (WordPair wordPair : wordList) {
			System.out.println(wordPair.getFinnishWord() + " = " + wordPair.getEnglishWord());
		}
		input.close();

	}

}
