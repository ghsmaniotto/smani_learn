package tests;
import java.math.BigDecimal;

import budget.Budget;
import budget.BudgetItem;
import discount.DiscountCalculator;

public class DiscountCalculatorTest {
  
  public static void main(String[] args){
    Budget firstBudget = new Budget();
    
    firstBudget.addItem(new BudgetItem(new BigDecimal("50.0")));
    firstBudget.addItem(new BudgetItem(new BigDecimal("50.0")));
    firstBudget.addItem(new BudgetItem(new BigDecimal("50.0")));
    firstBudget.addItem(new BudgetItem(new BigDecimal("50.0")));
    firstBudget.addItem(new BudgetItem(new BigDecimal("50.0")));
    firstBudget.addItem(new BudgetItem(new BigDecimal("50.0")));
    
    Budget secondBudget = new Budget();
    secondBudget.addItem(new BudgetItem(new BigDecimal("500.0")));
    secondBudget.addItem(new BudgetItem(new BigDecimal("500.0")));
    
    DiscountCalculator discountCalculator = new DiscountCalculator();

    System.out.println(discountCalculator.calculate(firstBudget));
    System.out.println(discountCalculator.calculate(secondBudget));
  }
}
