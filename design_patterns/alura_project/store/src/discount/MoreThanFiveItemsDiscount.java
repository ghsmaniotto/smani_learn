package discount;

import java.math.BigDecimal;

import budget.Budget;

public class MoreThanFiveItemsDiscount extends Discount {

  public MoreThanFiveItemsDiscount(Discount next) {
    super(next);
  }

  public BigDecimal calculate(Budget budget) {
    if (budget.getItemsCount() > 5) {
      return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    return next.calculate(budget);
  }
  
}
