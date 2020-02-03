package model;

public class CalculateMortgage {
	
	private static final double NO_PMI_PERCENTAGE = .20;
	private static final int PAYMENTS_PER_YEAR = 12;
	
	public double calculateLoanAmount(HomeOwner homeowner) {
		
		double loanAmount = homeowner.getHomePrice() - homeowner.getDownPayment();
		return loanAmount;
		
	}
	
	public boolean hasPMI(HomeOwner homeowner) {
		
		double downPaymentPct = homeowner.getDownPayment() / homeowner.getHomePrice();
		boolean pmi = false;
		
		if ( downPaymentPct < NO_PMI_PERCENTAGE) {
			pmi = true;
		} else {
			pmi = false;
		}
		
		return pmi;
		
	}
	
	public double calculateMonthlyMortgagePrincipalAndInterestPayment(HomeOwner homeowner) {
		
		double loanAmount = calculateLoanAmount(homeowner);
		int loanTerm = homeowner.getLoanTerm();
		int loanPayments = loanTerm * PAYMENTS_PER_YEAR;
		double loanInterestRate = homeowner.getLoanInterestRate() / 100;
		double monthlyInterestRate = loanInterestRate / PAYMENTS_PER_YEAR;
		double monthlyMortgagePayment = Math.floor(loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanPayments) / (Math.pow(1 + monthlyInterestRate, loanPayments) - 1));
		
		return monthlyMortgagePayment;
		
	}
	 
}

