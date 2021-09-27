package budget.status;

import java.math.BigDecimal;

import budget.Budget;

public class Reproved extends BudgetStatus {
  public BigDecimal calculateExtraDiscountValue(Budget budget) {
    return BigDecimal.ZERO;
  }

  public void complete(Budget budget) {
    budget.setStatus(new budget.status.Completed());
  }
}
