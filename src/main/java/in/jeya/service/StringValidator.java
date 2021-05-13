package in.jeya.service;

public class StringValidator {

	private StringValidator() {

	}

	public static boolean isValidString(String string) {
		boolean Valid = true;
		if (string == null || string.trim().isEmpty()) {
			Valid = false;
		}
		return Valid;
	}

}
