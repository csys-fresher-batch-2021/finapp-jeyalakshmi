package in.jeya.service.validation;

import java.util.List;

import in.jeya.service.user.UserManager;
import in.jeya.service.user.User;

public class AdminLoginValid {

	private AdminLoginValid() {

	}

	public static boolean login(String userName, String password) {
		boolean isValid = false;
		if (UsernameValid.isValidUsername(userName) && PasswordValid.isValidPassword(password)) {
			List<User> userList = UserManager.getAdminUserInfo();
			for (User user : userList) {
				if (userName.equals(user.getUsername()) && password.equals(user.getPassword())) {
					isValid = true;
				}
			}

		}

		return isValid;
	}

}
