package tests;

import java.math.BigDecimal;
import order.OrderBuilder;

public class OrderTest {

  public static void main(String[] args) {

    String customer = args[0];
    BigDecimal budgetValue = new BigDecimal(args[1]);
    int itemsCount = Integer.parseInt(args[2]);

    OrderBuilder builder = new OrderBuilder(customer, budgetValue, itemsCount);
    builder.execute();
  }

}
