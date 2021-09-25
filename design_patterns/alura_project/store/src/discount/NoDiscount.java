package discount;

import java.math.BigDecimal;

import budget.Budget;

public class NoDiscount extends Discount {

  public NoDiscount() {
    super(null);
  }
  
  public BigDecimal calculate(Budget budget) {
    return BigDecimal.ZERO;
  }

}
