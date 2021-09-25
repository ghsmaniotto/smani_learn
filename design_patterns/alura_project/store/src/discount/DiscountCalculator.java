package discount;

import java.math.BigDecimal;

import budget.Budget;

public class DiscountCalculator {

  public BigDecimal calculate(Budget budget){
    return new MoreThanFiveItemsDiscount( 
      new ValueGreaterThanFiveHundredDiscount(
        new NoDiscount()
      )
    ).calculate(budget);
  }

}
