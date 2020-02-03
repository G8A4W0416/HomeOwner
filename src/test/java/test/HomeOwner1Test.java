package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.CalculateMortgage;
import model.HomeOwner;

public class HomeOwner1Test {
	CalculateMortgage calcMortgage = new CalculateMortgage();
	HomeOwner homeowner = new HomeOwner("Bob", 250000, 50000, 30, 3.875);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateLoanAmount() {
		double loanAmount = calcMortgage.calculateLoanAmount(homeowner);
		assertEquals(200000, loanAmount, 0.0);
	}
	
	@Test
	public void testDoesNotHavePMI() {
		assertFalse(calcMortgage.hasPMI(homeowner));
	}
	
	@Test
	public void testCalculateMonthlyMortgagePrincipalAndInterestPayment() {
		double monthlyMortgagePayment = calcMortgage.calculateMonthlyMortgagePrincipalAndInterestPayment(homeowner);
		assertEquals(940, monthlyMortgagePayment, 0.0);
	}

}
