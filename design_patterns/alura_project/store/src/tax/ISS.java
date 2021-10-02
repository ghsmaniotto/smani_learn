package tax;

import java.math.BigDecimal;

import budget.Budget;

public class ISS extends Tax {
  public ISS(Tax anotherTax){
    super(anotherTax);
  }

  public BigDecimal calculateTax(Budget budget){
    return budget.getValue().multiply(new BigDecimal("0.06"));
  }
}
