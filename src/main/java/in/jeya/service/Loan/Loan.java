package in.jeya.service.Loan;


public class Loan {

	private String getLoan; 
	
	public Loan(String type) {
		this.getLoan = type;
	}
	
	@Override
	public String toString() {
		return "Loans [type = " + getLoan + "]";
	}

	public String getLoans() {
		return getLoan;
	}

	public void setLoans(String loans) {
		this.getLoan = loans;
	}
}
