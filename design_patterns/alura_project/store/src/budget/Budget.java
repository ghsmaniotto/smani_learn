package budget;

import java.math.BigDecimal;

public class Budget {
  private BigDecimal value;
  private int itemsCount;

  public Budget(BigDecimal value, int itemsCount) {
    this.value = value;
    this.itemsCount = itemsCount;
  }

  public BigDecimal getValue() {
    return value;
  }

  public int getItemsCount() {
    return itemsCount;
  }
}
