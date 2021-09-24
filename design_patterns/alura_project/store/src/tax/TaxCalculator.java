package tax;

import java.math.BigDecimal;

import budget.Budget;

public class TaxCalculator {
  
  public BigDecimal calculate(Budget budget, TaxType taxType){
    switch (taxType) {
      case ICMS:
        return budget.getValue().multiply(new BigDecimal("0.1"));
      case ISS:
        return budget.getValue().multiply(new BigDecimal("0.06"));
      default:
        return BigDecimal.ZERO;
    }
    
  }
}
