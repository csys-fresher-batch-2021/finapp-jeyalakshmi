package in.jeya.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValid {

	private PasswordValid() {

	}

	public static boolean isValidPassword(String password) {
		boolean Valid = false;
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[8@#$%^&-+=()]).{8,15}$";
		if (StringValidator.isValidString(password)) {
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(password);
			Valid = match.matches();
		}
		return Valid;
	}

}
