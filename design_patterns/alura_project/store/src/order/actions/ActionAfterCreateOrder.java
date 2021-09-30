package order.actions;

import order.Order;

public interface ActionAfterCreateOrder {

  public void executeAction(Order order);

}
