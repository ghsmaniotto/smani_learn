package order;

import java.time.LocalDateTime;
import java.util.List;

import budget.Budget;
import order.actions.ActionAfterCreateOrder;

public class OrderBuilderHandler {

  private OrderBuilder data;
  private List<ActionAfterCreateOrder> actionsAfterCreateOrder;

  public OrderBuilderHandler(OrderBuilder data, List<ActionAfterCreateOrder> actions) {
    this.data = data;
    this.actionsAfterCreateOrder = actions;
  }

  public void execute() {
    Budget budget = new Budget();
    data.getItems().forEach(item -> budget.addItem(item));

    Order order = new Order(this.data.getCustomer(), LocalDateTime.now(), budget);

    this.actionsAfterCreateOrder.forEach(action -> action.executeAction(order));
  }
}
