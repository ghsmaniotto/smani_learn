package tests;

import java.math.BigDecimal;
import java.util.Arrays;

import order.OrderBuilder;
import order.OrderBuilderHandler;
import order.actions.PersistOrderOnDatabase;
import order.actions.SendOrderEmail;

public class OrderTest {

  public static void main(String[] args) {

    String customer = "Fulano";
    BigDecimal budgetValue = new BigDecimal("300");
    int itemsCount = Integer.parseInt("2");

    OrderBuilder orderData = new OrderBuilder(customer, budgetValue, itemsCount);
    OrderBuilderHandler handler = new OrderBuilderHandler(orderData,
        Arrays.asList(new PersistOrderOnDatabase(), new SendOrderEmail()));

    handler.execute();
  }

}
