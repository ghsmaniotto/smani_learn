package budget.status;

import java.math.BigDecimal;

import budget.Budget;

public class Approved extends BudgetStatus {
  public BigDecimal calculateExtraDiscountValue(Budget budget) {
    return budget.getValue().multiply(new BigDecimal("0.02"));
  }

  public void complete(Budget budget) {
    budget.setStatus(new budget.status.Completed());
  }
}
