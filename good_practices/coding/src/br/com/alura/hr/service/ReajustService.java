package br.com.alura.hr.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.hr.ExceptionValidation;
import br.com.alura.hr.model.Employee;

public class ReajustService {

  public void reajustEmployeeSalary(Employee employee, BigDecimal aumento){
    BigDecimal currentSalary = employee.getSalary();

    BigDecimal percentageOfReajust = aumento.divide(currentSalary, RoundingMode.HALF_UP);
    if (percentageOfReajust.compareTo(new BigDecimal("0.4")) > 0) {
      throw new ExceptionValidation("The reajust cant be higher than 40% of salary!");
    }

    LocalDate dateOfLastReajust = employee.getDateOfLastReajust();
    LocalDate currentDate = LocalDate.now();
    long monthsSinceLastReajust = ChronoUnit.MONTHS.between(dateOfLastReajust, currentDate);
    if (monthsSinceLastReajust < 6) {
      throw new ExceptionValidation("Time between reajusts must be higher than 6 months!");
    }

    BigDecimal salaryReajustado = currentSalary.add(aumento);
    employee.atualizarSalary(salaryReajustado);
  }
  
}
