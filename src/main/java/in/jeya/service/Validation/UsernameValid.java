package in.jeya.service.Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValid {

	private UsernameValid() {

	}

	public static boolean isValidUsername(String username) {
		boolean isValid = false;
		String regex = "^[A-Za-z]{6,25}$";
		if (StringValidator.isValidString(username)) {
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(username);
			isValid = match.matches();
		}
		return isValid;
	}

}
