package in.jeya.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginTest {

	@Test
	public void testCase1() {
		boolean login = LoginValid.login("Jeyalakshmi", "Jeya@1234");
		assertTrue(login);
	}

	@Test
	public void testCase2() {
		boolean login = LoginValid.login("Nandhini", "Nandhini@1234");
		assertTrue(login);
	}

	@Test
	public void testCase3() {
		boolean login = LoginValid.login("jeyalakshmi", "12345678");
		assertFalse(login);
	}

}
