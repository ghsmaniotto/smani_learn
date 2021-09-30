package order.actions;

import order.Order;

public class PersistOrderOnDatabase implements ActionAfterCreateOrder {

  public void executeAction(Order order) {
    System.out.println("Persist the order" + order.toString() + " on database!");
  }

}
