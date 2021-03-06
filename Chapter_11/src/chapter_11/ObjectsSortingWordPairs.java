package chapter_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		input.close();

		Collections.sort(wordList);

		for (WordPair wordPair : wordList) {
			System.out.println(wordPair);
		}

		System.out.println();

		Collections.sort(wordList, new FinnishSorting());
		for (int i = 0; i < wordList.size(); i++) {
			System.out.println(wordList.get(i).getFinnishWord() + " = " + wordList.get(i).getEnglishWord());
		}

	}

}
