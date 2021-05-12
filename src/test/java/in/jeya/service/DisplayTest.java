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
		List<Loan> typesOfLoans = DisplayLoans.getLoanType();
		assertEquals(6,typesOfLoans.size());
	}

}
