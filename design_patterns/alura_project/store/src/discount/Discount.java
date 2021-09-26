package discount;

import java.math.BigDecimal;

import budget.Budget;

public abstract class Discount {
  
  protected Discount next;

  public Discount(Discount next){
    this.next = next;
  }

  public BigDecimal calculate(Budget budget){
    if(mustApply(budget)){
      return evaluateCalculation(budget);
    }

    return next.calculate(budget);
  };

  protected abstract boolean mustApply(Budget budget);
  protected abstract BigDecimal evaluateCalculation(Budget budget);
}
