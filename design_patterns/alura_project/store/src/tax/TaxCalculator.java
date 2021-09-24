package tax;

import java.math.BigDecimal;

import budget.Budget;

public class TaxCalculator {
  
  public BigDecimal calculate(Budget budget, Tax tax){
    return tax.calculate(budget);
  }
}
