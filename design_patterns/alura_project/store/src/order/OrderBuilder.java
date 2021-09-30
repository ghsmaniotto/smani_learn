package order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import budget.Budget;
import order.actions.PersistOrderOnDatabase;
import order.actions.SendOrderEmail;

public class OrderBuilder {

  private String customer;
  private BigDecimal budgetValue;
  private int itemsCount;

  public OrderBuilder(String customer, BigDecimal budgetValue, int itemsCount) {
    this.customer = customer;
    this.budgetValue = budgetValue;
    this.itemsCount = itemsCount;
  }

  public void execute() {
    Budget budget = new Budget(this.budgetValue, this.itemsCount);

    Order order = new Order(this.customer, LocalDateTime.now(), budget);

    new PersistOrderOnDatabase().execute(order);
    new SendOrderEmail().execute(order);
  }
}
