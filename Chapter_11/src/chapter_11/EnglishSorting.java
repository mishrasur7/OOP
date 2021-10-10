package chapter_11;

import java.util.Comparator;

public class EnglishSorting implements Comparable<WordPair> {

	@Override
	public int compare(WordPair o1, WordPair o2) {
		return o1.getEnglishWord().compareTo(o2.getEnglishWord()); 
	}
	

}
