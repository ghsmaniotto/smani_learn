package discount;

import java.math.BigDecimal;

import budget.Budget;

public class ValueGreaterThanFiveHundredDiscount extends Discount {

  public ValueGreaterThanFiveHundredDiscount(Discount next) {
    super(next);
  }

  @Override
  protected boolean mustApply(Budget budget) {
    return budget.getValue().compareTo(new BigDecimal("500")) > 0;
  }

  @Override
  protected BigDecimal evaluateCalculation(Budget budget) {
    return budget.getValue().multiply(new BigDecimal("0.05"));
  }  
}
