package budget;

import java.math.BigDecimal;

public class Budget {
  BigDecimal value;
  int itemsCount;

  public Budget(BigDecimal value, int itemsCount) {
    this.value = value;
    this.itemsCount = itemsCount;
  }

  public BigDecimal getValue() {
    return value;
  }
}
