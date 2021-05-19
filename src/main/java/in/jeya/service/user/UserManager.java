package in.jeya.service.user;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

	private UserManager() {
		// default constructor
	}

	private static final ArrayList<User> adminUserList = new ArrayList<>();

	static {

		User user1 = new User();
		user1.setUsername("AdminOne");
		user1.setPassword("Admin@01");
		adminUserList.add(user1);

		User user2 = new User();
		user2.setUsername("AdminTwo");
		user2.setPassword("Admin@02");
		adminUserList.add(user2);
	}

	/**
	 * This method is to return list of users
	 * 
	 * @return
	 */

	public static List<User> getAdminUserInfo() {
		return adminUserList;
	}

	private static final ArrayList<User> customerUserList = new ArrayList<>();

	static {

		User user1 = new User();
		user1.setUsername("Jeyalakshmi");
		user1.setPassword("Jeya@1234");
		customerUserList.add(user1);

		User user2 = new User();
		user2.setUsername("Nandhini");
		user2.setPassword("Nandhini@1234");
		customerUserList.add(user2);
	}

	/**
	 * This method is to return list of users
	 * 
	 * @return
	 */

	public static List<User> getCustomerUserInfo() {
		return customerUserList;
	}

}
