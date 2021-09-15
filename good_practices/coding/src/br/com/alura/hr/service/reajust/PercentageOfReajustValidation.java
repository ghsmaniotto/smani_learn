package br.com.alura.hr.service.reajust;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.hr.ExceptionValidation;
import br.com.alura.hr.model.Employee;

public class PercentageOfReajustValidation implements ReajustValidation {
  
  public void validate(Employee employee, BigDecimal raise){
    BigDecimal currentSalary = employee.getSalary();
    BigDecimal percentageOfReajust = raise.divide(currentSalary, RoundingMode.HALF_UP);
    if (percentageOfReajust.compareTo(new BigDecimal("0.4")) > 0) {
      throw new ExceptionValidation("The reajust cant be higher than 40% of salary!");
    }
  }
}
