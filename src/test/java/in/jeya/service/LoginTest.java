package in.jeya.service;

import static org.junit.Assert.*;

import org.junit.Test;

import in.jeya.service.Validation.AdminLoginValid;
import in.jeya.service.Validation.CustomerLoginValid;

public class LoginTest {

	@Test
	public void validCustomerTestCase1() {
		boolean login = CustomerLoginValid.login("Jeyalakshmi", "Jeya@1234");
		assertTrue(login);
	}

	@Test
	public void validCustomerTestCase2() {
		boolean login = CustomerLoginValid.login("Nandhini", "Nandhini@1234");
		assertTrue(login);
	}

	@Test
	public void invalidCustomerTestCase3() {
		boolean login = CustomerLoginValid.login("jeyalakshmi", "12345678");
		assertFalse(login);
	}

	@Test
	public void validAdminTestCase1() {
		boolean login = AdminLoginValid.login("AdminOne", "Admin@01");
		assertTrue(login);
	}

	@Test
	public void validAdminTestCase2() {
		boolean login = AdminLoginValid.login("AdminTwo", "Admin@02");
		assertTrue(login);
	}

	@Test
	public void invalidAdminTestCase() {
		boolean login = AdminLoginValid.login("adminone", "admin@01");
		assertFalse(login);
	}

}
