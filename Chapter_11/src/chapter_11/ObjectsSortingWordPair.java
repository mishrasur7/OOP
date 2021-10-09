package chapter_11;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ObjectsSortingWordPair {

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

		System.out.println();
		
		Collections.sort(wordList, new Comparator<WordPair>() {
			public int compare(WordPair w1, WordPair w2) {
				return Integer.valueOf(w1.getEnglishWord().compareTo(w2.getEnglishWord()));
			}
		});

		for (int i = 0; i < wordList.size(); i++) {
			System.out.print(wordList.get(i).getEnglishWord() + " = " + wordList.get(i).getFinnishWord() + "\n");
		}

		Collections.sort(wordList, new Comparator<WordPair>() {
			public int compare(WordPair w1, WordPair w2) {
				return Integer.valueOf(w1.getFinnishWord().compareTo(w2.getFinnishWord()));
			}
		});

		System.out.println();
		for (int i = 0; i < wordList.size(); i++) {
			System.out.print(wordList.get(i).getFinnishWord() + " = " + wordList.get(i).getEnglishWord() + "\n");
		}

	}

}
