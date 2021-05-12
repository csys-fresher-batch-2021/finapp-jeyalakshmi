package in.jeya.service;

import java.util.ArrayList;
import java.util.List;

public class DisplayLoans {
	
	private DisplayLoans() {
		//default constructor
	}

	private static final List<Loan> listOfLoans = new ArrayList<>();
	static {
		
		Loan loan1 = new Loan("House Loan");
		Loan loan2 = new Loan("Personal Loan");
		Loan loan3 = new Loan("Gold Loan");
		Loan loan4 = new Loan("Vehicle Loan");
		Loan loan5 = new Loan("Agri Loan");
		Loan loan6 = new Loan("Education Loan");
		
		listOfLoans.add(loan1);
		listOfLoans.add(loan2);
		listOfLoans.add(loan3);
		listOfLoans.add(loan4);
		listOfLoans.add(loan5);
		listOfLoans.add(loan6);
	}

	/**
	 * Displaying Available Loans
	 */
	
	
	
	public static List <Loan> getLoanType(){
		return listOfLoans;
	}
	
}
