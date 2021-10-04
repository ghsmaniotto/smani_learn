package tests;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import budget.BudgetItem;
import order.OrderBuilder;
import order.OrderBuilderHandler;
import order.actions.PersistOrderOnDatabase;
import order.actions.SendOrderEmail;

public class OrderTest {

  public static void main(String[] args) {

    String customer = "Fulano";
    BigDecimal firstItem = new BigDecimal("150");
    BigDecimal secondItem = new BigDecimal("150");
    ArrayList<BudgetItem> itemList = new ArrayList<BudgetItem>();
    itemList.add(new BudgetItem(firstItem));
    itemList.add(new BudgetItem(secondItem));

    OrderBuilder orderData = new OrderBuilder(customer, itemList);
    OrderBuilderHandler handler = new OrderBuilderHandler(orderData,
        Arrays.asList(new PersistOrderOnDatabase(), new SendOrderEmail()));

    handler.execute();
  }

}
