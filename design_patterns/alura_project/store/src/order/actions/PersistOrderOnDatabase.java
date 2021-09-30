package order.actions;

import order.Order;

public class PersistOrderOnDatabase {

  public void execute(Order order) {
    System.out.println("Persist the order" + order.toString() + " on database!");
  }

}
