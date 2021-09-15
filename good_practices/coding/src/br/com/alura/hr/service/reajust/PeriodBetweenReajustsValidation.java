package br.com.alura.hr.service.reajust;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.hr.ExceptionValidation;
import br.com.alura.hr.model.Employee;

public class PeriodBetweenReajustsValidation implements ReajustValidation{
  public void validate(Employee employee, BigDecimal raise){
    LocalDate dateOfLastReajust = employee.getDateOfLastReajust();
    LocalDate currentDate = LocalDate.now();

    long monthsSinceLastReajust = ChronoUnit.MONTHS.between(dateOfLastReajust, currentDate);
    
    if (monthsSinceLastReajust < 6) {
      throw new ExceptionValidation("Time between reajusts must be higher than 6 months!");
    }
  }
}
