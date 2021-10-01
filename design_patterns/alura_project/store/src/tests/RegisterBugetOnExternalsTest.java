package tests;
import java.math.BigDecimal;

import budget.Budget;
import budget.RegisterBudget;
import http.JavaHttpClient;

public class RegisterBugetOnExternalsTest {
  
  public static void main(String[] args){
    Budget budget = new Budget(new BigDecimal("200.0"), 6);
    budget.approve();
    budget.complete();

    RegisterBudget register = new RegisterBudget(new JavaHttpClient());
    register.register(budget);
  }
}
