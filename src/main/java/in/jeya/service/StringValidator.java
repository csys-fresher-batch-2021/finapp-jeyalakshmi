package in.jeya.service;

public class StringValidator {

	private StringValidator() {

	}

	public static boolean isValidString(String string) {
		boolean isValid = true;
		if (string == null || string.trim().isEmpty()) {
			isValid = false;
		}
		return isValid;
	}

}
