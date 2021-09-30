package tests;

import java.math.BigDecimal;
import java.util.Arrays;

import order.OrderBuilder;
import order.actions.PersistOrderOnDatabase;
import order.actions.SendOrderEmail;

public class OrderTest {

  public static void main(String[] args) {

    String customer = args[0];
    BigDecimal budgetValue = new BigDecimal(args[1]);
    int itemsCount = Integer.parseInt(args[2]);

    OrderBuilder builder = new OrderBuilder(customer, budgetValue, itemsCount,
        Arrays.asList(new PersistOrderOnDatabase(), new SendOrderEmail()));
    builder.execute();
  }

}
