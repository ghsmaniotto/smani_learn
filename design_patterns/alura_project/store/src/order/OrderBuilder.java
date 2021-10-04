package order;

import java.math.BigDecimal;
import java.util.List;

import budget.Budgetable;

public class OrderBuilder {

  private String customer;
  private BigDecimal budgetValue;
  private List<Budgetable> items;

  public OrderBuilder(String customer, List<Budgetable> items) {
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

  public void addItem(Budgetable item){
    this.budgetValue.add(item.getValue());
    this.items.add(item);
  }

  public List<Budgetable> getItems(){
    return items;
  }

}
