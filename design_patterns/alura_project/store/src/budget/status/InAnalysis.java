package budget.status;

import java.math.BigDecimal;

import budget.Budget;

public class InAnalysis extends BudgetStatus {
  public BigDecimal calculateExtraDiscountValue(Budget budget) {
    return budget.getValue().multiply(new BigDecimal("0.05"));
  }

  public void approve(Budget budget) {
    budget.setStatus(new budget.status.Approved());
  }

  public void reprove(Budget budget) {
    budget.setStatus(new budget.status.Reproved());
  }

}
