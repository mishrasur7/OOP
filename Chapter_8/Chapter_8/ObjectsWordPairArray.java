package Chapter_8;

public class ObjectsWordPairArray {

	public static void main(String[] args) {
		WordPair[] wordPairArray = new WordPair[3];
		wordPairArray[0] = new WordPair("class", "luokka"); 
		wordPairArray[1] = new WordPair("object", "olio");
		wordPairArray[2] = new WordPair("variable", "muuttuja");
		
		for(WordPair array : wordPairArray) {
			System.out.println(array);
		}
	}

}
