package discount;

import java.math.BigDecimal;

import budget.Budget;

public class MoreThanFiveItemsDiscount extends Discount {

  public MoreThanFiveItemsDiscount(Discount next) {
    super(next);
  }

  @Override
  protected boolean mustApply(Budget budget) {
    return budget.getItemsCount() > 5;
  }

  @Override
  protected BigDecimal evaluateCalculation(Budget budget) {
    return budget.getValue().multiply(new BigDecimal("0.1"));
  }
  
}
