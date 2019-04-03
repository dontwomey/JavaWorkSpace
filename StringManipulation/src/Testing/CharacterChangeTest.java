package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterChangeTest {

	@Test
	public void test() {
		CharacterChange test = new CharacterChange();
		String output = "characker";
		String input = CharacterChange.replace("character", 't', 'k');
		assertEquals(input, output);
		
	}

}
