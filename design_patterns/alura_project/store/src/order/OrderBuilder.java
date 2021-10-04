package order;

import java.math.BigDecimal;
import java.util.List;

import budget.BudgetItem;

public class OrderBuilder {

  private String customer;
  private BigDecimal budgetValue;
  private List<BudgetItem> items;

  public OrderBuilder(String customer, List<BudgetItem> items) {
    this.customer = customer;
    this.items = items;
  }

  public String getCustomer() {
    return customer;
  }

  public BigDecimal getBudgetValue() {
    return budgetValue;
  }

  public int getItemsCount() {
    return items.size();
  }

  public void addItem(BudgetItem item){
    this.budgetValue.add(item.getValue());
    this.items.add(item);
  }

  public List<BudgetItem> getItems(){
    return items;
  }

}
