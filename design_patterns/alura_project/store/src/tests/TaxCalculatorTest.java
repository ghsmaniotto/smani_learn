package tests;
import java.math.BigDecimal;

import budget.Budget;
import tax.ICMS;
import tax.ISS;
import tax.TaxCalculator;

public class TaxCalculatorTest {
  
  public static void main(String[] args){
    Budget budget = new Budget(new BigDecimal("100.0"), 1);
    TaxCalculator taxCalculator = new TaxCalculator();

    System.out.println(taxCalculator.calculate(budget, new ICMS(new ISS(null))));
    System.out.println(taxCalculator.calculate(budget, new ISS(null)));
  }
}
