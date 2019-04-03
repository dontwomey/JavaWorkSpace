package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class primeTesting {

	@Test
	public void test() {
		boolean expected = true;
		boolean actual = PrimeNumber.isPrime(197);
		
		assertEquals(expected, actual);
		
	}

}
