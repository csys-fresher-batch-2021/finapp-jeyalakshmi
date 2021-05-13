package in.jeya.service;

public class LoginValid {

	private LoginValid() {

	}

	public static boolean login(String userName, String password) {
		boolean isValid = false;
		if (userName.trim().equals("Jeyalakshmi") && password.trim().equals("Jeya@1234")) {
			isValid = true;
		}

		return isValid;
	}

}
