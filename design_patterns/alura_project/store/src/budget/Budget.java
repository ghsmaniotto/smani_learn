package budget;

import java.math.BigDecimal;

import budget.status.BudgetStatus;
import budget.status.Completed;

public class Budget {
  private BigDecimal value;
  private int itemsCount;
  private BudgetStatus status;

  public Budget(BigDecimal value, int itemsCount) {
    this.value = value;
    this.itemsCount = itemsCount;
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

  public boolean isCompleted(){
    return this.status instanceof Completed;
  }

  public BigDecimal getValue() {
    return value;
  }

  public int getItemsCount() {
    return itemsCount;
  }

  public BudgetStatus getStatus() {
    return status;
  }

  public void setStatus(BudgetStatus status) {
    this.status = status;
  }
}
