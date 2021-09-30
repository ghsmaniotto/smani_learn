package order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import budget.Budget;
import order.actions.ActionAfterCreateOrder;

public class OrderBuilder {

  private String customer;
  private BigDecimal budgetValue;
  private int itemsCount;
  private List<ActionAfterCreateOrder> actionsAfterCreateOrder;

  public OrderBuilder(String customer, BigDecimal budgetValue, int itemsCount, List<ActionAfterCreateOrder> actions) {
    this.customer = customer;
    this.budgetValue = budgetValue;
    this.itemsCount = itemsCount;
    this.actionsAfterCreateOrder = actions;
  }

  public void execute() {
    Budget budget = new Budget(this.budgetValue, this.itemsCount);

    Order order = new Order(this.customer, LocalDateTime.now(), budget);

    this.actionsAfterCreateOrder.forEach(action -> action.executeAction(order));
  }
}
