package budget;

import java.math.BigDecimal;

public class BudgetItem implements Budgetable {

  private BigDecimal value;

  public BudgetItem(BigDecimal value) {
    this.value = value;
  }

  public BigDecimal getValue() {
    return this.value;
  }

}
