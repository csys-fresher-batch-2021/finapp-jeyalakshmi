package in.jeya.service;

import java.util.ArrayList;

public class UserManager {

	private UserManager() {
		// default constructor
	}

	private static final ArrayList<User> userList = new ArrayList<>();

	static {

		User user1 = new User();
		user1.setUsername("Jeyalakshmi");
		user1.setPassword("Jeya@1234");
		userList.add(user1);

		User user2 = new User();
		user2.setUsername("Nandhini");
		user2.setPassword("Nandhini@1234");
		userList.add(user2);
	}

	/**
	 * This method is to return list of users
	 * 
	 * @return
	 */

	public static ArrayList<User> getUserInfo() {
		return userList;
	}

}
