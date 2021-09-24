package tax;

import java.math.BigDecimal;

import budget.Budget;

public class ICMS implements Tax {
  public BigDecimal calculate(Budget budget){
    return budget.getValue().multiply(new BigDecimal("0.1"));
  }
}
