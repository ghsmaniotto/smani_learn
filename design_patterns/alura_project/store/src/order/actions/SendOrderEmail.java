package order.actions;

import order.Order;

public class SendOrderEmail implements ActionAfterCreateOrder {

  public void executeAction(Order order) {
    System.out.println("Send email to inform that the order" + order.toString() + " was created with success!");
  }

}
