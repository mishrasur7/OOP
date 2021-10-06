package Chapter_10;

public class WordPair {
	
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

}
