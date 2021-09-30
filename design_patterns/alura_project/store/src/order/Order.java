package order;

import java.time.LocalDateTime;

import budget.Budget;

public class Order {

  private String customer;
  private LocalDateTime date;
  private Budget budget;

  public Order(String customer, LocalDateTime date, Budget budget) {
    this.customer = customer;
    this.date = date;
    this.budget = budget;
  }

  public String getCustomer() {
    return customer;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public Budget getBudget() {
    return budget;
  }
}
