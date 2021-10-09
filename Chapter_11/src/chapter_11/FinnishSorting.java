package chapter_11;

import java.util.Comparator;

public class FinnishSorting implements Comparator<WordPair>{

	@Override
	public int compare(WordPair o1, WordPair o2) {
		return o1.getFinnishWord().compareTo(o2.getFinnishWord()); 
	}
	
	

}
