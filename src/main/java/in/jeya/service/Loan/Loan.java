package in.jeya.service.Loan;


public class Loan {

	private String loan; 
	
	public Loan(String type) {
		this.loan = type;
	}
	
	@Override
	public String toString() {
		return "Loans [type = " + loan + "]";
	}

	public String getLoans() {
		return loan;
	}

	public void setLoans(String loans) {
		this.loan = loans;
	}
}
