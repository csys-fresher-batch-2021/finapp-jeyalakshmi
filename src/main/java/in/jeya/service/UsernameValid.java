package in.jeya.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValid {

	private UsernameValid() {

	}

	public static boolean isValidUsername(String username) {
		boolean Valid = false;
		String regex = "^[A-Za-z]{6,25}$";
		if (StringValidator.isValidString(username)) {
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(username);
			Valid = match.matches();
		}
		return Valid;
	}

}
