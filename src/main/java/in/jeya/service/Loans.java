package in.jeya.service;

public class Loans {

	public String loans; 
	
	public Loans(String type) {
		this.loans = type;
	}
	
	@Override
	public String toString() {
		return "Loans [type = " + loans + "]";
	}
}
