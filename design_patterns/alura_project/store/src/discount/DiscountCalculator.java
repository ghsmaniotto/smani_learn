package discount;

import java.math.BigDecimal;

import budget.Budget;

public class DiscountCalculator {
  public BigDecimal calculate(Budget budget){
    Discount chainOfDiscounts = new MoreThanFiveItemsDiscount( 
      new ValueGreaterThanFiveHundredDiscount(
        new NoDiscount()
      )
    );
    
    return chainOfDiscounts.calculate(budget);
  }
}
