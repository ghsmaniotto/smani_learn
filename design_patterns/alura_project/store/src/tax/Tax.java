package tax;

import java.math.BigDecimal;

import budget.Budget;

public abstract class Tax {

  private Tax anotherTax;

  public Tax(Tax anotherTax) {
    this.anotherTax = anotherTax;
  }

  protected abstract BigDecimal calculateTax(Budget budget);
  
  public BigDecimal calculate(Budget budget){
    BigDecimal currentTaxValue = this.calculateTax(budget);
    BigDecimal anotherTaxValue = BigDecimal.ZERO;
    
    if(anotherTax != null){
      anotherTaxValue = anotherTax.calculateTax(budget); 
    }
    
    return currentTaxValue.add(anotherTaxValue); 
  };
}
