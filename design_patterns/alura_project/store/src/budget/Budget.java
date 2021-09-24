package budget;

import java.math.BigDecimal;

public class Budget {
  BigDecimal value;

  public Budget(BigDecimal value) {
    this.value = value;
  }

  public BigDecimal getValue() {
    return value;
  }
}
