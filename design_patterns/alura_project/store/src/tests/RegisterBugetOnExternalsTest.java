package tests;
import java.math.BigDecimal;

import budget.Budget;
import budget.RegisterBudget;
import http.JavaHttpClient;

public class RegisterBugetOnExternalsTest {
  
  public static void main(String[] args){
    Budget budget = new Budget();
    budget.addItem(new budget.BudgetItem(new BigDecimal("100.0")));
    budget.addItem(new budget.BudgetItem(new BigDecimal("100.0")));

    budget.approve();
    budget.complete();

    RegisterBudget register = new RegisterBudget(new JavaHttpClient());
    register.register(budget);
  }
}
