package Testing;

public class CharacterChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "Character";
		System.out.println(sentence);
		sentence = replace(sentence, 't', 'k');
		System.out.println(sentence);
		
	}
	
	public static String replace(String sentence, char x, char y){
		
		sentence = sentence.replace(x, y);
		return sentence;
	}

}
