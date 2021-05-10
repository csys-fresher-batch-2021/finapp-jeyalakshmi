package in.jeya.service;

import java.util.ArrayList;
import java.util.List;

public class DisplayLoans {

	static List<String> listOfLoans = new ArrayList<String>();
	static {
		listOfLoans.add("House Loan");
		listOfLoans.add("Personal Loan");
		listOfLoans.add("Gold Loan");
		listOfLoans.add("Vehicle Loan");
		listOfLoans.add("Agri Loan");
		listOfLoans.add("Education Loan");
	}

	/**
	 * Displaying Available Loans
	 */
	public static void display() {
		for (String displayloans : listOfLoans) {
			System.out.println("-----------------" + displayloans + "----------------");
		}
	}

	public static List<String> getLoanTypes(){
		return listOfLoans;
	}
}
