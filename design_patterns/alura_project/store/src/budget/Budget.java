package budget;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import budget.status.BudgetStatus;
import budget.status.Completed;
import budget.status.InAnalysis;

public class Budget implements Budgetable {
  private BigDecimal value;
  private BudgetStatus status;
  private List<Budgetable> items;

  public Budget() {
    this.value = BigDecimal.ZERO;
    this.items = new ArrayList<Budgetable>();
    this.status = new InAnalysis();
  }

  public void applyExtraDiscount() {
    BigDecimal extraDiscountValue = this.status.calculateExtraDiscountValue(this);

    this.value = this.value.subtract(extraDiscountValue);
  }

  public void approve() {
    this.status.approve(this);
  }

  public void reprove() {
    this.status.reprove(this);
  }

  public void complete() {
    this.status.complete(this);
  }

  public boolean isCompleted() {
    return this.status instanceof Completed;
  }

  public BigDecimal getValue() {
    return value;
  }

  public int getItemsCount() {
    return items.size();
  }

  public BudgetStatus getStatus() {
    return status;
  }

  public void setStatus(BudgetStatus status) {
    this.status = status;
  }

  public void addItem(Budgetable item) {
    this.value = this.value.add(item.getValue());
    this.items.add(item);
  }
}
