package order;

import java.math.BigDecimal;

public class OrderBuilder {

  private String customer;
  private BigDecimal budgetValue;
  private int itemsCount;

  public OrderBuilder(String customer, BigDecimal budgetValue, int itemsCount) {
    this.customer = customer;
    this.budgetValue = budgetValue;
    this.itemsCount = itemsCount;
  }

  public String getCustomer() {
    return customer;
  }

  public BigDecimal getBudgetValue() {
    return budgetValue;
  }

  public int getItemsCount() {
    return itemsCount;
  }

}
