package in.jeya.service.Validation;

import java.util.List;

import in.jeya.service.User.User;
import in.jeya.service.User.UserManager;

public class CustomerLoginValid {

	private CustomerLoginValid() {

	}

	/**
	 * This method is to verify whether the username and password is valid or not
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */

	public static boolean login(String userName, String password) {
		boolean isValid = false;
		if (UsernameValid.isValidUsername(userName) && PasswordValid.isValidPassword(password)) {
			List<User> userList = UserManager.getCustomerUserInfo();
			for (User user : userList) {
				if (userName.equals(user.getUsername()) && password.equals(user.getPassword())) {
					isValid = true;
				}
			}

		}

		return isValid;
	}

}
