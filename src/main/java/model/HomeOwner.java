package model;

public class HomeOwner {
	private String name;
	private double homePrice;
	private double downPayment;
	private int loanTerm;
	private double loanInterestRate;
	
	public HomeOwner() {
		
	}
	
	public HomeOwner(String name, double homePrice, double downPayment, int loanTerm, double loanInterestRate) {
		this.name = name;
		this.homePrice = homePrice;
		this.downPayment = downPayment;
		this.loanTerm = loanTerm;
		this.loanInterestRate = loanInterestRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHomePrice() {
		return homePrice;
	}

	public void setHomePrice(double homePrice) {
		this.homePrice = homePrice;
	}

	public double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	public double getLoanInterestRate() {
		return loanInterestRate;
	}

	public void setLoanInterestRate(double loanInterestRate) {
		this.loanInterestRate = loanInterestRate;
	}
	
}
