package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.CalculateMortgage;
import model.HomeOwner;

public class HomeOwner2Test {

	CalculateMortgage calcMortgage = new CalculateMortgage();
	HomeOwner homeowner = new HomeOwner("Jerry", 100000, 10000, 30, 4);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateLoanAmount() {
		double loanAmount = calcMortgage.calculateLoanAmount(homeowner);
		assertEquals(90000, loanAmount, 0.0);
	}
	
	@Test
	public void testHasPMI() {
		assertTrue(calcMortgage.hasPMI(homeowner));
	}
	
	@Test
	public void testCalculateMonthlyMortgagePrincipalAndInterestPayment() {
		double monthlyMortgagePayment = calcMortgage.calculateMonthlyMortgagePrincipalAndInterestPayment(homeowner);
		assertEquals(429, monthlyMortgagePayment, 0.0);
	}

}
