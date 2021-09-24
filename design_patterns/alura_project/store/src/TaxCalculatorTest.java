import java.math.BigDecimal;

import budget.Budget;
import tax.TaxCalculator;
import tax.TaxType;

public class TaxCalculatorTest {
  
  public static void main(String[] args){
    Budget budget = new Budget(new BigDecimal("100.0"));
    TaxCalculator taxCalculator = new TaxCalculator();

    System.out.println(taxCalculator.calculate(budget, TaxType.ISS));
  }
}
