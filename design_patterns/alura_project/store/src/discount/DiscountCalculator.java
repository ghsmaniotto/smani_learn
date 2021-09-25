package discount;

import java.math.BigDecimal;

import budget.Budget;

public class DiscountCalculator {

  public BigDecimal calculate(Budget budget){
    if(budget.getItemsCount() > 5){
      return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    return BigDecimal.ZERO;
  }

}
