package chapter_11;

import java.util.Comparator;

public class FinnishSorting implements Comparable<WordPair> {

	@Override
	public int compareTo(WordPair o) {
		return o.getFinnishWord().compareTo(o.getFinnishWord()); 
	}

}
