package in.jeya.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class DisplayTest {
	
	/*
	 * For Valid Loan Types Display(using size)
	 */

	@Test
	public void testDisplay() {
		List<String> typesOfLoans = DisplayLoans.getLoanTypes();
		assertEquals(6,typesOfLoans.size());
	}
	
	/*
	 * For InValid Loan Types Display(using size)
	 */

	
	@Test
	public void test1Display() {
		List<String> typesOfLoans = DisplayLoans.getLoanTypes();
		assertEquals(5,typesOfLoans.size());
	}

}
