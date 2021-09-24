package tax;

import java.math.BigDecimal;

import budget.Budget;

public interface Tax {
  public BigDecimal calculate(Budget budget);
}
