package br.com.alura.hr.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.hr.ExceptionValidation;
import br.com.alura.hr.model.Employee;

public class ReajustService {

  public void reajustEmployeeSalary(Employee Employee, BigDecimal aumento){
    BigDecimal currentSalary = Employee.getSalary();

    BigDecimal percentageOfReajust = aumento.divide(currentSalary, RoundingMode.HALF_UP);
    if (percentageOfReajust.compareTo(new BigDecimal("0.4")) > 0) {
      throw new ExceptionValidation("The reajust cant be higher than 40% of salary!");
    }

    BigDecimal salaryReajustado = currentSalary.add(aumento);
    Employee.atualizarSalary(salaryReajustado);
  }
  
}
