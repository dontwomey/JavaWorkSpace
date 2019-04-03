package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class reverseWordTest {

	@Test
	public void test() {
		String expected = "koob";
		String actual = StringReversal.reverseWord("book");
		
		assertEquals(expected, actual);
	}

}
