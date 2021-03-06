package tests;

import java.math.BigDecimal;

import budget.Budget;
import budget.BudgetProxy;
import budget.BudgetItem;

public class CompositionTest {

  public static void main(String args[]){
    Budget oldBudget = new Budget();
    oldBudget.addItem(new BudgetItem(new BigDecimal("100.0")));
    oldBudget.reprove();

    Budget newBudget = new Budget();
    newBudget.addItem(new BudgetItem(new BigDecimal("500.0")));
    newBudget.addItem(oldBudget);

    BudgetProxy proxy = new BudgetProxy(newBudget);

    System.out.println(proxy.getValue());
    System.out.println(proxy.getValue());
    System.out.println(proxy.getValue());
  }
  
}
