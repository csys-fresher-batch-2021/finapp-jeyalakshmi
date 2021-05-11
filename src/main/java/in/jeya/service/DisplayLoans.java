package in.jeya.service;

import java.util.ArrayList;
import java.util.List;

public class DisplayLoans {

	private static List<Loans> listOfLoans = new ArrayList<Loans>();
	static {
		
		Loans loan1 = new Loans("House Loan");
		Loans loan2 = new Loans("Personal Loan");
		Loans loan3 = new Loans("Gold Loan");
		Loans loan4 = new Loans("Vehicle Loan");
		Loans loan5 = new Loans("Agri Loan");
		Loans loan6 = new Loans("Education Loan");
		
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
	
	/*public static void display() {
		for (String displayloans : listOfLoans) {
			System.out.println("-----------------" + displayloans + "----------------");
		}
	}

	public static List<String> getLoanTypes(){
		return listOfLoans;
	}*/
	
	public static List <Loans> getLoanType(){
		return listOfLoans;
	}
	
}
