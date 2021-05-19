package in.jeya.service.user;

import in.jeya.service.validation.PasswordValid;
import in.jeya.service.validation.UsernameValid;

public class User {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if (!UsernameValid.isValidUsername(username)) {
			throw new IllegalArgumentException("Invalid Username");
		}
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (!PasswordValid.isValidPassword(password)) {
			throw new IllegalArgumentException("Invalid Password");
		}
		this.password = password;
	}

}
