package budget.status;

import java.math.BigDecimal;

import budget.Budget;
import exceptions.DomainException;

public abstract class BudgetStatus {
  public BigDecimal calculateExtraDiscountValue(Budget budget) {
    return BigDecimal.ZERO;
  }

  public void approve(Budget budget){
    throw new DomainException("Não é possível aprovar o orçamento");
  }

  public void reprove(Budget budget) {
    throw new DomainException("Não é possível reprovar o orçamento");
  }

  public void complete(Budget budget) {
    throw new DomainException("Não é possível finalizar o orçamento");
  }
}
