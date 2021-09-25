import java.math.BigDecimal;

import budget.Budget;
import discount.DiscountCalculator;

public class DiscountCalculatorTest {
  
  public static void main(String[] args){
    Budget budget = new Budget(new BigDecimal("100.0"), 6);
    DiscountCalculator discountCalculator = new DiscountCalculator();

    System.out.println(discountCalculator.calculate(budget));
  }
}
