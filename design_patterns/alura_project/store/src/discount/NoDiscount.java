package discount;

import java.math.BigDecimal;

import budget.Budget;

public class NoDiscount extends Discount {

  public NoDiscount() {
    super(null);
  }
  
  @Override
  protected boolean mustApply(Budget budget) {
    return true;
  }

  @Override
  protected BigDecimal evaluateCalculation(Budget budget) {
    return BigDecimal.ZERO;
  }

}
