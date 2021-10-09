package chapter_11;

public class WordPair implements Comparable<WordPair>{

	private String englishWord;
	private String finnishWord;

	public WordPair(String englishWord, String finnishWord) {
		this.englishWord = englishWord;
		this.finnishWord = finnishWord;
	}

	public String getEnglishWord() {
		return englishWord;
	}

	public String getFinnishWord() {
		return finnishWord;
	}

	public String toString() {
		return englishWord + " = " + finnishWord;
	}

	@Override
	public int compareTo(WordPair o) {
		return englishWord.compareTo(o.englishWord); 
	}
}
