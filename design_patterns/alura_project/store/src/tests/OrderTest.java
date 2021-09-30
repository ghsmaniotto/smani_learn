package tests;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import budget.Budget;
import order.Order;

public class OrderTest {

  public static void main(String[] args) {
    Budget budget = new Budget(new BigDecimal("200.0"), 6);
    LocalDateTime date = LocalDateTime.now();
    String customer = "Fulano da Silva e Sauro";

    Order order = new Order(customer, date, budget);

    System.out.println("Persit order into the database");
    System.out.println("Send email to customer warning new order");
  }

}
