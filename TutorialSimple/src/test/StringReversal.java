package test;

public class StringReversal {

	public static void main(String[] args) {
		
		String word = "sentence";
		
		String reversedWord = reverseWord(word); 
		
		System.out.println(reversedWord);
		
		//System.out.println(reversedWord);

	}

	static String reverseWord(String word) {
		
		String reversedWord = "";
		for (int i = 0; i <= word.length() - 1 ; i++){
			reversedWord += word.charAt(word.length() - 1 - i);
		}
		return reversedWord;
	}

}