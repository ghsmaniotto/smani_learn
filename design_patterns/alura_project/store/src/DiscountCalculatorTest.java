import java.math.BigDecimal;

import budget.Budget;
import discount.DiscountCalculator;

public class DiscountCalculatorTest {
  
  public static void main(String[] args){
    Budget first_budget = new Budget(new BigDecimal("200.0"), 6);
    Budget second_budget = new Budget(new BigDecimal("1000.0"), 4);
    DiscountCalculator discountCalculator = new DiscountCalculator();

    System.out.println(discountCalculator.calculate(first_budget));
    System.out.println(discountCalculator.calculate(second_budget));
  }
}
