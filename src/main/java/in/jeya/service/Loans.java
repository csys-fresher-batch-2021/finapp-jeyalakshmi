package in.jeya.service;


public class Loans {

	private String loans; 
	
	public Loans(String type) {
		this.loans = type;
	}
	
	@Override
	public String toString() {
		return "Loans [type = " + loans + "]";
	}

	public String getLoans() {
		return loans;
	}

	public void setLoans(String loans) {
		this.loans = loans;
	}
}
