package Chapter_8;

public class WordPair {
	
	private String englishWord; 
	private String finnishWord; 
	
	public WordPair(String englishWord, String finnishWord) {
		this.englishWord = englishWord;
		this.finnishWord = finnishWord; 
	}
	
	public String getEnglishWord(String englishWord) {
		return englishWord; 
	}
	
	public String getFinnishWord(String finnishWord) {
		return finnishWord;
	}
	
	public String toString() {
		return englishWord + " = " + finnishWord; 
	}

}
